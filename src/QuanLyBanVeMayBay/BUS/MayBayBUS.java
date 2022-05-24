/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.BUS;

import java.util.ArrayList;
import QuanLyBanVeMayBay.DAO.MayBayDAO;
import QuanLyBanVeMayBay.DTO.MayBay;

/**
 *
 * @author Dell
 */
public class MayBayBUS {

    private ArrayList<MayBay> listMayBay = null;
    private MayBayDAO mbDAO = new MayBayDAO();

    public void docListMayBay() {
        this.listMayBay = mbDAO.getListMayBay();
    }
    
    public ArrayList<MayBay> listMayBay(){
        docListMayBay();
        return listMayBay;
    }

    public ArrayList<MayBay> getListMayBay() {
        if (listMayBay == null) {
            docListMayBay();
        }
        return listMayBay;
    }

    public ArrayList<MayBay> timKiemMayBayTheoMa(String maMB) {
        ArrayList<MayBay> dsmb = new ArrayList();
        for (MayBay mb : listMayBay) {
            if (String.valueOf(mb.getMaMayBay()).contains(maMB)) {
                dsmb.add(mb);
            }
        }
        return dsmb;
    }

    public ArrayList<MayBay> timKiemMayBayTheoTen(String tenMB) {
        ArrayList<MayBay> dsmb = new ArrayList();
        for (MayBay mb : listMayBay) {
            if (mb.getTenMayBay().contains(tenMB)) {
                dsmb.add(mb);
            }
        }
        return dsmb;
    }

    public ArrayList<MayBay> timKiemMayBayTheoHang(String hangMB) {
        ArrayList<MayBay> dsmb = new ArrayList();
        for (MayBay mb : listMayBay) {
            if (String.valueOf(mb.getMaMayBay()).contains(hangMB)) {
                dsmb.add(mb);
            }
        }
        return dsmb;
    }

    public boolean themMayBay(MayBay mb) {

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
                System.out.print("Thanh cong");
                return true;
            } else {
//                new MyDialog("Thêm thất bại!", MyDialog.ERROR_DIALOG);
System.out.print("that bai");
                return false;
            }
        } catch (Exception e) {
//            new MyDialog("Nhập số hợp lệ cho tên máy bay và số lượng ghế!", MyDialog.ERROR_DIALOG);
        }
        return false;
    }

    public boolean xoaMayBay(int ma) {

        if (mbDAO.xoaMayBay(ma)) {
//            new MyDialog("Xoá thành công!", MyDialog.SUCCESS_DIALOG);
            return true;
        }

//        new MyDialog("Xoá thất bại!", MyDialog.ERROR_DIALOG);
        return false;
    }

    public boolean suaMayBay(MayBay mb) {

        try {
            if (mb.getTenMayBay().trim().equals("")) {
//                new MyDialog("Chưa chọn may bay để sửa!", MyDialog.ERROR_DIALOG);
                return false;
            }

            if (String.valueOf(mb.getMaHang()).trim().equals("")) {
//                new MyDialog("Chưa chọn may bay để sửa!", MyDialog.ERROR_DIALOG);
                return false;
            }

            if (String.valueOf(mb.getSoLuongGhe()).trim().equals("")) {
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

}
