package com.example.hasanul.easymath.BangunDatar.Trapesium;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hasanul.easymath.R;

public class LuasTrapesium {
    double AB;
    double CD;
    double tinggi;

    public LuasTrapesium(double ab, double cd, double t) {
        AB = ab;
        CD = cd;
        tinggi = t;
    }

    public double hitung_luas() {
        return ((AB + CD) * tinggi) / 2;
    }
}