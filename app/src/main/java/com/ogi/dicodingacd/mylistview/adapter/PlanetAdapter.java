package com.ogi.dicodingacd.mylistview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.ogi.dicodingacd.mylistview.R;
import com.ogi.dicodingacd.mylistview.model.Planet;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class PlanetAdapter extends BaseAdapter {
    Context context;
    ArrayList<Planet> planets;

    public PlanetAdapter(Context context, ArrayList<Planet> planets) {
        this.context = context;
        this.planets = planets;
    }

    @Override
    public int getCount() {
        return planets.size();
    }

    @Override
    public Object getItem(int i) {
        return planets.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.daftar_item_planet,viewGroup, false);
        }

        ViewHolder viewHolder = new ViewHolder(view);
        Planet planet = (Planet) getItem(i);
        viewHolder.bind(planet);

        return view;
    }

    private class ViewHolder{
        private TextView tvNamaPlanet, tvDeskripsiPlanet, tvUkuranPlanet;
        private ImageView ivPlanet;

        ViewHolder(View view){
            tvNamaPlanet = view.findViewById(R.id.TvNamaPlanet);
            tvDeskripsiPlanet = view.findViewById(R.id.TvPlanetDeskripsi);
            tvUkuranPlanet = view.findViewById(R.id.TvUkuranPlanet);
            ivPlanet = view.findViewById(R.id.IvPlanet);
        }

        void bind(Planet planet){
            DecimalFormat decimalFormat = new DecimalFormat("0.##");
            tvNamaPlanet.setText(planet.getNamePlanet());
            tvDeskripsiPlanet.setText("Overview : " + planet.getDeskripsiPlanet());
            tvUkuranPlanet.setText(String.valueOf("Ukuran : " + decimalFormat.format(planet.getUkuranPlanet()) + " ribu km"));
            ivPlanet.setImageResource(planet.getGambarPlanet());
        }
    }
}
