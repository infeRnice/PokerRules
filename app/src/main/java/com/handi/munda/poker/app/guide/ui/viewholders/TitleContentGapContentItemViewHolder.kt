package com.handi.munda.poker.app.guide.ui.viewholders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.handi.munda.poker.app.guide.R
import com.handi.munda.poker.domain.TitleContentGapContentItem

class TitleContentGapContentItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
    private val firstContentTextView: TextView = itemView.findViewById(R.id.firstContentTextView)
    private val secondContentTextView: TextView = itemView.findViewById(R.id.secondContentTextView)

    fun bind(item: TitleContentGapContentItem) {
        titleTextView.text = item.title
        firstContentTextView.text = item.firstContent
        secondContentTextView.text = item.secondContent
    }
}