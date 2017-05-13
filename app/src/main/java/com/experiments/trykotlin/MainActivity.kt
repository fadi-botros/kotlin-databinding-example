package com.experiments.trykotlin

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.experiments.trykotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var d = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        var model = MovableOne()
        d.setVariable(BR.`var`, MovableOneInMeter(model))
        d.setVariable(BR.var2, MovableOneInFoot(model))
        d.executePendingBindings()
    }
}
