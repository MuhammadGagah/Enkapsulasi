/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

/**
 *
 * @author muham
 */
public class Enkapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persegi P = new Persegi();
        P.setPanjang(7);    
        P.setLebar(6);
        System.out.println("Selamat datang pada program hitung persegi panjang");
        System.out.println("Program ini dibuat menggunakan java");
                System.out.println("Sebagai tugas dari pak Roberto");
                System.out.println("Dan inilah hasilnya.");
                System.out.println("Salam, Muhammad.");
                System.out.println("----------");
        System.out.println("Panjang: " +P.getPanjang());
        System.out.println("Lebar: " +P.getLebar());
        System.out.print("Luas persegi: " +P.getLuas());
    }
    
}
