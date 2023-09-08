package io.runebox.internal.updater.util

import me.tongfei.progressbar.ProgressBar
import me.tongfei.progressbar.ProgressBarBuilder
import me.tongfei.progressbar.ProgressBarStyle

object ProgressBar {

    private lateinit var progressBar: ProgressBar

    fun open(name: String, size: Int) {
        progressBar = ProgressBarBuilder()
            .setInitialMax(size.toLong())
            .setTaskName(name)
            .setMaxRenderedLength(130)
            .setUpdateIntervalMillis(1)
            .continuousUpdate()
            .setStyle(ProgressBarStyle.COLORFUL_UNICODE_BLOCK)
            .build()
    }

    fun step(count: Int = 1) {
        progressBar.stepBy(count.toLong())
    }

    fun stepTo(step: Int) {
        progressBar.stepTo(step.toLong())
    }

    fun close() {
        progressBar.close()
    }
}