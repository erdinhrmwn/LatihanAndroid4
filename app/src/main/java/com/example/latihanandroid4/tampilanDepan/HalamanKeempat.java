package com.example.latihanandroid4.tampilanDepan;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.latihanandroid4.R;

import java.util.ArrayList;
import java.util.List;

public class HalamanKeempat extends Fragment {
    private ListView lv;
    /**
     * method untuk membuat/inisialisasi fragmet
     *
     * @param idx
     * @return
     */

    public static HalamanKeempat newInstance(int idx) {
        HalamanKeempat fragment = new HalamanKeempat();
        Bundle b = new Bundle();
        b.putInt("index", idx);
        fragment.setArguments(b);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.halaman_keempat, container, false);
        lv = (ListView) v.findViewById(R.id.lv_sample2);
        List<String> data = new ArrayList<String>();
        data.add("Facebook");
        data.add("Twitter");
        data.add("Path");
        data.add("G+");
        data.add("Instagram");

        ArrayAdapter<String> array = new ArrayAdapter<String>(getActivity(), R.layout.halaman_keempat, R.id.tv_sample2, data);
        lv.setAdapter(array);
        return v;
    }
}
