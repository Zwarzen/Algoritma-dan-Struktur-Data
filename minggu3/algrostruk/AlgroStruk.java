/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algrostruk;

import java.util.Scanner;

/**
 *
 * @author R154NG
 */
public class AlgroStruk{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial [] fk = new Faktorial[elemen];
        for(int i = 0; i < elemen; i++){
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-"+(i+1)+" : ");
            fk[i].nilai = sc.nextInt();
        }
        
        System.out.println("============================================");
        System.out.println("Hasil Faktorial Brute Force");
        for(int i = 0; i < elemen; i++){
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("=============================================");
        System.out.println("Hasil Faktorial Divide and Conquer");
        for(int i = 0; i < elemen; i++){
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah " + fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println("=============================================");
        
        
    }
}
