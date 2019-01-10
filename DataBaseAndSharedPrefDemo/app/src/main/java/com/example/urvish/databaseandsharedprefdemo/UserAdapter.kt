package com.example.urvish.databaseandsharedprefdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

import kotlinx.android.synthetic.main.list_row_item.*
import kotlinx.android.synthetic.main.list_row_item.view.*

class UserAdapter(val context:Context,val dataSource:ArrayList<User>):BaseAdapter(){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater=context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rowView=inflater.inflate(R.layout.list_row_item,parent,false)
        rowView.username.text=dataSource.get(position).email
        return rowView
    }

    override fun getItem(position: Int): Any {
       return dataSource.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount()=dataSource.size

}