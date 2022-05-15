package QuanLyBanVeMayBay.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import javax.swing.JScrollBar;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;

import QuanLyBanVeMayBay.BUS.CTHoaDonBUS;
import QuanLyBanVeMayBay.BUS.HoaDonBUS;
import QuanLyBanVeMayBay.DAO.CTHoaDonDAO;
import QuanLyBanVeMayBay.DTO.CTHoaDon;
import QuanLyBanVeMayBay.DTO.HoaDon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;

public class jijih extends JFrame {

	private JPanel contentPane;
	private JTextField txtMaHD;
	private JTextField txtMaNV;
	private JTextField txtMaKH;
	private JTextField txtNgayLap;
	private JTextField txtTongTien;
	private JTextField txtMaHDCT;
	private JTextField txtMaLoaiVe;
	private JTextField txtSoLuongCT;
	private JTextField textField_8;
	private JTextField txtThue;
	private JTable table;
	private JTable table_1;
	private JTextField txtThanhTienCT;
	private JTable table_2;
	private JTable tblCTHoaDon;
	private JTextField txtMinSearch;
	private JTextField txtMaxSearch;
	private JTextField txtMinNgayLap;
	private JTextField txtMaxNgayLap;
    private JList list;
    private JList listHoaDon;
    DecimalFormat dcf = new DecimalFormat("###,###");
    DefaultTableModel dtmCTHoaDon;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jijih frame = new jijih();
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
	public jijih() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1211, 762);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(UIManager.getColor("Button.background"));
		panel.setBounds(10, 10, 437, 705);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("M\u00E3 h\u00F3a \u0111\u01A1n");
		lblNewLabel_1.setBounds(85, 73, 76, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("TH\u00D4NG TIN H\u00D3A \u0110\u01A0N");
		lblNewLabel.setBounds(10, 10, 417, 39);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel.add(lblNewLabel);
		
		txtMaHD = new JTextField();
		txtMaHD.setBounds(171, 70, 187, 19);
		panel.add(txtMaHD);
		txtMaHD.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("M\u00E3 nh\u00E2n vi\u00EAn");
		lblNewLabel_2.setBounds(85, 111, 76, 13);
		panel.add(lblNewLabel_2);
		
		txtMaNV = new JTextField();
		txtMaNV.setBounds(171, 108, 187, 19);
		panel.add(txtMaNV);
		txtMaNV.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("M\u00E3 kh\u00E1ch h\u00E0ng");
		lblNewLabel_3.setBounds(85, 149, 76, 13);
		panel.add(lblNewLabel_3);
		
		txtMaKH = new JTextField();
		txtMaKH.setBounds(171, 146, 187, 19);
		panel.add(txtMaKH);
		txtMaKH.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Ng\u00E0y l\u1EADp");
		lblNewLabel_4.setBounds(85, 184, 45, 13);
		panel.add(lblNewLabel_4);
		
		txtNgayLap = new JTextField();
		txtNgayLap.setBounds(171, 181, 187, 19);
		panel.add(txtNgayLap);
		txtNgayLap.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("T\u1ED5ng ti\u1EC1n");
		lblNewLabel_5.setBounds(85, 220, 45, 13);
		panel.add(lblNewLabel_5);
		
		txtTongTien = new JTextField();
		txtTongTien.setBounds(171, 217, 187, 19);
		panel.add(txtTongTien);
		txtTongTien.setColumns(10);
		
		list = new JList();
		list.setBounds(425, 574, -383, -69);
		panel.add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(215, 418, 81, -120);
		panel.add(list_1);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(410, 343, 17, 373);
		panel.add(scrollBar_1);
		
		JLabel lblNewLabel_13 = new JLabel("Gi\u00E1 t\u1EEB:");
		lblNewLabel_13.setBounds(32, 264, 45, 13);
		panel.add(lblNewLabel_13);
		
		txtMinSearch = new JTextField();
		txtMinSearch.setBounds(103, 261, 96, 19);
		panel.add(txtMinSearch);
		 txtMinSearch.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	xuLyTimTheoKhoangGia();
	            }
	        });
		txtMinSearch.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("\u0111\u1EBFn");
		lblNewLabel_14.setBounds(215, 264, 45, 13);
		panel.add(lblNewLabel_14);
		
		txtMaxSearch = new JTextField();
		txtMaxSearch.setBounds(260, 261, 96, 19);
		panel.add(txtMaxSearch);
		txtMaxSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	xuLyTimTheoKhoangGia();
            }
        });
		txtMaxSearch.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Ng\u00E0y l\u1EADp t\u1EEB");
		lblNewLabel_15.setBounds(32, 307, 62, 13);
		panel.add(lblNewLabel_15);
		
		txtMinNgayLap = new JTextField();
		txtMinNgayLap.setBounds(103, 304, 96, 19);
		panel.add(txtMinNgayLap);
		txtMinNgayLap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	xuLyTimTheoKhoangNgay();
            }
        });
		txtMinNgayLap.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("\u0111\u1EBFn");
		lblNewLabel_16.setBounds(215, 307, 45, 13);
		panel.add(lblNewLabel_16);
		
		txtMaxNgayLap = new JTextField();
		txtMaxNgayLap.setBounds(262, 304, 96, 19);
		panel.add(txtMaxNgayLap);
		txtMinNgayLap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	xuLyTimTheoKhoangNgay();
            }
        });
		txtMaxNgayLap.setColumns(10);
		
		JList list_2 = new JList();
		list_2.setBounds(28, 540, 159, -105);
		panel.add(list_2);
		
	    listHoaDon = new JList();
		listHoaDon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				xuLyHienCTHoaDon();
			}
		});
		listHoaDon.setBounds(10, 361, 396, 303);
		panel.add(listHoaDon);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("Button.background"));
		panel_1.setBounds(443, 10, 744, 715);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("CHI TI\u1EBET H\u00D3A \u0110\u01A0N");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(0, 5, 744, 34);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("M\u00E3 h\u00F3a \u0111\u01A1n");
		lblNewLabel_7.setBounds(139, 62, 100, 13);
		panel_1.add(lblNewLabel_7);
		
		txtMaHDCT = new JTextField();
		txtMaHDCT.setBounds(249, 59, 327, 19);
		panel_1.add(txtMaHDCT);
		txtMaHDCT.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("M\u00E3 lo\u1EA1i v\u00E9");
		lblNewLabel_8.setBounds(139, 103, 100, 13);
		panel_1.add(lblNewLabel_8);
		
		txtMaLoaiVe = new JTextField();
		txtMaLoaiVe.setBounds(249, 100, 327, 19);
		panel_1.add(txtMaLoaiVe);
		txtMaLoaiVe.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("S\u1ED1 l\u01B0\u1EE3ng");
		lblNewLabel_9.setBounds(139, 149, 100, 13);
		panel_1.add(lblNewLabel_9);
		
		txtSoLuongCT = new JTextField();
		txtSoLuongCT.setBounds(249, 146, 327, 19);
		panel_1.add(txtSoLuongCT);
		txtSoLuongCT.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("M\u00E3 khuy\u1EBFn m\u00E3i");
		lblNewLabel_10.setBounds(139, 196, 100, 13);
		panel_1.add(lblNewLabel_10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(249, 193, 327, 19);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Thu\u1EBF");
		lblNewLabel_11.setBounds(139, 247, 100, 13);
		panel_1.add(lblNewLabel_11);
		
		txtThue = new JTextField();
		txtThue.setBounds(249, 244, 327, 19);
		panel_1.add(txtThue);
		txtThue.setColumns(10);
		
		table = new JTable();
		table.setBounds(139, 519, -42, -27);
		panel_1.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(730, 320, -717, -9);
		panel_1.add(table_1);
		
		JLabel lblNewLabel_12 = new JLabel("Th\u00E0nh ti\u1EC1n");
		lblNewLabel_12.setBounds(139, 298, 100, 13);
		panel_1.add(lblNewLabel_12);
		
		txtThanhTienCT = new JTextField();
		txtThanhTienCT.setBounds(249, 295, 327, 19);
		panel_1.add(txtThanhTienCT);
		txtThanhTienCT.setColumns(10);
		
		table_2 = new JTable();
		table_2.setBounds(51, 517, 13, -152);
		panel_1.add(table_2);
		
		tblCTHoaDon = new JTable();
		tblCTHoaDon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		tblCTHoaDon.setSurrendersFocusOnKeystroke(true);
		tblCTHoaDon.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 h\u00F3a \u0111\u01A1n", "M\u00E3 lo\u1EA1i v\u00E9", "S\u1ED1 l\u01B0\u1EE3ng", "M\u00E3 khuy\u1EBFn m\u00E3i", "Thu\u1EBF", "Th\u00E0nh ti\u1EC1n"
			}
		));
		tblCTHoaDon.getColumnModel().getColumn(3).setPreferredWidth(91);
		tblCTHoaDon.getColumnModel().getColumn(5).setPreferredWidth(70);
		tblCTHoaDon.setForeground(Color.WHITE);
		tblCTHoaDon.setBounds(10, 344, 712, 160);
		panel_1.add(tblCTHoaDon);
		
		JScrollBar scrollBar_2 = new JScrollBar();
		scrollBar_2.setBounds(730, 344, 17, 371);
		panel_1.add(scrollBar_2);
	}
	
	
			private void loadDataListHoaDon() {
		        ArrayList<HoaDon> dshd = HoaDonBUS.getListHoaDon();
		        addDataListHoaDon(dshd);
		    }
		
		    private void addDataListHoaDon(ArrayList<HoaDon> dshd) {
		        DefaultListModel<String> listModel = new DefaultListModel<>();
		        if (dshd != null) {
		            for (HoaDon hd : dshd) {
		                listModel.addElement(hd.getMaHD() + " | " + hd.getNgayLap() + " === " + dcf.format(hd.getTongTien()) + " VND");
		            }
		            listHoaDon.setModel(listModel);
		        }
		    }

	
			private void xuLyHienCTHoaDon() {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
				String hoaDon = (String) list.getSelectedValue();
				String[] stMaHD = hoaDon.split(" | ");
				
				HoaDon hd = HoaDonBUS.getHoaDon(stMaHD[0]);
				txtMaHD.setText(hd.getMaHD() + "");
				txtMaKH.setText(hd.getMaKHThanhToan() + "");
				txtMaNV.setText(hd.getMaNV() + "");
				
				txtNgayLap.setText(sdf.format(hd.getNgayLap()));
				txtTongTien.setText(dcf.format(hd.getTongTien()));
			
				
				// Gá»�i hiá»ƒn thá»‹ data trÃªn tblCTHoaDon
				loadDataTblCTHoaDon(stMaHD[0]);
			}
			

			private void loadDataTblCTHoaDon() {
				CTHoaDonBUS.docListCTHoaDon();
		        ArrayList<CTHoaDon> listCTHoaDon = CTHoaDonBUS.getListCTHoaDon();
		        addDataTableCTHoaDon(listCTHoaDon);
		    }
			
			 private void addDataTableCTHoaDon(ArrayList<CTHoaDon> listCTHoaDon) {
			        dtmCTHoaDon.setRowCount(0);
			        for (CTHoaDon ct : listCTHoaDon) {
			            Vector<String> vec = new Vector<>();
			            vec.add(ct.getMaHD() + "");
			            vec.add(ct.getMaLoaiVe() + "");
			            vec.add(ct.getSoLuongVe() + "");
			            vec.add(ct.getSoLuongVe() + "");
			            vec.add(ct.getMaKM() + "");
			            vec.add(dcf.format(ct.getThue()));
			            vec.add(dcf.format(ct.getThanhTien()));
			            dtmCTHoaDon.addRow(vec);
			        }
			    }   
		
			 private void loadDataTblCTHoaDon(String maHD) {
			        ArrayList<CTHoaDon> listCTHoaDon = CTHoaDonBUS.getListCTHoaDonTheoMaHD(maHD);

			        addDataTableCTHoaDon(listCTHoaDon);
			  }
			 
			 
			 private void xuLyClickTblCTHoaDon() {
			        int row = tblCTHoaDon.getSelectedRow();
			        if (row > -1) {
			            String maHD = tblCTHoaDon.getValueAt(row, 0) + "";
			            String maSP = tblCTHoaDon.getValueAt(row, 1) + "";
			            String soLuong = tblCTHoaDon.getValueAt(row, 2) + "";
			            String thue = tblCTHoaDon.getValueAt(row, 4) + "";
			            String thanhTien = tblCTHoaDon.getValueAt(row, 4) + "";

			            txtMaHDCT.setText(maHD);
			            txtMaLoaiVe.setText(maSP);
			            txtSoLuongCT.setText(soLuong);
			            txtThue.setText(thue);
			            txtThanhTienCT.setText(thanhTien);
			        }
			    }

			
			
			 private void xuLyTimTheoKhoangNgay() {
//			        ArrayList<HoaDon> listHoaDon = CTHoaDonBUS.getListHoaDonTheoNgay(txtMinSearch.getText(), txtMaxSearch.getText());
//			        addDataListHoaDon(listHoaDon);
			    }

			    private void xuLyTimTheoKhoangGia() {
//			        ArrayList<HoaDon> listHoaDon = CTHoaDonBUS.getListHoaDonTheoGia(txtMinSearch.getText(), txtMaxSearch.getText());
//			        addDataListHoaDon(listHoaDon);
			    }
			 
	   }

