package com.example.hiltexample2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller
import com.funnydevs.hilt_conductor.annotations.ConductorEntryPoint

@ConductorEntryPoint
class MainController(args: Bundle?) : Controller(args) {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup, savedViewState: Bundle?): View {
        return inflater.inflate(R.layout.controller_main, container, false)
    }
}