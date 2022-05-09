/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.DTO;

/**
 *
 * @author Thepi314
 */
public class VeKH {
    private int maVeKH;
    private int maVe;
    private int maKH;

    public int getMaVeKH() {
        return maVeKH;
    }

    public void setMaVeKH(int maVeKH) {
        this.maVeKH = maVeKH;
    }

    public int getMaVe() {
        return maVe;
    }

    public void setMaVe(int maVe) {
        this.maVe = maVe;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public VeKH(int maVeKH, int maVe, int maKH) {
        this.maVeKH = maVeKH;
        this.maVe = maVe;
        this.maKH = maKH;
    }

    public VeKH() {
    }
    
    
    
}
