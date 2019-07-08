package com.ogi.dicodingacd.mylistview.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Planet implements Parcelable {
    private String namePlanet, deskripsiPlanet;
    private int gambarPlanet;
    private float ukuranPlanet;

    public Planet(String namePlanet, String deskripsiPlanet, int gambarPlanet, float ukuranPlanet){
        this.namePlanet = namePlanet;
        this.deskripsiPlanet = deskripsiPlanet;
        this.gambarPlanet = gambarPlanet;
        this.ukuranPlanet = ukuranPlanet;
    }

    protected Planet(Parcel in) {
        namePlanet = in.readString();
        deskripsiPlanet = in.readString();
        gambarPlanet = in.readInt();
        ukuranPlanet = in.readFloat();
    }

    public static final Creator<Planet> CREATOR = new Creator<Planet>() {
        @Override
        public Planet createFromParcel(Parcel in) {
            return new Planet(in);
        }

        @Override
        public Planet[] newArray(int size) {
            return new Planet[size];
        }
    };

    public String getNamePlanet() {
        return namePlanet;
    }

    public void setNamePlanet(String namePlanet) {
        this.namePlanet = namePlanet;
    }

    public String getDeskripsiPlanet() {
        return deskripsiPlanet;
    }

    public void setDeskripsiPlanet(String deskripsiPlanet) {
        this.deskripsiPlanet = deskripsiPlanet;
    }

    public int getGambarPlanet() {
        return gambarPlanet;
    }

    public void setGambarPlanet(int gambarPlanet) {
        this.gambarPlanet = gambarPlanet;
    }

    public float getUkuranPlanet() {
        return ukuranPlanet;
    }

    public void setUkuranPlanet(float ukuranPlanet) {
        this.ukuranPlanet = ukuranPlanet;
    }

    public Planet(){}

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(namePlanet);
        parcel.writeString(deskripsiPlanet);
        parcel.writeInt(gambarPlanet);
        parcel.writeFloat(ukuranPlanet);
    }
}
