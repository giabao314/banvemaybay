/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.BUS;

import QuanLyBanVeMayBay.DAO.LoaiVeDAO;
import QuanLyBanVeMayBay.DTO.LoaiVe;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Thepi314
 */
public class LoaiVeBUS {

    private ArrayList<LoaiVe> listLV = null;
    private LoaiVeDAO lvDAO = new LoaiVeDAO();

    public LoaiVeBUS() {
        docDanhSachLoaiVe();
    }

    public void docDanhSachLoaiVe() {
        listLV = lvDAO.getDanhSachLoaiVe();
    }

    public ArrayList<LoaiVe> getDanhSachLoaiVe() {
        if (listLV == null) {
            docDanhSachLoaiVe();
        }
        return listLV;
    }

    public LoaiVe getLoaiVe(String ma) {
        if (!ma.trim().equals("")) {
            try {
                int maLoaiVe = Integer.parseInt(ma);
                for (LoaiVe lv : listLV) {
                    if (lv.getMaLoaiVe() == maLoaiVe) {
                        return lv;
                        // return lv.getMaLoaiVe() + " - " + lv.getTenLoaiVe();
                    }
                }
            } catch (Exception e) {

            }
        }
        return null;

    }

    public boolean themLoaiVe(String tenLoai, String donGia) {
        if (tenLoai.trim().equals("")) {
            new JOptionPane("Không được để trống tên loại!", JOptionPane.ERROR_MESSAGE);
//            new Dialog("Không được để trống tên loại!", Dialog.ERROR_DIALOG);
            return false;
        }
        if (donGia.trim().equals("")) {
            new JOptionPane("Vui lòng điền đơn giá!", JOptionPane.ERROR_MESSAGE);
//            new Dialog("Vui lòng điền đơn giá!", Dialog.ERROR_DIALOG);
        }
        int giaVe = Integer.parseInt(donGia);
        LoaiVe lv = new LoaiVe();
        lv.setTenLoaiVe(tenLoai);
        lv.setDonGia(giaVe);
        if (lvDAO.themLoaiVe(lv)) {
            new JOptionPane("Thêm thành công!", JOptionPane.ERROR_MESSAGE);
//            new Dialog("Thêm thành công!", Dialog.SUCCESS_DIALOG);
            return true;
        } else {
            new JOptionPane("Thêm thành công!", JOptionPane.ERROR_MESSAGE);
//            new Dialog("Thêm thất bại!", Dialog.ERROR_DIALOG);
            return false;
        }
    }

    public boolean xoaLoaiVe(String ma) {
        if (ma.trim().equals("")) {
//            new Dialog("Chưa chọn loại để xoá!", Dialog.ERROR_DIALOG);
            return false;
        }
        int maLoai = Integer.parseInt(ma);
        if (lvDAO.xoaLoaiVe(maLoai)) {
//            new Dialog("Xoá thành công!", Dialog.SUCCESS_DIALOG);
            return true;
        } else {
//            new Dialog("Xoá thất bại! Loại có sản phẩm con", Dialog.ERROR_DIALOG);
            return false;
        }
    }

    public boolean suaLoaiVe(String ma, String ten, String donGia) {
        if (ten.trim().equals("")) {
//            new Dialog("Không được để trống tên loại!", Dialog.ERROR_DIALOG);
            return false;
        }
        int maLoai = Integer.parseInt(ma);
        int giaVe = Integer.parseInt(donGia);
        if (lvDAO.suaLoaiVe(maLoai, ten, giaVe)) {
//            new Dialog("Sửa thành công!", Dialog.SUCCESS_DIALOG);
            return true;
        } else {
//            new Dialog("Sửa thất bại!", Dialog.ERROR_DIALOG);
            return false;
        }
    }
}
