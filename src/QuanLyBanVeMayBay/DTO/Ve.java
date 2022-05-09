/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.DTO;

/**
 *
 * @author Thepi314
 */
public class Ve {
    private int maVe;
    private int maChuyenBay;
    private int maLoaiVe;
    private String maGhe;
    private String gioLenMayBay;

    public int getMaVe() {
        return maVe;
    }

    public void setMaVe(int maVe) {
        this.maVe = maVe;
    }

    public int getMaChuyenBay() {
        return maChuyenBay;
    }

    public void setMaChuyenBay(int maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public int getMaLoaiVe() {
        return maLoaiVe;
    }

    public void setMaLoaiVe(int maLoaiVe) {
        this.maLoaiVe = maLoaiVe;
    }

    public String getMaGhe() {
        return maGhe;
    }

    public void setMaGhe(String maGhe) {
        this.maGhe = maGhe;
    }

    public String getGioLenMayBay() {
        return gioLenMayBay;
    }

    public void setGioLenMayBay(String gioLenMayBay) {
        this.gioLenMayBay = gioLenMayBay;
    }

    public Ve(int maVe, int maChuyenBay, int maLoaiVe, String maGhe, String gioLenMayBay) {
        this.maVe = maVe;
        this.maChuyenBay = maChuyenBay;
        this.maLoaiVe = maLoaiVe;
        this.maGhe = maGhe;
        this.gioLenMayBay = gioLenMayBay;
    }

    public Ve() {
    }

}
