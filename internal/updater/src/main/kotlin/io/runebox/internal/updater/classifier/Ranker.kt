package io.runebox.internal.updater.classifier

interface Ranker<T> {
    var weight: Double
    fun getScore(a: T, b: T): Double
}