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

    public HangBayBUS() {
        docDanhSachHangBay();
    }

    public void docDanhSachHangBay() {
        this.listHangBay = HangBayDAO.getDanhSachHangBay();
    }

    public ArrayList<HangBayDTO> getDanhSachHangBay() {
        if (listHangBay == null) {
            docDanhSachHangBay();
        }
        return this.listHangBay;
    }

    public String getTenHangBay(String ma) {
        for (HangBayDTO HangBay : listHangBay) {
            if (HangBay.getMaHang() == ma) {
                return HangBay.getMaHang() + " - " + HangBay.getTenHang();
            }
        }
        return "";
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

    public boolean xoaHangBay(String ma) {
        if (ma.trim().equals("")) {
//            new MyDialog("Chưa chọn hãng để xoá!", MyDialog.SUCCESS_DIALOG);
            return false;
        }
//        int maLoai = Integer.parseInt(ma);
        if (HangBayDAO.xoaHangBay(ma)) {
//            new MyDialog("Xoá thành công!", MyDialog.SUCCESS_DIALOG);
            return true;
        } else {
//            new MyDialog("Xoá thất bại!", MyDialog.ERROR_DIALOG);
            return false;
        }
    }

    public boolean suaHangBay(HangBayDTO hb) {
        if (hb.getMaHang().trim().equals("")) {
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

    public ArrayList<HangBayDTO> timKiemHangBayTheoTen(String tenHB) {
        ArrayList<HangBayDTO> dshb = new ArrayList();
        for (HangBayDTO hb : listHangBay) {
            if (hb.getTenHang().trim().equals(tenHB)) {
                dshb.add(hb);
            }
        }
        return dshb;
    }

    public ArrayList<HangBayDTO> timKiemHangBayTheoMa(String maHB) {
        ArrayList<HangBayDTO> dshb = new ArrayList();
        for (HangBayDTO hb : listHangBay) {
            if (hb.getMaHang().trim().equals(maHB)) {
                dshb.add(hb);
            }
        }
        return dshb;
    }
}
