package com.example.hasanul.easymath.BangunRuang;

import com.example.hasanul.easymath.BangunDatar.Lingkaran;

import static com.example.hasanul.easymath.R.string.jari_jari;

/**
 * Created by hasanul on 26/05/17.
 */

public class Bola extends Lingkaran {

    public Bola(double r) {
        super(r);
    }

    public double hitung_luas() {
        return (4 * super.hitung_luas());
    }

    public double hitung_volume() {
        return (4.0 / 3 * Math.PI * (jari_jari*jari_jari*jari_jari));
    }
}
