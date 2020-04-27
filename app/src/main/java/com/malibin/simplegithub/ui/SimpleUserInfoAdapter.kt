package com.malibin.simplegithub.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.malibin.simplegithub.data.SimpleUserInfo
import com.malibin.simplegithub.databinding.ItemSimpleUserInfoBinding

/**
 * Created By Yun Hyeok
 * on 4월 27, 2020
 */

class SimpleUserInfoAdapter :
    ListAdapter<SimpleUserInfo, SimpleUserInfoAdapter.ViewHolder>(DiffCallback()) {

    private var itemClickListener: SimpleUserInfoClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemSimpleUserInfoBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val repository = getItem(position)
        holder.bind(repository)
    }

    fun setItemClickListener(itemClickListener: SimpleUserInfoClickListener?) {
        this.itemClickListener = itemClickListener
    }

    inner class ViewHolder(
        private val binding: ItemSimpleUserInfoBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(simpleUserInfo: SimpleUserInfo) {
            binding.user = simpleUserInfo
            binding.itemClickListener = itemClickListener
        }
    }

    private class DiffCallback : DiffUtil.ItemCallback<SimpleUserInfo>() {
        override fun areItemsTheSame(oldItem: SimpleUserInfo, newItem: SimpleUserInfo): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: SimpleUserInfo, newItem: SimpleUserInfo): Boolean {
            return oldItem == newItem
        }
    }

    interface SimpleUserInfoClickListener {
        fun onUserClick(simpleUserInfo: SimpleUserInfo)
    }
}