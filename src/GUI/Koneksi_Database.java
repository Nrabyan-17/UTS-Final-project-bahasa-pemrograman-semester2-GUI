package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Koneksi_Database {
   
    // Menyiapkan paramter JDBC untuk koneksi ke datbase
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost/db_umkm";
    private static final String USER = "root";
    private static final String PASS = "";
    
    // Menyiapkan objek yang diperlukan untuk mengelola database
    static Connection conn;
    
    public void connect() {
        
        // Melakukan koneksi ke database
        // harus dibungkus dalam blok try/catch
        try {
             
             // buat koneksi ke database
             conn = DriverManager.getConnection(DB_URL, USER, PASS);
             
             System.out.println("Koneksi Berhasil");
        
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            
            System.out.println("Koneksi gagal");
        }
        
    }
    
    public Connection getCon() {
            return conn;
        }
}

