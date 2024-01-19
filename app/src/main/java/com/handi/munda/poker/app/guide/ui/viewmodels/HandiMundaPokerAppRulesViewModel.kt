package com.handi.munda.poker.app.guide.ui.viewmodels

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.handi.munda.poker.domain.HandiMundaPokerAppRuleItem
import com.handi.munda.poker.domain.repository.HandiMundaRepository
import kotlinx.coroutines.launch
import javax.inject.Inject


class HandiMundaPokerAppRulesViewModel @Inject constructor(private val handiMundaRepository: HandiMundaRepository) : ViewModel() {

    companion object {
        const val TOTAL_RULES = 21
        fun getImageResourceId(resourceName: String, context: Context): Int {
            return context.resources.getIdentifier(resourceName, "drawable", context.packageName)
        }
    }

    private val _rules = MutableLiveData<HandiMundaPokerAppRuleItem>()
    val rules: LiveData<HandiMundaPokerAppRuleItem> = _rules

    fun loadRule(ruleId: Int) {
        viewModelScope.launch {
            val rule = handiMundaRepository.getRuleById(ruleId)
            _rules.postValue(rule)
        }
    }
}