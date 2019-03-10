package com.example.latihanandroid4.tampilanDepan;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.latihanandroid4.R;

public class HalamanKetiga extends Fragment {

    /**
     * method untuk membuat/inisialisasi fragmet
     *
     * @param idx
     * @return
     */

    public static HalamanKetiga newInstance(int idx) {
        HalamanKetiga fragment = new HalamanKetiga();
        Bundle b = new Bundle();
        b.putInt("index", idx);
        fragment.setArguments(b);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.halaman_ketiga, container, false);

        setHasOptionsMenu(true);
        return v;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_tiga, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_1: {
                Toast.makeText(getActivity(), "Menu 1", Toast.LENGTH_SHORT).show();
            }
            break;
            case R.id.menu_2: {
                Toast.makeText(getActivity(), "Menu 2", Toast.LENGTH_SHORT).show();
            }
            break;
            case R.id.menu_3: {
                Toast.makeText(getActivity(), "Menu 3", Toast.LENGTH_SHORT).show();
            }
            break;
            default: {
                Toast.makeText(getActivity(), "Default", Toast.LENGTH_SHORT).show();
            }
            break;
        }
        return super.onOptionsItemSelected(item);
    }
}
