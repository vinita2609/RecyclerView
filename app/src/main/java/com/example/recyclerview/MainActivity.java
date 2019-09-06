package com.example.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

        private RecyclerView recyclerView;
        private RecyclerView.LayoutManager layoutManager;
        private List<String> List;
        private RecyclerAdapter adapter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            recyclerView = findViewById(R.id.recycleview);
            layoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(layoutManager);

            List = Arrays.asList(getResources().getStringArray(R.array.android_versions));

            adapter = new RecyclerAdapter(List);
            recyclerView.setHasFixedSize(true);
            recyclerView.setAdapter(adapter);

        }
}
