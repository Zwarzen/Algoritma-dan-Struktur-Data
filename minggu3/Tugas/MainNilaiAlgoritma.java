/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
import java.util.Scanner;
/**
 *
 * @author R154NG
 */
public class MainNilaiAlgoritma {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Mencari Nilai Akhir");
        
        System.out.print("Masukkan Nilai Tugas : ");
        int NilaiTugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis : ");
        int NilaiKuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        int NilaiUts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        int NilaiUas = sc.nextInt();
        
        double a,b,c,d;
        
        a = NilaiTugas*0.3;
        b = NilaiKuis*0.2;
        c = NilaiUts*0.2;
        d = NilaiUas*0.3;
        
        double nilaiAkhir = a+b+c+d;
        
        System.out.println("Nilai akhir anda adalah : " + nilaiAkhir);
    }      
}
