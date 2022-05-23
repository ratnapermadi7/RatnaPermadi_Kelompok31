import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class LoginForm extends JFrame {
    JPanel panel1;
    JFrame frame;

    public JTextField id;
    public JPasswordField password;
    private JButton loginButton;
    private JButton cancelButton;


    public LoginForm(){
        frame = new JFrame("LoginForm");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300,300));
        frame.setResizable(true);
        frame.setTitle("LOGIN FORM");

        frame.add(panel1);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // LOGIN BUTTON
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean status = check();
                if(status){
                    JOptionPane.showMessageDialog(rootPane,"Login Berhasil sebagai "+id.getText());
                    new DataJadwal(id.getText(),password.getText());
                }
                else{
                    int pil = JOptionPane.showConfirmDialog(null,"Try Again?","INVALID LOGIN",JOptionPane.YES_NO_OPTION);
                    switch(pil){
                        case JOptionPane.YES_OPTION:
                            id.setText("");
                            password.setText("");
                            break;
                        case JOptionPane.NO_OPTION:
                            System.exit(0); break;
                    }
                }
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    // checkAuthenticated
    public boolean check(){
        String name = id.getText();
        String pass = password.getText();

        User us = new User();
        for (int i = 0; i <us.data.length ; i++) {
            if(name.equals(us.data[i][0])){
                if(pass.equals(us.data[i][1])){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        new LoginForm();
    }
}
