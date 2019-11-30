package com.example.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Restauran extends AppCompatActivity {

    private EditText etmakanan, etqty, etharga;
    private Button btnsimpan;

    //adapter
    private RecyclerView recyclerView;
    private RiwayatAdapter adapter;
    private ArrayList<String> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //tampilan
        setContentView(R.layout.activity_restauran);

        //memanggil id
        etmakanan = findViewById(R.id.etmakanan);
        etqty = findViewById(R.id.etqty);
        etharga = findViewById(R.id.etharga);
        btnsimpan = findViewById(R.id.btnsimpan);

        //inisialisasi recycleview
        recyclerView=findViewById(R.id.recyclerView);
        adapter = new RiwayatAdapter(list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        //event klik button
        btnsimpan.setOnClickListener() {

            // ambil data
        String makanan = etmakanan.getText().toString();
        String qty = etqty.getText().toString();
        String harga = etharga.getText().toString();
        }

    }
}
