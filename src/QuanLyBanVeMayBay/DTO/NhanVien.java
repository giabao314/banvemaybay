package QuanLyBanVeMayBay.DTO;

public class NhanVien {
    private int maNV;
    private String hoNV;
    private String tenNV;
    private String gioiTinh;
    private String canCuoc;
    private int sdt;
    private int luong;
    
    public NhanVien() {
    	
    }
    
	public NhanVien(int maNV, String hoNV, String tenNV, String gioiTinh, String canCuoc, int sdt, int luong) {
		super();
		this.maNV = maNV;
		this.hoNV = hoNV;
		this.tenNV = tenNV;
		this.gioiTinh = gioiTinh;
		this.canCuoc = canCuoc;
		this.sdt = sdt;
		this.luong = luong;
	}

	public int getMaNV() {
		return maNV;
	}

	public void setMaNV(int ma) {
		this.maNV = ma;
	}

	public String getHoNV() {
		return hoNV;
	}

	public void setHoNV(String hoNV) {
		this.hoNV = hoNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getCanCuoc() {
		return canCuoc;
	}

	public void setCanCuoc(String canCuoc) {
		this.canCuoc = canCuoc;
	}

	public int getSdt() {
		return sdt;
	}

	public void setSdt(int sdt) {
		this.sdt = sdt;
	}

	public int getLuong() {
		return luong;
	}

	public void setLuong(int luong) {
		this.luong = luong;
	}
	
	
	
    
    
}
