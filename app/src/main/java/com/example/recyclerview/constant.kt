package com.example.recyclerview

object constant {
    private lateinit var datalist: ArrayList<rv_model>

    fun getdata(): ArrayList<rv_model> {

        var datalist = ArrayList<rv_model>()

        datalist=ArrayList<rv_model>()

        datalist.add(rv_model(R.drawable.book,"Book name","order"))
        datalist.add(rv_model(R.drawable.book,"Book name","order"))
        datalist.add(rv_model(R.drawable.book,"Book name","order"))
        datalist.add(rv_model(R.drawable.book,"Book name","order"))
        datalist.add(rv_model(R.drawable.book,"Book name","order"))
        datalist.add(rv_model(R.drawable.book,"Book name","order"))
        datalist.add(rv_model(R.drawable.book,"Book name","order"))
        datalist.add(rv_model(R.drawable.book,"Book name","order"))

        return datalist

    }
}