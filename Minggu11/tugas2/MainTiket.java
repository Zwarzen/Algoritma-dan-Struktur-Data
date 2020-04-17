/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu11.tugas2;

import java.util.Scanner;

/**
 *
 * @author R154NG
 */
public class MainTiket {
    public static void main(String[] args) {
        DaftarTiket data = new DaftarTiket();
        Scanner sc = new Scanner(System.in);
        int pilih = 0, pilih1, id, harga, jumlah, index;
        String nama;
        do {
            try {
                System.out.println("Pesanan Tiket tidak terbatas");
                System.out.println("1. Pesan Tiket");
                System.out.println("2. Lihat Tiket Teratas");
                System.out.println("3. Lihat Tiket Terbawah");
                System.out.println("4. Lihat Semua Tiket");
                System.out.println("5. Batalkan Tiket Teratas");
                System.out.println("6. Cari Tiket");
                System.out.println("7. Batalkan Semua Tiket");
                System.out.println("8. Hitung hargat Seluruh Tiket");
                System.out.println("9. Keluar Program");
                System.out.print("Pilih menu: ");
                pilih = sc.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.println("Pesan Tiket");
                        System.out.print("ID Tiket: ");
                        id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Judul: ");
                        nama = sc.nextLine();
                        System.out.print("Harga: ");
                        harga = sc.nextInt();
                        System.out.print("Jumlah: ");
                        jumlah = sc.nextInt();
                        data.addFirst(id, nama, harga, jumlah);
                        data.print();
                        break;
                    case 2:
                        data.getFirst();
                        break;
                    case 3:
                        data.getLast();
                        break;
                    case 4:
                        data.print();
                        break;
                    case 5:
                        data.removeFirst();
                        break;
                    case 6:
                        System.out.println("Submenu Cari");
                        System.out.println("1. Cari di Pesanan");
                        System.out.println("2. Cari di No Barang");
                        System.out.print("Masukkan pilihan : ");
                        pilih1 = sc.nextInt();
                        switch (pilih1) {
                            case 1:
                                System.out.println("Cari Pesanan");
                                System.out.print("Masukkan Pesanan ke : ");
                                index = sc.nextInt();
                                data.cari(index);
                                break;
                            case 2:
                                System.out.println("Cari Nomor Tiket");
                                System.out.print("Masukkan Nomor Tiket: ");
                                id = sc.nextInt();
                                data.cariKey(id);
                                break;
                        }
                        break;
                    case 7:
                        data.clear();
                        break;
                    case 8:
                        data.hitungHarga();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println();
        } while (pilih != 9);
    }
}
