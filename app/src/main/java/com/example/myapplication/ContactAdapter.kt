package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.fragment.app.Fragment


class ContactAdapter(private val context: Context, private val data: List<BlankFragment.Person>) : BaseAdapter(){
    private val inflater = LayoutInflater.from(context)
    private val itemList = data.toMutableList()

    override fun getCount(): Int {
        return itemList.size
    }

    override fun getItem(position: Int): Any {
        return itemList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View =
            convertView ?: inflater.inflate(R.layout.list_items, parent, false)

        val item = itemList[position]
        val nameId = view.findViewById<TextView>(R.id.outName)
        val phoneId = view.findViewById<TextView>(R.id.outPhoneNumber)
        nameId.text = item.name
        phoneId.text = item.telephone.toString()

        return view
    }

    fun addItem(item: String) {
        //itemList.add(item)
        notifyDataSetChanged()
    }

}