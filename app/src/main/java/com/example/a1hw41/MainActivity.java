package com.example.a1hw41;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private NameAdapter adapter;
    private ArrayList<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        recyclerView=findViewById(R.id.recycler);
        adapter = new NameAdapter(names);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        names = new ArrayList<>();
        names.add("Beksultan");
        names.add("Dastan");
        names.add("Bakyt bayke");
        names.add("Tilek");
        names.add("Myrzabekov");
        names.add("Daniel");
        names.add("Bolot bayke");
        names.add("Adilet");
        names.add("Arstan");
        names.add("Beka 98");
        names.add("Ramazan");
        names.add("Eldar");
        names.add("Marat");
        names.add("Sapar bayke");
        names.add("Akjol");
        names.add("Apakem");
        names.add("Ilyaz");
        names.add("Elaman");
        names.add("Emir");
        names.add("Sultan");
        names.add("Oroz");
        names.add("Adil");
    }
}