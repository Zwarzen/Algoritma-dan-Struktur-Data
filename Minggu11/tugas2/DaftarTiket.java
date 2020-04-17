/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu11.tugas2;

/**
 *
 * @author R154NG
 */
public class DaftarTiket {
    Tiket head;
    int size;

    public DaftarTiket() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int idTiket, String judul, int harga, int jumlah) {
        head = new Tiket(idTiket, judul, harga, jumlah, head);
        size++;
    }

    public void getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Tidak ada Pesanan Tiket");
        }
        System.out.println("========Barang Keluar========");
        System.out.println("ID Tiket: " + head.idTiket);
        System.out.println("Judul: " + head.judul);
        System.out.println("Harga: " + head.harga);
        System.out.println("Jumlah: " + head.jumlah);
        System.out.println("=============================");
    }

    public void getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Tidak ada Pesanan Tiket");
        }
        Tiket tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        System.out.println("========Barang Keluar========");
        System.out.println("ID Tiket: " + tmp.idTiket);
        System.out.println("Judul: " + tmp.judul);
        System.out.println("Harga: " + tmp.harga);
        System.out.println("Jumlah: " + tmp.jumlah);
        System.out.println("=============================");
    }

    public void removeFirst() throws Exception {
        System.out.println("========Barang Keluar========");
        System.out.println("ID Tiket: " + head.idTiket);
        System.out.println("Judul: " + head.judul);
        System.out.println("Harga: " + head.harga);
        System.out.println("Jumlah: " + head.jumlah);
        System.out.println("=============================");
        head = head.next;
        size--;
    }

    public void clear() {
        System.out.println("Semua Pesanan dihapus");
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Tiket tmp = head;
            System.out.println("Tumpukan dari teratas ke terbawah : ");
            System.out.println("=============================");
            while (tmp != null) {
                System.out.println("ID Tiket: " + tmp.idTiket);
                System.out.println("Judul: " + tmp.judul);
                System.out.println("Harga: " + tmp.harga);
                System.out.println("Jumlah: " + tmp.jumlah);
                System.out.println("=============================");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List kosong");
        }
    }

    public void cari(int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai Pesanan diluar batas");
        } else {
            Tiket tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            System.out.println("Tiket pada Pesanan ke-" + index + " adalah : ");
            System.out.println("=============================");
            System.out.println("ID Tiket: " + tmp.idTiket);
            System.out.println("Judul: " + tmp.judul);
            System.out.println("Harga: " + tmp.harga);
            System.out.println("Jumlah: " + tmp.jumlah);
            System.out.println("=============================");
        }
    }

    public void cariKey(int cari) throws Exception {
        Tiket tmp = head;
        int index = 0;
        boolean ditemukan = false;
        if (isEmpty()) {
            System.out.println("Tidak ada Pesanan Tiket");
        } else {
            while (tmp.next != null) {
                tmp = tmp.next;
                if ((int) head.idTiket == cari) {
                    ditemukan = true;
                    break;
                } else if ((int) tmp.idTiket == cari) {
                    ditemukan = true;
                    index++;
                    break;
                }
                index++;
            }
        }
        if (ditemukan) {
            System.out.println("ID Tiket " + cari + " ditemukan pada Pesanan ke-" + index);
        } else {
            throw new Exception("Tidak ada Pesanan Tiket");
        }
    }

    public void hitungHarga() {
        if (!isEmpty()) {
            Tiket tmp = head;
            int total = 0;
            System.out.println("Tiket : ");
            System.out.println("=============================");
            while (tmp != null) {
                total += tmp.hargaTiket;
                System.out.println("ID Tiket: " + tmp.judul);
                System.out.println("Judul: " + tmp.harga);
                System.out.println("Jumlah: " + tmp.jumlah);
                System.out.println("Total Berat: " + tmp.hargaTiket);
                System.out.println("=============================");
                tmp = tmp.next;
            }
            System.out.println("Total Harga keseluruhan " + total);
        } else {
            System.out.println("Tidak ada pesanan Tiket");
        }
    }
}
