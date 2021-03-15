package com.example.classwork5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {

    TextView nameItem;
    ImageView imageView;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);

        nameItem = itemView.findViewById(R.id.tv_item);
        imageView = itemView.findViewById(R.id.iv_item);
    }

    public void onBind(ItemModel data){
nameItem.setText(data.name);
imageView.setImageResource(data.age);
    }

}
