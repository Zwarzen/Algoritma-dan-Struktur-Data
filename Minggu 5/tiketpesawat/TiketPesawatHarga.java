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
public class TiketPesawatHarga {
    TiketPesawatSorting tiket[] = new TiketPesawatSorting[3];
    int idx;
    
    //tambahkan method tambah()
    void tambah(TiketPesawatSorting m){
        if(idx < tiket.length){
            tiket[idx] = m;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh!");
        }
    }
    
    //method tampil
    void tampil(){
        for(TiketPesawatSorting t : tiket){
            t.tampil();
            System.out.println("----------------");
        }
    }
    
    //method bubbleshort
    void bubbleSort(){
        for(int i = 0; i < tiket.length-1; i++){
            for(int j=1; j < tiket.length-i; j++){
                if(tiket[j].harga > tiket[j-1].harga){
                    //penukaran
                    TiketPesawatSorting temp = tiket[j];
                    tiket[j] = tiket[j-1];
                    tiket[j-1] = temp;
                }
            }
        }
    }
    void selectionSort(){
        for (int i = 0; i < tiket.length-1; i++){
            int idxMin = i;
            for(int j = i+1; j < tiket.length; j++){
                if(tiket[j].harga < tiket[idxMin].harga){
                    idxMin = j;
                }
            }
            //swap
            TiketPesawatSorting tmp = tiket[idxMin];
            tiket[idxMin] =tiket[i];
            tiket[i] = tmp;
        }   
    }
}
