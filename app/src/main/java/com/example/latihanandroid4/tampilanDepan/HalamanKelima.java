package com.example.latihanandroid4.tampilanDepan;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.latihanandroid4.R;

import java.util.ArrayList;
import java.util.List;

public class HalamanKelima extends Fragment {

    /**
     * method untuk membuat/inisialisasi fragmet
     *
     * @param idx
     * @return
     */

    public static HalamanKelima newInstance(int idx) {
        HalamanKelima fragment = new HalamanKelima();
        Bundle b = new Bundle();
        b.putInt("index", idx);
        fragment.setArguments(b);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.halaman_kelima, container, false);
        ListView lv = v.findViewById(R.id.lv_sample2);
        List<String> data = new ArrayList<String>();
        data.add("Pertama");
        data.add("Kedua");
        data.add("Ketiga");
        data.add("Keempat");
        data.add("Kelima");
        data.add("Pertama");
        data.add("Kedua");
        data.add("Ketiga");
        data.add("Keempat");
        data.add("Kelima");
        data.add("Pertama");
        data.add("Kedua");
        data.add("Ketiga");
        data.add("Keempat");
        data.add("Kelima");
        data.add("Pertama");
        data.add("Kedua");
        data.add("Ketiga");
        data.add("Keempat");
        data.add("Kelima");

        final ArrayAdapter<String> array = new ArrayAdapter<String>(getActivity(), R.layout.halaman_kelima, R.id.tv_sample2, data);
        lv.setAdapter(array);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView) view.findViewById(R.id.tv_sample2);
                String text = textView.getText().toString();
                Toast.makeText(getActivity(), "Hallo saya fragment " + text, Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }
}
