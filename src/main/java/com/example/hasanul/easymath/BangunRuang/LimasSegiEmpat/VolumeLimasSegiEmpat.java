package com.example.hasanul.easymath.BangunRuang.LimasSegiEmpat;

/**
 * Created by hasanul on 26/05/17.
 */

public class VolumeLimasSegiEmpat {
    double luas_alas;
    double tinggi;

    public VolumeLimasSegiEmpat(double la, double t) {
        luas_alas = la;
        tinggi = t;
    }

    public double hitung_volume() {
        return 1.0 / 4 * luas_alas * tinggi;
    }
}
