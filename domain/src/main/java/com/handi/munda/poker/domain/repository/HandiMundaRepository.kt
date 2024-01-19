package com.handi.munda.poker.domain.repository

import com.handi.munda.poker.domain.HandiMundaPokerAppRuleItem

interface HandiMundaRepository {
    fun getRuleById(id: Int): HandiMundaPokerAppRuleItem
}