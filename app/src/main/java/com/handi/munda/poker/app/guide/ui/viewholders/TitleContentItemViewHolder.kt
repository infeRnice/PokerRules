package com.handi.munda.poker.app.guide.ui.viewholders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.handi.munda.poker.app.guide.R
import com.handi.munda.poker.domain.TitleContentItem

class TitleContentItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
    private val contentTextView: TextView = itemView.findViewById(R.id.contentTextView)

    fun bind (item: TitleContentItem) {
        titleTextView.text = item.title
        contentTextView.text = item.content
    }
}