/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.BUS;

import QuanLyBanVeMayBay.DAO.VeDAO;
import QuanLyBanVeMayBay.DTO.Ve;
// import QuanLyBanVeMayBay.BUS.ChuyenBayBUS;
import QuanLyBanVeMayBay.DAO.ChuyenBayDAO;
import QuanLyBanVeMayBay.DTO.ChuyenBay;
// import QuanLyBanVeMayBay.DAO.MayBayDAO;
// import QuanLyBanVeMayBay.DTO.MayBay;
// import QuanLyBanVeMayBay.DAO.LoaiVeDAO;
// import QuanLyBanVeMayBay.DTO.LoaiVe;
//import Template.Dialog;
import java.util.ArrayList;
// import java.util.Date;
// import java.util.Calendar;
// import java.text.SimpleDateFormat;
// import java.time.LocalTime;

/**
 *
 * @author Thepi314
 */
public class VeBUS {
    private ArrayList<Ve> listVe = null;
    private VeDAO veDAO = new VeDAO();

//    public VeBUS() {
//        docListVe();
//    }

    public void docListVe() {
        this.listVe = veDAO.getListVe();
    }

    public ArrayList<Ve> getListVe() {
        if (listVe == null) {
            docListVe();
        }
        return listVe;
    }
    
    public ArrayList<Ve> showListVe(){
        docListVe();
        return listVe;
    }

    public Ve getVe(String ma) {
        if (!ma.trim().equals("")) {
            try {
                int maVe = Integer.parseInt(ma);
                for (Ve ve : listVe) {
                    if (ve.getMaVe() == maVe) {
                        return ve;
                    }
                }
            } catch (Exception e) {
            }
        }
        return null;
    }

    public ArrayList<Ve> getVeTheoChuyenBay(String ma) {
        if (!ma.trim().equals("")) {
            ArrayList<Ve> dsv = new ArrayList<>();
            try {
                int maCB = Integer.parseInt(ma);
                for (Ve ve : listVe) {
                    if (ve.getMaChuyenBay() == maCB) {
                        dsv.add(ve);
                    }
                }
                return dsv;
            } catch (Exception e) {
            }
        }
        return null;
    }

    public ArrayList<Ve> getVeTheoLoaiVe(String ma) {
        if (!ma.trim().equals("")) {
            ArrayList<Ve> dsv = new ArrayList<>();
            try {
                int maLoaiVe = Integer.parseInt(ma);
                for (Ve ve : listVe) {
                    if (ve.getMaLoaiVe() == maLoaiVe) {
                        dsv.add(ve);
                    }
                }
                return dsv;
            } catch (Exception e) {
            }
        }
        return null;
    }

    public boolean themVe(String maCB, String maLV, String maGhe, String gioLenMayBay) {
        if (maCB.equals("")) {
            //new Dialog("Vui lòng chọn mã chuyến bay!", Dialog.ERROR_DIALOG);
            return false;
        }
        if (maLV.equals("")) {
            //new Dialog("Vui lòng chọn mã loại vé!", Dialog.ERROR_DIALOG);
            return false;
        }
        if (maGhe.equals("")) {
            //new Dialog("Vui lòng chọn mã ghế!", Dialog.ERROR_DIALOG);
            return false;
        }
        if (gioLenMayBay.equals("")) {
            //new Dialog("Vui lòng điền giờ lên máy bay!", Dialog.ERROR_DIALOG);
            return false;
        }

        boolean flag = false;
        try {
            // String[] maTBTemp = maCB.split(" - ");
            // String[] maMBTemp = maLV.split(" - ");
            // int maTuyenBay = Integer.parseInt(maTBTemp[0]);
            // int maMayBay = Integer.parseInt(maMBTemp[0]);
            // Lấy ra số lượng ghế của máy bay có mã tương ứng và gán vào số lượng vé còn
            // lại.
            // int soLgVeCL = Integer.parseInt(getMayBay(maMayBay).getSoLgGhe());

            Ve ve = new Ve();
            ve.setMaChuyenBay(Integer.parseInt(maCB));
            ve.setMaLoaiVe(Integer.parseInt(maLV));
            ve.setMaGhe(maGhe);
            ve.setGioLenMayBay(gioLenMayBay);

            flag = veDAO.themVe(ve);
        } catch (Exception e) {
        }
        if (flag) {
            //new Dialog("Thêm thành công!", Dialog.SUCCESS_DIALOG);
        } else {
            //new Dialog("Thêm thất bại!", Dialog.ERROR_DIALOG);
            return false;
        }
        return flag;
    }

