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
public class BruteForce {    
    private static void match(char[] alphabet, char[] pola) {
        
        int A;
        int tes = 0;
        
        for (int i = 0; i <= alphabet.length - pola.length; i++) {
               A = 0;
               while (A < pola.length && alphabet[i + A] == pola[A]){
                  A++;
               }if (A >= pola.length) {
                  tes++;
               }
            }if (tes > 0) {
               System.out.println("DATA COCOK");
            }else {
               System.out.println("DATA TIDAK COCOK");
            }
          }
          
    public static void main(String[] args) {
             char[] x = {'A', 'B', 'U'};
             char[] y = {'S', 'E', 'R', 'A', 'B', 'U', 'T', 'A', 'N'};
             match(y, x);
          }
    }
