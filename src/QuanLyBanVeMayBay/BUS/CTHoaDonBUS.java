package QuanLyBanVeMayBay.BUS;
import java.util.ArrayList;

import QuanLyBanVeMayBay.DAO.CTHoaDonDAO;
import QuanLyBanVeMayBay.DTO.CTHoaDon;

public class CTHoaDonBUS {
	 private ArrayList<CTHoaDon> listCTHoaDon;
	    private CTHoaDonDAO ctHDDAO = new CTHoaDonDAO();
	    private HoaDonBUS hdBUS = new HoaDonBUS();

	    public CTHoaDonBUS() {
	        docListCTHoaDon();
	    }

	    public void docListCTHoaDon() {
	        this.listCTHoaDon = ctHDDAO.getListCTHoaDon();
	    }

	    public ArrayList<CTHoaDon> getListCTHoaDon() {
	        return listCTHoaDon;
	    }

	    public ArrayList<CTHoaDon> getListCTHoaDonTheoMaHD(String maHD) {
	        int ma = Integer.parseInt(maHD);
	        ArrayList<CTHoaDon> dsct = new ArrayList<>();

	        for (CTHoaDon cthd : listCTHoaDon) {
	            if (cthd.getMaHD() == ma)
	                dsct.add(cthd);
	        }

	        return dsct;
	    }

	    public void addCTHoaDon(String maLoaiVe, String maVeKH ,  int soLgVe, String maKM , String thue , int thanhtien) {
	        int ma = hdBUS.getMaHoaDonMoiNhat();

	       
	        CTHoaDon cthd = new CTHoaDon();

	        cthd.setMaHD(ma);
	        cthd.setMaLoaiVe(maLoaiVe);
	        cthd.setMaVeKH(maVeKH);
	        cthd.setSoLuongVe(soLgVe);
	        cthd.setMaKM(maKM);
	        cthd.setThue(thue);
	        cthd.setThanhTien(thanhtien);
	        

	        ctHDDAO.addCTHoaDon(cthd);
	    }
}
