package Mod6Tugas;
import java.util.Scanner;
public class geniusApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("SELAMAT DATANG PENGAJAR BIMBEL GENIUS\n");
        System.out.println("Kode Jadwal");
        System.out.println("1. Mtk(Mt)\n2. Fisika(Fi)\n3. Kimia(Km)");

        System.out.print("Nama       : ");String name = sc.next();

        for (int i = 1; i < 2; i++) {

            System.out.print("Kode Mapel : ");
            String code = sc.next();

            if (code.equalsIgnoreCase("Mt")) {
                mtk mtk = new mtk(name);
                mtk.code = code;
                mtk.display();

            } else if (code.equalsIgnoreCase("Fi")) {
                fisika fisika = new fisika(name);
                fisika.code = code;
                fisika.display();

            } else if (code.equals("Km")) {
                kimia kimia = new kimia(name);
                kimia.code = code;
                kimia.display();

            } else {
                System.out.println("KODE SALAH");
                System.out.println("COBA LAGI? \n1. YA\n2.Tidak");
                int pil = sc.nextInt();
                switch (pil) {
                    case 1:
                        i = 0; break;
                    case 2:
                        System.out.println("SAMPAI JUMPA");
                        System.exit(0); break;
                }
            }
        }
    }
}
