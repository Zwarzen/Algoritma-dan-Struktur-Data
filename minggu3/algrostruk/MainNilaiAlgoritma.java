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
        
            int array[],i, n, NilaiTugas = 0,NilaiKuis=0,NilaiUts=0,NilaiUas=0;
            array = new int[100];
            
            System.out.print("Masukkan banyaknya mahasiswa : ");
            n = sc.nextInt();
            
            for(i = 1; i <= n; i++){
                System.out.print("Mahasiswa Ke-"+ i +" : ");

                System.out.print("Masukkan Nilai Tugas : ");
                NilaiTugas = sc.nextInt();
                System.out.print("Masukkan Nilai Kuis : ");
                NilaiKuis = sc.nextInt();
                System.out.print("Masukkan Nilai UTS : ");
                NilaiUts = sc.nextInt();
                System.out.print("Masukkan Nilai UAS : ");
                NilaiUas = sc.nextInt();
                
                int nt = NilaiTugas;
                int nk = NilaiKuis;
                int nuts = NilaiUts;
                int nuas = NilaiUas;
                
                double a = nt,b=nk,c=nuts,d=nuas,nilaiAkhir;
                
                nilaiAkhir = (a*0.3)+(b*0.2)+(c*0.2)+(d*0.3);
                
                System.out.println("Nilai akhir : " + nilaiAkhir);
                
            }
                
    }      
}
