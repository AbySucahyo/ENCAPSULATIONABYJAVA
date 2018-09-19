/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import Praktikum.Bola;

/**
 *
 * @author Aby
 */
public class MainBola {
    public static void main(String[] args) {
        double r=14;
        Bola objekbola = new Bola(7);
        objekbola.showDiameter();
        objekbola.showLuasPermukaan();
        objekbola.showVolume();
        System.out.println("\n\n");
        objekbola.setR(r);
        objekbola.showDiameter();
        objekbola.showLuasPermukaan();
        objekbola.showVolume();
    }
}
