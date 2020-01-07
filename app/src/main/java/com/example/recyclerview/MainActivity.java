package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recylcerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String[] languages = {"java","HTML","CSS","kotlin","c","c++","SQL","PSQL","Ruby","python","PHP","Javascript"};
        recyclerView.setAdapter(new Adapter (languages));
    }
}
