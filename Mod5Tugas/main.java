package Mod5Tugas;
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----HELLO SELAMAT DATANG-----\n");

        for (int i = 0; i < 2 ; i++) {

            System.out.print("Email : ");
            String email = sc.next();
            System.out.print("Password :");
            String password = sc.next();
            user object = new user(email, password);
            object.login();

            System.out.println("\n1. Keluar\n2. Login Lagi");
            int pil = sc.nextInt();
            switch(pil){
                case 1 :
                    System.out.println("thanks " +email);
                    System.exit(0);
                    break;
                case 2 :
                    i = 0;
                    break;
            }
        }


    }
}
