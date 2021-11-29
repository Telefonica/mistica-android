#!/usr/bin/env kotlin

@file:Repository("https://jitpack.io")
@file:Repository("https://maven.google.com")
@file:Repository("https://jetbrains.bintray.com/trove4j")
@file:Repository("file:///home/mvera/.m2/repository")

// svg-to-compose
//@file:DependsOn("com.github.DevSrSouza:svg-to-compose:0.7.0")
@file:DependsOn("br.com.devsrsouza:svg-to-compose:0.7.0")
@file:DependsOn("com.google.guava:guava:23.0")
@file:DependsOn("com.android.tools:sdk-common:27.2.0-alpha16")
@file:DependsOn("com.android.tools:common:27.2.0-alpha16")
@file:DependsOn("com.squareup:kotlinpoet:1.7.2")
@file:DependsOn("org.ogce:xpp3:1.1.6")

@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")

// Jgit
@file:DependsOn("org.eclipse.jgit:org.eclipse.jgit:3.5.0.201409260305-r")

import br.com.devsrsouza.svg2compose.Svg2Compose
import br.com.devsrsouza.svg2compose.VectorType
import org.eclipse.jgit.api.Git
import java.io.File

fun File.makeDirs() = apply { mkdirs() }

val buildDir = File("build/").makeDirs()

val githubId = "Telefonica/mistica-icons"
val repository = "https://github.com/$githubId"

val repoCloneDir = createTempDir(suffix = "git-repo")

println("Cloning repository")
val git: Git = Git.cloneRepository()
    .setURI(repository)
    .setDirectory(repoCloneDir)
    .call()
git.checkout().setName("production").call()

val iconsDir = File(repoCloneDir, "icons")

// renaming to match to svg-to-compose
iconsDir.walkTopDown().filter { it.extension == "svg" }
    .forEach {
        val newFile = File(it.parentFile, it.name.replace("-", "_"))
        it.renameTo(newFile)
    }
iconsDir.walkTopDown().filter { it.isDirectory }
    .forEach {
        val newFile = File(it.parentFile, it.name.split(".").last())
        it.renameTo(newFile)
    }

val srcDir = File("src/main/kotlin").apply { mkdirs() }
srcDir.deleteRecursively()
srcDir.mkdirs()

println("Generating all svg to compose")

val result = Svg2Compose.parse(
    applicationIconPackage = "com.telefonica.mistica.compose",
    accessorName = "MisticaIcons",
    outputSourceDirectory = srcDir,
    vectorsDirectory = iconsDir,
    type = VectorType.SVG,
    allAssetsPropertyName = "AllIcons",
)

println("We're done!")
