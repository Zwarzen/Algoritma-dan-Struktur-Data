import java.util.Scanner;
public class pertanyaanDua{
    public static void main(String[] args){
        
    	Scanner sc = new Scanner(System.in);

    	int a;

    	System.out.println("Masukkan Angka : ");
    	a = sc.nextInt();

    	int hasil = 0;

        for(int i=0; i <= 5; i++){
            hasil = a - 3;
        }
        System.out.println(hasil);

        if(hasil % 2 == 0){
        	System.out.println("bilangan genap");
        }
        else {
        	System.out.println("bilangan ganjil");	
        }
    }
}