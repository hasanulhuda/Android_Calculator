
package com.example.hasanul.easymath.BangunDatar.Trapesium;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hasanul.easymath.R;

public class KelilingTrapesium {
    double AB, BC, CD, DA;

    public KelilingTrapesium(double ab, double bc, double cd, double da) {
        AB = ab;
        BC = bc;
        CD = cd;
        DA = da;
    }

    public double hitung_keliling() {
        return AB + BC + CD + DA;
    }
}
