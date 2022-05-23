/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.BUS;

import QuanLyBanVeMayBay.DAO.HangBayDAO;
import QuanLyBanVeMayBay.DTO.HangBayDTO;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class HangBayBUS {

    private HangBayDAO HangBayDAO = new HangBayDAO();
    private ArrayList<HangBayDTO> listHangBay = null;

//    public HangBayBUS() {
//        docDanhSachHangBay();
//    }
    public void docDanhSachHangBay() {
        this.listHangBay = HangBayDAO.getListHangBay();
    }

    public ArrayList<HangBayDTO> getListHangBay() {
        if (listHangBay == null) {
            docDanhSachHangBay();
        }
        return listHangBay;
    }
    
    public ArrayList<HangBayDTO> showListHangBay(){
        docDanhSachHangBay();
        return listHangBay;
    }

    public boolean themHangBay(HangBayDTO hb) {
        if (hb.getTenHang().trim().equals("")) {
//            new MyDialog("Không được để trống tên hãng bay!", MyDialog.ERROR_DIALOG);
            return false;
        }

        if (HangBayDAO.themHangBay(hb)) {
//            new MyDialog("Thêm thành công!", MyDialog.SUCCESS_DIALOG);
            return true;
        } else {
//            new MyDialog("Thêm thất bại!", MyDialog.ERROR_DIALOG);
            return false;
        }
    }

    public boolean suaHangBay(HangBayDTO hb) {
        if (String.valueOf(hb.getMaHang()).trim().equals("")) {
//            new MyDialog("Chưa chọn hãng bay!", MyDialog.ERROR_DIALOG);
            return false;
        }

        if (hb.getTenHang().trim().equals("")) {
//            new MyDialog("Không được để trống tên hãng bay!", MyDialog.ERROR_DIALOG);
            return false;
        }
//        int maLoai = Integer.parseInt(ma);
        if (HangBayDAO.suaHangBay(hb)) {
//            new MyDialog("Sửa thành công!", MyDialog.SUCCESS_DIALOG);
            return true;
        } else {
//            new MyDialog("Sửa thất bại!", MyDialog.ERROR_DIALOG);
            return false;
        }
    }

    public boolean xoaHangBay(int ma) {
        if (HangBayDAO.xoaHangBay(ma)) {
//            new MyDialog("Xoá thành công!", MyDialog.SUCCESS_DIALOG);
                System.out.print("Hello");
            return true;
        } else {
//            new MyDialog("Xoá thất bại!", MyDialog.ERROR_DIALOG);
                System.out.print("hello");
            return false;
        }
    }

    public ArrayList<HangBayDTO> timKiemHangBayTheoTen(String tenHB) {
        ArrayList<HangBayDTO> dshb = new ArrayList();
        for (HangBayDTO hb : listHangBay) {
            if (hb.getTenHang().contains(tenHB)) {
                dshb.add(hb);
            }
        }
        return dshb;
    }

    public ArrayList<HangBayDTO> timKiemHangBayTheoMa(String maHB) {
        ArrayList<HangBayDTO> dshb = new ArrayList();
        for (HangBayDTO hb : listHangBay) {
            if (Integer.parseInt(maHB) == hb.getMaHang()) {
                dshb.add(hb);
            }
        }
        return dshb;
    }
}
