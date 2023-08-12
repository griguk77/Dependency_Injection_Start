package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {

    @Inject
    lateinit var keyboard: Keyboard

    @Inject
    lateinit var mouse: Mouse

    @Inject
    lateinit var monitor: Monitor

//    val keyboard = DaggerNewComponent.create().getKeyboard()

    init {
        DaggerNewComponent.create().inject(this)
    }
}