    // public boolean sinhVeTuDong (String maCB) {
    //     if (!maCB.trim().equals("")) {
    //         try {
    //             int maChuyenBay = Integer.parseInt(maCB);
    //             for (Ve ve : listVe) {
    //                 if (ve.getMaChuyenBay() == maChuyenBay) {
    //                     ChuyenBayBUS cbBUS;
    //                     ChuyenBay cb;
    //                     MayBayBUS mbBUS;
    //                     MayBay mb;
    //                     int tongVe;
    //                     int soGheTemp = 1;
    //                     String[] loaiTemp = {"A", "B", "C", "D"};
    //                     cb = cbBUS.getChuyenBay(Integer.toString(ve.getMaChuyenBay()));
    //                     mb = mbBUS.getMayBay(Integer.toString().(cb.getMaMayBay()));
    //                     String gioBay = cb.getGioCatCanh
    //                     int tongVe = mb.getSoLgGhe();
    //                     for(int i = 0; i < tongVe; i++) {
    //                         listVe.add(themVe(maChuyenBay, Integer.toString(soGheTemp), loaiTemp + Integer.toString(i)));
    //                     }
    //                 }
    //             }
    //             return dsv;
    //         } catch (Exception e) {
    //         }
    //     }
    // }

    public boolean nhapVeTuExcel(String maCB, String maLV, String maGhe, String gioLenMayBay) {
        if (maCB.equals("")) {
            //new Dialog("Vui lòng chọn mã chuyến bay!", Dialog.ERROR_DIALOG);
            return false;
        }
        if (maLV.equals("")) {
            //new Dialog("Vui lòng chọn mã loại vé!", Dialog.ERROR_DIALOG);
            return false;
        }
        if (maGhe.equals("")) {
            //new Dialog("Vui lòng chọn mã ghế!", Dialog.ERROR_DIALOG);
            return false;
        }
        if (gioLenMayBay.equals("")) {
            //new Dialog("Vui lòng điền giờ lên máy bay!", Dialog.ERROR_DIALOG);
            return false;
        }
        boolean flag = false;
        try {
            Ve ve = new Ve();
            ve.setMaChuyenBay(Integer.parseInt(maCB));
            ve.setMaLoaiVe(Integer.parseInt(maLV));
            ve.setMaGhe(maGhe);
            ve.setGioLenMayBay(gioLenMayBay);

            veDAO.nhapVeTuExcel(ve);
        } catch (Exception e) {
        }
        if (flag) {
            //new Dialog("Thêm thành công!", Dialog.SUCCESS_DIALOG);
        } else {
            //new Dialog("Thêm thất bại!", Dialog.ERROR_DIALOG);
            return false;
        }
        return flag;
    }

    public boolean xoaVe(String ma) {
        if (ma.trim().equals("")) {
            //new Dialog("Chưa chọn vé để xoá!", Dialog.ERROR_DIALOG);
            return false;
        }

        int maVe = Integer.parseInt(ma);
        if (veDAO.xoaVe(maVe)) {
            //new Dialog("Xoá thành công!", Dialog.SUCCESS_DIALOG);
            return true;
        }

        //new Dialog("Xoá thất bại!", Dialog.ERROR_DIALOG);
        return false;
    }

    public boolean suaVe(String maVe, String maCB, String maLV, String maGhe, String gioLenMayBay) {

        try {
            if (maVe.trim().equals("")) {
                //new Dialog("Chưa chọn chuyến bay để sửa!", Dialog.ERROR_DIALOG);
                return false;
            }
            int maVeCB = Integer.parseInt(maVe);
            // String[] maTBTemp = maTB.split(" - ");
            // String[] maMBTemp = maMB.split(" - ");
            // int maTuyenBay = Integer.parseInt(maTBTemp[0]);
            // int maMayBay = Integer.parseInt(maMBTemp[0]);
            // // Lấy ra số lượng ghế của máy bay có mã tương ứng và gán vào số lượng vé còn
            // // lại.
            // int soLgVeCL = Integer.parseInt(getMayBay(maMayBay).getSoLgGhe());

            if (maCB.trim().equals("")) {
                //new Dialog("Mã tuyến bay không được để trống!", Dialog.ERROR_DIALOG);
                return false;
            }

            if (maLV.trim().equals("")) {
                //new Dialog("Vui lòng chọn loại vé", Dialog.ERROR_DIALOG);
                return false;
            }

            if (maGhe.trim().equals("")) {
                //new Dialog("Vui lòng chọn mã ghế", Dialog.ERROR_DIALOG);
                return false;
            }

            if (gioLenMayBay.trim().equals("")) {
                //new Dialog("Vui lòng chọn giờ lên máy bay", Dialog.ERROR_DIALOG);
                return false;
            }
            int maChuyenBay = Integer.parseInt(maCB);
            int maLoaiVe = Integer.parseInt(maLV);


            Ve ve = new Ve();
            ve.setMaVe(maVeCB);
            ve.setMaChuyenBay(maChuyenBay);
            ve.setMaLoaiVe(maLoaiVe);
            ve.setMaGhe(maGhe);
            ve.setGioLenMayBay(gioLenMayBay);

            // flag = cbDAO.themVe(cb);

            if (veDAO.suaVe(ve)) {
                //new Dialog("Sửa thành công!", Dialog.SUCCESS_DIALOG);
                return true;
            } else {
                //new Dialog("Sửa thất bại!", Dialog.ERROR_DIALOG);
                return false;
            }
        } catch (Exception e) {
            //new Dialog("Nhập chuỗi hợp lệ cho các mã và giờ lên máy bay!", Dialog.ERROR_DIALOG);
        }
        return false;
    }
}
