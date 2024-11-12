package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class LangAdapter (val contex:Context,
    val langs :HashMap<String,Language>):ArrayAdapter<String>(contex,0,langs.keys.toList()){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.languages_layout, parent, false)

        val languageName = getItem(position) ?: ""
        val languageData = langs[languageName]

        view.findViewById<TextView>(R.id.lang).text = languageName
        view.findViewById<TextView>(R.id.year).text = languageData?.annee
        view.findViewById<ImageView>(R.id.icon).setImageResource(languageData?.icon ?: 0)

        return view
    }
}
