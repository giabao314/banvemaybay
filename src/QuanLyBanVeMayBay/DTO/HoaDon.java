package QuanLyBanVeMayBay.DTO;
import java.sql.Date;

public class HoaDon {
    private int maHD;
    private String maNV;
    private String maKHThanhToan;
    private String ngayLap;
    private int tongTien;
    
    public HoaDon() {
    	
    }
    
	public HoaDon(int maHD, String maNV, String maKHThanhToan, String ngayLap, int tongTien) {
		super();
		this.maHD = maHD;
		this.maNV = maNV;
		this.maKHThanhToan = maKHThanhToan;
		this.ngayLap = ngayLap;
		this.tongTien = tongTien;
	}

	public int getMaHD() {
		return maHD;
	}

	public void setMaHD(int maHD) {
		this.maHD = maHD;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getMaKHThanhToan() {
		return maKHThanhToan;
	}

	public void setMaKHThanhToan(String maKHThanhToan) {
		this.maKHThanhToan = maKHThanhToan;
	}

	public String getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(String ngayLap) {
		this.ngayLap = ngayLap;
	}

	public int getTongTien() {
		return tongTien;
	}

	public void setTongTien(int tongTien) {
		this.tongTien = tongTien;
	}
    
	
	
    
    
}
