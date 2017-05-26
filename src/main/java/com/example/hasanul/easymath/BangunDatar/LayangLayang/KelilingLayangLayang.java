package com.example.hasanul.easymath.BangunDatar.LayangLayang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hasanul.easymath.R;

public class KelilingLayangLayang {
    double sisi_satu;
    double sisi_dua;

    public KelilingLayangLayang(double s1, double s2) {
        sisi_satu = s1;
        sisi_dua = s2;
    }

    public double hitung_keliling(){
        return 2*(sisi_satu+sisi_dua);
    }
}
