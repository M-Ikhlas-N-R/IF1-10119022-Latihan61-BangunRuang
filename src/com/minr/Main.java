/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minr;

/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : latihan abstract dan interface
 *
 */
public class Main {

    public static void main(String[] args) {
        BangunRuang bola = new Bola(7);
        System.out.println("Volume Bola : " + bola.hitungVolume());

        BangunRuang tabung = new Tabung(10, 21);
        System.out.println("Volume Tabung : " + tabung.hitungVolume());

        BangunRuang kerucut = new Kerucut(9, 14);
        System.out.println("Volume Kerucut : " + kerucut.hitungVolume());
    }
    
}
