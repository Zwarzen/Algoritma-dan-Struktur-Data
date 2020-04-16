/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu11.tugas1;

import java.util.Scanner;

/**
 *
 * @author R154NG
 */
public class MainMahasiswa {
     
    public static void main(String[] args) {
        
        DaftarMahasiswa data = new DaftarMahasiswa();
        Scanner sc = new Scanner(System.in);
        
        try {
            
            data.TambahFirst(1941720193, "Risang Daniswara", "Banyuwangi");
            data.print();
            
            data.add(1941720197, "Zulfan", "Malang", 1);
            data.print();
            
            data.TambahFirst(1941720194, "Juna", "Jl. Merapi No. 26");
            data.print();
            
            data.addByValue(1941720195, 1941720196, "Tes1", "Tes2");
            data.print();
            
            data.removeByValue(1941720196);
            
            data.print();
            
            data.clear();
            
            int pilih = 0, pilih1, index, nim;
            String nama, alamat;
            
            do {
                
                try {
                    
                    System.out.println("Menu");
                    System.out.println("1. Tambah");
                    System.out.println("2. Hapus");
                    System.out.println("3. Cari");
                    System.out.println("4. Keluar");
                    System.out.print("Masukkan pilihan : ");
                    pilih = sc.nextInt();
                    
                    switch (pilih) {
                        
                        case 1:
                            System.out.println("Submenu Tambah");
                            System.out.println("1. Tambah (First)");
                            System.out.println("2. Tambah (Index)");
                            System.out.println("3. Tambah (Last)");
                            System.out.print("Masukkan pilihan : ");
                            pilih1 = sc.nextInt();
                            
                            switch (pilih1) {
                            
                                case 1:
                                    System.out.println("Tambah (First)");
                                    System.out.print("Masukkan NIM: ");
                                    nim = sc.nextInt();
                                    sc.nextLine();
                                    
                                    System.out.print("Masukkan Nama: ");
                                    nama = sc.nextLine();
                                    
                                    System.out.print("Masukkan Alamat: ");
                                    alamat = sc.nextLine();
                                    
                                    data.TambahFirst(nim, nama, alamat);
                                    
                                    break;
                                
                                case 2:
                                    System.out.println("Tambahkan by Index");
                                    System.out.print("Masukkan NIM: ");
                                    nim = sc.nextInt();
                                    sc.nextLine();
                                    
                                    System.out.print("Masukkan Nama: ");
                                    nama = sc.nextLine();
                                    
                                    System.out.print("Masukkan Alamat: ");
                                    alamat = sc.nextLine();
                                    data.TambahFirst(nim, nama, alamat);
                                    
                                    System.out.print("Masukkan index: ");
                                    index = sc.nextInt();
                                    data.add(nim, nama, alamat, index);
                                    
                                    break;
                                    
                                case 3:
                                    System.out.print("Masukkan NIM: ");
                                    nim = sc.nextInt();
                                    sc.nextLine();
                                    
                                    System.out.print("Masukkan Nama: ");
                                    nama = sc.nextLine();
                                    
                                    System.out.print("Masukkan Alamat: ");
                                    alamat = sc.nextLine();
                                    data.TambahLast(nim, nama, alamat);
                                    
                                    break;
                                    
                            }
                            
                            data.print();
                            
                            break;
                        
                        case 2:
                            
                            System.out.println("Submenu : Hapus");
                            System.out.println("1. Hapus Index");
                            System.out.println("2. Hapus Key");
                            System.out.println("3. Clear");
                            System.out.print("Masukkan pilihan : ");
                            pilih1 = sc.nextInt();
                            
                            switch (pilih1) {
                                
                                case 1:
                                    System.out.println("Hapus Index");
                                    System.out.print("Masukkan Index : ");
                                    index = sc.nextInt();
                                    data.remove(index);
                                    break;
                                
                                case 2:
                                    System.out.println("Hapus (Key)");
                                    System.out.print("Masukkan NIM : ");
                                    nim = sc.nextInt();
                                    data.removeByValue(nim);
                                    break;
                                
                                case 3:
                                    data.clear();
                                    break;
                            }
                            
                            data.print();
                            break;
                        
                        case 3:
                            System.out.println("Submenu Cari");
                            System.out.println("1. Cari (Index)");
                            System.out.println("2. Cari (Key)");
                            System.out.print("Masukkan pilihan : ");
                            pilih1 = sc.nextInt();
                            switch (pilih1) {
                                
                                case 1:
                                    System.out.println("Cari (Index)");
                                    System.out.print("Masukkan Index : ");
                                    index = sc.nextInt();
                                    data.cari(index);
                                    break;
                                    
                                case 2:
                                    System.out.println("Cari by Key");
                                    System.out.print("Masukkan NIM : ");
                                    nim = sc.nextInt();
                                    data.cariKey(nim);
                                    break;
                            }
                            
                            break;
                        
                        case 4:
                            
                            System.out.println("Keluar Program");
                            System.exit(0);
                            break;
                        
                        default:
                            
                            System.out.println("Pilihan Salah!");
                    }
                
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                System.out.println();
            } while (pilih != 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
