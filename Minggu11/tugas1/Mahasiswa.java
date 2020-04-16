/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu11.tugas1;

/**
 *
 * @author R154NG
 */
public class Mahasiswa<A> {
    A nim, nama, alamat;
    Mahasiswa<A> next;

    public Mahasiswa(A nim, A nama, A alamat, Mahasiswa<A> next) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.next = next;
    }
}
