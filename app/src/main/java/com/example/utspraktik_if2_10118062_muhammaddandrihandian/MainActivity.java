package com.example.utspraktik_if2_10118062_muhammaddandrihandian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Tambah = (TextView)
                findViewById(R.id.button);

        Tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(MainActivity.this, MainActivity2.class);
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