package coba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {

    Connection con;
    Statement stm;

    public koneksi() {
    convig();
    }

    public static void main(String[] args) {
        new koneksi();
    }
    
    public void convig() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/apotek", "root", "");
            stm = con.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal" + e.getMessage());
        }
    }

  
}
