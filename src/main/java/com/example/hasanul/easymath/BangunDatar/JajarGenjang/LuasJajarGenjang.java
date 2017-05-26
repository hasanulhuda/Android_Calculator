package com.example.hasanul.easymath.BangunDatar.JajarGenjang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hasanul.easymath.R;

public class LuasJajarGenjang {
    double alas;
    double tinggi;

    public LuasJajarGenjang(double a, double t) {
        alas = a;
        tinggi = t;
    }

    public double hitung_luas() {
        return (alas * tinggi);
    }

}
