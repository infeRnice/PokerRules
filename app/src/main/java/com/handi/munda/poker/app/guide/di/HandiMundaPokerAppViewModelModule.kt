package com.handi.munda.poker.app.guide.di

import com.handi.munda.poker.app.guide.di.factories.HandiMundaPokerAppViewModelFactory
import com.handi.munda.poker.domain.repository.HandiMundaRepository
import dagger.Module
import dagger.Provides

@Module
class HandiMundaPokerAppViewModelModule {
    @Provides
    fun provideHandiMundaPokerAppViewModelFactory(handiMundaRepository: HandiMundaRepository): HandiMundaPokerAppViewModelFactory {
        return HandiMundaPokerAppViewModelFactory(handiMundaRepository)
    }
}