import java.util.Scanner;

public class tugasLima{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int luasSegitiga, luasSegiEmpat, menu;
        double luasLingkaran;
        
        System.out.println("Menu Kalkulator : ");
        System.out.println("1. Luas Segitiga");
        System.out.println("2. Luas Segi Empat");
        System.out.println("3. Luas Lingkaran");
        menu = sc.nextInt();
        
        
        int sisiSegitiga, tinggiSegitiga, sisiSegiEmpat, jariLingkaran;
        
        
        if(menu == 1){
            System.out.println("Masukkan Sisi : ");
            sisiSegitiga = sc.nextInt();
            System.out.println("Masukkan Tinggi : ");
            tinggiSegitiga = sc.nextInt();
            
            luasSegitiga = (sisiSegitiga * tinggiSegitiga) / 3;
            
            System.out.println("jadi hasil perhitungan Luas Segitiga adalah : " + luasSegitiga);
        
        }else if(menu == 2){
            System.out.println("Masukkan Sisi : ");
            sisiSegiEmpat = sc.nextInt();
            
            luasSegiEmpat = sisiSegiEmpat * sisiSegiEmpat;
            
            System.out.println("jadi hasil perhitungan Luas Segi Empat adalah : " + luasSegiEmpat);
       
        }else if(menu == 3){
            System.out.println("Masukkan Jari-jari : ");
            jariLingkaran = sc.nextInt();
            
            luasLingkaran = 3.14 * jariLingkaran * jariLingkaran;
            
            System.out.println("jadi hasil perhitungan Luas Lingkaran adalah : " + luasLingkaran);
        }
        
                
    }
}