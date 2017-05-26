package com.example.hasanul.easymath.BangunDatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hasanul.easymath.R;

public class Lingkaran {
    public double jari_jari;

    public Lingkaran(double r) {
        jari_jari = r;
    }

    public double hitung_luas() {
        return Math.PI * Math.pow(jari_jari, 2);
    }

    public double hitung_keliling() {
        return (Math.PI * (2 * jari_jari));
    }
}
