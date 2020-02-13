import java.util.Scanner;
public class pertanyaanTiga {
    public static void main(String[] args) {
    	
    	int[] bil = new int[15];

    	for(int i = 0; i < bil.length; i++){
    		System.out.println("inputan ke-" + (i+1) + " : " );
    		bil[i] = sc.nextInt();
    	}
        
        System.out.print("Bilangan Genap  :  ");
        for (int i = 0; i < bil.length; i++){
            if (bil [i] % 2 == 0) {
                System.out.print(bil[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("Bilangan Ganjil :  ");
        for (int i = 0; i < bil.length; i++){
            if (bil [i] % 2!= 0){
                System.out.print(bil[i] + " ");
            }
        }      
        System.out.println("");
    }
}