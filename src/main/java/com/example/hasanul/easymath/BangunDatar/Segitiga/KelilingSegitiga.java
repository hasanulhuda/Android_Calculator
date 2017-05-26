package com.example.hasanul.easymath.BangunDatar.Segitiga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hasanul.easymath.R;

public class KelilingSegitiga {
    double sisiA;
    double sisiB;
    double sisiC;


    public KelilingSegitiga(double sA, double sB, double sC) {
        sisiA = sA;
        sisiB = sB;
        sisiC = sC;
    }

    public double hitung_keliling() {
        return sisiA + sisiB + sisiC;
    }
}
