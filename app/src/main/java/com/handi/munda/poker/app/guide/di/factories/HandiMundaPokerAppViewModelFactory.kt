package com.handi.munda.poker.app.guide.di.factories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.handi.munda.poker.app.guide.ui.viewmodels.HandiMundaPokerAppMenuViewModel
import com.handi.munda.poker.app.guide.ui.viewmodels.HandiMundaPokerAppRulesViewModel
import com.handi.munda.poker.domain.repository.HandiMundaRepository
import javax.inject.Inject

class HandiMundaPokerAppViewModelFactory @Inject constructor(
    private val handiMundaRepository: HandiMundaRepository
): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(HandiMundaPokerAppMenuViewModel::class.java) -> HandiMundaPokerAppMenuViewModel()
            modelClass.isAssignableFrom(HandiMundaPokerAppRulesViewModel::class.java) -> HandiMundaPokerAppRulesViewModel(handiMundaRepository)
            else -> throw IllegalArgumentException("Unknown ViewModel class")
        } as T
    }
}