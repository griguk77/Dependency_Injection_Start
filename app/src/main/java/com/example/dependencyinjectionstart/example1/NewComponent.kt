package com.example.dependencyinjectionstart.example1

@dagger.Component
interface NewComponent {

    fun getKeyboard(): Keyboard

    fun inject(activity: Activity)
}