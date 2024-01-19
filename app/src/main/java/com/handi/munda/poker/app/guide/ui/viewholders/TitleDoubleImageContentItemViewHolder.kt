package com.handi.munda.poker.app.guide.ui.viewholders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.handi.munda.poker.app.guide.R
import com.handi.munda.poker.domain.TitleDoubleImageContentItem

class TitleDoubleImageContentItemViewHolder(
    itemView: View,
    private val getImageResId: (String) -> Int
    ) : RecyclerView.ViewHolder(itemView) {
    private val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
    private val firstImageView: ImageView = itemView.findViewById(R.id.firstImageView)
    private val secondImageView: ImageView = itemView.findViewById(R.id.secondImageView)
    private val contentTextView: TextView = itemView.findViewById(R.id.contentTextView)

    fun bind(item: TitleDoubleImageContentItem) {
        titleTextView.text = item.title
        firstImageView.setImageResource(getImageResId(item.firstImageResId))
        secondImageView.setImageResource(getImageResId(item.secondImageResId))
        contentTextView.text = item.content
    }
}
