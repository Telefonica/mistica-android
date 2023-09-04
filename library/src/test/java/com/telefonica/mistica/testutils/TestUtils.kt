package com.telefonica.mistica.testutils

import org.junit.Test

object TestUtils {
    fun findRunningTestMethodName(): String {
        val stackTrace = Thread.currentThread().stackTrace
        for (element in stackTrace) {
            val methodName = element.methodName
            val className = element.className
            val testClass = Class.forName(className)
            val methods = testClass.declaredMethods
            for (method in methods) {
                if (method.name == methodName && method.isAnnotationPresent(Test::class.java)) {
                    return methodName.replace(
                        oldValue = " ",
                        newValue = "_"
                    )
                }
            }
        }
        throw IllegalStateException("Could not find running test method name")
    }
}
