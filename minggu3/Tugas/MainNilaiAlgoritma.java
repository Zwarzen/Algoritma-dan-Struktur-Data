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
        
        double r2 = 0;
        
        System.out.println("==========================");
        System.out.print("Masukkan banyak mahasiswa: ");
        
        int mhs = sc.nextInt();
        sc.nextLine();
        
        System.out.println("");
        System.out.println("==========================");
        
        NilaiAlgoritma[] nilai = new NilaiAlgoritma[mhs];
        
            for(int i = 0; i < nilai.length; i++){
                System.out.println("Mahasiswa " + (i+1));
                System.out.print("Masukkan nama mahasiswa: ");
                String nm = sc.nextLine();
                
                System.out.print("Masukkan nilai tugas: ");
                int nt = sc.nextInt();
                
                System.out.print("Masukkan nilai kuis: ");
                int nk = sc.nextInt();
                
                
                System.out.print("Masukkan nilai UTS: ");
                int nuts = sc.nextInt();
                
                System.out.print("Masukkan nilai UAS: ");
                int nuas = sc.nextInt();
                sc.nextLine();
                
                System.out.println("==========================");
                nilai[i] = new NilaiAlgoritma(nm, nt, nk, nuts, nuas);
            }
            
            System.out.println("Nilai Total Mahasiswa");
            
            for(int i = 0; i < nilai.length; i++){
                System.out.println("Nama: " + nilai[i].namaMhs);
                System.out.println("Nilai Total: " + nilai[i].hitungTotalNilai());
                System.out.println("-------------------------");
                r2 += nilai[i].hitungTotalNilai();
            }
            System.out.println("Rata-rata nilai seluruh Mahasiswa: " + (r2/nilai.length));
                
        }
                
}      
