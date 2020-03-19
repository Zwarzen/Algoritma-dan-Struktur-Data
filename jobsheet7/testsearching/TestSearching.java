/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsearching;

/**
 *
 * @author R154NG
 */
public class TestSearching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int data[] = {10, 30, 40, 50, 60, 70, 80, 90};
        Searching pencarian = new Searching(data,8);
        System.out.println("isi array : ");
        pencarian.TampilData();
        
        int cari = 30;
        
        System.out.println("Menggunakan sequential search");
        int posisi = pencarian.FindSeqSearch(cari);
        
        if(posisi != -1){
            System.out.println("data : " + cari + " ditemukan pada indeks " + posisi);
        } else {
            System.out.println("data : " + cari + " tidak ditemukan");
        }
    }
    
}
