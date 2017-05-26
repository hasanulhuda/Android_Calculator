package com.example.hasanul.easymath.BangunDatar.LayangLayang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hasanul.easymath.R;

public class LuasLayangLayang {
    double diagonal_satu;
    double diagonal_dua;

    public LuasLayangLayang(double d1, double d2){
        diagonal_satu=d1;
        diagonal_dua=d2;
    }

    public double hitung_luas(){
        return (diagonal_satu*diagonal_dua)/2;
    }
}
