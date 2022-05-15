/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.BUS;

import java.awt.Component;
import java.util.ArrayList;
import QuanLyBanVeMayBay.DAO.KhuyenMaiDAO;
import QuanLyBanVeMayBay.DTO.KhuyenMaiDTO;
import javax.swing.JOptionPane;
/**
 *
 * @author hp
 */
public class KhuyenMaiBUS {
    private ArrayList<KhuyenMaiDTO> listKhuyenMai = null;
    private KhuyenMaiDAO khuyenMaiDAO = new KhuyenMaiDAO();
    private Component frame;
    
    public void docListKhuyenMai(){
        listKhuyenMai = khuyenMaiDAO.getListKhuyenMai();
    }
    
    public ArrayList<KhuyenMaiDTO> getListKhuyenMai(){
        if(listKhuyenMai == null){
            docListKhuyenMai();
        }
        return listKhuyenMai;
    }
    
    
    public boolean themKhuyenMai(String tenKM, String ngayBD, String ngayKT,int dieuKienGia, int phanTramKM){
        if(tenKM.trim().equals("")){
            JOptionPane.showMessageDialog(frame,"Vui lòng không để trống tên","Thông Báo",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(ngayBD.trim().equals("")){
            JOptionPane.showMessageDialog(frame,"Vui lòng không để trống ngày bắt đầu","Thông Báo",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(ngayKT.trim().equals("")){
            JOptionPane.showMessageDialog(frame,"Vui lòng không để trống ngày kết thúc","Thông Báo",JOptionPane.ERROR_MESSAGE);
            return false;
        }

        
        KhuyenMaiDTO km = new KhuyenMaiDTO();
        km.setTenKM(tenKM);
        km.setDieuKienGia(dieuKienGia);
        km.setPhanTramKM(phanTramKM);
        km.setNgayBD(ngayBD);
        km.setNgayKT(ngayKT);
        boolean flag = khuyenMaiDAO.themKhuyenMai(km);
        
        if(flag){
            JOptionPane.showMessageDialog(frame,"Thêm thành công");
        }else{
            JOptionPane.showMessageDialog(frame,"Thêm thất bại");
        }
        
        return flag;
    }
    
    public boolean suaKhuyenMai(int maKM,String tenKM, String ngayBD, String ngayKT,int dieuKienGia, int phanTramKM){
        if(tenKM.trim().equals("")){
            JOptionPane.showMessageDialog(frame,"Vui lòng không để trống tên","Thông Báo",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(ngayBD.trim().equals("")){
             JOptionPane.showMessageDialog(frame,"Vui lòng không để trống ngày bắt đầu","Thông Báo",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(ngayKT.trim().equals("")){
             JOptionPane.showMessageDialog(frame,"Vui lòng không để trống ngày kết thúc","Thông Báo",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        KhuyenMaiDTO km = new KhuyenMaiDTO();
        km.setTenKM(tenKM);
        km.setDieuKienGia(dieuKienGia);
        km.setPhanTramKM(phanTramKM);
        km.setNgayBD(ngayBD);
        km.setNgayKT(ngayKT);
        boolean flag = khuyenMaiDAO.suaKhuyenMai(maKM,km);
        
        if(flag){
             JOptionPane.showMessageDialog(frame,"Sửa thành công");
        }else{
            JOptionPane.showMessageDialog(frame,"Sửa thất bại");
        }

        return flag;
    }
    
    public boolean xoaKhuyenMai(int maKM){
        boolean flag = false;
        try{
            flag = khuyenMaiDAO.xoaKhuyenMai(maKM);
        }catch(Exception ex){
            
        }
        if(flag){
            JOptionPane.showMessageDialog(frame,"Xóa thành công");
        }else{
            JOptionPane.showMessageDialog(frame,"Xóa thất bại");
        }
        return flag;
    }
}
