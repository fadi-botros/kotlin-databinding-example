package com.experiments.trykotlin

/**
 * Created by mac on 5/11/17.
 */
class MovableOneInFoot(model : MovableOne) : MovableViewModel(model) {
    override fun backConvert(value: Double): Double = value
    override fun convert(value: Double): Double = value
}
