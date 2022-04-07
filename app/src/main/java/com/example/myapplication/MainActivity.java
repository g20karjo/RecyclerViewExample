package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> mountains = Arrays.asList("K2","Kebnekaise","Billingen", "Ida", "Hunneberg", "Halleberg", "Erik", "Sebastian", "Wille", "Erik 2",  "Karl", "Eriksberg","Hejsan");

        recyclerView=findViewById(R.id.recycler_view);
        MountainAdapter mountainAdapter = new MountainAdapter(mountains);
        recyclerView.setAdapter(mountainAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }
}