package com.handi.munda.poker.app.guide.di

import com.handi.munda.poker.data.repository.HandiMundaRepositoryImpl
import com.handi.munda.poker.domain.repository.HandiMundaRepository
import dagger.Module
import dagger.Provides

@Module
class HandiMundaPokerAppRepositoryModule {
    @Provides
    fun provideHandiMundaRepository(): HandiMundaRepository {
        return HandiMundaRepositoryImpl()
    }
}