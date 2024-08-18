package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AlphaAnimation
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.RvItemBinding

class RvAdapter(var datalist: ArrayList<rv_model>, var context: Context): RecyclerView.Adapter<RvAdapter.MyViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//        var view =LayoutInflater.from(context).inflate(R.layout.rv_item,parent,false)
//        return MyViewHolder(view)


        var binding =RvItemBinding.inflate(LayoutInflater.from(context),parent,false)
//        var binding =RvItemBinding.inflate(LayoutInflater.from(context))


        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return datalist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        anim(holder.itemView)
        holder.binding.profile.setImageResource(datalist[position].profile)
        holder.binding.name.text=datalist[position].name
        holder.binding.username.text=datalist[position].username
        holder.itemView.setOnClickListener{
            Toast.makeText(context, "Nishat", Toast.LENGTH_SHORT).show()
        }

    }

    inner   class MyViewHolder(var binding: RvItemBinding) : RecyclerView.ViewHolder(binding.root)

    fun anim(view: View){
        var animation = AlphaAnimation(0.0f,1.0f)
        animation.duration=1000
        view.startAnimation(animation)

    }
}