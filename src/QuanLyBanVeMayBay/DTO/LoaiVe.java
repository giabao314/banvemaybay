/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.DTO;

/**
 *
 * @author Thepi314
 */
public class LoaiVe {
    private int maLoaiVe;
    private String tenLoaiVe;	
    private int donGia;

    public int getMaLoaiVe() {
        return maLoaiVe;
    }

    public void setMaLoaiVe(int maLoaiVe) {
        this.maLoaiVe = maLoaiVe;
    }

    public String getTenLoaiVe() {
        return tenLoaiVe;
    }

    public void setTenLoaiVe(String tenLoaiVe) {
        this.tenLoaiVe = tenLoaiVe;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public LoaiVe(int maLoaiVe, String tenLoaiVe, int donGia) {
        this.maLoaiVe = maLoaiVe;
        this.tenLoaiVe = tenLoaiVe;
        this.donGia = donGia;
    }

    public LoaiVe() {
    }
    
    

}
