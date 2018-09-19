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
public class UjiBus {
    public static void main(String[] args) {
        int password;
        
        Bus bus = new Bus(40);
        bus.cetak();
        
        bus.getpenumpang(17);
        bus.getpenumpang(24);
        bus.cetak();
        bus.addpenumpang(2);
        bus.cetak();
        bus.addpenumpang(1);
        bus.cetak();
        bus.addpenumpang(3);
        bus.cetak();
        System.out.println("Rata-rata penumpang :"+bus.getAverage());
    }
}
