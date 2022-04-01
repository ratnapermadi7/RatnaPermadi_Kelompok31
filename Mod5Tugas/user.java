package Mod5Tugas;

public class user {
    private String data[][] = new String[4][4];
    private String barang[][] = new String[4][3];
    private String email, password, role, nama;
    private String motor, mobil, hp;


    public user(String emails, String passwords) {
        email = emails;
        password = passwords;
        this.data = new String[][]{
                {"ratnapermadi@gmail.com", "00000", "NGAB","Ratna"},
                {"bagus@gmail.com", "11111", "BANG","Bagus"},
                {"fathan@gmail.com", "22222", "BRO","Fathan"},
                {"radhit@gmail.com", "33333", "BANH","Radhit"}
            };
        this.barang = new String[][] {
                {"Mobillio","Cb150r","Samsung A51"},
                {"Jazz","Klx","Iphone 8"},
                {"Yaris","R15","Samsung S20"},
                {"Innova","Beat","Oppo Reno"}
        };
    }

    private boolean check(){
        for (int i = 0; i<data.length; i++){
            if (data[i][0].equals(email) ){
                if(data[i][1].equals(password)) {
                    email = data[i][0];
                    role = data[i][2];
                    nama = data[i][3];
                    mobil = barang[i][0];
                    motor = barang[i][1];
                    hp = barang[i][2];
                    return true;
                }
            }
        }
        return false;
    }

    public void login(){
        boolean status = check();
        if(status == true){
            System.out.println("\nWelcome " + role);
            System.out.println("Logged it as " + email);
            System.out.println(nama+", aset pribadi mu adalah : ");
            System.out.println(mobil);
            System.out.println(motor);
            System.out.println(hp);
        }
        else {
            System.out.println("Invalid login");
        }
    }

}
