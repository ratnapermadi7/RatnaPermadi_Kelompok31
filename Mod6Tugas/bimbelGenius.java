package Mod6Tugas;

public abstract  class bimbelGenius {
    String code;
    public abstract void display();
}
class GR{
    // GR (group room/ grup kelas)
    public String[] dataMapel = new String[3];
    public String[] day,dataGR = new String[6];
    String teacher;
    public GR(){
        this.dataMapel = new String[]{
                "Matematika","Fisika","Kimia"
        };
        this.dataGR = new String[]{
          "GR143","GR144","GR145","GR146"
        };
        this.day = new String[]{
          "Minggu","Senin","Selasa","Rabu","Kamis","Jumat"
        };
    }

}

class mtk extends bimbelGenius {
    private String name;

    public mtk(String name) {
        this.name = name;
    }

    public String getCode(String name) {
        return name;
    }

    public void setCode(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        GR gr = new GR();
        System.out.println("Kode mapel : " + super.code);

        System.out.println("Pengajar : " + name);
        System.out.println("Jadwal mapel "+gr.dataMapel[0]+" adalah : ");
        for (int i = 0; i < gr.dataGR.length; i++) {
            System.out.println(gr.dataGR[i] + " hari " + gr.day[i]);
        }
    }
}
    class fisika extends bimbelGenius {
        private String name;

        public fisika(String name) {
            this.name = name;
        }

        public String getCode(String name) {
            return name;
        }

        public void setCode(String name) {
            this.name = name;
        }

        @Override
        public void display() {
            GR gr = new GR();
            System.out.println("Kode mapel : " + super.code);

            System.out.println("Pengajar : " + name);
            System.out.println("Jadwal mapel "+gr.dataMapel[1]+" adalah : ");
            for (int i = 0; i < gr.dataGR.length; i++) {
                System.out.println(gr.dataGR[i] + " hari " + gr.day[i+1]);
            }
        }

}
class kimia extends bimbelGenius {
    private String name;

    public kimia(String name) {
        this.name = name;
    }

    public String getCode(String name) {
        return name;
    }

    public void setCode(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        GR gr = new GR();
        System.out.println("Kode mapel : " + super.code);

        System.out.println("Pengajar : " + name);
        System.out.println("Jadwal mapel "+gr.dataMapel[2]+" adalah : ");
        for (int i = 0; i < gr.dataGR.length; i++) {
            System.out.println(gr.dataGR[i] + " hari " + gr.day[i+2]);
        }
    }

}
