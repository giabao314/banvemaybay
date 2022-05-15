package QuanLyBanVeMayBay.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import QuanLyBanVeMayBay.BUS.NhanVienBUS;

//import MyCustom.MyDialog;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.AbstractAction;
import javax.swing.Action;

public class NhanVienGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JComboBox  Gioitinhnv;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	private JTable table_6;
	private JTable table_7;
	private JTable table_8;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction();
	private final Action action_2 = new SwingAction();
	private final Action action_3 = new SwingAction();
    DefaultTableModel dtmNhanVien;
    private JTextField txtTimNV;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NhanVienGUI frame = new NhanVienGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NhanVienGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1253, 831);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QU\u1EA2N L\u00DD NH\u00C2N VI\u00CAN");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(53, 38, 1186, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("M\u00E3 nh\u00E2n vi\u00EAn");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(366, 101, 126, 19);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(543, 97, 503, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("H\u1ECD nh\u00E2n vi\u00EAn");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(353, 144, 154, 28);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(543, 150, 503, 23);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("T\u00EAn nh\u00E2n vi\u00EAn");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(377, 193, 140, 31);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(543, 200, 503, 23);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Gi\u1EDBi t\u00EDnh");
		lblNewLabel_4.setBackground(Color.BLACK);
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(353, 245, 115, 28);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("C\u0103n c\u01B0\u1EDBc");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(377, 294, 130, 19);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(543, 295, 503, 23);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("S\u1ED1 \u0111i\u1EC7n tho\u1EA1i");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(377, 339, 115, 19);
		contentPane.add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(543, 340, 503, 23);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("L\u01B0\u01A1ng");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(377, 387, 115, 19);
		contentPane.add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(543, 388, 503, 23);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		Gioitinhnv = new JComboBox();
		Gioitinhnv.setModel(new DefaultComboBoxModel(new String[] {"Nam", "N\u1EEF"}));
		Gioitinhnv.setBounds(543, 251, 503, 23);
		contentPane.add(Gioitinhnv);
		
		JButton Themnv = new JButton("Th\u00EAm");
		Themnv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xuLyThemNhanVien();
			}
		});
		Themnv.setForeground(UIManager.getColor("Button.light"));
		Themnv.setBackground(UIManager.getColor("Button.background"));
		Themnv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Themnv.setBounds(230, 475, 109, 34);
		contentPane.add(Themnv);
		
		JButton Luunv = new JButton("L\u01B0u");
		Luunv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Luunv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xuLySuaNhanVien();
			}
		});
		Luunv.setBounds(353, 475, 102, 34);
		contentPane.add(Luunv);
		
		JButton Xoanv = new JButton("X\u00F3a");
		Xoanv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Xoanv.setBounds(467, 475, 109, 34);
		Xoanv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xuLyXoaNhanVien();
			}
		});
		contentPane.add(Xoanv);
		
		JButton Timkiemnv = new JButton("T\u00ECm ki\u1EBFm");
		Timkiemnv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Timkiemnv.setBounds(580, 475, 115, 34);
		Timkiemnv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xuLyTimKiemNhanVien();
			}
		});
		contentPane.add(Timkiemnv);
		
		JButton XuatExcel = new JButton("Xu\u1EA5t EXCEL");
		XuatExcel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		XuatExcel.setBounds(849, 475, 126, 34);
		contentPane.add(XuatExcel);
		
		table = new JTable();
		table.setBounds(0, 683, 900, -153);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(20, 560, 20, 0);
		contentPane.add(table_1);
		
		table_2 = new JTable();
		table_2.setBounds(10, 686, 1219, -166);
		contentPane.add(table_2);
		
		table_3 = new JTable();
		table_3.setBackground(new Color(204, 0, 153));
		table_3.setForeground(UIManager.getColor("Button.background"));
		table_3.setBounds(1233, 692, -1243, -93);
		contentPane.add(table_3);
		
		table_4 = new JTable();
		table_4.setBounds(137, 244, -24, -99);
		contentPane.add(table_4);
		
		table_5 = new JTable();
		table_5.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table_5.setBackground(new Color(255, 0, 255));
		table_5.setBounds(500, 679, -73, -93);
		contentPane.add(table_5);
		
		table_6 = new JTable();
		table_6.setShowVerticalLines(false);
		table_6.setBounds(53, 548, 1, 1);
		contentPane.add(table_6);
		
		table_7 = new JTable();
		table_7.setBounds(68, 559, 1, 1);
		contentPane.add(table_7);
		
		table_8 = new JTable();
		table_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 xuLyClickTblNhanVien();
			}
		});
		table_8.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 nh\u00E2n vi\u00EAn", "H\u1ECD nh\u00E2n vi\u00EAn", "T\u00EAn nh\u00E2n vi\u00EAn", "Gi\u1EDBi t\u00EDnh", "C\u0103n c\u01B0\u1EDBc", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i", "L\u01B0\u01A1ng"
			}
		));
		table_8.setBounds(0, 571, 1239, 192);
		contentPane.add(table_8);
		
		JButton NhapExcel = new JButton("Nh\u1EADp EXCEL");
		NhapExcel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		NhapExcel.setBounds(699, 476, 140, 32);
		contentPane.add(NhapExcel);
		
		JLabel lblNewLabel_8 = new JLabel("T\u00ECm");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(377, 429, 140, 19);
		contentPane.add(lblNewLabel_8);
		
		txtTimNV = new JTextField();
		txtTimNV.setBounds(543, 429, 503, 20);
		contentPane.add(txtTimNV);
		txtTimNV.setColumns(10);
	}
	
	 private void xuLyClickTblNhanVien() {
	        int row = table_8.getSelectedRow();
	        if (row > -1) {
	        	textField.setText(table_8.getValueAt(row, 0) + "");
	        	textField_1.setText(table_8.getValueAt(row, 1) + "");
	        	textField_2.setText(table_8.getValueAt(row, 2) + "");
	        	textField_4.setText(table_8.getValueAt(row, 4) + "");
	        	textField_5.setText(table_8.getValueAt(row, 5) + "");
	        	textField_6.setText(table_8.getValueAt(row, 6) + "");

	            String gioiTinh = "";
	            if ((table_8.getValueAt(row, 3) + "").equals("Nam")) {
	            	Gioitinhnv.setSelectedIndex(1);
	            } else {
	            	Gioitinhnv.setSelectedIndex(2);
	            }
	        }
	    }
	
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	
	
	 private void xuLyThemNhanVien() {

	        String ho = textField_1.getText();
	        String ten = textField_2.getText();
	        String gioiTinh = Gioitinhnv.getSelectedItem() + "";
	        String cancuoc = textField_4.getText();
	        int sdt = Integer.parseInt(textField_5.getText());;
	        int luong = Integer.parseInt(textField_6.getText());
	        if (NhanVienBUS.themNhanVien(ho, ten, gioiTinh, cancuoc , sdt , luong)) {
	            NhanVienBUS.docDanhSach();
	            loadDataTblNhanVien();
	        }
	    }
	 
	 
	 private void xuLySuaNhanVien() {
//	        if (cmbGioiTinh.getSelectedIndex() == 0) {
//	            new MyDialog("HÃ£y chá»�n giá»›i tÃ­nh!", MyDialog.ERROR_DIALOG);
//	            return;
//	        }
	        String ma = textField.getText();
	        String ho = textField_1.getText();
	        String ten = textField_2.getText();
	        String gioiTinh = Gioitinhnv.getSelectedItem() + "";
	        String cancuoc = textField_4.getText();
	        int sdt = Integer.parseInt(textField_5.getText());;
	        int luong = Integer.parseInt(textField_6.getText());
	        if (NhanVienBUS.updateNhanVien(ma, ho, ten, gioiTinh, cancuoc , sdt , luong)) {
	        	NhanVienBUS.docDanhSach();
	            loadDataTblNhanVien();
	        }
	    }
	 
	 
	  private void xuLyXoaNhanVien() {
        String ma = textField.getText();
        boolean flag = NhanVienBUS.xoaNhanVien(ma);
        if (flag) {
        	NhanVienBUS.docDanhSach();
            loadDataTblNhanVien();
        }
    }
	  
	  
	  private void xuLyTimKiemNhanVien() {
	        ArrayList<QuanLyBanVeMayBay.DTO.NhanVien> dsnv = NhanVienBUS.timNhanVien(txtTimNV.getText());
	        dtmNhanVien.setRowCount(0);
	        for (QuanLyBanVeMayBay.DTO.NhanVien nv : dsnv) {
	            Vector vec = new Vector();
	            vec.add(nv.getMaNV());
	            vec.add(nv.getHoNV());
	            vec.add(nv.getTenNV());
	            vec.add(nv.getGioiTinh());
	            vec.add(nv.getCanCuoc());
	            vec.add(nv.getSdt());
	            vec.add(nv.getLuong());
	            dtmNhanVien.addRow(vec);
	        }
	    }
	  
	  
	  
	 

	 
	 
	 private void loadDataTblNhanVien() {
	        dtmNhanVien.setRowCount(0);
	        ArrayList<QuanLyBanVeMayBay.DTO.NhanVien> dsnv = NhanVienBUS.getDanhSachNhanVien();

	        for (QuanLyBanVeMayBay.DTO.NhanVien nv : dsnv) {
	            Vector vec = new Vector();
	            vec.add(nv.getMaNV());
	            vec.add(nv.getHoNV());
	            vec.add(nv.getTenNV());
	            vec.add(nv.getGioiTinh());
	            vec.add(nv.getCanCuoc());
	            vec.add(nv.getSdt());
	            vec.add(nv.getLuong());
//	            int trangThai = taiKhoanBUS.getTrangThai(nv.getMaNV() + "");
//	            if (trangThai == 0) {
//	                vec.add("KhoÃ¡");
//	            }
//	            else if(trangThai == 1) {
//	                vec.add("Hiá»‡u lá»±c");
//	            }
//	            else {
//	                vec.add("ChÆ°a cÃ³");
//	            }
	            dtmNhanVien.addRow(vec);
	        }
	    }
}
