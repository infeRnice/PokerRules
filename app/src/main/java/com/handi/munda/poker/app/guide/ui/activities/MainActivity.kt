package com.handi.munda.poker.app.guide.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import com.handi.munda.poker.app.guide.R
import com.handi.munda.poker.app.guide.app.HandiMundaPokerApp
import com.handi.munda.poker.app.guide.di.factories.HandiMundaPokerAppViewModelFactory
import com.handi.munda.poker.app.guide.ui.viewmodels.HandiMundaPokerAppMenuViewModel

import javax.inject.Inject


class MainActivity : AppCompatActivity() {



    @Inject
    lateinit var handiMundaPokerAppViewModelFactory: HandiMundaPokerAppViewModelFactory

    private lateinit var handiMundaPokerAppVM: HandiMundaPokerAppMenuViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (applicationContext as HandiMundaPokerApp).handiMundaPokerAppComponent.injectToActivity(this)

        handiMundaPokerAppVM = ViewModelProvider(this, handiMundaPokerAppViewModelFactory)
            .get(HandiMundaPokerAppMenuViewModel::class.java)

        setContentView(R.layout.activity_main)

    }
}
