package QuanLyBanVeMayBay.DTO;

public class CTHoaDon {
    private int maHD;
    private String maLoaiVe;
    private String maVeKH;
    private int soLgVe;
    private String maKM;
    private String thue;
    private int thanhTien;
    
    public  CTHoaDon() {
    	
    }
    
	public CTHoaDon(int maHD, String maLoaiVe, String maVeKH, int soLgVe, String maKM, String thue,
		int thanhTien) {
		this.maHD = maHD;
		this.maLoaiVe = maLoaiVe;
		this.maVeKH = maVeKH;
		this.soLgVe = soLgVe;
		this.maKM = maKM;
		this.thue = thue;
		this.thanhTien = thanhTien;
	}

	public int getMaHD() {
		return maHD;
	}

	public void setMaHD(int maHD) {
		this.maHD = maHD;
	}

	public String getMaLoaiVe() {
		return maLoaiVe;
	}

	public void setMaLoaiVe(String maLoaiVe) {
		this.maLoaiVe = maLoaiVe;
	}

	public String getMaVeKH() {
		return maVeKH;
	}

	public void setMaVeKH(String maVeKH) {
		this.maVeKH = maVeKH;
	}

	public int getSoLuongVe() {
		return soLgVe;
	}

	public void setSoLuongVe(int soLuongVe) {
		this.soLgVe = soLuongVe;
	}

	public String getMaKM() {
		return maKM;
	}

	public void setMaKM(String maKM) {
		this.maKM = maKM;
	}

	public String getThue() {
		return thue;
	}

	public void setThue(String thue) {
		this.thue = thue;
	}

	public int getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(int thanhTien) {
		this.thanhTien = thanhTien;
	}
	
	
	
    
    
}
