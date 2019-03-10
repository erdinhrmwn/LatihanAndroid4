package com.example.latihanandroid4.allAdapter;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import com.example.latihanandroid4.tampilanDepan.HalamanKedua;
import com.example.latihanandroid4.tampilanDepan.HalamanKeempat;
import com.example.latihanandroid4.tampilanDepan.HalamanKelima;
import com.example.latihanandroid4.tampilanDepan.HalamanKetiga;
import com.example.latihanandroid4.tampilanDepan.HalamanPertama;

public class NavBottomAdapter extends FragmentPagerAdapter {

    final int RG = 5;
    private Fragment currentFragment;

    public NavBottomAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0: {
                currentFragment = HalamanPertama.newInstance(0);
            }
            break;
            case 1: {
                currentFragment = HalamanKedua.newInstance(1);
            }
            break;
            case 2: {
                currentFragment = HalamanKetiga.newInstance(2);
            }
            break;
            case 3: {
                currentFragment = HalamanKeempat.newInstance(3);
            }
            break;
            case 4: {
                currentFragment = HalamanKelima.newInstance(4);
            }
            break;
            default: {
                currentFragment = HalamanPertama.newInstance(0);
            }
            break;
        }
        return currentFragment;
    }

    @Override
    public int getCount() {
        return RG;
    }

    @Override
    public void setPrimaryItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        super.setPrimaryItem(container, position, object);
    }

    public Fragment getCurrentFragment() {
        return currentFragment;
    }
}
