package com.imgur.cats.ui

import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.imgur.cats.databinding.ListItemCatsBinding
import com.imgur.cats.domain.models.Image
import com.imgur.cats.utils.IMAGE_JPEG_FORMAT
import com.imgur.cats.utils.MP4_FORMAT
import com.squareup.picasso.Picasso

class CatsAdapter(private val mediaList: List<Image>) :
    RecyclerView.Adapter<CatsAdapter.ViewHolder>() {

    inner class ViewHolder(private val listItemCatsBinding: ListItemCatsBinding) :
        RecyclerView.ViewHolder(listItemCatsBinding.root) {
        fun bind(image: Image) {
            when (image.type) {
                IMAGE_JPEG_FORMAT -> {
                    listItemCatsBinding.catImage.run {
                        visibility = View.VISIBLE
                        Glide.with(itemView).load(image.link).into(this)
                    }
                }

                MP4_FORMAT -> {
                    listItemCatsBinding.catVideo.run {
                        visibility = View.VISIBLE
                        setVideoURI(image.link.toUri())
                        setOnPreparedListener {
                            start()
                        }
                    }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ListItemCatsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return mediaList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(mediaList[position])
    }
}