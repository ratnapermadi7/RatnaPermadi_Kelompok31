package atm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;import java.awt.event.ComponentAdapter;

public class ATM extends JFrame {
    private JPanel panel;
    private JButton cekSaldoButton;
    private JButton tarikButton;
    private JButton transferButton;
    private JButton simpanButton;
    private JTextField textField1;
    private JButton keluarButton;
    private JButton clearButton;

    double hasil;
    String answer;
    double saldo = 3000000;
    int masukan;

    public ATM() {
        cekSaldoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPane, " Saldo anda : "+saldo);
                hasil = saldo;
                saldo = hasil;
                answer = String.format("%,.2f",saldo);
            }
        });
        tarikButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                masukan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka : "));
                hasil = saldo - masukan;
                saldo = hasil;
                answer = String.format(" %,.2f ", hasil);
                if(masukan > saldo){
                    JOptionPane.showMessageDialog(rootPane,"Saldo anda tidak cukup");
                } else{
                    JOptionPane.showMessageDialog(rootPane,"Saldo anda : "+saldo+"\n");
                }

            }
        });
        transferButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = JOptionPane.showInputDialog("Nama tujuan : ");
                masukan = Integer.parseInt(JOptionPane.showInputDialog("Jumlah transfer : "));
                if(masukan > saldo){
                    JOptionPane.showMessageDialog(rootPane,"Saldo anda tidak cukup");
                    JOptionPane.showConfirmDialog(null, " Apakah ingin lanjut");
                    JOptionPane.showMessageDialog(rootPane,"Tambahkan Saldo Rekening Anda Terlebih Dahulu");
                    System.exit(0);
                } else{
                    hasil = saldo - masukan;
                    saldo = hasil;
                    answer = String.format(" %,.2f ", hasil);
                }
            }
        });
        simpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                masukan = Integer.parseInt(JOptionPane.showInputDialog("Masukan angka : "));
                JOptionPane.showMessageDialog(rootPane,"Saldo Anda Saat Ini adalah :"+ (saldo + masukan));
                hasil = saldo + masukan;
                saldo=hasil;
                answer = String.format(" %,.2f ",saldo);
            }
        });
        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
  }

    public ATM(int saldo) {
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Kel 31");
        frame.setContentPane(new ATM().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500, 270);
        frame.setResizable(true);
    }
}
