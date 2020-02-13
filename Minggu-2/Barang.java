public class Barang {
	String namaBarang, jenisBarang	;
	int stok, hargaSatuan;

	void tampilBarang(){
		System.out.println("Nama : " + namaBarang);
		System.out.println("Jenis : " + jenisBarang);
		System.out.println("Stok : " + stok);
		System.out.println("Harga Satuan : " + hargaSatuan);
	}
	void tambahStok(int n){
		stok = stok + n;
	}

	void kurangiStok(int n){
		stok = stok - n;
	}

	int hitungHargaTotal(int jumlah){
		return jumlah*hargaSatuan;
	}
}