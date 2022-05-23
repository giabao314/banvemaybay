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
    public static Connection conn = null;
    private String severName = "localhost";
    private String dbName = "banvemaybay";
    private String userName = "root";
    private String password = "";

    public MyConnect() {
        //docFileText();

        String strConnect = "jdbc:mysql://localhost:3306/banvemaybay";
        Properties pro = new Properties();
        pro.put("user", userName);
        pro.put("password", password);
        try {
            com.mysql.jdbc.Driver driver = new Driver();
            conn = driver.connect(strConnect, pro);
            System.out.print("Done!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ä�á»�c dá»¯ liá»‡u tháº¥t báº¡i", "Lá»—i", JOptionPane.ERROR_MESSAGE);
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
