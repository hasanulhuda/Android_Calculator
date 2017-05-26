package com.example.hasanul.easymath.BangunRuang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.hasanul.easymath.R;

public class PilihBangunDatarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_bangun_datar);
    }

    public void persegiPanjang(View view) {
        Intent intent = new Intent(PilihBangunDatarActivity.this, com.example.hasanul.easymath.BangunRuang.HitungPersegiPanjangActivity.class);
        startActivity(intent);
    }

    public void lingkaran(View view) {
        Intent intent = new Intent(PilihBangunDatarActivity.this, com.example.hasanul.easymath.BangunRuang.HitungLingkaranActivity.class);
        startActivity(intent);
    }

    public void persegi(View view) {
        Intent intent = new Intent(PilihBangunDatarActivity.this, com.example.hasanul.easymath.BangunRuang.HitungPersegiActivity.class);
        startActivity(intent);
    }

    public void segitiga(View view) {
        Intent intent = new Intent(PilihBangunDatarActivity.this, com.example.hasanul.easymath.BangunRuang.HitungSegitigaActivity.class);
        startActivity(intent);
    }

    public void trapesium(View view) {
        Intent intent = new Intent(PilihBangunDatarActivity.this, com.example.hasanul.easymath.BangunRuang.HitungTrapesiumActivity.class);
        startActivity(intent);
    }

    public void layangLayang(View view) {
        Intent intent = new Intent(PilihBangunDatarActivity.this, com.example.hasanul.easymath.BangunRuang.HitungLayangLayangActivity.class);
        startActivity(intent);
    }

    public void belahKetupat(View view) {
        Intent intent = new Intent(PilihBangunDatarActivity.this, com.example.hasanul.easymath.BangunRuang.HitungBelahKetupatActivity.class);
        startActivity(intent);
    }

    public void jajarGenjang(View view) {
        Intent intent = new Intent(PilihBangunDatarActivity.this, com.example.hasanul.easymath.BangunRuang.HitungJajarGenjangActivity.class);
        startActivity(intent);
    }
}

