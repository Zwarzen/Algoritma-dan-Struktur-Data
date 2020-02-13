/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programsegitiga;

/**
 *
 * @author R154NG
 */
public class Segitiga {
     public int alas;
     public int tinggi;
     public int keliling;
     
     public Segitiga(int a, int t){
        alas = a;
        tinggi = t;
     }
     
     public double hitungKeliling(){
      return keliling = alas * alas + tinggi * tinggi ;
     }
     
     public double hitungLuas(){
        return 0.333 * alas * tinggi / 2; 
     } 
     
     
}
