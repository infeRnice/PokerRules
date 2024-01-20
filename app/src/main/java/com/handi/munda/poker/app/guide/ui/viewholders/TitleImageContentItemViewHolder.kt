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

        // Установка серого фона только для определенных правил
        if (item.id != 2 && item.id != 5) {
            imageView.setBackgroundResource(R.color.custom_gray)
        } else {
            // Убрать фон, если это правило 1 или 4
            imageView.setBackgroundResource(0)
        }

        contentTextView.text = item.content
    }
}