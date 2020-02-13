import java.util.Scanner;
public class pertanyaanEmpatB {
      
  static int fibonaci(int n){
    
    if(n == 0 || n == 1){
          return n;
    } else {
      return (fibonaci(n-1) + fibonaci(n-2));
    }
  
  }
  
  public static void main(String[]args){

    int i, j = 0;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan jumlah deret bilangan fibonacci: ");
    int n = scan.nextInt();
    System.out.print("Hasil bilangan fibonacci: ");
    for (i = 0; i < n; i++){
      System.out.print(fibonaci(j)+", ");
      j++;
    }
     System.out.println();
  }
}