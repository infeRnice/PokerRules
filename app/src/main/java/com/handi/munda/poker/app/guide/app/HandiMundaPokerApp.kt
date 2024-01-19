package com.handi.munda.poker.app.guide.app

import android.app.Application
import com.handi.munda.poker.app.guide.di.DaggerHandiMundaPokerAppComponent
import com.handi.munda.poker.app.guide.di.HandiMundaPokerAppComponent


class HandiMundaPokerApp: Application() {

    lateinit var handiMundaPokerAppComponent: HandiMundaPokerAppComponent

    override fun onCreate() {
        super.onCreate()

        handiMundaPokerAppComponent = DaggerHandiMundaPokerAppComponent.builder()
            .context(this)
            .build()
    }
}