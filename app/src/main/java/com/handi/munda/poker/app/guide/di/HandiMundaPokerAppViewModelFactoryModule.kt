package com.handi.munda.poker.app.guide.di

import androidx.lifecycle.ViewModelProvider
import com.handi.munda.poker.app.guide.di.factories.HandiMundaPokerAppViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class HandiMundaPokerAppViewModelFactoryModule {
    @Provides
    fun provideHandiMundaViewModelFactory(factory: HandiMundaPokerAppViewModelFactory): ViewModelProvider.Factory {
        return factory
    }
}