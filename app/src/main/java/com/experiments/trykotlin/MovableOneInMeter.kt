package com.experiments.trykotlin

/**
 * Created by mac on 5/11/17.
 */
class MovableOneInMeter(model : MovableOne) : MovableViewModel(model) {
    override fun backConvert(value: Double): Double = value * 3
    override fun convert(value: Double): Double = value / 3
}