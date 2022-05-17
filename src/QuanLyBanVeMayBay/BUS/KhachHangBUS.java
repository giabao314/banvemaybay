/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.BUS;
import QuanLyBanVeMayBay.DAO.KhachHangDAO;
import QuanLyBanVeMayBay.DTO.KhachHang;


import java.util.ArrayList;
/**
 *
 * @author hp
 */
public class KhachHangBUS {
    private ArrayList<KhachHang> listKhachHang = null;
    private KhachHangDAO khachHangDAO = new KhachHangDAO();
    
    public void docListKhachHang(){
        listKhachHang = khachHangDAO.getListKhachHang();
    }
    
    public ArrayList<KhachHang> getListKhachHang(){
        if(listKhachHang == null){
            docListKhachHang();
        }
        return listKhachHang;
    }
    
    public ArrayList<KhachHang> timKiemKhachHangTheoTen(String tenKH){
        ArrayList<KhachHang> dskh = new ArrayList();
        for(KhachHang kh : listKhachHang){
            String ho = kh.getHoKH();
            String ten = kh.getTenKH();
            if(ten.contains(tenKH)){
                dskh.add(kh);
            }
        }
        return dskh;
    }
    
    public ArrayList<KhachHang> timKiemKhachHangTheoMa(String maKH){
        ArrayList<KhachHang> dskh = new ArrayList();
        for(KhachHang kh : listKhachHang){
            int ma = kh.getMaKH();
            if(ma == Integer.parseInt(maKH)){
                dskh.add(kh);
            }
        }
        return dskh;
    }
    
    public ArrayList<KhachHang> timKiemKhachHangTheoSDT(String sdt){
        ArrayList<KhachHang> dskh = new ArrayList();
        for(KhachHang kh : listKhachHang){
            String sodienthoai = kh.getSdt();
            if(sodienthoai.contains(sdt)){
                dskh.add(kh);
            }
        }
        return dskh;
    }
    
    public ArrayList<KhachHang> timKiemKhachHangTheoCanCuoc(String canCuoc){
        ArrayList<KhachHang> dskh = new ArrayList();
        for(KhachHang kh : listKhachHang){
            String cancuoc = kh.getCanCuoc();
            if(cancuoc.contains(canCuoc)){
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
        
        KhachHang kh = new KhachHang();
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
        
        KhachHang kh = new KhachHang();
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
