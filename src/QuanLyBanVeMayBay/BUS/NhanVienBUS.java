package QuanLyBanVeMayBay.BUS;
import java.util.ArrayList;

import QuanLyBanVeMayBay.DAO.NhanVienDAO;
import QuanLyBanVeMayBay.DTO.NhanVien;

public class NhanVienBUS {
	 private static NhanVienDAO nvDAO = new NhanVienDAO();
	    private static ArrayList<NhanVien> listNhanVien = null;

	    public NhanVienBUS() {
	        docDanhSach();
	    }

	    public static void docDanhSach() {
	      listNhanVien = nvDAO.getDanhSachNhanVien();
	    }

	    public static ArrayList<NhanVien> getDanhSachNhanVien() {
	        if (listNhanVien == null)
	            docDanhSach();
	        return listNhanVien;
	    }

	    public static  boolean themNhanVien(String ho, String ten, String gioiTinh, String cancuoc , int sdt , int luong) {
	        ho = ho.trim();
	        ten = ten.trim();
	        
	        
	        if (ho.equals("")) {
//	            new MyDialog("Họ không được để trống!", MyDialog.ERROR_DIALOG);
	            return false;
	        }
	      
	        if (ten.equals("")) {
//	            new MyDialog("Tên không được để trống!", MyDialog.ERROR_DIALOG);
	            return false;
	        }
	        
	        NhanVien nv = new NhanVien();
	        nv.setHoNV(ho);
	        nv.setTenNV(ten);
	        nv.setGioiTinh(gioiTinh);
	        nv.setCanCuoc(cancuoc);
	        nv.setSdt(sdt);
	        nv.setLuong(luong);
	        boolean flag = nvDAO.themNhanVien(nv);
	        if (!flag) {
//	            new MyDialog("Thêm thất bại!", MyDialog.ERROR_DIALOG);
	        } else {
//	            new MyDialog("Thêm thành công!", MyDialog.SUCCESS_DIALOG);
	        }
	        return flag;
	    }

	    public static boolean updateNhanVien(String ma, String ho, String ten, String gioiTinh, String cancuoc , int sdt , int luong) {
	    	int maNV = Integer.parseInt(ma);
	        ho = ho.trim();
	        ten = ten.trim();
	      
	        
	        if (ho.equals("")) {
//	            new MyDialog("Họ không được để trống!", MyDialog.ERROR_DIALOG);
	            return false;
	        }
	      
	        if (ten.equals("")) {
//	            new MyDialog("Tên không được để trống!", MyDialog.ERROR_DIALOG);
	            return false;
	        }
	        NhanVien nv = new NhanVien();
	        nv.setMaNV(maNV);
	        nv.setHoNV(ho);
	        nv.setTenNV(ten);
	        nv.setGioiTinh(gioiTinh);
	        nv.setCanCuoc(cancuoc);
	        nv.setSdt(sdt);
	        nv.setLuong(luong);
	        boolean flag = nvDAO.updateNhanVien(nv);
//	        if (!flag) {
//	            new MyDialog("Cập nhập thất bại!", MyDialog.ERROR_DIALOG);
//	        } else {
//	            new MyDialog("Cập nhập thành công!", MyDialog.SUCCESS_DIALOG);
//	        }
	        return flag;
	    }

	    public static ArrayList<NhanVien> timNhanVien(String tuKhoa) {
	        tuKhoa = tuKhoa.toLowerCase();
	        ArrayList<NhanVien> dsnv = new ArrayList<>();
	        for (NhanVien nv : listNhanVien) {
	            if (nv.getHoNV().toLowerCase().contains(tuKhoa) || nv.getTenNV().toLowerCase().contains(tuKhoa) ||
	                    nv.getGioiTinh().toLowerCase().contains(tuKhoa) || nv.getCanCuoc().toLowerCase().contains(tuKhoa) || Integer.toString(nv.getSdt()).contains(tuKhoa) || Integer.toString(nv.getLuong()).contains(tuKhoa)) {
	                dsnv.add(nv);
	            }
	        }
	        return dsnv;
	    }

	  

		public static boolean xoaNhanVien(String ma) {
	        try {
	            int maNV = Integer.parseInt(ma);
//	            MyDialog dlg = new MyDialog("Bạn có chắc chắn muốn xoá?", MyDialog.WARNING_DIALOG);
	            boolean flag = false;
//	            if (dlg.getAction() == MyDialog.OK_OPTION) {
//	                flag = nvDAO.deleteNhanVien(maNV);
//	                if (flag) {
//	                    new MyDialog("Xoá thành công!", MyDialog.SUCCESS_DIALOG);
//	                } else {
//	                    new MyDialog("Xoá thất bại!", MyDialog.ERROR_DIALOG);
//	                }
//	            }
	            return flag;
	        } catch (Exception e) {
//	            new MyDialog("Chưa chọn nhân viên!", MyDialog.ERROR_DIALOG);
	        }
	        return false;
	    }

	    public boolean nhapExcel(String ho, String ten, String gioiTinh, String cancuoc , int sdt , int luong) {
	        NhanVien nv = new NhanVien();
	        nv.setHoNV(ho);
	        nv.setTenNV(ten);
	        nv.setGioiTinh(gioiTinh);
	        nv.setCanCuoc(cancuoc);
	        nv.setSdt(sdt);
	        nv.setLuong(luong);
	        boolean flag = nvDAO.nhapExcel(nv);
	        return flag;
	    }
}
