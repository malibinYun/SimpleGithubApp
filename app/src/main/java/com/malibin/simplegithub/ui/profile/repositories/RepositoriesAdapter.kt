package com.malibin.simplegithub.ui.profile.repositories

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.malibin.simplegithub.data.Repository
import com.malibin.simplegithub.databinding.ItemRepositoryBinding

/**
 * Created By Yun Hyeok
 * on 4월 27, 2020
 */

class RepositoriesAdapter :
    ListAdapter<Repository, RepositoriesAdapter.ViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemRepositoryBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val repository = getItem(position)
        holder.bind(repository)
    }

    inner class ViewHolder(
        private val binding: ItemRepositoryBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(repository: Repository) {
            binding.repository = repository
        }
    }

    private class DiffCallback : DiffUtil.ItemCallback<Repository>() {
        override fun areItemsTheSame(oldItem: Repository, newItem: Repository): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Repository, newItem: Repository): Boolean {
            return oldItem == newItem
        }
    }
}