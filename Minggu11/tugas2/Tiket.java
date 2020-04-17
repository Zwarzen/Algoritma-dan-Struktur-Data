/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu11.tugas2;

/**
 *
 * @author R154NG
 * 
 */
public class Tiket<T> {
    T idTiket, judul, harga, jumlah;
    int hargaTiket;
    Tiket<T> next;

    public Tiket(T idTiket, T judul, T harga, T jumlah, Tiket<T> next) {
        this.idTiket = idTiket;
        this.judul = judul;
        this.harga = harga;
        this.jumlah = jumlah;
        this.hargaTiket = (int) harga * (int) jumlah;
        this.next = next;
    }
}
