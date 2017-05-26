package com.example.hasanul.easymath.BangunRuang.Kerucut;

/**
 * Created by hasanul on 26/05/17.
 */

public class LuasKerucut{
    double jari_jari;
    double garis_lukis;

    public LuasKerucut(double r,double s) {
        jari_jari = r;
        garis_lukis = s;
    }

    public double hitung_luas() {
        return (Math.PI * Math.pow(jari_jari, 2)) + (Math.PI * jari_jari * garis_lukis);
    }
}
