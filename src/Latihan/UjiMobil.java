/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author Aby
 */
public class UjiMobil {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Password : ");
        String pw = input.next();
        mobil.setPassword("wow");
        if (pw == mobil.getPassword()){
            System.out.println("Password Benar");
        }else {
            System.out.println("Password Salah");
        }
}
}
