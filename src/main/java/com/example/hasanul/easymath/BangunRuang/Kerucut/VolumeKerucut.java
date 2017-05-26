package com.example.hasanul.easymath.BangunRuang.Kerucut;

import com.example.hasanul.easymath.BangunRuang.Tabung;

/**
 * Created by hasanul on 26/05/17.
 */

public class VolumeKerucut extends Tabung {
    public VolumeKerucut(double r, double t) {
        super(r, t);
    }

    public double hitung_volume() {
        return (1.0 / 3 * super.hitung_volume());
    }
}
