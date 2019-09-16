package com.example.fragmentstutorial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context context;
    List<Contact> data;


    public RecyclerViewAdapter(Context context, List<Contact> data) {
        this.context = context;
        this.data = data;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.item_contact, parent, false);

        MyViewHolder viewHolder = new MyViewHolder(v);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.name.setText(data.get(position).getName());
        holder.phone.setText(data.get(position).getPhone());
        holder.img.setImageResource(data.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private TextView phone;
        private ImageView img;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.item_name);
            phone = itemView.findViewById(R.id.item_phone);
            img = itemView.findViewById(R.id.item_img);
        }
    }

}
