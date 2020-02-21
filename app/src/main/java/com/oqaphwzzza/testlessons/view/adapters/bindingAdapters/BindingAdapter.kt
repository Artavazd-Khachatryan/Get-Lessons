package com.oqaphwzzza.testlessons.view.adapters.bindingAdapters

import android.view.View
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

object BindingAdapter {

    @BindingAdapter("app:recyclerAdapter")
    @JvmStatic
    fun setRecyclerAdapter(recyclerView: RecyclerView, adapter: RecyclerView.Adapter<*>) {
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(
            recyclerView.context,
            LinearLayoutManager.HORIZONTAL,
            false
        )
    }

    @BindingAdapter("app:visible")
    @JvmStatic
    fun setViewVisible(view: View, state: Int) {
        if (state == View.VISIBLE ||
            state == View.INVISIBLE ||
            state == View.GONE
        ) {
            view.visibility = state
        }
    }

}