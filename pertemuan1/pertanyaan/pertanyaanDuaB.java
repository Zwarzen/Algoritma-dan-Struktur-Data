import java.util.Scanner;
public class pertanyaanDuaB{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int lamaBulan,saldoAwal;

		System.out.println("Masukkan saldo awal : ");
		saldoAwal = sc.nextInt();
		System.out.println("Masukkan berapa banyak bulan : "); 
		lamaBulan = sc.nextInt();

		int bunga = 2/100;
		int hasilA = 0;
		int hasilB = 0;

		hasilA = (saldoAwal * bunga) * lamaBulan;
		hasilB = hasilA * saldoAwal;

		System.out.println("Saldo akhir nasabah adalah : " + hasilB);

	}
}