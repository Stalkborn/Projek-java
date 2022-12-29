import javax.swing.*;
import java.awt.*;
import java.sql.*;
import javax.swing.border.*;
import javax.swing.event.MouseInputAdapter;
import javax.swing.table.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

class TablePelanggan extends JFrame{
    JLabel title = new JLabel("");
    JLabel Txpelanggan = new JLabel("DATA PELANGGAN");

    //JLabel KodeBarang = new JLabel("Kode Barang");
    //JLabel NamaBarang = new JLabel("Nama Barang");


    JButton BtSimpan = new JButton("SIMPAN");
    JButton BtEdit = new JButton("EDIT");
    JButton BtHapus = new JButton("HAPUS");
    JButton BtKembali = new JButton("KEMBALI");
    JButton BtSearch = new JButton("");
    JButton BtPrint = new JButton();

    JLabel BorderTb = new JLabel();
    JLabel Id_member = new JLabel("ID MEMBER");
    JLabel Nama = new JLabel("NAMA");
    JLabel Alamat = new JLabel("ALAMAT");
    JLabel NO_hp = new JLabel("NO HP");
    JLabel Email = new JLabel("EMAIL");

    //text field
    JTextField TbId = new JTextField();
    JTextField TbNama = new JTextField();
    JTextField TbAlamat = new JTextField();
    JTextField TbNo = new JTextField();
    JTextField TbEmail = new JTextField();

    //awal kodingan tabel
    String header[] = {"Id User","Nama User","Alamat User","No_Hp","Email User"};

    DefaultTableModel model = new DefaultTableModel(null, header);
    JTable tabel = new JTable(model);
    JScrollPane pane = new JScrollPane();
    Dimension dimensi = new Dimension(15,2);

    

    TablePelanggan()
    {
        setTitle("Table pemesanan");
        setLocation(260,10);
        setSize(900,700);
        setResizable(false);
        setVisible(true);
    }

    void Komponen3()
    {
        //Title
        getContentPane().setLayout(null);
        getContentPane().add(Txpelanggan);
        Txpelanggan.setBounds(360, 20,200,40);
        Txpelanggan.setFont(new Font("Times New Roman" , Font.BOLD , 20));

        //Border
        getContentPane().add(BorderTb);
        BorderTb.setBounds(70,70,750,450);
        BorderTb.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 3), "Tabel Pelanggan") );
        BorderTb.setOpaque(false);

        //Button
        getContentPane().add(BtSimpan);
        BtSimpan.setBounds(160,550,130,60);
        BtSimpan.setIcon(new ImageIcon("gambar/save.png"));

        getContentPane().add(BtEdit);
        BtEdit.setBounds(300,550,130,60);
        BtEdit.setIcon(new ImageIcon("gambar/writing.png"));

        getContentPane().add(BtHapus);
        BtHapus.setBounds(440,550,130,60);
        BtHapus.setIcon(new ImageIcon("gambar/delete.png"));

        getContentPane().add(BtKembali);
        BtKembali.setBounds(580,550,130,60);
        BtKembali.setIcon(new ImageIcon("gambar/kembali.png"));

        getContentPane().add(BtSearch);
        BtSearch.setBounds(290,108,30,25);
        BtSearch.setIcon(new ImageIcon("gambar/search3.png"));

        getContentPane().add(BtPrint);
        BtPrint.setBounds(210,260,80,40);
        BtPrint.setIcon(new ImageIcon("gambar/print.png"));
        
        //label

        getContentPane().add(Id_member);
        Id_member.setBounds(90,90,130,60);

        getContentPane().add(Nama);
        Nama.setBounds(90,120,130,60);

        getContentPane().add(Alamat);
        Alamat.setBounds(90,150,130,60);

        getContentPane().add(NO_hp);
        NO_hp.setBounds(90,180,130,60);

        getContentPane().add(Email);
        Email.setBounds(90,210,130,60);

        //jtext field
        getContentPane().add(TbId);
        TbId.setBounds(170,108,120,25);

        getContentPane().add(TbNama);
        TbNama.setBounds(170,138,120,25);

        getContentPane().add(TbAlamat);
        TbAlamat.setBounds(170,168,120,25);

        getContentPane().add(TbNo);
        TbNo.setBounds(170,198,120,25);

        getContentPane().add(TbEmail);
        TbEmail.setBounds(170,228,120,25);

        //tabel
        // Awal Codingan Visual Data View
        getContentPane().add(pane);
        getContentPane().setLayout(null);
        getContentPane().setBounds(20, 120, 820, 480);
        getContentPane().setBorder(new TitledBorder(new LineBorder(Color.white, 5), "Tabel DataBase"));
        getContentPane().setOpaque(false);
        getContentPane().setForeground(Color.white);

        getContentPane().add(pane);
        pane.setBounds(325,88,480,420);
        pane.setOpaque(false);
        pane.getViewport().setOpaque(false);

        tabel.setShowGrid(true);
        tabel.setShowVerticalLines(true);
        tabel.setIntercellSpacing(new Dimension((dimensi)));
        tabel.setGridColor(Color.GREEN);

        setVisible(true);
    }


    public static void main(String args[])
    {
        TablePelanggan AI = new TablePelanggan();
        AI.Komponen3();
    }
}
