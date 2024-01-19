package com.handi.munda.poker.app.guide.di

import android.content.Context
import com.handi.munda.poker.app.guide.ui.activities.MainActivity
import com.handi.munda.poker.app.guide.ui.fragments.HandiMundaPokerAppMenuFragment
import com.handi.munda.poker.app.guide.ui.fragments.HandiMundaPokerAppRuleFragment
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [HandiMundaPokerAppDataModule::class,
        HandiMundaPokerAppDomainModule::class,
        HandiMundaPokerAppModule::class,
        HandiMundaPokerAppViewModelModule::class,
        HandiMundaPokerAppRepositoryModule::class,
        HandiMundaPokerAppViewModelFactoryModule::class]
)
interface HandiMundaPokerAppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun context(context: Context): Builder

        fun build(): HandiMundaPokerAppComponent
    }

    fun injectToActivity(mainActivity: MainActivity)

    fun injectToHandiMundaPokerAppMenuFragment(handiMundaPokerAppMenuFragment: HandiMundaPokerAppMenuFragment)

    fun injectToHandiMundaPokerAppRuleFragment(handiMundaPokerAppRuleFragment: HandiMundaPokerAppRuleFragment)
}