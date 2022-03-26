package Mod4;
import java.util.Arrays;
public class def {
    public static void home(){
        System.out.println("\n-----SELAMAT DATANG-----\n");
        System.out.println("Silahkan pilih Tempat Makan");
        System.out.println("1. Legender \n2. Heika \n3. Elite Coffe");
    }
    public static void legender(){
        System.out.println("----Legender----");
        System.out.println("MENU dan HARGA");
        String menu[][] = {
                {"Esspreso","17000"} , {"Americano","18000"},{"Hot Mocca","20000"},
                {"Avocado Coffe","28000"}, {"Mocca Blend","22000"},{"Jus Jambu","10000"}
        };
        for (int i = 0; i < menu.length ; i++) {
            System.out.println(i+1+". " + menu[i][0] + " "+menu[i][1]);
        }

    }
    public static void heika(){
        System.out.println("----HEIKA----");
        System.out.println("MENU dan HARGA");
        String menu[][] = {
                {"Latte","24000"} , {"Mocchacino","22000"},{"Hazzelnut Latte","27000"},
                {"French Fries","10000"}, {"Es Teh","6000"},{"Matcha","21000"}
        };
        for (int i = 0; i < menu.length ; i++) {
            System.out.println(i+1+". " + menu[i][0] + " "+menu[i][1]);
        }
    }
    public static void eliteCoffe(){
        System.out.println("----Elite Coffe----");
        System.out.println("MENU dan HARGA");
        String menu[][] = {
                {"Kopi ABC","4000"} , {"White Coffe","4000"},{"Kopi Item","3500"},
                {"TOP Coffe","3000"}, {"Kukubima+Susu","5000"},{"Wedang Jahe","50000"}
        };
        for (int i = 0; i < menu.length ; i++) {
            System.out.println(i+1+". " + menu[i][0] + " "+menu[i][1]);
        }
    }
}
