package com.dicoding.movilogue.ui.tvshow

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.movilogue.R
import com.dicoding.movilogue.data.TVShow
import com.dicoding.movilogue.databinding.ItemsTvshowBinding
import com.dicoding.movilogue.ui.detail.DetailMovieActivity
import com.dicoding.movilogue.utils.Companion
import java.util.*

class TVShowAdapter : RecyclerView.Adapter<TVShowAdapter.CourseViewHolder>() {
    private var listItems = ArrayList<TVShow>()

    fun setCourses(tvshows: List<TVShow>?) {
        if (tvshows == null) return
        this.listItems.clear()
        this.listItems.addAll(tvshows)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val itemsAcademyBinding = ItemsTvshowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CourseViewHolder(itemsAcademyBinding)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        val course = listItems[position]
        holder.bind(course)
    }

    override fun getItemCount(): Int = listItems.size

    class CourseViewHolder(private val binding: ItemsTvshowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tvshow: TVShow) {
            with(binding) {
                tvItemTitle.text = tvshow.name
                tvItemDate.text = itemView.resources.getString(R.string.deadline_date, tvshow.first_air_date?.let { Date(it) })
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailMovieActivity::class.java)
                    intent.putExtra(DetailMovieActivity.EXTRA_COURSE, tvshow.id)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                        .load(Companion.POSTER_PATH_BASE_URL + tvshow.poster_path)
                        .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                                .error(R.drawable.ic_error))
                        .into(imgPoster)
            }
        }
    }
}

