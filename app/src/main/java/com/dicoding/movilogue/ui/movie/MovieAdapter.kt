package com.dicoding.movilogue.ui.movie

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.movilogue.R
import com.dicoding.movilogue.data.Movie
import com.dicoding.movilogue.databinding.ItemsMovieBinding
import com.dicoding.movilogue.ui.detail.DetailMovieActivity
import com.dicoding.movilogue.utils.Companion
import java.util.*

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    private var listItems = ArrayList<Movie>()

    fun setCourses(items: LiveData<List<Movie>>?) {
        if (items == null) return
        this.listItems.clear()
        this.listItems.addAll(items)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieAdapter.MovieViewHolder {
        val binding = ItemsMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieAdapter.MovieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieAdapter.MovieViewHolder, position: Int) {
        val item = listItems[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = listItems.size

    class MovieViewHolder(private val binding: ItemsMovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: Movie) {
            with(binding) {
                tvItemTitle.text = movie.title
                tvItemDate.text = itemView.resources.getString(R.string.deadline_date, movie.release_date?.let { Date(it) })
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailMovieActivity::class.java)
                    intent.putExtra(DetailMovieActivity.EXTRA_COURSE, movie.id)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                        .load(Companion.POSTER_PATH_BASE_URL + movie.poster_path)
                        .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                                .error(R.drawable.ic_error))
                        .into(imgPoster)
            }
        }
    }
}

