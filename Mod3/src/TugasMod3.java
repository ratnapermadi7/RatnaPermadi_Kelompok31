import java.util.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
    public class TugasMod3 {
        public static void main(String[] args) {

            int pil1, pil2;
            long saldo = 10000000;

            Scanner sc = new Scanner(System.in);

            for (int i = 1; i < 2; i++) {

                System.out.println("\n------ATM KELOMPOK 31------\n");
                System.out.print("USERNAME      : ");
                String user = sc.next();
                System.out.print("PIN           : ");
                int pin = sc.nextInt();


                if (user.equals("USERSULTAN") && pin == 456789) {

                    System.out.println("\n LOGIN SUKSES \n");
                    for (int j = 1; j < 2; j++) {
                        System.out.println("MASUKKAN PILIHAN TRANSAKSI ");
                        System.out.println("1. Cek Saldo");
                        System.out.println("2. Tarik Tunai");
                        System.out.println("3. Simpan Uang");
                        System.out.println("4. Transfer");
                        System.out.println("5. Keluar");

                        pil1 = sc.nextInt();

                        switch (pil1) {
                            case 1:

                                print("Saldo anda = ", saldo);
                                out();
                                pil2 = sc.nextInt();
                                switch (pil2) {
                                    case 1:
                                        ty();
                                        System.exit(0);
                                    case 2 :
                                        j = 0; break;
                                }

                                break;
                            case 2:
                                System.out.print("Masukkan jumlah penarikan = ");
                                long tarik = sc.nextLong();

                                if (tarik < saldo) {
                                    print("Penarikan Berhasil dengan Nominal = ", tarik);
                                    saldo = saldo - tarik;

                                } else {
                                    System.out.println("Maaf Saldo Anda tidak Cukup");
                                }
                                out();
                                pil2 = sc.nextInt();
                                switch (pil2) {
                                    case 1:
                                        ty();
                                        i = 3;
                                        break;
                                    case 2:
                                        j = 0;
                                        break;
                                }
                                break;
                            case 3:
                                System.out.print("Masukkan jumlah uang yang akan disimpan = ");
                                int simpan = sc.nextInt();
                                saldo += simpan;
                                out();
                                pil2 = sc.nextInt();
                                switch (pil2) {
                                    case 1:
                                        ty();
                                        i = 3;
                                        break;
                                    case 2:
                                        j = 0;
                                        break;
                                }
                                break;

                            case 4:
                                System.out.print("Masukkan nomor rekening tujuan = ");
                                long rek = sc.nextLong();
                                System.out.print("Masukkan jumlah pengiriman = ");
                                long kirim = sc.nextLong();
                                if (kirim < saldo) {
                                    System.out.print("Transfer Berhasil ke no rek. " + rek + " dengan nominal ");
                                    print("", kirim);
                                    saldo = saldo - kirim;
                                } else {
                                    System.out.println("Maaf Saldo Anda tidak Cukup");
                                }
                                out();
                                pil2 = sc.nextInt();
                                switch (pil2) {
                                    case 1:
                                        ty();
                                        i = 3;
                                        break;
                                    case 2:
                                        j = 0;
                                        break;
                                }
                                break;
                            case 5:
                                ty();
                                i = 3;
                                break;
                        }
                    }
                } else {
                    System.out.println("MAAF USERNAME/PIN TIDAK BENAR");
                    System.out.println("COBA LAGI NDAK?");
                    System.out.println("1. YA, 2. TIDAK");
                    pil2 = sc.nextInt();
                    switch (pil2) {
                        case 1:
                            i = 0;
                            break;
                        case 2:
                            ty();
                            System.exit(0);
                            break;
                    }
                }
            }
        }
        public static void ty(){
            System.out.println("\nTENGKYU GAN, SEHAT SELALU, JAN LUPA MANDI :D");
        }
        static void out(){
            System.out.println("\n1. Keluar \n2. Transaksi Lagi");
        }
        static void print(String anu, long saldo){
            DecimalFormat kursIndo = (DecimalFormat) DecimalFormat.getCurrencyInstance();
            DecimalFormatSymbols rupiah = new DecimalFormatSymbols();

            rupiah.setCurrencySymbol("Rp ");
            rupiah.setGroupingSeparator(',');

            kursIndo.setDecimalFormatSymbols(rupiah);
            System.out.printf(anu + kursIndo.format(saldo));
        }
    }


