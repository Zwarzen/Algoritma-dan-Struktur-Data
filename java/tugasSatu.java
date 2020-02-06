import java.util.Scanner;

public class tugasSatu {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int paket, jenisPaket1, jenisPaket2;
        
        System.out.println("Pilih Paket Menu : ");
        System.out.println("1. Paket Chicken");
        System.out.println("2. Paket OKE");
        paket = sc.nextInt();
        
        if(paket==1){
            System.out.println("Paket Chicken : ");
            System.out.println("Paket Chicken : A ");
            System.out.println("Paket Chicken : B");
            System.out.println("Paket Chicken : C");
            System.out.println("Pilih Paket Chicken : ");
            jenisPaket1 = sc.nextInt();
            if(jenisPaket1 == 1){
                System.out.println("12.000");
            }else if(jenisPaket1 == 2){
                System.out.println("15.000");
            }else if(jenisPaket1 == 3){
                System.out.println("20.000");
            }else{
                System.out.println("Paket tidak ada!");
            }
            
        
        }else if(paket==2){
            System.out.println("Paket OKE : ");
            System.out.println("Paket OKE : A ");
            System.out.println("Paket OKE : B");
            System.out.println("Paket OKE : C");
            System.out.println("Pilih Paket OKE : ");
            jenisPaket2 = sc.nextInt();
            if(jenisPaket2 == 1){
                System.out.println("10.000");
            }else if(jenisPaket2 == 2){
                System.out.println("12.000");
            }else if(jenisPaket2 == 3){
                System.out.println("15.000");
            }else{
                System.out.println("Paket tidak ada!");
            }
        }
        
        else{
            System.out.println("Paket Anda Salah!");
        }
        }
}