package com.example.utspraktik_if2_10118062_muhammaddandrihandian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView Tambah = (ImageView)
                findViewById(R.id.imageView);

        Tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);
            }
        });

        Button Tambah2 = (Button)
                findViewById(R.id.button2);

        Tambah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
/* Tanggal : 05/06/2021
   Nama : Muhammad Dandri Handian
   Nim : 10118062
   Kelas : IF2

 */