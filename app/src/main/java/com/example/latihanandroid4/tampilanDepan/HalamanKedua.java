package com.example.latihanandroid4.tampilanDepan;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.latihanandroid4.R;

public class HalamanKedua extends Fragment {

    /**
     * method untuk membuat/inisialisasi fragmet
     *
     * @param idx
     * @return
     */

    public static HalamanKedua newInstance(int idx) {
        HalamanKedua fragment = new HalamanKedua();
        Bundle b = new Bundle();
        b.putInt("index", idx);
        fragment.setArguments(b);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.halaman_kedua, container, false);
        Button btn = v.findViewById(R.id.btn2);
        final EditText text = v.findViewById(R.id.text);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name;
                name = text.getText().toString();
                Bundle b = new Bundle();
                b.putString("k", name);
                Intent i = new Intent(getActivity(), PageKedua.class);
                i.putExtras(b);
                startActivity(i);
            }
        });
        return v;
    }
}
