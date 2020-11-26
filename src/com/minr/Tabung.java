package com.minr;


public class Tabung extends BangunRuang{
    
    private final float radius;
    private final float tinggi;

    public Tabung(int radius, int tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    @Override
    float hitungVolume() {
        return (float) (Math.PI * Math.pow(radius, 2) * tinggi);
    }
}
