package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class skor_activity extends AppCompatActivity {
    int skorA = 0;
    int skorB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor);
        TextView namaTimA = findViewById(R.id.skorA);
        TextView namaTimB = findViewById(R.id.skorB);
        String namaA = getIntent().getStringExtra("Tim A");
        String namaB = getIntent().getStringExtra("Tim B");
        namaTimA.setText("Team" + " " + namaA);
        namaTimB.setText("Team" + " " + namaB);
    }

    public void Tambah(View view) {
        if (view.getId() == R.id.plus_satu_a) {
            skorA = skorA + 1;
        } else if (view.getId() == R.id.plus_dua_a) {
            skorA = skorA + 2;
        } else if (view.getId() == R.id.plus_tiga_a) {
            skorA = skorA + 3;
        } else if (view.getId() == R.id.plus_satu_a) {
            skorB = skorB + 1;
        } else if (view.getId() == R.id.plus_dua_b) {
            skorB = skorB + 2;
        } else if (view.getId() == R.id.plus_tiga_b) {
            skorB = skorB + 3;
        }
        TextView skorTimA = findViewById(R.id.skorA);
        TextView skorTimB = findViewById(R.id.skorB);
        skorTimA.setText(String.valueOf(skorA));
        skorTimB.setText(String.valueOf(skorB));
    }

    public void ResetB(View view) {
        TextView skorTimB = findViewById(R.id.skorB);
        skorB = 0;
        skorTimB.setText(String.valueOf(skorB));
    }

    public void ResetA(View view) {
        TextView skorTimA = findViewById(R.id.skorA);
        skorA = 0;
        skorTimA.setText(String.valueOf(skorA));
    }
}
