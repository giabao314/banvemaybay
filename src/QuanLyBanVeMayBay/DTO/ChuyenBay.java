/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.DTO;
// import QuanLyBanVeMayBay.DTO.MayBay;

import java.util.Date;

/**
 *
 * @author Thepi314
 */
public class ChuyenBay {

    private int maChuyenBay;
    private int maTuyenBay;
    private int maMayBay;
    private int soLgVeCL;
    private Date ngayCatCanh;
    private Date ngayHaCanh;

    public ChuyenBay() {
    }

    public ChuyenBay(int maChuyenBay, int maTuyenBay, int maMayBay, int soLgVeCL, Date ngayCatCanh,
            Date ngayHaCanh) {
        this.maChuyenBay = maChuyenBay;
        this.maTuyenBay = maTuyenBay;
        this.maMayBay = maMayBay;
        this.soLgVeCL = soLgVeCL;
        this.ngayCatCanh = ngayCatCanh;
        this.ngayHaCanh = ngayHaCanh;
    }

    public int getMaChuyenBay() {
        return maChuyenBay;
    }

    public void setMaChuyenBay(int maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public int getMaTuyenBay() {
        return maTuyenBay;
    }

    public void setMaTuyenBay(int maTuyenBay) {
        this.maTuyenBay = maTuyenBay;
    }

    public int getMaMayBay() {
        return maMayBay;
    }

    public void setMaMayBay(int maMayBay) {
        this.maMayBay = maMayBay;
    }

    public int getSoLgVeCL() {
        return soLgVeCL;
    }

    public void setSoLgVeCL(int soLgVeCL) {
        this.soLgVeCL = soLgVeCL;
    }

    public Date getNgayCatCanh() {
        return ngayCatCanh;
    }

    public void setNgayCatCanh(Date ngayCatCanh) {
        this.ngayCatCanh = ngayCatCanh;
    }

    public Date getNgayHaCanh() {
        return ngayHaCanh;
    }

    public void setNgayHaCanh(Date ngayHaCanh) {
        this.ngayHaCanh = ngayHaCanh;
    }
}
