/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.BUS;

import java.util.ArrayList;
import QuanLyBanVeMayBay.DAO.SanBayDAO;
import QuanLyBanVeMayBay.DTO.SanBayDTO;

/**
 *
 * @author Dell
 */
public class SanBayBUS {

    private ArrayList<SanBayDTO> listSanBay = null;
    private SanBayDAO sbDAO = new SanBayDAO();

    public SanBayBUS() {
        docListSanBay();
    }

    public void docListSanBay() {
        listSanBay = sbDAO.getSanhSachSanBay();
    }

    public ArrayList<SanBayDTO> getListSanBay() {
        if (listSanBay == null) {
            docListSanBay();
        }
        return listSanBay;
    }

    public SanBayDTO getSanBay(String ma) {
        if (!ma.trim().equals("")) {
            try {
//                int maSP = Integer.parseInt(ma);
                for (SanBayDTO sb : listSanBay) {
                    if (sb.getMaSanBay() == ma) {
                        return sb;
                    }
                }
            } catch (Exception e) {
            }
        }
        return null;
    }

    public ArrayList<SanBayDTO> getSanBayTheoTen(String ten) {
        ArrayList<SanBayDTO> dssb = new ArrayList<>();
        for (SanBayDTO sb : listSanBay) {
            String tenSB = sb.getTenSanBay().toLowerCase();
            if (tenSB.toLowerCase().contains(ten.toLowerCase())) {
                dssb.add(sb);
            }
        }
        return dssb;
    }

    public ArrayList<SanBayDTO> getSanBayTheoDiaChi(String diaChi) {
        if (!diaChi.trim().equals("")) {
            ArrayList<SanBayDTO> dssb = new ArrayList<>();
            try {
//                int maLoai = Integer.parseInt(ma);
                for (SanBayDTO sb : listSanBay) {
                    if (sb.getDiaChi() == diaChi) {
                        dssb.add(sb);
                    }
                }
                return dssb;
            } catch (Exception e) {
            }
        }
        return null;
    }

//    public String getAnh(String ma) {
//        int maSP = Integer.parseInt(ma);
//        return spDAO.getAnh(maSP);
//    }
    public boolean themSanBay(SanBayDTO sb) {
        if (sb.getTenSanBay().trim().equals("")) {
//            new MyDialog("Tên sân bay không được để rỗng!", MyDialog.ERROR_DIALOG);
            return false;
        }

        if (sb.getDiaChi().trim().equals("")) {
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
    public boolean xoaSanBay(String ma) {
        if (ma.trim().equals("")) {
//            new MyDialog("Chưa chọn sân bay để xoá!", MyDialog.ERROR_DIALOG);
            return false;
        }

//        int maSP = Integer.parseInt(ma);
        if (sbDAO.xoaSanBay(ma)) {
//            new MyDialog("Xoá thành công!", MyDialog.SUCCESS_DIALOG);
            return true;
        }

//        new MyDialog("Xoá thất bại!", MyDialog.ERROR_DIALOG);
        return false;
    }

    public boolean suaSanBay(SanBayDTO sb) {
        if (sb.getMaSanBay().trim().equals("")) {
//            new MyDialog("Chưa chọn sân bay để sửa!", MyDialog.ERROR_DIALOG);
            return false;
        }

        if (sb.getTenSanBay().trim().equals("")) {
//            new MyDialog("Tên san bay không được để rỗng!", MyDialog.ERROR_DIALOG);
            return false;
        }

        if (sb.getDiaChi().trim().equals("")) {
//            new MyDialog("Địa chỉ không được để trống!", MyDialog.ERROR_DIALOG);
            return false;
        }

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

    public String getTenSB(String maSB) {
        for (SanBayDTO sb : listSanBay) {
            if (sb.getMaSanBay() == maSB) {
                return sb.getTenSanBay();
            }
        }
        return "";
    }

    public ArrayList<SanBayDTO> timKiemSanBayTheoMa(String maSB) {
        ArrayList<SanBayDTO> dssb = new ArrayList();
        for (SanBayDTO sb : listSanBay) {
            if (sb.getMaSanBay().trim().equals(maSB)) {
                dssb.add(sb);
            }
        }
        return dssb;
    }

    public ArrayList<SanBayDTO> timKiemSanBayTheoTên(String tenSB) {
        ArrayList<SanBayDTO> dssb = new ArrayList();
        for (SanBayDTO sb : listSanBay) {
            if (sb.getTenSanBay().trim().equals(tenSB)) {
                dssb.add(sb);
            }
        }
        return dssb;
    }

    public ArrayList<SanBayDTO> timKiemSanBayTheoDiaChi(String diaChi) {
        ArrayList<SanBayDTO> dssb = new ArrayList();
        for (SanBayDTO sb : listSanBay) {
            if (sb.getDiaChi().trim().equals(diaChi)) {
                dssb.add(sb);
            }
        }
        return dssb;
    }
}
