import java.util.Scanner;

public class tugasEmpat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu;
        int pilih, harga = 0, jumlah, total = 0;
        char pilihPaket;
        
        for (String pilihUlang = "Ya"; pilihUlang.equalsIgnoreCase("Ya");) {
            System.out.println("Pilih Paket");
            System.out.println("1. Paket Chicken");
            System.out.println("2. Paket Oke");


            System.out.print("Pilih Paket : ");
            pilih = input.nextInt();


            switch(pilih) {
                
                case 1:
                    
                    System.out.println("Menu Paket Chicken : ");
                    System.out.println("a. Chicken A/Rp. 12.000");
                    System.out.println("b. Chicken B/Rp. 15.000");
                    System.out.println("c. Chicken C/Rp. 20.000");

                    System.out.print("Masukkan Pilihan: ");

                    pilihPaket = input.next().charAt(0);

                    switch(pilihPaket) {
                        
                        case 'a':
                            harga = 12000;
                            System.out.println("Harga Paket : Rp. " + harga);
                            break;

                        case 'b':
                            harga = 15000;
                            System.out.println("Harga Paket : Rp. " + harga);
                            break;

                        case 'c':
                            harga = 20000;
                            System.out.println("Harga Paket : Rp. " + harga);
                            break;

                        default: 
                            System.out.println("Maaf, Pilihan Tidak Ada");
                            System.exit(0);

                    } 
                    break;


                case 2:
                    System.out.println("Menu Paket OKE :");
                    System.out.println("a. Oke A/Rp. 10.000");
                    System.out.println("b. Oke B/Rp. 12.000");
                    System.out.println("c. Oke C/Rp. 15.000");

                    System.out.print("Masukkan Pilihan: ");
                    pilihPaket = input.next().charAt(0);

                    switch(pilihPaket) {

                        case 'a':
                            harga = 10000;
                            System.out.println("Harga Paket : Rp. " + harga);
                            break;

                        case 'b':
                            harga = 12000;
                            System.out.println("Harga Paket : Rp. " + harga);
                            break;

                        case 'c':
                            harga = 15000;
                            System.out.println("Harga Paket : Rp. " + harga);
                            break;

                        default: 
                            System.out.println("Maaf, Pilihan Tidak Ada");
                            System.exit(0);
                    } break;

            default:
                System.out.println("Maaf pilihan Tidak Tersedia!");
                System.exit(0);
            }

            System.out.print("Masukkan Banyak Pembelian\t: ");
            jumlah = input.nextInt();

            System.out.print("Apakah Anda Ingin Pesan lagi? (Ya/Tidak) : ");
            ulang = input.next();
            
            total += harga * jumlah;
            
            System.out.println();

            System.out.println("Total Pembayaran Anda : Rp " + total);
        } 
    }
}
