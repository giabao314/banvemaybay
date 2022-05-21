/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.DAO;

import com.mysql.jdbc.Driver;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;
import java.sql.DriverManager;


/**
 *
 * @author Thepi314
 */
public class MyConnect {
<<<<<<< HEAD
    public static Connection conn;
    private String severName = "localhost";
    private String dbName = "banvemaybay";
    private String userName = "root";
    private String password = "";
=======

    public static Connection conn = null;
    private String severName;
    private String dbName;
    private String userName;
    private String password;
>>>>>>> 2b53277792b0d3406c387f54d3759cb45dfd859e

    public MyConnect() {
        //docFileText();

        String strConnect = "jdbc:mysql://localhost:3306/banvemaybay";
        Properties pro = new Properties();
        pro.put("user", userName);
        pro.put("password", password);
        try {
            com.mysql.jdbc.Driver driver = new Driver();
            conn = driver.connect(strConnect, pro);
<<<<<<< HEAD
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banvemaybay", "root", "");
            System.out.print("Done!");
=======
//            JOptionPane.showMessageDialog(null, "Đọc dữ liệu thất bại", "Lỗi", JOptionPane.ERROR_MESSAGE);
>>>>>>> 2b53277792b0d3406c387f54d3759cb45dfd859e
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Đọc dữ liệu thất bại", "Lỗi", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
            

    }


//    private void docFileText() {
//        severName = "";
//        dbName = "";
//        userName = "";
//        password = "";
//
//        try {
//            FileInputStream fis = new FileInputStream("Connect.txt");
//            InputStreamReader isr = new InputStreamReader(fis);
//            BufferedReader br = new BufferedReader(isr);
//
//            severName = br.readLine();
//            dbName = br.readLine();
//            userName = br.readLine();
//            password = br.readLine();
//
//            if (password == null) {
//                password = "";
//            }
//
//        } catch (Exception e) {
//        }
//    }
   
}
