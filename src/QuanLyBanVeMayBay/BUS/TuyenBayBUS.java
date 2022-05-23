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

//    public TuyenBayBUS() {
//        docListTuyenBay();
//    }
    public void docListTuyenBay() {
        listTuyenBay = tbDAO.getListTuyenBay();
    }

    public ArrayList<TuyenBayDTO> getListTuyenBay() {
        if (listTuyenBay == null) {
            docListTuyenBay();
        }
        return listTuyenBay;
    }
    
    public ArrayList<TuyenBayDTO> showListTuyenBay(){
        docListTuyenBay();
        return listTuyenBay;
    }

    public boolean themTuyenBay(TuyenBayDTO tb) {

        if (tb.getGioCatCanh().trim().equals("")) {
//            new MyDialog("Không được để trống giờ cất cánh", MyDialog.ERROR_DIALOG);
            return false;
        }

        if (tb.getGioHaCanh().trim().equals("")) {
//            new MyDialog("Không được để trống giờ hạ cánh", MyDialog.ERROR_DIALOG);
            return false;
        }

        try {
            if (tbDAO.themTuyenBay(tb)) {
//                new MyDialog("Thêm thành công!", MyDialog.SUCCESS_DIALOG);
                System.out.print("THanh cong");
                return true;
            } else {
//                new MyDialog("Thêm thất bại!", MyDialog.ERROR_DIALOG);
                System.out.print("that bai");
                return false;
            }
        } catch (Exception e) {
//            new MyDialog("Nhập số hợp lệ cho Đơn giá và Số lượng!", MyDialog.ERROR_DIALOG);
        }
        return false;
    }

    public boolean suaTuyenBay(TuyenBayDTO tb) {
        try {

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

    public boolean xoaTuyenBay(int ma) {
        if (String.valueOf(ma).trim().equals("")) {
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

    public ArrayList<TuyenBayDTO> timKiemTuyenBayTheoMa(String maTB) {
        ArrayList<TuyenBayDTO> dstb = new ArrayList();
        for (TuyenBayDTO tb : listTuyenBay) {
            if (String.valueOf(tb.getMaTuyenBay()).contains(maTB)) {
                dstb.add(tb);
            }
        }
        return dstb;
    }

    public ArrayList<TuyenBayDTO> timKiemTuyenBayTheoSBCatCanh(String SBCatCanh) {
        ArrayList<TuyenBayDTO> dstb = new ArrayList();
        for (TuyenBayDTO tb : listTuyenBay) {
            if (String.valueOf(tb.getSanBayCatCanh()).contains(SBCatCanh)) {
                dstb.add(tb);
            }
        }
        return dstb;
    }

    public ArrayList<TuyenBayDTO> timKiemTuyenBayTheoSBHaCanh(String SBHaCanh) {
        ArrayList<TuyenBayDTO> dstb = new ArrayList();
        for (TuyenBayDTO tb : listTuyenBay) {
            if (String.valueOf(tb.getSanBayHaCanh()).contains(SBHaCanh)) {
                dstb.add(tb);
            }
        }
        return dstb;
    }
}
