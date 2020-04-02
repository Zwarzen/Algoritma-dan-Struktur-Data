/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utssortingsearching;

import java.util.Scanner;

/**
 *
 * @author R154NG
 */
public class UtsSortingSearching {
    private static Object pencarian;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        DaftarMahasiswaBerprestasi data = new DaftarMahasiswaBerprestasi();
        int jumMhs = 4;
        
        for(int i = 0; i < jumMhs; i++){
            System.out.print("Nama : ");
            String nama = s1.nextLine();
            System.out.print("Tahun Masuk : ");
            int thn = s.nextInt();
            System.out.print("Umur : ");
            int umur = s.nextInt();
            System.out.print("IPK : ");
            double ipk = s.nextDouble();
            
            Mahasiswa m = new Mahasiswa(nama,thn,umur,ipk);
            data.tambah(m);
            
        }
        
        System.out.println("Data Mahasiswa setelah Sorting berdasarkan ipk : ");
        data.bubbleSort();
        data.tampil();
       
        /*Searching pencarian = new Searching(data,5);
        
        double cari = 3.3;
        
        System.out.println("Menggunakan sequential search");
        int posisi = pencarian.FindSeqSearch(cari);
        
        if(posisi != -1){
            System.out.println("data : " + cari + " ditemukan pada indeks " + posisi);
        } else {
            System.out.println("data : " + cari + " tidak ditemukan");
        }*/
        
    }
       
    }
    
