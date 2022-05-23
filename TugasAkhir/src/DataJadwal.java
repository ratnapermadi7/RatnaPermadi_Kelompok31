import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Arrays;

public class DataJadwal extends LoginForm{
    private JTextArea senin;
    private JTextArea selasa;
    private JTextArea rabu;
    private JTextArea kamis;
    private JTextArea jumat;
    private JTextArea Welcome;
    private JButton closeButton;
    JPanel panel2;
    private JButton backButton;
    JFrame frame2;

    public DataJadwal(String id, String password) {


        frame2 = new JFrame("Data Jadwal");
        frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame2.setPreferredSize(new Dimension(800,500));
        frame2.setResizable(true);
        frame2.setTitle("JADWAL MATKUL");

        frame2.add(panel2);
        frame2.pack();
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);

        User user = new User();

        Welcome.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);

                for (int i = 0; i <user.fName.length; i++) {
                   if(id.equals(user.data[i][0])){
                      Welcome.setText("Hallo Selamat Datang \n"+user.fName[i]);
                   }
                }
            }
        });
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame2.dispose();
                new LoginForm();
            }
        });

        // JADWAL MATKUL
        int pass = Integer.parseInt(String.valueOf(password));
        int mod = pass % 2;

        senin.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
//                super.componentResized(e);
                    if(mod == 0){
                        senin.setText(user.matkul[0]+"\n\n"+user.matkul[1]);
                    }
                    else {
                        senin.setText(user.matkul[2]+"\n\n"+user.matkul[3]);
                    }
            }
        });

        selasa.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                if(mod == 0){
                    selasa.setText(user.matkul[2]+"\n\n"+user.matkul[3]);
                }
                else {
                    selasa.setText(user.matkul[4]+"\n\n"+user.matkul[5]);
                }
            }
        });
        rabu.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                if(mod == 0){
                    rabu.setText(user.matkul[4]);
                }
                else {
                    rabu.setText(user.matkul[6]+"\n\n"+user.matkul[7]);
                }
            }
        });
        kamis.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                if(mod == 0){
                    kamis.setText(user.matkul[5]+"\n\n"+user.matkul[6]);
                }
                else {
                    kamis.setText(user.matkul[0]);
                }
            }
        });
        jumat.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                if(mod == 0){
                    jumat.setText(user.matkul[7]);
                }
                else {
                    jumat.setText(user.matkul[1]+"\n\n"+user.matkul[6]);
                }
            }
        });
    }

    public static void main(String[] args) {
        new DataJadwal("Anu","Some");
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
