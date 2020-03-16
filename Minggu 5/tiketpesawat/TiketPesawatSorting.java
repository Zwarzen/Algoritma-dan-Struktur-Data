/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiketpesawat;

/**
 *
 * @author R154NG
 */
public class TiketPesawatSorting {
    String maskapai;
    float harga;
    int flightTime, transitCount;
    
    TiketPesawatSorting(String m, float h, int t, int f){        
        maskapai = m;
        harga = h;
        flightTime = f;
        transitCount = t; 
        
        
    }
    
    void tampil(){        
        System.out.println("Maskapai = " + maskapai);
        System.out.println("Tujuan = " + flightTime);
        System.out.println("Tujuan = " + transitCount);
        System.out.println("Harga = " + harga);
    }
}
