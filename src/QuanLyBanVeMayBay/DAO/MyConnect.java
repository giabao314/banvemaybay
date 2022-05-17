/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.DAO;

import com.mysql.jdbc.Driver;
import Template.Dialog;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Thepi314
 */
public class MyConnect {
    public static Connection conn = null;
    private String severName;
    private String dbName;
    private String userName;
    private String password;

    public MyConnect() {
        docFileText();

        String strConnect = "jdbc:mysql://" + severName + "/" + dbName + "?useUnicode=true&characterEncoding=utf-8";
        Properties pro = new Properties();
        pro.put("user", userName);
        pro.put("password", password);
        try {
            com.mysql.jdbc.Driver driver = new Driver();
            conn = driver.connect(strConnect, pro);
        } catch (SQLException ex) {
            new Dialog("Không kết nối được tới CSDL!", Dialog.ERROR_DIALOG);
            System.exit(0);
        }

    }

    private void docFileText() {
        // Xử lý đọc file để lấy ra 4 tham số
        severName = "";
        dbName = "";
        userName = "";
        password = "";

        try {
            FileInputStream fis = new FileInputStream("Connect.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            severName = br.readLine();
            dbName = br.readLine();
            userName = br.readLine();
            password = br.readLine();

            if (password == null) {
                password = "";
            }

        } catch (Exception e) {
        }
    }
}
