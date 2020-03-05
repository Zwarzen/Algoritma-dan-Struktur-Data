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
    private static void match(char[] text, char[] pattern) {
        
        int j;
        int cek = 0;
        
        for (int i = 0; i <= text.length - pattern.length; i++) {
               j = 0;
               while (j < pattern.length && text[i + j] == pattern[j]){
                  j++;
               }if (j >= pattern.length) {
                  cek++;
               }
            }if (cek > 0) {
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
