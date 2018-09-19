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
public class UjiBus {
    public static void main(String[] args) {
        //membuat objek busMini dari kelas bus
        Bus busMini = new Bus ();
        //memasukkan nilai jumlah penumpang dan penumpang maksimal ke 
        //ke dalam objek busMini
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        //memanggil metod cetak pada kelas Bus
        busMini.cetak();
        
        //menambahkan penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 5;
        //memanggil method cetak pada kelaas Bus
        busMini.cetak();
        
        //mengurangi jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang -2;
        busMini.cetak();
        
        //menambahkan jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
    }
}
