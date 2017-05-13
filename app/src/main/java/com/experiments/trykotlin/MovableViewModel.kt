package com.experiments.trykotlin

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.Observable
import android.widget.EditText

/**
 * Created by mac on 5/11/17.
 */
abstract class MovableViewModel(var model: MovableOne) : BaseObservable() {
    init {
        model.addOnPropertyChangedCallback(object : Observable.OnPropertyChangedCallback() {
            override fun onPropertyChanged(p0: Observable?, p1: Int) {
                notifyPropertyChanged(p1)
            }
        })
    }

    abstract fun convert(value : Double): Double
    abstract fun backConvert(value : Double): Double

    @get:Bindable var name : String
        get() = model.name
        set(value) { model.name = value }
    @get:Bindable var height : Double
        get() = backConvert(model.height)
        set(value) { model.height = convert(value) }
    @get:Bindable var speed : Double
        get() = backConvert(model.speed)
        set(value) { model.speed = convert(value) }

    fun calculate(et1 : EditText, et2 : EditText, et3 : EditText) {
        name = et1.text.toString()
        height = et2.text.toString().toDouble()
        speed = et3.text.toString().toDouble()
    }
}