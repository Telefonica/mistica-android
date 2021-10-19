package com.telefonica.mistica.feedback.screen.haptics

import android.content.Context
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator

fun Context.performHapticFeedback(type: HapticFeedbackType) {
    val vibrator = getVibrator()

    if (!vibrator.hasVibrator()) {
        return
    }

    val repeat = -1
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        vibrator.vibrate(VibrationEffect.createWaveform(type.pattern, repeat))
    } else {
        @Suppress("DEPRECATION")
        vibrator.vibrate(type.pattern, repeat)
    }
}

private fun Context.getVibrator(): Vibrator {
    val vibratorName = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
        Context.VIBRATOR_MANAGER_SERVICE
    } else {
        @Suppress("DEPRECATION")
        Context.VIBRATOR_SERVICE
    }

    return getSystemService(vibratorName) as Vibrator
}

enum class HapticFeedbackType(val pattern: LongArray) {
    SUCCESS(longArrayOf(0, 15, 100, 15)),
    ERROR(longArrayOf(0, 15, 100, 15, 100, 15))
}