package com.example.lab3mobile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TipAdapter(
    private val tips: List<Tip>
) : RecyclerView.Adapter<TipAdapter.TipViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_tip, parent, false)
        return TipViewHolder(view)
    }

    override fun onBindViewHolder(holder: TipViewHolder, position: Int) {
        holder.bind(tips[position])
    }

    override fun getItemCount() = tips.size

    class TipViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvDay: TextView = itemView.findViewById(R.id.tv_day)
        private val tvTitle: TextView = itemView.findViewById(R.id.tv_title)
        private val tvFullDescription: TextView = itemView.findViewById(R.id.tv_full_description)
        private val ivImage: ImageView = itemView.findViewById(R.id.iv_image)

        fun bind(tip: Tip) {
            // Используем строковый ресурс для дня
            tvDay.text = itemView.context.getString(R.string.day_template, tip.day)
            tvTitle.text = tip.title
            tvFullDescription.text = tip.fullDescription
            ivImage.setImageResource(tip.imageResId)
        }
    }
}