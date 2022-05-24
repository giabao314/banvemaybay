/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.BUS;

import java.util.ArrayList;
import QuanLyBanVeMayBay.DAO.SanBayDAO;
import QuanLyBanVeMayBay.DTO.SanBayDTO;
import QuanLyBanVeMayBay.DTO.TuyenBayDTO;

/**
 *
 * @author Dell
 */
public class SanBayBUS {

    private ArrayList<SanBayDTO> listSanBay = null;
    private SanBayDAO sbDAO = new SanBayDAO();

//    public SanBayBUS() {
//        docListSanBay();
//    }
    
    public void docListSanBay() {
        listSanBay = sbDAO.getListSanBay();
    }

    public ArrayList<SanBayDTO> getListSanBay() {
        if (listSanBay == null) {
            docListSanBay();
        }
        return listSanBay;
    }

    public ArrayList<SanBayDTO> listSB() {
        docListSanBay();
        return listSanBay;
    }

    public boolean themSanBay(SanBayDTO sb) {
        if (sb.getTenSanBay().trim().equals("")) {
//            new MyDialog("Tên sân bay không được để rỗng!", MyDialog.ERROR_DIALOG);
            return false;
        }

        if (sb.getThanhPho().trim().equals("")) {
//            new MyDialog("Không được để trống địa chỉ!", MyDialog.ERROR_DIALOG);
            return false;
        }

        try {
            if (sbDAO.themSanBay(sb)) {
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

    public boolean suaSanBay(SanBayDTO sb) {
        try {
            if (sbDAO.suaSanBay(sb)) {
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

    public boolean xoaSanBay(int ma) {
        if (sbDAO.xoaSanBay(ma)) {
//            new MyDialog("Xoá thành công!", MyDialog.SUCCESS_DIALOG);
            return true;
        }

//        new MyDialog("Xoá thất bại!", MyDialog.ERROR_DIALOG);
        return false;
    }

    public ArrayList<SanBayDTO> TimKiemSanBayTheoMa(String maSB) {
        ArrayList<SanBayDTO> dssb = new ArrayList<>();
        for (SanBayDTO sb : listSanBay) {
            if (String.valueOf(sb.getMaSanBay()).contains(maSB)) {
                dssb.add(sb);
            }
        }
        return dssb;
    }

    public ArrayList<SanBayDTO> TimKiemSanBayTheoTen(String ten) {
        ArrayList<SanBayDTO> dssb = new ArrayList<>();
        for (SanBayDTO sb : listSanBay) {
            String tenSB = sb.getTenSanBay().toLowerCase();
            if (tenSB.toLowerCase().contains(ten.toLowerCase())) {
                dssb.add(sb);
            }
        }
        return dssb;
    }

    public ArrayList<SanBayDTO> TimKiemSanBayTheoDiaChi(String diaChi) {
            ArrayList<SanBayDTO> dssb = new ArrayList<>();
            try {
                for (SanBayDTO sb : listSanBay) {
                    if (sb.getThanhPho().contains(diaChi)) {
                        dssb.add(sb);
                    }
                }
                return dssb;
            } catch (Exception e) {
                
            }
        return null;
    }

    public int getIDSanBay(String tenSanBay){
        int idSanBay = 0;
        if(listSanBay != null){
            for(SanBayDTO sb : listSanBay){
            if(tenSanBay.toLowerCase().equals(sb.getTenSanBay().toLowerCase())){
                idSanBay = sb.getMaSanBay();
                return idSanBay;
            }
        }
        }
        return 0;
    }
    
//    public String getTenSanBay(int maSanBay){
//        String tenSanBay;
//        if(listSanBay != null){
//            for(SanBayDTO sb : listSanBay){
//            if(maSanBay == sb.getMaSanBay()){
//                tenSanBay = sb.getTenSanBay();
//                return tenSanBay;
//            }
//        }
//        }
//        return null;
//    }
}
