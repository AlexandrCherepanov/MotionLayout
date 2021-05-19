package com.cherepanov.motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_collapsing_toolbar_start.*
import kotlinx.android.synthetic.main.tutorial_item.view.*

class CollapseToolbarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collapsing_toolbar_start)

        recyclerView.apply {
            adapter = DummyListAdapter()
            layoutManager = LinearLayoutManager(this@CollapseToolbarActivity)
        }
    }
}


class DummyListAdapter: RecyclerView.Adapter<DummyListAdapter.ViewHolder>() {

    class ViewHolder(val layout: ConstraintLayout) : RecyclerView.ViewHolder(layout)



    override fun onBindViewHolder(holder: DummyListAdapter.ViewHolder, position: Int) {
        holder.itemView.textView.text = "Sample item $position"
    }

    override fun getItemCount() = 15

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DummyListAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.text_list_item, parent, false) as ConstraintLayout
        )
    }

}