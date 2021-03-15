package com.example.classwork5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);
        mainAdapter = new MainAdapter();
        recyclerView.setAdapter(mainAdapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(
                this,LinearLayoutManager.HORIZONTAL,
                false);
        recyclerView.setLayoutManager(manager);

        ArrayList<ItemModel> list = new ArrayList<>();
        list.add(0, new ItemModel("", R.drawable.img1));
        list.add(1, new ItemModel("", R.drawable.img2));
        list.add(2, new ItemModel("", R.drawable.img3));
        list.add(3, new ItemModel("", R.drawable.image4));
        list.add(4, new ItemModel(" ", R.drawable.image5));

        mainAdapter.addText(list);


    }
}