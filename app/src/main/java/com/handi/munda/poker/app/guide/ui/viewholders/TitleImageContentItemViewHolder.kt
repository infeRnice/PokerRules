package com.handi.munda.poker.app.guide.ui.viewholders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.handi.munda.poker.app.guide.R
import com.handi.munda.poker.domain.TitleImageContentItem

class TitleImageContentItemViewHolder(
    itemView: View,
    private val getImageResId: (String) -> Int
    ) : RecyclerView.ViewHolder(itemView) {
    private val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
    private val imageView: ImageView = itemView.findViewById(R.id.imageView)
    private val contentTextView: TextView = itemView.findViewById(R.id.contentTextView)

    fun bind(item: TitleImageContentItem) {
        titleTextView.text = item.title
        imageView.setImageResource(getImageResId(item.imageResId))
        contentTextView.text = item.content
    }
}