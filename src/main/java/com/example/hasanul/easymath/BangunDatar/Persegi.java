package com.example.hasanul.easymath.BangunDatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hasanul.easymath.R;

public class Persegi {
    double sisi;

    public Persegi(double s) {
        sisi = s;
    }

    public double hitung_luas() {
        return (Math.pow(sisi, 2));
    }

    public double hitung_keliling() {
        return (4 * sisi);
    }
}
