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
public class Bus3 {
    private int penumpang;
    private int maxpenumpang;
    private int penumpangbaru;
    
    public Bus3(int maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    public void addpenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if(temp>maxpenumpang){
            System.out.println("Penumpang melebiihi Kuota");
        }else{
            this.penumpang= temp;
        }
    }
    public void getpenumpang(int password){
        if(password==01){
            System.out.println("Password benar");
        }else{
            System.out.println("Password Salah");
        }
    }
    public void cetak(){
        System.out.println("Penumpang bus sekarang "+penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah "+maxpenumpang);
    }
}
