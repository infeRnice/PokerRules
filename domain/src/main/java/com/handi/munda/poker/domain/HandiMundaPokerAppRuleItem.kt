package com.handi.munda.poker.domain

sealed class HandiMundaPokerAppRuleItem {
    abstract val id: Int
}

data class TitleContentItem(override val id: Int, val title: String, val content: String) : HandiMundaPokerAppRuleItem()

data class TitleImageContentItem(override val id: Int, val title: String, val imageResId: String, val content: String) : HandiMundaPokerAppRuleItem()

data class TitleContentTitleTextItem(override val id: Int, val firstTitle: String, val firstContent: String, val secondTitle: String, val secondText: String) : HandiMundaPokerAppRuleItem()

data class TitleContentGapContentItem(override val id: Int, val title: String, val firstContent: String, val secondContent: String) : HandiMundaPokerAppRuleItem()

data class TitleImageContentImageContentItem(override val id: Int, val title: String, val firstImageResId: String, val firstContent: String, val secondImageResId: String, val secondContent: String) : HandiMundaPokerAppRuleItem()

data class TitleDoubleImageContentItem(override val id: Int, val title: String, val firstImageResId: String, val secondImageResId: String, val content: String) : HandiMundaPokerAppRuleItem()
