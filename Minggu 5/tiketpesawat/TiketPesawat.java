/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiketpesawat;

import java.util.Scanner;

/**
 *
 * @author R154NG
 */
public class TiketPesawat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        TiketPesawatHarga data = new TiketPesawatHarga();
        int jumTiket = 3;
        
        for(int i = 0; i < jumTiket; i++){
            System.out.print("Maskapai : ");
            String maskapai = s.nextLine();
            System.out.print("Jumlah Penerbangan : ");
            int transitCount = s1.nextInt();
            System.out.print("Waktu Tempuh : ");
            int flightTime = s1.nextInt();            
            System.out.print("Harga : ");
            float harga = s1.nextFloat();
            
            TiketPesawatSorting m = new TiketPesawatSorting(maskapai, harga, transitCount, flightTime);
            data.tambah(m);
        }
    System.out.println("Data Tiket Penerbangan Sebelum Sorting : ");
    data.tampil();
        
    System.out.println("Data Tiket setelah Sorting Desc berdasarkan Harga : ");
    data.bubbleSort();
    data.tampil();
        
    System.out.println("Data Tiket setelah Sorting Asc berdasarkan Harga : ");
    data.selectionSort();
    data.tampil();
    }
}
