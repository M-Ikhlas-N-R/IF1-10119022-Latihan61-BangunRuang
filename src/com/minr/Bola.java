package com.minr;


public class Bola extends BangunRuang{
    
    private final float radius;

    public Bola(int radius) {
        this.radius = radius;
    }

    @Override
    float hitungVolume() {
        return (float) (1.3 * Math.PI * Math.pow(radius,3));
    }
}
