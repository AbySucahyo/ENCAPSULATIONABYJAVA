/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Aby
 */
public class Bus {
    private double penumpang;
    private double maxpenumpang;
    private double penumpangBaru;
    private double counter;
    
    public Bus(double maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    public void addpenumpang(double penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        if(temp>maxpenumpang){
            System.out.println("Penumpang melebihi Kuota");
        }else{
            this.penumpang=temp;
            counter++;
        }
    }
    public void getpenumpang(int password){
        if(password==25){
            System.out.println("Password benar");
        }else{
            System.out.println("Password Salah");
        }
    }
    public double getAverage(){
        return penumpang/counter;
    }
    public void cetak(){
        System.out.println("Penumpang Bus Sekarang "+ penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah "+maxpenumpang);
    }
}
