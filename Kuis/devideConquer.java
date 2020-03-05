/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuissaturisangd;

/**
 *
 * @author R154NG
 */
public class devideConquer {
    static void exchange(int n, char tiangAwal, char ke, char sementara) 
    { 
        if (n == 1) 
        { 
            System.out.println("pindah disk 1 dari tiang " +  tiangAwal + " ke tiang " + ke); 
            return; 
        } 
        exchange(n-1, tiangAwal, sementara, ke); 
        System.out.println("pindah disk " + n + " dari tiang " +  tiangAwal + " ke tiang " + ke); 
        exchange(n-1, sementara, ke, tiangAwal); 
    } 
      
    //  Driver method 
    public static void main(String args[]) 
    { 
        int n = 4; // Number of disks 
        exchange(n, 'A', 'C', 'B'); 
    } 
}
