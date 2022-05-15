/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.BUS;

import QuanLyBanVeMayBay.DAO.ChuyenBayDAO;
import QuanLyBanVeMayBay.DTO.ChuyenBay;
import Template.Dialog;
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
        if (maTB.equals("")) {
            new MyDialog("Vui lòng chọn mã tuyến bay!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (maMB.equals("")) {
            new MyDialog("Vui lòng chọn mã máy bay!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (ngayCC.compareTo(ngayHC) > 0 || ngayCC.compareTo(ngayHC) == 0) {
            new MyDialog("Ngày kết thúc không hợp lệ!", MyDialog.ERROR_DIALOG);
            return false;
        }
        boolean flag = false;
        try {
            String[] maTBTemp = maTB.split(" - ");
            String[] maMBTemp = maMB.split(" - ");
            int maTuyenBay = Integer.parseInt(maTBTemp[0]);
            int maMayBay = Integer.parseInt(maMBTemp[0]);
            // Lấy ra số lượng ghế của máy bay có mã tương ứng và gán vào số lượng vé còn
            // lại.
            int soLgVeCL = Integer.parseInt(getMayBay(maMayBay).getSoLgGhe());

            ChuyenBay cb = new ChuyenBay();
            cb.setMaTuyenBay(maTuyenBay);
            cb.setMaMayBay(maMayBay);
            cb.setSoLgVeCL(soLgVeCL);
            cb.setNgayCatCanh(ngayCC);
            cb.setNgayHaCanh(ngayHC);

            flag = cbDAO.themChuyenBay(cb);
        } catch (Exception e) {
            new MyDialog("Vui lòng nhập số nguyên hợp lệ!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (flag) {
            new MyDialog("Thêm thành công!", MyDialog.SUCCESS_DIALOG);
            return true;
        } else {
            new MyDialog("Thêm thất bại!", MyDialog.ERROR_DIALOG);
            return false;
        }
        return flag;
    }

    public boolean nhapChuyenBayTuExcel(String maTB, String maMB, Date ngayCC, Date ngayHC) {
        if (maTB.equals("")) {
            new MyDialog("Vui lòng chọn mã tuyến bay!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (maMB.equals("")) {
            new MyDialog("Vui lòng chọn mã máy bay!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (ngayCC.compareTo(ngayHC) > 0 || ngayCC.compareTo(ngayHC) == 0) {
            new MyDialog("Ngày kết thúc không hợp lệ!", MyDialog.ERROR_DIALOG);
            return false;
        }
        boolean flag = false;
        try {
            String[] maTBTemp = maTB.split(" - ");
            String[] maMBTemp = maMB.split(" - ");
            int maTuyenBay = Integer.parseInt(maTBTemp[0]);
            int maMayBay = Integer.parseInt(maMBTemp[0]);
            // Lấy ra số lượng ghế của máy bay có mã tương ứng và gán vào số lượng vé còn
            // lại.
            int soLgVeCL = Integer.parseInt(getMayBay(maMayBay).getSoLgGhe());

            ChuyenBay cb = new ChuyenBay();
            cb.setMaTuyenBay(maTuyenBay);
            cb.setMaMayBay(maMayBay);
            cb.setSoLgVeCL(soLgVeCL);
            cb.setNgayCatCanh(ngayCC);
            cb.setNgayHaCanh(ngayHC);

            cbDAO.nhapChuyenBayTuExcel(cb);
        } catch (Exception e) {
        }
        return false;
    }

    public boolean xoaChuyenBay(String ma) {
        if (ma.trim().equals("")) {
            new MyDialog("Chưa chọn chuyến bay để xoá!", MyDialog.ERROR_DIALOG);
            return false;
        }

        int maSP = Integer.parseInt(ma);
        if (cbDAO.xoaChuyenBay(maSP)) {
            new MyDialog("Xoá thành công!", MyDialog.SUCCESS_DIALOG);
            return true;
        }

        new MyDialog("Xoá thất bại!", MyDialog.ERROR_DIALOG);
        return false;
    }

    public boolean suaChuyenBay(String maCB, String maTB, String maMB, Date ngayCC, Date ngayHC) {

        try {
            if (maCB.trim().equals("")) {
                new MyDialog("Chưa chọn chuyến bay để sửa!", MyDialog.ERROR_DIALOG);
                return false;
            }
            int maChuyenBay = Integer.parseInt(maCB);
            String[] maTBTemp = maTB.split(" - ");
            String[] maMBTemp = maMB.split(" - ");
            int maTuyenBay = Integer.parseInt(maTBTemp[0]);
            int maMayBay = Integer.parseInt(maMBTemp[0]);
            // Lấy ra số lượng ghế của máy bay có mã tương ứng và gán vào số lượng vé còn
            // lại.
            int soLgVeCL = Integer.parseInt(getMayBay(maMayBay).getSoLgGhe());
            
            if (maTuyenBay == 0) {
                new MyDialog("Mã tuyến bay không được để trống!", MyDialog.ERROR_DIALOG);
                return false;
            }

            if (maMayBay == 0) {
                new MyDialog("Vui lòng chọn mã máy bay", MyDialog.ERROR_DIALOG);
                return false;
            }

            if (ngayCC.toString().trim().equals("")) {
                new MyDialog("Vui lòng chọn ngày cất cánh!", MyDialog.ERROR_DIALOG);
                return false;
            }

            if (ngayCC.toString().trim().equals("")) {
                new MyDialog("Vui lòng chọn ngày hạ cánh!", MyDialog.ERROR_DIALOG);
                return false;
            }

            if (ngayCC.compareTo(ngayHC) > 0 || ngayCC.compareTo(ngayHC) == 0) {
                new MyDialog("Ngày kết thúc không hợp lệ!", MyDialog.ERROR_DIALOG);
                return false;
            }

            ChuyenBay cb = new ChuyenBay();
            cb.setMaChuyenBay(maChuyenBay);
            cb.setMaTuyenBay(maTuyenBay);
            cb.setMaMayBay(maMayBay);
            cb.setSoLgVeCL(soLgVeCL);
            cb.setNgayCatCanh(ngayCC);
            cb.setNgayHaCanh(ngayHC);

            // flag = cbDAO.themChuyenBay(cb);

            if (cbDAO.suaChuyenBay(cb)) {
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

    // public String getTenSP(int maSP) {
    //     for (ChuyenBay sp : listChuyenBay) {
    //         if (sp.getMaSP() == maSP) {
    //             return sp.getTenSP();
    //         }
    //     }
    //     return "";
    // }
}
