/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;
import java.lang.Math;
/**
 *
 * @author Aby
 */
public class Bola {
    private double r;
    public  Bola (double r){
        this.r=r;
    }
    public void setR(double r){
        this.r=r;
    }
    public void showDiameter(){
        System.out.println("Diameter Bola "+2*r);
    }
    public void showLuasPermukaan(){
        System.out.println("Luas Permukaan Bola "+(4*Math.pow(r,2)));
    }
    public void showVolume(){
        System.out.println("Volume Bola "+(4/3*Math.PI*Math.pow(r,3)));
    }
}
