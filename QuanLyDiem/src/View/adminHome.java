package View;

import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class adminHome extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel dateTime;
	private JTextField textField_5;
	
	Connection con = null; 
    Statement st = null; 
    ResultSet rs = null; 

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminHome frame = new adminHome();
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
	public adminHome() {
		setTitle("Lê Viết Việt");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\java\\school (1).png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new LineBorder(Color.WHITE, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBorder(new LineBorder(null, 6));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 168, 463);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Thêm Sinh Viên");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(12, 47, 148, 30);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Thêm Điểm Sinh Viên");
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new insertNewResult().setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(12, 103, 148, 30);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Danh Sách Sinh Viên");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new registeredStudent().setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBounds(12, 162, 148, 30);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Điểm Sinh Viên");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new allStudentResult().setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setBounds(12, 217, 148, 30);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Đăng Xuất");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new adminIndex().setVisible(true);
			}
		});
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\abc\\Downloads\\picture\\icons8-exit-50.png"));
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_4.setBounds(10, 362, 148, 91);
		panel.add(btnNewButton_4);
		
		textField = new JTextField();
		textField.setBounds(362, 85, 180, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(362, 134, 180, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(362, 180, 180, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Kỹ Thuật Máy Tính", "Công Nghệ Thông Tin", "Quản Trị Kinh Doanh"}));
		comboBox.setBounds(362, 227, 180, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Nam", "Nữ"}));
		comboBox_1.setBounds(362, 369, 180, 20);
		contentPane.add(comboBox_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(362, 281, 180, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel idsv = new JLabel("Mã Sinh Viên");
		idsv.setFont(new Font("Times New Roman", Font.BOLD, 12));
		idsv.setBounds(178, 84, 100, 20);
		contentPane.add(idsv);
		
		JLabel hoten = new JLabel("Họ Và Tên");
		hoten.setFont(new Font("Times New Roman", Font.BOLD, 12));
		hoten.setBounds(178, 133, 100, 20);
		contentPane.add(hoten);
		
		JLabel idlop = new JLabel("Lớp");
		idlop.setFont(new Font("Times New Roman", Font.BOLD, 12));
		idlop.setBounds(178, 179, 100, 20);
		contentPane.add(idlop);
		
		JLabel khoa = new JLabel("Khoa");
		khoa.setFont(new Font("Times New Roman", Font.BOLD, 12));
		khoa.setBounds(178, 227, 100, 20);
		contentPane.add(khoa);
		
		JLabel diachi = new JLabel("Địa Chỉ");
		diachi.setFont(new Font("Times New Roman", Font.BOLD, 12));
		diachi.setBounds(178, 280, 100, 20);
		contentPane.add(diachi);
		
		JLabel ngaysinh = new JLabel("Ngày Sinh");
		ngaysinh.setFont(new Font("Times New Roman", Font.BOLD, 12));
		ngaysinh.setBounds(178, 325, 100, 20);
		contentPane.add(ngaysinh);
		
		JLabel gioitinh = new JLabel("Giới Tính");
		gioitinh.setFont(new Font("Times New Roman", Font.BOLD, 12));
		gioitinh.setBounds(178, 369, 100, 20);
		contentPane.add(gioitinh);
		
		JLabel sdt = new JLabel("Số Điện Thoại");
		sdt.setFont(new Font("Times New Roman", Font.BOLD, 12));
		sdt.setBounds(178, 413, 100, 20);
		contentPane.add(sdt);
		
		textField_4 = new JTextField();
		textField_4.setBounds(362, 326, 180, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Nhập thông tin sinh viên");
		lblNewLabel_8.setForeground(new Color(135, 206, 250));
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(200, 10, 600, 47);
		contentPane.add(lblNewLabel_8);
		
		JButton btnNewButton_5 = new JButton("Thêm");
		btnNewButton_5.setIcon(new ImageIcon("D:\\java\\follow (1).png"));
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String idsv=textField.getText();
				String hoten=textField_1.getText();
				String idlop=textField_2.getText();
				String khoa=(String)comboBox.getSelectedItem();
				String diachi=textField_3.getText();
				String ngaysinh=textField_4.getText();
				String gioitinh=(String)comboBox_1.getSelectedItem();
				String sdt=textField_5.getText();
						
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vietviet","root","");
					Statement st=con.createStatement();
					st.executeUpdate("insert into sinhvien(idsv,hoten,idlop,khoa,diachi,ngaysinh,gioitinh,sdt) "
							+ "values ('"+idsv+"','"+hoten+"','"+idlop+"','"+khoa+"','"+diachi+"','"+ngaysinh+"','"+gioitinh+"','"+sdt+"')");
					JOptionPane.showMessageDialog(null, "Đã cập nhật thành công");
					setVisible(false);
					new adminHome().setVisible(true);
					st.close();
				}
				catch (Exception v)
				{
					JOptionPane.showMessageDialog(null,v);
					System.out.println(v);
					setVisible(false);
					new adminHome().setVisible(true);
				}		
			
			}
		});
		btnNewButton_5.setBounds(655, 85, 135, 65);
		contentPane.add(btnNewButton_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(362, 414, 180, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton_5_1 = new JButton("Sửa");
		btnNewButton_5_1.setIcon(new ImageIcon("D:\\java\\reload.png"));
		btnNewButton_5_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_5_1.setBounds(655, 213, 135, 65);
		contentPane.add(btnNewButton_5_1);
		
		JButton btnNewButton_5_2 = new JButton("Mới");
		btnNewButton_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				
			}
		});
		btnNewButton_5_2.setIcon(new ImageIcon("D:\\java\\reset.png"));
		btnNewButton_5_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_5_2.setBounds(655, 345, 135, 65);
		contentPane.add(btnNewButton_5_2);
	}
	
}
