package com.handi.munda.poker.app.guide.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.handi.munda.poker.app.guide.R
import com.handi.munda.poker.domain.HandiMundaPokerAppRuleItem
import com.handi.munda.poker.domain.TitleContentGapContentItem
import com.handi.munda.poker.domain.TitleContentItem
import com.handi.munda.poker.domain.TitleContentTitleTextItem
import com.handi.munda.poker.domain.TitleDoubleImageContentItem
import com.handi.munda.poker.domain.TitleImageContentImageContentItem
import com.handi.munda.poker.domain.TitleImageContentItem
import com.handi.munda.poker.app.guide.ui.viewholders.TitleContentGapContentItemViewHolder
import com.handi.munda.poker.app.guide.ui.viewholders.TitleContentItemViewHolder
import com.handi.munda.poker.app.guide.ui.viewholders.TitleContentTitleTextItemViewHolder
import com.handi.munda.poker.app.guide.ui.viewholders.TitleDoubleImageContentItemViewHolder
import com.handi.munda.poker.app.guide.ui.viewholders.TitleImageContentImageContentItemViewHolder
import com.handi.munda.poker.app.guide.ui.viewholders.TitleImageContentItemViewHolder

class HandiMundaPokerAppRuleItemAdapter(
    private var handiMundaItems: List<HandiMundaPokerAppRuleItem>,
    private val getImageResId: (String) -> Int
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemViewType(position: Int): Int {
        return when (handiMundaItems[position]) {
            is TitleContentItem -> R.layout.item_title_content
            is TitleImageContentItem -> R.layout.item_title_image_content
            is TitleContentTitleTextItem -> R.layout.item_title_content_title_text
            is TitleContentGapContentItem -> R.layout.item_title_content_gap_content
            is TitleImageContentImageContentItem -> R.layout.item_title_image_content_image_content
            is TitleDoubleImageContentItem -> R.layout.item_title_double_image_content
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            R.layout.item_title_content -> TitleContentItemViewHolder(layoutInflater.inflate(R.layout.item_title_content, parent, false))
            R.layout.item_title_image_content -> TitleImageContentItemViewHolder(layoutInflater.inflate(R.layout.item_title_image_content, parent, false)) { resourceName ->
                parent.context.resources.getIdentifier(resourceName, "drawable", parent.context.packageName)
            }
            R.layout.item_title_content_title_text -> TitleContentTitleTextItemViewHolder(layoutInflater.inflate(R.layout.item_title_content_title_text, parent, false))
            R.layout.item_title_content_gap_content -> TitleContentGapContentItemViewHolder(layoutInflater.inflate(R.layout.item_title_content_gap_content, parent, false))
            R.layout.item_title_image_content_image_content -> TitleImageContentImageContentItemViewHolder(layoutInflater.inflate(R.layout.item_title_image_content_image_content, parent, false)) { resourceName ->
                parent.context.resources.getIdentifier(resourceName, "drawable", parent.context.packageName)
            }
            R.layout.item_title_double_image_content -> TitleDoubleImageContentItemViewHolder(layoutInflater.inflate(R.layout.item_title_double_image_content, parent, false)) { resourceName ->
                parent.context.resources.getIdentifier(resourceName, "drawable", parent.context.packageName)
            }
            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = handiMundaItems[position]
        when (holder) {
            is TitleContentItemViewHolder -> holder.bind(item as TitleContentItem)
            is TitleImageContentItemViewHolder -> holder.bind(item as TitleImageContentItem)
            is TitleContentTitleTextItemViewHolder -> holder.bind(item as TitleContentTitleTextItem)
            is TitleContentGapContentItemViewHolder -> holder.bind(item as TitleContentGapContentItem)
            is TitleImageContentImageContentItemViewHolder -> holder.bind(item as TitleImageContentImageContentItem)
            is TitleDoubleImageContentItemViewHolder -> holder.bind(item as TitleDoubleImageContentItem)
        }
    }

    override fun getItemCount(): Int = handiMundaItems.size

    fun updateData(newItems: List<HandiMundaPokerAppRuleItem>) {
        handiMundaItems = newItems
        notifyDataSetChanged()
    }
}