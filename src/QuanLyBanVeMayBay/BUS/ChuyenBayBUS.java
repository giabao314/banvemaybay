/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.BUS;

import QuanLyBanVeMayBay.DAO.ChuyenBayDAO;
import QuanLyBanVeMayBay.DTO.ChuyenBay;
import java.util.ArrayList;
import java.util.Date;
import QuanLyBanVeMayBay.DAO.MayBayDAO;

/**
 *
 * @author Thepi314
 */
public class ChuyenBayBUS {
    private ArrayList<ChuyenBay> listCB = null;
    private ChuyenBayDAO cbDAO = new ChuyenBayDAO();

    public ChuyenBayBUS() {
        docListChuyenBay();
    }

    public void docListChuyenBay() {
        listCB = cbDAO.getListChuyenBay();
    }

    public ArrayList<ChuyenBay> getListChuyenBay() {
        if (listCB == null) {
            docListChuyenBay();
        }
        return listCB;
    }

    public ChuyenBay getChuyenBay(String ma) {
        if (!ma.trim().equals("")) {
            try {
                int maCB = Integer.parseInt(ma);
                for (ChuyenBay cb : listCB) {
                    if (cb.getMaChuyenBay() == maCB) {
                        return cb;
                    }
                }
            } catch (Exception e) {
            }
        }
        return null;
    }

    public ArrayList<ChuyenBay> getChuyenBayTheoMaTuyenBay(String ma) {
        if (!ma.trim().equals("")) {
            ArrayList<ChuyenBay> dscb = new ArrayList<>();
            try {
                int maTuyenBay = Integer.parseInt(ma);
                for (ChuyenBay cb : listCB) {
                    if (cb.getMaTuyenBay() == maTuyenBay) {
                        dscb.add(cb);
                    }
                }
                return dscb;
            } catch (Exception e) {
            }
        }
        return null;
    }

    public ArrayList<ChuyenBay> getChuyenBayTheoMaMayBay(String ma) {
        if (!ma.trim().equals("")) {
            ArrayList<ChuyenBay> dscb = new ArrayList<>();
            try {
                int maMayBay = Integer.parseInt(ma);
                for (ChuyenBay cb : listCB) {
                    if (cb.getMaMayBay() == maMayBay) {
                        dscb.add(cb);
                    }
                }
                return dscb;
            } catch (Exception e) {
            }
        }
        return null;
    }

    // public String getAnh(String ma) {
    // int maSP = Integer.parseInt(ma);
    // return spDAO.getAnh(maSP);
    // }

    // public void capNhatSoLuongCB(int ma, int soLuongMat) {
    // cbDAO.capNhatSoLuongCB(ma, soLuongMat);
    // }

    public boolean themChuyenBay(String maTB, String maMB, Date ngayCC, Date ngayHC) {

        try {
            String[] maTBTemp = maTB.split(" - ");
            String[] maMBTemp = maMB.split(" - ");
            
            int maTuyenBay = Integer.parseInt(maTBTemp[0]);
            int maMayBay = Integer.parseInt(maMBTemp[0]);
            int soLgVeCL = Integer.parseInt();
            int donGiaSP = Integer.parseInt(donGia);
            ChuyenBay cb = new ChuyenBay();
            cb.setTenSP(ten);
            cb.setMaLoai(maLoai);
            cb.setSoLuong(soLuongSP);
            cb.setDonViTinh(donViTinh);
            cb.setHinhAnh(anh);
            cb.setDonGia(donGiaSP);

            if (spDAO.themChuyenBay(sp)) {
                new MyDialog("Thêm thành công!", MyDialog.SUCCESS_DIALOG);
                return true;
            } else {
                new MyDialog("Thêm thất bại!", MyDialog.ERROR_DIALOG);
                return false;
            }
        } catch (Exception e) {
            new MyDialog("Nhập số hợp lệ cho Đơn giá và Số lượng!", MyDialog.ERROR_DIALOG);
        }
        return false;
    }

    public boolean nhapChuyenBayTuExcel(String ten,
            String loai,
            String soLuong,
            String donViTinh,
            String anh,
            String donGia) {

        try {
            String[] loaiTmp = loai.split(" - ");
            int maLoai = Integer.parseInt(loaiTmp[0]);
            int soLuongSP = Integer.parseInt(soLuong);
            donGia = donGia.replace(",", "");
            int donGiaSP = Integer.parseInt(donGia);

            ChuyenBay sp = new ChuyenBay();
            sp.setTenSP(ten);
            sp.setMaLoai(maLoai);
            sp.setSoLuong(soLuongSP);
            sp.setDonViTinh(donViTinh);
            sp.setHinhAnh(anh);
            sp.setDonGia(donGiaSP);

            spDAO.nhapChuyenBayTuExcel(sp);
        } catch (Exception e) {
        }
        return false;
    }

    public boolean xoaChuyenBay(String ma) {
        if (ma.trim().equals("")) {
            new MyDialog("Chưa chọn sản phẩm để xoá!", MyDialog.ERROR_DIALOG);
            return false;
        }

        int maSP = Integer.parseInt(ma);
        if (spDAO.xoaChuyenBay(maSP)) {
            new MyDialog("Xoá thành công!", MyDialog.SUCCESS_DIALOG);
            return true;
        }

        new MyDialog("Xoá thất bại!", MyDialog.ERROR_DIALOG);
        return false;
    }

    public boolean suaChuyenBay(String ma,
            String ten,
            String loai,
            String soLuong,
            String donViTinh,
            String anh,
            String donGia) {

        try {
            if (ma.trim().equals("")) {
                new MyDialog("Chưa chọn sản phẩm để sửa!", MyDialog.ERROR_DIALOG);
                return false;
            }
            donGia = donGia.replace(",", "");
            int maSP = Integer.parseInt(ma);
            String[] loaiTmp = loai.split(" - ");
            int maLoai = Integer.parseInt(loaiTmp[0]);
            int soLuongSP = Integer.parseInt(soLuong);
            int donGiaSP = Integer.parseInt(donGia);

            if (maLoai == 0) {
                new MyDialog("Vui lòng chọn Loại sản phẩm!", MyDialog.ERROR_DIALOG);
                return false;
            }

            if (ten.trim().equals("")) {
                new MyDialog("Tên SP không được để rỗng!", MyDialog.ERROR_DIALOG);
                return false;
            }

            if (donViTinh.trim().equals("")) {
                new MyDialog("Vui lòng điền Đơn vị tính!", MyDialog.ERROR_DIALOG);
                return false;
            }

            ChuyenBay sp = new ChuyenBay();
            sp.setMaSP(maSP);
            sp.setTenSP(ten);
            sp.setMaLoai(maLoai);
            sp.setSoLuong(soLuongSP);
            sp.setDonViTinh(donViTinh);
            sp.setHinhAnh(anh);
            sp.setDonGia(donGiaSP);

            if (spDAO.suaChuyenBay(sp)) {
                new MyDialog("Sửa thành công!", MyDialog.SUCCESS_DIALOG);
                return true;
            } else {
                new MyDialog("Sửa thất bại!", MyDialog.ERROR_DIALOG);
                return false;
            }
        } catch (Exception e) {
            new MyDialog("Nhập số hợp lệ cho Đơn giá và Số lượng!", MyDialog.ERROR_DIALOG);
        }
        return false;
    }

    public String getTenSP(int maSP) {
        for (ChuyenBay sp : listChuyenBay) {
            if (sp.getMaSP() == maSP) {
                return sp.getTenSP();
            }
        }
        return "";
    }
}
