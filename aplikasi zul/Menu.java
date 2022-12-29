import javax.swing.*;
import javax.swing.border.EtchedBorder;

import java.awt.*;

class Menu extends JFrame {

    JButton BtData_Barang = new JButton("Data Barang");
    JButton BtData_Pelanggan = new JButton("Data Pelanggan");
    JButton BtData_Suplier = new JButton("Data Suplier");
    JButton BtLogout = new JButton("Logout");
    JButton BtAbout = new JButton("About");

    JLabel Menu = new JLabel("Menu");


    JLabel BorderMenu = new JLabel();

    Menu()
    {
        setTitle("Menu");
        setLocation(200,20);
        setSize(400,600);
        setResizable(false);
        setVisible(true);
    }

    void Komponen2()
    {
        getContentPane().setLayout(null);
        
        getContentPane().add(BtData_Barang);
        BtData_Barang.setBounds(132,120,120,40);
        BtData_Barang.setIcon(new ImageIcon("gambar/open-box.png"));

        getContentPane().add(BtData_Pelanggan);
        BtData_Pelanggan.setBounds(128,180,130,40);
        BtData_Pelanggan.setIcon(new ImageIcon("gambar/pelanggan.png"));

        getContentPane().add(BtData_Suplier);
        BtData_Suplier.setBounds(128,240,130,40);
        BtData_Suplier.setIcon(new ImageIcon("gambar/boxes.png"));

        getContentPane().add(BtAbout);
        BtAbout.setBounds(150,300,80,40);
        BtAbout.setIcon(new ImageIcon("gambar/about.png"));

        getContentPane().add(BtLogout);
        BtLogout.setBounds(150,360,80,40);
        BtLogout.setIcon(new ImageIcon("gambar/logout.png"));

        getContentPane().add(BorderMenu);
        BorderMenu.setBounds(82,60,220,400);;
        BorderMenu.setBorder(new EtchedBorder(EtchedBorder.RAISED));
        BorderMenu.setOpaque(false);

        getContentPane().add(Menu);
        Menu.setBounds(170,60,70,60);
        Menu.setFont(new Font("Times New Roman", Font.BOLD,20));

        setVisible(true);
    }

    public static void main (String args[])
    {
        Menu As = new Menu();
        As.Komponen2();
    }
}
