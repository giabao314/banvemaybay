package QuanLyBanVeMayBay.DTO;

public class CTHoaDon {
    private int maHD;
    private int maLoaiVe;
    private int maVeKH;
    private int soLgVe;
    private double thue;
    private int thanhTien;
    
    public  CTHoaDon() {
    	
    }
    
	public CTHoaDon(int maHD, int maLoaiVe, int maVeKH, int soLgVe, double thue,
		int thanhTien) {
		this.maHD = maHD;
		this.maLoaiVe = maLoaiVe;
		this.maVeKH = maVeKH;
		this.soLgVe = soLgVe;
		this.thue = thue;
		this.thanhTien = thanhTien;
	}

	public int getMaHD() {
		return maHD;
	}

	public void setMaHD(int maHD) {
		this.maHD = maHD;
	}

	public int getMaLoaiVe() {
		return maLoaiVe;
	}

	public void setMaLoaiVe(int maLoaiVe) {
		this.maLoaiVe = maLoaiVe;
	}

	public int getMaVeKH() {
		return maVeKH;
	}

	public void setMaVeKH(int maVeKH) {
		this.maVeKH = maVeKH;
	}

	public int getSoLuongVe() {
		return soLgVe;
	}

	public void setSoLuongVe(int soLuongVe) {
		this.soLgVe = soLuongVe;
	}

	

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}

	public int getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(int thanhTien) {
		this.thanhTien = thanhTien;
	}
	
	
	
    
    
}
