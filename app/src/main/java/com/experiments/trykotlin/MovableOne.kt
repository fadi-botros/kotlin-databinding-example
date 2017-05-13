package com.experiments.trykotlin

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.support.annotation.IntegerRes
import android.widget.EditText
import kotlin.properties.Delegates

/**
 * Created by mac on 5/11/17.
 */
class MovableOne  : BaseObservable() {
    var name : String = "Anonymous"
        get
        set(value) {field = value; notifyPropertyChanged(BR.name)}
    var height : Double = 50.0
        get
        set(value) {field = value; notifyPropertyChanged(BR.height)}
    var speed : Double = 100.0
        get
        set(value) {field = value; notifyPropertyChanged(BR.speed)}
}