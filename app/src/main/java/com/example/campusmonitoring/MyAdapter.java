package com.example.campusmonitoring;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    String[] title,des;
    int[] images;

    public MyAdapter(Context context, String[] title, String[] des, int[] images) {
        this.context = context;
        this.title = title;
        this.des = des;
        this.images = images;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater =LayoutInflater.from(context);
        View view= layoutInflater.inflate(R.layout.simple_layout,viewGroup,false);
        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.titleText.setText(title[i]);
        myViewHolder.desText.setText(des[i]);
        myViewHolder.canImage.setImageResource(images[i]);

    }

    @Override
    public int getItemCount() {
        return title.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView titleText,desText;
        ImageView canImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titleText=itemView.findViewById(R.id.tv1);
            desText=itemView.findViewById(R.id.td1);
            canImage=itemView.findViewById(R.id.iv1);
        }
    }

}