package com.malibin.simplegithub.ui.profile.organizations

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.malibin.simplegithub.data.Organization
import com.malibin.simplegithub.databinding.ItemOrganizationBinding

/**
 * Created By Yun Hyeok
 * on 4월 27, 2020
 */

class OrganizationsAdapter :
    ListAdapter<Organization, OrganizationsAdapter.ViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemOrganizationBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val organization = getItem(position)
        holder.bind(organization)
    }

    inner class ViewHolder(
        private val binding: ItemOrganizationBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(organization: Organization) {
            binding.organization = organization
        }
    }

    private class DiffCallback : DiffUtil.ItemCallback<Organization>() {
        override fun areItemsTheSame(oldItem: Organization, newItem: Organization): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Organization, newItem: Organization): Boolean {
            return oldItem == newItem
        }
    }
}