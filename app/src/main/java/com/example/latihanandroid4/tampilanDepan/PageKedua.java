package com.example.latihanandroid4.tampilanDepan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.latihanandroid4.R;

public class PageKedua extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_kedua);
        TextView text = findViewById(R.id.tv2);
        Bundle b = getIntent().getExtras();
        if (b != null) {
            String nama = b.getString("k");
            text.setText(nama);
        } else {
            text.setText("Nama tidak ada");
        }
    }
}
