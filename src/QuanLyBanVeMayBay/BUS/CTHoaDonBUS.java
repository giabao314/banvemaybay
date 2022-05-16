package QuanLyBanVeMayBay.BUS;
import java.util.ArrayList;

import QuanLyBanVeMayBay.DAO.CTHoaDonDAO;
import QuanLyBanVeMayBay.DTO.CTHoaDon;

public class CTHoaDonBUS {
	 private static ArrayList<CTHoaDon> listCTHoaDon;
	    private static CTHoaDonDAO ctHDDAO = new CTHoaDonDAO();
	    private HoaDonBUS hdBUS = new HoaDonBUS();

	    public CTHoaDonBUS() {
	        docListCTHoaDon();
	    }

	    public static void docListCTHoaDon() {
	       listCTHoaDon = ctHDDAO.getListCTHoaDon();
	    }

	    public static ArrayList<CTHoaDon> getListCTHoaDon() {
	        return listCTHoaDon;
	    }

	    public static ArrayList<CTHoaDon> getListCTHoaDonTheoMaHD(String maHD) {
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
