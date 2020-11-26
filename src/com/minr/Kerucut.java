package com.minr;

public class Kerucut extends BangunRuang{
    private final float tinggi;
    private final float radius;

    public Kerucut(int tinggi, int radius) {
        this.tinggi = tinggi;
        this.radius = radius;
    }

    @Override
    float hitungVolume() {
        return (float) (0.3 * Math.PI * Math.pow(radius, 2) * tinggi);
    }
}
