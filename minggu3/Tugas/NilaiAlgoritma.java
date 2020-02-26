/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author R154NG
 */
public class NilaiAlgoritma {
   String namaMhs;
    int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;

    public NilaiAlgoritma(String nm, int nt, int nk, int nuts, int nuas) {
        namaMhs = nm;
        nilaiTugas = nt;
        nilaiKuis = nk;
        nilaiUTS = nuts;
        nilaiUAS = nuas;
    }

    double hitungTotalNilai(){
        return(nilaiTugas * 0.3) + (nilaiKuis * 0.2) + (nilaiUTS * 0.2) + (nilaiUAS * 0.3); 
    }
   
}
