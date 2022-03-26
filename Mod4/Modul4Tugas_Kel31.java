package Mod4;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;
public class Modul4Tugas_Kel31 {
    public static void main(String[] args) {
        def objek = new def();
        long result = 0;
        for (int i = 0; i < 2; i++) {

            objek.home();
            Scanner sc = new Scanner(System.in);
            int pil = sc.nextInt();
            int pil2,pil3,item,harga2;
            if (pil == 1) {
                int []harga ={0,17000,18000,20000,28000,22000,10000};
                objek.legender();
                System.out.print("Masukkan Menu = ");
                pil2 = sc.nextInt();
                System.out.print("Jumlah item = ");
                item = sc.nextInt();
                    switch(pil2){
                        case 1 : harga2 = harga[1];
                             print("Total Pesan = ",total(harga2, item));
                             result += total(harga2,item);
                             break;
                        case 2 : harga2 = harga[2];
                             print("Total = ",total(harga2,item));
                            result += total(harga2,item);
                             break;
                        case 3 : harga2 = harga[3];
                             print("Total = ",total(harga2,item));
                             result += total(harga2,item);
                             break;
                        case 4 : harga2 = harga[4];
                             print("Total = ",total(harga2,item));
                             result += total(harga2,item);
                             break;
                        case 5 : harga2 = harga[5];
                             print("Total = ",total(harga2,item));
                             result += total(harga2,item);
                             break;
                         case 6 : harga2 = harga[6];
                             print("Total = ",total(harga2,item));
                             result += total(harga2,item);
                             break;
                        default:
                            System.out.println("Pilihan tidak tersedia banh");
                            break;
                              }
                out();
                pil3 = sc.nextInt();
                switch (pil3) {
                    case 1:
                        print("TOTAL YANG HARUS DIBAYAR = ", result);
                        System.out.println(ty());
                        System.exit(0);
                        break;
                    case 2:
                        i = 0;
                        break;
                }
            } else if (pil == 2) {
                int []harga ={0,24000,22000,27000,10000,6000,21000};
                objek.heika();
                System.out.print("Masukkan Menu pesan = ");
                pil2 = sc.nextInt();
                System.out.print("Jumlah Pesan = ");
                item = sc.nextInt();
                switch(pil2){
                    case 1 : harga2 = harga[1];
                        print("Total Pesan = ",total(harga2, item));
                        result += total(harga2,item);
                        break;
                    case 2 : harga2 = harga[2];
                        print("Total = ",total(harga2,item));
                        result += total(harga2,item);
                        break;
                    case 3 : harga2 = harga[3];
                        print("Total = ",total(harga2,item));
                        result += total(harga2,item);
                        break;
                    case 4 : harga2 = harga[4];
                        print("Total = ",total(harga2,item));
                        result += total(harga2,item);
                        break;
                    case 5 : harga2 = harga[5];
                        print("Total = ",total(harga2,item));
                        result += total(harga2,item);
                        break;
                    case 6 : harga2 = harga[6];
                        print("Total = ",total(harga2,item));
                        result += total(harga2,item);
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia banh");
                        break;
                }
                out();
                pil3 = sc.nextInt();
                switch (pil3) {
                    case 1:
                        print("TOTAL YANG HARUS DIBAYAR = ", result);
                        System.out.println(ty());
                        System.exit(0);
                        break;
                    case 2:
                        i = 0;
                        break;
                }
            }
            else if (pil == 3){
                int []harga = {0,4000,3500,3000,5000};
                objek.eliteCoffe();
                System.out.print("Masukkan Menu pesan = ");
                pil2 = sc.nextInt();
                System.out.print("Jumlah Pesan = ");
                item = sc.nextInt();
                switch(pil2){
                    case 1 : harga2 = harga[1];
                        print("Total Pesan = ",total(harga2, item));
                        result += total(harga2,item);
                        break;
                    case 2 : harga2 = harga[1];
                        print("Total = ",total(harga2,item));
                        result += total(harga2,item);
                        break;
                    case 3 : harga2 = harga[2];
                        print("Total = ",total(harga2,item));
                        result += total(harga2,item);
                        break;
                    case 4 : harga2 = harga[3];
                        print("Total = ",total(harga2,item));
                        result += total(harga2,item);
                        break;
                    case 5 : harga2 = harga[4];
                        print("Total = ",total(harga2,item));
                        result += total(harga2,item);
                        break;
                    case 6 : harga2 = harga[4];
                        print("Total = ",total(harga2,item));
                        result += total(harga2,item);
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia banh");
                        break;
                }
                out();
                pil3 = sc.nextInt();
                switch (pil3) {
                    case 1:
                        print("TOTAL YANG HARUS DIBAYAR = ", result);
                        System.out.println(ty());
                        System.exit(0);
                        break;
                    case 2:
                        i = 0;
                        break;
                }
            }
        }
    }

    static void out() {
        System.out.println("\n\n1. Checkout \n2. Pesan Lagi");
    }
    static String ty(){
        return "\n   TERIMA KASIH GAN\n   SEHAT SELALU\n   JAN LUPA MANDI :D";
    }
    static long total(int pil2,int jum){
        long total = pil2*jum;
        return total;
    }
    static void print(String statement, long saldo){
        DecimalFormat kursIndo = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols rupiah = new DecimalFormatSymbols();

        rupiah.setCurrencySymbol("Rp ");
        rupiah.setGroupingSeparator('.');

        kursIndo.setDecimalFormatSymbols(rupiah);
        System.out.printf(statement + kursIndo.format(saldo));
    }
}
