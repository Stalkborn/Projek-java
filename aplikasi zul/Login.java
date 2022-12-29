import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.desktop.*;
import java.sql.*;

class Login extends JFrame {

    // gambar
    JLabel Gambar1 = new JLabel(new ImageIcon("gambar/bg1.jpg"));

    // JLabel
    JLabel Judul_Login = new JLabel("LOGIN");
    JLabel Judul_Username = new JLabel("Username");
    JLabel Judul_Password = new JLabel("Password");

    // JTextField
    JTextField TbUsername = new JTextField(20);
    JPasswordField TbPassword = new JPasswordField(20);

    // JButton
    JButton BtLogin = new JButton("LOGIN");
    JButton BtReset = new JButton("RESET");

    // Border
    JLabel Border = new JLabel();

    Login() {
        setTitle("Market Pedia");
        setLocation(420, 178);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    void komponen() {
        // Login title
        getContentPane().setLayout(null);
        getContentPane().add(Judul_Login);
        Judul_Login.setBounds(255, -30, 160, 100);
        Judul_Login.setFont(new Font("Monaco", Font.BOLD, 30));

        // Border
        getContentPane().add(Border);
        Border.setBounds(120, 50, 360, 260);
        Border.setBorder(new EtchedBorder(EtchedBorder.RAISED));
        Border.setOpaque(false);

        // Tabel username
        getContentPane().add(Judul_Username);
        Judul_Username.setBounds(150, 68, 160, 100);
        getContentPane().add(TbUsername);
        TbUsername.setBounds(260, 103, 160, 30);

        // Tabel Password
        getContentPane().add(Judul_Password);
        Judul_Password.setBounds(150, 107, 160, 100);
        getContentPane().add(TbPassword);
        TbPassword.setBounds(260, 143, 160, 30);
        TbPassword.setEchoChar('*');

        // Login_Button
        getContentPane().add(BtLogin);
        BtLogin.setBounds(340, 190, 80, 50);

        // Exit_Button
        getContentPane().add(BtReset);
        BtReset.setBounds(240, 190, 80, 50);

        // wallpaper login
        getContentPane().add(Gambar1);
        Gambar1.setBounds(0, 0, 600, 400);

        setVisible(true);
    }

    void AksiReaksi() 
    {

        TbUsername.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                TbUsername.setText("");
            }
        });

      TbPassword.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
              TbPassword.setText("");
            }
        });



        BtReset.addActionListener(new ActionListener()
        {
            public void actionPerformed(MouseEvent e) 
            {
                TbPassword.setText("");
                TbUsername.setText("");
            }
        });

      
        
    }

    // Menjalan kan program
    public static void main(String args[]) {
        Login AF = new Login();
        AF.komponen();
        AF.AksiReaksi();
    }
}
