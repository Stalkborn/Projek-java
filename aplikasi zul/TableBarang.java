import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import javax.swing.table.*;

class TableBarang extends JFrame
{

    JLabel DataBarang = new JLabel("DATA BARANG");
    JLabel KodeBarang = new JLabel("Kode barang");
    JLabel NamaBarang = new JLabel("Nama barang");
    JLabel HargaBarang = new JLabel("Harga barang");
    JLabel JumlahBarang = new JLabel("Jumlah barang");
    JLabel TotalHarga = new JLabel("Total Harga");

    JLabel BorderBarang = new JLabel();
    JLabel BorderTable = new JLabel();

    TableBarang()
    {
        setTitle("TabelBarang");
        setLocation(260,10);
        setSize(900,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    void komponen4()
    {
        getContentPane().setLayout(null);
        getContentPane().add(DataBarang);
        DataBarang.setBounds(360, 0,200,40);
        DataBarang.setFont(new Font("Times New Roman" , Font.BOLD , 20));


        

        getContentPane().add(BorderBarang);
        BorderBarang.setBounds(10,85,220,450);
        BorderBarang.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 3), "Tabel Pelanggan") );
        BorderBarang.setOpaque(false);

        
        getContentPane().add(BorderTable);
        BorderTable.setBounds(230,85,280,450);
        BorderTable.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 3), "Tabel Pelanggan") );
        BorderTable.setOpaque(false);


        setVisible(true);
    }


    public static void main (String args[]){
        TableBarang Tb = new TableBarang();
        Tb.komponen4();
    }
}
