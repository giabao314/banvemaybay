/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.BUS;
import QuanLyBanVeMayBay.DAO.KhachHangDAO;
import QuanLyBanVeMayBay.DTO.KhachHangDTO;


import java.util.ArrayList;
/**
 *
 * @author hp
 */
public class KhachHangBUS {
    private ArrayList<KhachHangDTO> listKhachHang = null;
    private KhachHangDAO khachHangDAO = new KhachHangDAO();
    
    public void docListKhachHang(){
        listKhachHang = khachHangDAO.getListKhachHang();
    }
    
    public ArrayList<KhachHangDTO> getListKhachHang(){
        if(listKhachHang == null){
            docListKhachHang();
        }
        return listKhachHang;
    }
    
    public ArrayList<KhachHangDTO> timKiemKhachHangTheoTen(String tenKH){
        ArrayList<KhachHangDTO> dskh = new ArrayList();
        for(KhachHangDTO kh : listKhachHang){
            String ho = kh.getHoKH();
            String ten = kh.getTenKH();
            if(ten.contains(tenKH)){
                dskh.add(kh);
            }
        }
        return dskh;
    }
    
    public ArrayList<KhachHangDTO> timKiemKhachHangTheoMa(String maKH){
        ArrayList<KhachHangDTO> dskh = new ArrayList();
        for(KhachHangDTO kh : listKhachHang){
            int ma = kh.getMaKH();
            if(ma == Integer.parseInt(maKH)){
                dskh.add(kh);
            }
        }
        return dskh;
    }
    
    public ArrayList<KhachHangDTO> timKiemKhachHangTheoSDT(String sdt){
        ArrayList<KhachHangDTO> dskh = new ArrayList();
        for(KhachHangDTO kh : listKhachHang){
            String sodienthoai = kh.getSdt();
            if(sodienthoai.contains(sdt)){
                dskh.add(kh);
            }
        }
        return dskh;
    }
    
    public ArrayList<KhachHangDTO> timKiemKhachHangTheoCanCuoc(String canCuoc){
        ArrayList<KhachHangDTO> dskh = new ArrayList();
        for(KhachHangDTO kh : listKhachHang){
            String cancuoc = kh.getCanCuoc();
            if(cancuoc.equals(canCuoc)){
                dskh.add(kh);
            }
        }
        return dskh;
    }
    
    public boolean themKhachHang(String hoKH, String tenKH, String gioiTinh, String date, String canCuoc, String sdt){
        if(hoKH.trim().equals("")){
            // new dialog bao' loi~;
            return false;
        }
        if(tenKH.trim().equals("")){
            // new dialog bao' loi~;
            return false;
        }
        if(gioiTinh.trim().equals("")){
            // new dialog bao' loi~;
            return false;
        }
        if(date.trim().equals("")){
            // new dialog bao' loi~;
            return false;
        }
        if(canCuoc.trim().equals("")){
            // new dialog bao' loi~;
            return false;
        }
        if(sdt.trim().equals("")){
            // new dialog bao' loi~;
            return false;
        }
        
        KhachHangDTO kh = new KhachHangDTO();
        kh.setHoKH(hoKH);
        kh.setTenKH(tenKH);
        kh.setGioiTinh(gioiTinh);
        kh.setDate(date);
        kh.setCanCuoc(canCuoc);
        kh.setSdt(sdt);
        boolean flag = khachHangDAO.themKhachHang(kh);
        if(flag){
            // dialog thanh` cong
        }else{
            // dialog that bai
        }
        return flag;
    }
    
    public boolean suaKhachHang(int maKH, String hoKH, String tenKH, String gioiTinh, String date, String canCuoc, String sdt){
        if(hoKH.trim().equals("")){
            // new dialog bao' loi~;
            return false;
        }
        if(tenKH.trim().equals("")){
            // new dialog bao' loi~;
            return false;
        }
        if(gioiTinh.trim().equals("")){
            // new dialog bao' loi~;
            return false;
        }
        if(date.trim().equals("")){
            // new dialog bao' loi~;
            return false;
        }
        if(canCuoc.trim().equals("")){
            // new dialog bao' loi~;
            return false;
        }
        if(sdt.trim().equals("")){
            // new dialog bao' loi~;
            return false;
        }
        
        KhachHangDTO kh = new KhachHangDTO();
        kh.setHoKH(hoKH);
        kh.setTenKH(tenKH);
        kh.setGioiTinh(gioiTinh);
        kh.setDate(date);
        kh.setCanCuoc(canCuoc);
        kh.setSdt(sdt);
        boolean flag = khachHangDAO.suaKhachHang(maKH, kh);
        
        if(flag){
            // dialog thang cong
        }else{
            // dialog that bai
        }

        return flag;
    }
    
    public boolean xoaKhachHang(int maKH){
        boolean flag = false;
        try{
            flag = khachHangDAO.xoaKhachHang(maKH);
        }catch(Exception e){
            
        }
        if(flag){
            // dialog thanh cong
        }else{
            // dialog that bai
        }
        return flag;
    }
}
