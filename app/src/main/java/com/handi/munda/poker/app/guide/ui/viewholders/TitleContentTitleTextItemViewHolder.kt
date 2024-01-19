package com.handi.munda.poker.app.guide.ui.viewholders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.handi.munda.poker.app.guide.R
import com.handi.munda.poker.domain.TitleContentTitleTextItem

class TitleContentTitleTextItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val firstTitleTextView: TextView = itemView.findViewById(R.id.firstTitleTextView)
    private val firstContentTextView: TextView = itemView.findViewById(R.id.firstContentTextView)
    private val secondTitleTextView: TextView = itemView.findViewById(R.id.secondTitleTextView)
    private val secondTextTextView: TextView = itemView.findViewById(R.id.secondTextTextView)
    fun bind(item: TitleContentTitleTextItem) {
        firstTitleTextView.text = item.firstTitle
        firstContentTextView.text = item.firstContent
        secondTitleTextView.text = item.secondTitle
        secondTextTextView.text = item.secondText

    }
}