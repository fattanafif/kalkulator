package com.example.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvHasil;
    private EditText etAngka1, etAngka2;
    private Button btnTambah, btnKurang, btnKali, btnBagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //tampilannya bisa di liat di sini
        setContentView(R.layout.activity_main);

        //memanggil id yang ada di tampilan
        tvHasil = findViewById(R.id.tvHasil);
        etAngka1 = findViewById(R.id.etAngka1);
        etAngka2 = findViewById(R.id.etAngka2);
        btnTambah = findViewById(R.id.btnTambah);
        btnKurang = findViewById(R.id.btnKurang);
        btnKali = findViewById(R.id.btnKali);
        btnBagi = findViewById(R.id.btnBagi);

        //event klik untuk button
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //ambil data dari Edittext
                String angka1 = etAngka1.getText().toString();
                String angka2 = etAngka2.getText().toString();

            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}
