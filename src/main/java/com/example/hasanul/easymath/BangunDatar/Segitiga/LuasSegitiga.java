package com.example.hasanul.easymath.BangunDatar.Segitiga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hasanul.easymath.R;

public class LuasSegitiga {
    public double alas;
    public double tinggi;

    public LuasSegitiga(double a,double t) {
        alas = a;
        tinggi = t;
    }

    public double hitung_luas() {
        return (alas * tinggi) / 2;
    }
}
