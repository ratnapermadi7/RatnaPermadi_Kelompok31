import java.util.*;
public class coba {

    public String id;
    public String []data;
    public coba(){
        this.data = new String[]{
          "Rat","Nano","Rony"
        };
    }
    public String tes(String id){
     this.id = "Nano";
     return id;
    }
    public static void main(String[] args) {
//        coba c = new coba();
//        Scanner sc = new Scanner(System.in);
//        c.id = sc.next();
//        for (int i = 0; i < c.data.length; i++) {
//            int cek = Integer.parseInt(c.data[i]);
//            if (c.id.equals(c.data[i])){
//                if(cek == 0){
//                    System.out.println("Genap");
//                }
//            }
//        }
        String [] data = {"12","Qqq","Sss"};
//        int cek = Arrays.toString(data[1]);
//        System.out.println(cek);
        int a = Integer.parseInt(String.valueOf(data[0]));
        int b = a *2;
        System.out.println("b = "+b);

    }
}
