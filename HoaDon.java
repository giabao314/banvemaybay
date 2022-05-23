package QuanLyBanVeMayBay.DTO;
import java.sql.Date;

public class HoaDon {
    private int maHD;
    private int maNV;
    private int maKHThanhToan;
    private String ngayLap;
    private int tongTien;
    private int maKM;
    
    public HoaDon() {
    	
    }
    
	public HoaDon(int maHD, int maNV, int maKHThanhToan, String ngayLap, int tongTien , int maKM) {
		super();
		this.maHD = maHD;
		this.maNV = maNV;
		this.maKHThanhToan = maKHThanhToan;
		this.ngayLap = ngayLap;
		this.tongTien = tongTien;
                this.maKM = maKM;
	}

	public int getMaHD() {
		return maHD;
	}

	public void setMaHD(int maHD) {
		this.maHD = maHD;
	}

	public int getMaNV() {
		return maNV;
	}

	public void setMaNV(int maNV) {
		this.maNV = maNV;
	}

	public int getMaKHThanhToan() {
		return maKHThanhToan;
	}

	public void setMaKHThanhToan(int maKHThanhToan) {
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
    
	
	public int getmaKM() {
		return maKM;
	}

	public void setmaKM(int maKM) {
		this.maKM = maKM;
	}
    
    
}
