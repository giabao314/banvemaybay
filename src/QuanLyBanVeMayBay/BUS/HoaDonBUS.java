package QuanLyBanVeMayBay.BUS;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import QuanLyBanVeMayBay.DAO.HoaDonDAO;
import QuanLyBanVeMayBay.DTO.HoaDon;

public class HoaDonBUS {

	    private ArrayList<HoaDon> listHoaDon;
	    private HoaDonDAO hoaDonDAO = new HoaDonDAO();

	    public ArrayList<HoaDon> getListHoaDon() {
	        listHoaDon = hoaDonDAO.getListHoaDon();
	        return listHoaDon;
	    }

	    public void luuHoaDon(String maKH, String maNV, int tongtien , String ngaylap) {
	        HoaDon hd = new HoaDon();
//	        String[] arrNV = nhanVien.split(" - ");
//	        int maNV = Integer.parseInt(arrNV[0]);
	        hd.setMaNV(maNV);
	        hd.setMaKHThanhToan(maKH);
	        hd.setNgayLap(ngaylap);
	        hd.setTongTien(tongtien);

	        hoaDonDAO.addHoaDon(hd);
	    }

	    public int getMaHoaDonMoiNhat() {
	        return hoaDonDAO.getMaHoaDonMoiNhat();
	    }

	    public HoaDon getHoaDon(String maHD) {
	        int ma = Integer.parseInt(maHD);
	        for (HoaDon hd : listHoaDon) {
	            if (hd.getMaHD() == ma)
	                return hd;
	        }
	        return null;
	    }

	    public ArrayList<HoaDon> getListHoaDonTheoGia(String min, String max) {
	        try {
	            int minPrice = Integer.parseInt(min);
	            int maxPrice = Integer.parseInt(max);
	            ArrayList<HoaDon> dshd = new ArrayList<>();
	            for (HoaDon hd : listHoaDon) {
	                if (hd.getTongTien() > minPrice && hd.getTongTien() < maxPrice)
	                    dshd.add(hd);
	            }
	            return dshd;
	        } catch (Exception e) {
//	            new MyDialog("Hãy nhập khoảng giá hợp lệ", MyDialog.ERROR_DIALOG);
	        }
	        return null;
	    }

	    public ArrayList<HoaDon> getListHoaDonTheoNgay(String min, String max) {
	        try {
	            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	            Date minDate = (Date) sdf.parse(min);
	            Date maxDate = (Date) sdf.parse(max);

	            String dateMin =  "" + (minDate.getTime());
	            String dateMax =  "" + (maxDate.getTime());

	            ArrayList<HoaDon> dshd = hoaDonDAO.getListHoaDon(dateMin, dateMax);
	            return dshd;
	        } catch (Exception e) {
//	            new MyDialog("Hãy nhập khoảng ngày hợp lệ!", MyDialog.ERROR_DIALOG);
	        }
	        return null;
	    }
	}

