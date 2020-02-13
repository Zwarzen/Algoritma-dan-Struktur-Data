import java.util.Scanner;
public class pertanyaanSatuB{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int y;

		System.out.print("Masukkan angka yang diinginkan : ");
		y = sc.nextInt();

		
		if(y % 2 == 0 && y % 6 != 0 && y % 15 != 0){
			System.out.println("Bilangan Kelipatan 2!");
		}
		else if(y % 6 == 0 && y % 15 != 0){
			System.out.println("Bilangan Kelipatan 6!");
		}
		else if(y % 15 == 0){
			System.out.println("Bilangan Kelipatan 15!");
		}
		else{
			System.out.println("Bilangan bukan Kelipatan 2, 6, 15!");
		}


	}
}