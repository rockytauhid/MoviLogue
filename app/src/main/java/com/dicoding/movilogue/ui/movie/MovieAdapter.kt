package com.dicoding.movilogue.ui.movie

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.movilogue.R
import com.dicoding.movilogue.data.Movie
import com.dicoding.movilogue.databinding.ItemsMovieBinding
import com.dicoding.movilogue.ui.detail.DetailMovieActivity
import java.util.*

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.CourseViewHolder>() {
    private var listCourses = ArrayList<Movie>()

    fun setCourses(courses: List<Movie>?) {
        if (courses == null) return
        this.listCourses.clear()
        this.listCourses.addAll(courses)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val itemsAcademyBinding = ItemsMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CourseViewHolder(itemsAcademyBinding)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        val course = listCourses[position]
        holder.bind(course)
    }

    override fun getItemCount(): Int = listCourses.size


    class CourseViewHolder(private val binding: ItemsMovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: Movie) {
            with(binding) {
                tvItemTitle.text = movie.login
                tvItemDate.text = itemView.resources.getString(R.string.deadline_date, movie.deadline)
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailMovieActivity::class.java)
                    intent.putExtra(DetailMovieActivity.EXTRA_COURSE, movie.id)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                        .load(movie.avatarUrl)
                        .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                                .error(R.drawable.ic_error))
                        .into(imgPoster)
            }
        }
    }
}

