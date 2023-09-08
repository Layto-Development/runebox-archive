package io.runebox.internal.updater.classifier

import io.runebox.internal.updater.asm.Matchable

abstract class AbstractClassifier<T : Matchable<T>> {

    val rankers = mutableListOf<Ranker<T>>()
    var maxScore: Double = 0.0

    abstract fun init()

    fun register(ranker: Ranker<T>, weight: Int) {
        ranker.weight = weight.toDouble()
        rankers.add(ranker)
        maxScore += ranker.weight
    }

    @DslMarker
    annotation class RankerDslMarker

    @RankerDslMarker
    fun ranker(block: (a: T, b: T) -> Double): Ranker<T> {
        return object : Ranker<T> {
            override var weight: Double = 0.0
            override fun getScore(a: T, b: T): Double = block(a, b)
        }
    }
}