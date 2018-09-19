/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Aby
 */
public class UjiBus3 {
    public static void main(String[] args) {
        int password;
        Bus3 bus = new Bus3(5);
        bus.getpenumpang(17);
        bus.getpenumpang(24);
        bus.cetak();
        bus.addpenumpang(2);
        bus.cetak();
        bus.addpenumpang(1);
        bus.cetak();
        bus.addpenumpang(1);
    }
}
