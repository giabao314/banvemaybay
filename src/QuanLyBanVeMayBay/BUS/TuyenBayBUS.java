/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.BUS;

import java.util.ArrayList;
import QuanLyBanVeMayBay.DAO.TuyenBayDAO;
import QuanLyBanVeMayBay.DTO.TuyenBayDTO;

/**
 *
 * @author Dell
 */
public class TuyenBayBUS {

    private ArrayList<TuyenBayDTO> listTuyenBay = null;
    private TuyenBayDAO tbDAO = new TuyenBayDAO();

    public TuyenBayBUS() {
        docListTuyenBay();
    }

    public void docListTuyenBay() {
        listTuyenBay = tbDAO.getDanhSachTuyenBay();
    }

    public ArrayList<TuyenBayDTO> getListTuyenBay() {
        if (listTuyenBay == null) {
            docListTuyenBay();
        }
        return listTuyenBay;
    }

    public TuyenBayDTO getTuyenBay(String ma) {
        if (!ma.trim().equals("")) {
            try {
//                int maSP = Integer.parseInt(ma);
                for (TuyenBayDTO tb : listTuyenBay) {
                    if (tb.GetMaTuyenBay() == ma) {
                        return tb;
                    }
                }
            } catch (Exception e) {
            }
        }
        return null;
    }

    public boolean themTuyenBay(TuyenBayDTO tb) {
        if (tb.GetSanBayCatCanh().trim().equals("")) {
//            new MyDialog("Không được để trống sân bay cất cánh!", MyDialog.ERROR_DIALOG);
            return false;
        }

        if (tb.GetSanBayHaCanh().trim().equals("")) {
//            new MyDialog("Không được để trống sân bay hạ cánh!", MyDialog.ERROR_DIALOG);
            return false;
        }

        if (tb.GetGioCatCanh().trim().equals("")) {
//            new MyDialog("Không được để trống giờ cất cánh", MyDialog.ERROR_DIALOG);
            return false;
        }

        if (tb.GetGioHaCanh().trim().equals("")) {
//            new MyDialog("Không được để trống giờ hạ cánh", MyDialog.ERROR_DIALOG);
            return false;
        }

        try {
            if (tbDAO.themTuyenBay(tb)) {
//                new MyDialog("Thêm thành công!", MyDialog.SUCCESS_DIALOG);
                return true;
            } else {
//                new MyDialog("Thêm thất bại!", MyDialog.ERROR_DIALOG);
                return false;
            }
        } catch (Exception e) {
//            new MyDialog("Nhập số hợp lệ cho Đơn giá và Số lượng!", MyDialog.ERROR_DIALOG);
        }
        return false;
    }

    public boolean xoaTuyenBay(String ma) {
        if (ma.trim().equals("")) {
//            new MyDialog("Chưa chọn tuyến bay để xoá!", MyDialog.ERROR_DIALOG);
            return false;
        }

//        int maSP = Integer.parseInt(ma);
        if (tbDAO.xoaTuyenBay(ma)) {
//            new MyDialog("Xoá thành công!", MyDialog.SUCCESS_DIALOG);
            return true;
        }

//        new MyDialog("Xoá thất bại!", MyDialog.ERROR_DIALOG);
        return false;
    }

    public boolean suaTuyenBay(String ma, String sbCatCanh, String sbHaCanh, String gioCatCanh, String gioHaCanh) {
        try {
            if (ma.trim().equals("")) {
//                new MyDialog("Chưa chọn tuyến bay để sửa!", MyDialog.ERROR_DIALOG);
                return false;
            }

            TuyenBayDTO tb = new TuyenBayDTO();
            tb.SetSanBayCatCanh(sbCatCanh);
            tb.SetSanBayHaCanh(sbHaCanh);
            tb.SetGioCatCanh(gioCatCanh);
            tb.SetGioHaCanh(gioHaCanh);

            if (tbDAO.suaTuyenBay(tb)) {
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

    public ArrayList<TuyenBayDTO> timKiemTuyenBayTheoMa(String maTB) {
        ArrayList<TuyenBayDTO> dstb = new ArrayList();
        for (TuyenBayDTO tb : listTuyenBay) {
            if (tb.GetMaTuyenBay().trim().equals(maTB)) {
                dstb.add(tb);
            }
        }
        return dstb;
    }

    public ArrayList<TuyenBayDTO> timKiemTuyenBayTheoSBCatCanh(String SBCatCanh) {
        ArrayList<TuyenBayDTO> dstb = new ArrayList();
        for (TuyenBayDTO tb : listTuyenBay) {
            if (tb.GetSanBayCatCanh().trim().equals(SBCatCanh)) {
                dstb.add(tb);
            }
        }
        return dstb;
    }

    public ArrayList<TuyenBayDTO> timKiemTuyenBayTheoSBHaCanh(String SBHaCanh) {
        ArrayList<TuyenBayDTO> dstb = new ArrayList();
        for (TuyenBayDTO tb : listTuyenBay) {
            if (tb.GetSanBayHaCanh().trim().equals(SBHaCanh)) {
                dstb.add(tb);
            }
        }
        return dstb;
    }
}
