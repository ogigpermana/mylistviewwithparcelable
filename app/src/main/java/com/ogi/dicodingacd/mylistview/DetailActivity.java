package com.ogi.dicodingacd.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.ogi.dicodingacd.mylistview.model.Planet;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_PLANET = "extra_planet";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Overview dari tiap planet");
        }

        Planet detailPlanetPilihan = getIntent().getParcelableExtra(EXTRA_PLANET);

        if (detailPlanetPilihan != null){

            ImageView ivPlanet = findViewById(R.id.IvPlanet);
            ivPlanet.setImageResource(detailPlanetPilihan.getGambarPlanet());
            ivPlanet.setScaleType(ImageView.ScaleType.CENTER_CROP);

            TextView tvNamaPlanet = findViewById(R.id.TvNamaPlanet);
            tvNamaPlanet.setText("Nama Planet : " + detailPlanetPilihan.getNamePlanet());

            TextView tvDeskripsiPlanet = findViewById(R.id.TvPlanetDeskripsi);
            tvDeskripsiPlanet.setText("Gambaran Planet : " + detailPlanetPilihan.getDeskripsiPlanet());

            TextView tvUkuranPlanet = findViewById(R.id.TvUkuranPlanet);
            tvUkuranPlanet.setText(String.valueOf("Ukuran Planet : " + detailPlanetPilihan.getUkuranPlanet() + " ribu km"));
        }
    }
}
