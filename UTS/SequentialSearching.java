/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utssortingsearching;

/**
 *
 * @author R154NG
 */
public class SequentialSearching {
    public double[] ipk;
    public int jumData;
    
    public SequentialSearching(int[] ipk, int jmlData){
        this.jumData = jmlData;
        ipk = new int [jmlData];
        for (int i = 0; i < jumData; i++){
            ipk[i] = ipk[i];
        }
    }
    
    public int FindSeqSearch(int cari){
        int posisi = -1;
        for(int j = 0; j < jumData; j++){
            if(ipk[j] == cari){
            posisi = j;
            break;  
            }
        }
    return posisi;
    }
    public void TampilData(){
        for(int i = 0; i < jumData; i++){
            System.out.print(ipk[i] + " ");
        }
        System.out.println();
    }
    
    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left+right)/2;
            if (cari == ipk[mid]){
                return(mid);
            }else if(ipk[mid] > cari){
                return FindBinarySearch(cari, left, mid-1);
            }else{
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
    
    public void Tampilposisi(int x, int pos){
        if(pos != -1){
            System.out.println("data : " + x + "ditemukan pada indeks" + pos);
        }else{
            System.out.println("data" + x +" tak ditemukan");
        }
    }
}
