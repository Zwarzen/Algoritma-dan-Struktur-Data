import java.util.Scanner;
public class pertanyaanSatu{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double nilaiAkhir;
		double a = 70, b = 80, c = 90;
		
		System.out.println("Masukkan nilai tugas : ");
		a = sc.nextInt();
		System.out.println("Masukkan nilai UTS : ");
		b = sc.nextInt();
		System.out.println("Masukkan nilai UAS : ");
		c = sc.nextInt();

		a = a * (20/100);
		b = b * (35/100);
		c = c * (45/100);

		//nilaiAkhir = ((a * (20/100)) + (b * (35/100)) + (c * (45/100))) * 100;

		nilaiAkhir = a+b+c;

		System.out.println("Nilai akhir anda adalah : " + nilaiAkhir); 
	}
}