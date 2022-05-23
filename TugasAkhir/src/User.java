public class User {
    public String data[][] = new String[4][4];
    public String fName[] = new String[4];
    public String matkul[];

    public User(){
        this.data = new String [][]{
                {"Ratna","222"},
                {"Fathoni","333"},
                {"Dewi","444"},
                {"Liya","555"},
                {"Ghea","666"},
                {"David","777"},
                {"Ludvi","888"},
                {"Uki","999"}
        };
        this.fName = new String[]{
                "Ratna Goeng Permadi","Ahmad Fathoni","Dewi Sinta","Liya Dwi Rahmawati","Ghea Antika","David Kuncoro","Ludvi Argorahayu","Sukimin"
        };
        this.matkul = new String[]{
          "Kimia","Algoritma  ","Elektronika Dasar","Fisika Dasar II","Aljabar Linier","Internet Of Things","Matematika Teknik","Praktikum DKP"
        };
    }
}
