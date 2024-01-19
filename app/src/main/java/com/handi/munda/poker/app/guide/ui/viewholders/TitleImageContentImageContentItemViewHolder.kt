package com.handi.munda.poker.app.guide.ui.viewholders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.handi.munda.poker.app.guide.R
import com.handi.munda.poker.domain.TitleImageContentImageContentItem

class TitleImageContentImageContentItemViewHolder(
    itemView: View,
    private val getImageResId: (String) -> Int
    ) : RecyclerView.ViewHolder(itemView) {
    private val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
    private val firstImageView: ImageView = itemView.findViewById(R.id.firstImageView)
    private val firstContentTextView: TextView = itemView.findViewById(R.id.firstContentTextView)
    private val secondImageView: ImageView = itemView.findViewById(R.id.secondImageView)
    private val secondContentTextView: TextView = itemView.findViewById(R.id.secondContentTextView)

    fun bind(item: TitleImageContentImageContentItem) {
        titleTextView.text = item.title
        firstImageView.setImageResource(getImageResId(item.firstImageResId))
        firstContentTextView.text = item.firstContent
        secondImageView.setImageResource(getImageResId(item.secondImageResId))
        secondContentTextView.text = item.secondContent
    }
}