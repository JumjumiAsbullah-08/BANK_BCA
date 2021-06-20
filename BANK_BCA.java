# BANK_BCA
ini adalah tugas Praktikum KONSTRUKTOR DAN OVERLOADING

package com.mycompany.bank_bca;
import java.util.Scanner;

class BANK {
    private int saldo;
    Scanner msk = new Scanner (System.in);
    
public BANK(int saldo ){
    this.saldo = saldo;
}
void SimpanUang(int simpan){
    simpan = msk.nextInt();
    saldo = simpan+saldo;
    System.out.println(" Saldo Saat ini : Rp. " +saldo);
}
void AmbilUang(int ambil){
    ambil = msk.nextInt();
    saldo = saldo - ambil;
    System.out.println(" Uang yang Anda Ambil : Rp. " +ambil);
    System.out.println(" Saldo Saat ini  : Rp. " +saldo);
}
void GetSaldo(int get_saldo){
    System.out.println(" Saldo Saat ini : Rp. " +saldo);
}
}
public class bank_beraksi {
    public static void main(String[] args) {
       int ambil = 0;
       int simpan = 0;
       int get_saldo = 100000;
       
        BANK bank = new BANK(100000);
        
        System.out.println(" SELAMAT DATANG DI BANK BCA "); 
        bank.GetSaldo(get_saldo);
        
        System.out.println("  Simpan Uang : Rp. ");
        bank.SimpanUang(simpan); 
    
        System.out.println(" \n Ambil Uang : Rp. ");
        bank.AmbilUang(ambil);    
    }
}
