/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.BUS;

import java.util.ArrayList;
import QuanLyBanVeMayBay.DAO.MayBayDAO;
import QuanLyBanVeMayBay.DTO.MayBayDTO;

/**
 *
 * @author Dell
 */
public class MayBayBUS {

    private ArrayList<MayBayDTO> listMayBay = null;
    private MayBayDAO mbDAO = new MayBayDAO();

    public MayBayBUS() {
        docListMayBay();
    }

    public void docListMayBay() {
        listMayBay = mbDAO.getDanhSachMayBay();
    }

    public ArrayList<MayBayDTO> getListMayBay() {
        if (listMayBay == null) {
            docListMayBay();
        }
        return listMayBay;
    }

    public MayBayDTO getMayBay(String ma) {
        if (!ma.trim().equals("")) {
            try {
//                int maSP = Integer.parseInt(ma);
                for (MayBayDTO mb : listMayBay) {
                    if (mb.getMaMayBay() == ma) {
                        return mb;
                    }
                }
            } catch (Exception e) {
            }
        }
        return null;
    }

    public ArrayList<MayBayDTO> getMayBayTheoTen(String ten) {
        ArrayList<MayBayDTO> dsmb = new ArrayList<>();
        for (MayBayDTO mb : listMayBay) {
            String tenMB = mb.getTenMayBay().toLowerCase();
            if (tenMB.toLowerCase().contains(ten.toLowerCase())) {
                dsmb.add(mb);
            }
        }
        return dsmb;
    }

    public ArrayList<MayBayDTO> getMayBayTheoHang(String tenhang) {
        if (!tenhang.trim().equals("")) {
            ArrayList<MayBayDTO> dsmb = new ArrayList<>();
            dsmb = mbDAO.getMayBayTheoHang(tenhang);
            return dsmb;
        }
        return null;
    }

//    public String getAnh(String ma) {
//        int maSP = Integer.parseInt(ma);
//        return spDAO.getAnh(maSP);
//    }
    public void capNhatSoLuongGhe(String ma, int soLuongGhe) {
        mbDAO.capNhatSoLuongGhe(ma, soLuongGhe);
    }

    public boolean themMayBay(MayBayDTO mb) {

        if (mb.getTenMayBay().trim().equals("")) {
//            new MyDialog("Tên máy bay không được để rỗng!", MyDialog.ERROR_DIALOG);
            return false;
        }

        if (mb.getSoLuongGhe() == 0) {
//            new MyDialog("Vui lòng điền số lượng ghế!", MyDialog.ERROR_DIALOG);
            return false;
        }

        try {
            if (mbDAO.themMayBay(mb)) {
//                new MyDialog("Thêm thành công!", MyDialog.SUCCESS_DIALOG);
                return true;
            } else {
//                new MyDialog("Thêm thất bại!", MyDialog.ERROR_DIALOG);
                return false;
            }
        } catch (Exception e) {
//            new MyDialog("Nhập số hợp lệ cho tên máy bay và số lượng ghế!", MyDialog.ERROR_DIALOG);
        }
        return false;
    }

//    public boolean nhapSanPhamTuExcel(String ten,
//            String loai,
//            String soLuong,
//            String donViTinh,
//            String anh,
//            String donGia) {
//
//        try {
//            String[] loaiTmp = loai.split(" - ");
//            int maLoai = Integer.parseInt(loaiTmp[0]);
//            int soLuongSP = Integer.parseInt(soLuong);
//            donGia = donGia.replace(",", "");
//            int donGiaSP = Integer.parseInt(donGia);
//
//            SanPham sp = new SanPham();
//            sp.setTenSP(ten);
//            sp.setMaLoai(maLoai);
//            sp.setSoLuong(soLuongSP);
//            sp.setDonViTinh(donViTinh);
//            sp.setHinhAnh(anh);
//            sp.setDonGia(donGiaSP);
//
//            spDAO.nhapSanPhamTuExcel(sp);
//        } catch (Exception e) {
//        }
//        return false;
//    }
    public boolean xoaMayBay(String ma) {
        if (ma.trim().equals("")) {
//            new MyDialog("Chưa chọn máy bay để xoá!", MyDialog.ERROR_DIALOG);
            return false;
        }

//        int maSP = Integer.parseInt(ma);
        if (mbDAO.xoaMayBay(ma)) {
//            new MyDialog("Xoá thành công!", MyDialog.SUCCESS_DIALOG);
            return true;
        }

//        new MyDialog("Xoá thất bại!", MyDialog.ERROR_DIALOG);
        return false;
    }

    public boolean suaMayBay(MayBayDTO mb) {

        try {
            if (mb.getMaMayBay().trim().equals("")) {
//                new MyDialog("Chưa chọn may bay để sửa!", MyDialog.ERROR_DIALOG);
                return false;
            }

            if (mbDAO.suaMayBay(mb)) {
//                new MyDialog("Sửa thành công!", MyDialog.SUCCESS_DIALOG);
                return true;
            } else {
//                new MyDialog("Sửa thất bại!", MyDialog.ERROR_DIALOG);
                return false;
            }
        } catch (Exception e) {
//            new MyDialog("Nhập số hợp lệ cho Đơn giá và Số lượng!", MyDialog.ERROR_DIALOG);
        }
        return false;
    }

    public String getTenMB(String maMB) {
        for (MayBayDTO mb : listMayBay) {
            if (mb.getMaMayBay() == maMB) {
                return mb.getTenMayBay();
            }
        }
        return "";
    }

    public ArrayList<MayBayDTO> timKiemMayBayTheoMa(String maMB) {
        ArrayList<MayBayDTO> dsmb = new ArrayList();
        for (MayBayDTO mb : listMayBay) {
            if (mb.getMaMayBay().trim().equals(maMB)) {
                dsmb.add(mb);
            }
        }
        return dsmb;
    }

    public ArrayList<MayBayDTO> timKiemMayBayTheoTen(String tenMB) {
        ArrayList<MayBayDTO> dsmb = new ArrayList();
        for (MayBayDTO mb : listMayBay) {
            if (mb.getTenMayBay().trim().equals(tenMB)) {
                dsmb.add(mb);
            }
        }
        return dsmb;
    }

    public ArrayList<MayBayDTO> timKiemMayBayTheoHang(String hangMB) {
        ArrayList<MayBayDTO> dsmb = new ArrayList();
        for (MayBayDTO mb : listMayBay) {
            if (mb.getMaMayBay().trim().equals(hangMB)) {
                dsmb.add(mb);
            }
        }
        return dsmb;
    }
}
