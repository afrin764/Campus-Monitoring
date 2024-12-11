package com.example.campusmonitoring;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView direc;
    private ImageView l1,evnt,maps;

    MyAdapter myAdapter;
    String[] title,des;
    int[] images={
            R.drawable.c2,R.drawable.c1, R.drawable.c2,R.drawable.c2 ,R.drawable.c1
            ,R.drawable.c2 , R.drawable.c3,R.drawable.c2

    };

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        direc = findViewById(R.id.log1);
        direc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,MainDirectory.class);
                startActivity(intent);
            }
        });

        l1 = findViewById(R.id.im5);
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,LostAndFound_main.class);
                startActivity(intent);
            }
        });
        evnt= findViewById(R.id.im4);
        evnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivityEvent.class);
                startActivity(intent);
            }
        });
        /*recyclerView=findViewById(R.id.rv);

        title=getResources().getStringArray(R.array.Canteen);

        des = getResources().getStringArray(R.array.Description);
        myAdapter = new MyAdapter(this ,title,des,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));*/
        maps=findViewById (R.id.im3);
        maps.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivityMaps.class);
                startActivity(intent);
            }
        });
    }
}