package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

import net.proteanit.sql.DbUtils;

import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class studentHome extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentHome frame = new studentHome();
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
	
	public studentHome(String idsv) {
		// TODO Auto-generated constructor stub
	}
	
	public studentHome() {
		setTitle("Lê Viết Việt");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\java\\school (1).png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 854, 746);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 255, 255), 5));
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(0, 0, 840, 709);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã Sinh Viên");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(30, 25, 100, 30);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Họ Và Tên");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(30, 80, 100, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Lớp");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(30, 130, 100, 30);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Khoa");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3.setBounds(30, 180, 100, 30);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Địa Chỉ");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_4.setBounds(495, 25, 100, 30);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Ngày Sinh");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_5.setBounds(495, 80, 100, 30);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Giới Tính");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_6.setBounds(495, 130, 100, 30);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Số Điện Thoại");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_7.setBounds(495, 180, 100, 30);
		panel.add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setBounds(156, 27, 170, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(156, 82, 170, 30);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(156, 132, 170, 30);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(156, 182, 170, 30);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(640, 27, 170, 30);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(640, 82, 170, 30);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(640, 132, 170, 30);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(640, 180, 170, 30);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(8, 220, 824, 479);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Cơ Sở Dữ Liệu");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_8.setBounds(63, 55, 170, 30);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Java Cơ Bản");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_9.setBounds(63, 95, 170, 30);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Mạng Máy Tính");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_10.setBounds(63, 135, 170, 30);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Tin Học Đại Cương");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_11.setBounds(63, 175, 170, 30);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Tiếng Anh 1");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_12.setBounds(63, 215, 170, 30);
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Vật Lý");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_13.setBounds(63, 255, 170, 30);
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Công Nghệ Web");
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_14.setBounds(63, 295, 170, 30);
		panel_1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Tổng Điểm");
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_15.setBounds(63, 355, 170, 30);
		panel_1.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Danh Sách Điểm");
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_16.setBounds(320, 3, 170, 50);
		panel_1.add(lblNewLabel_16);
		
		textField_8 = new JTextField();
		textField_8.setBounds(320, 55, 170, 30);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(320, 95, 170, 30);
		panel_1.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(320, 135, 170, 30);
		panel_1.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(320, 175, 170, 30);
		panel_1.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(320, 215, 170, 30);
		panel_1.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(320, 255, 170, 30);
		panel_1.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(320, 295, 170, 30);
		panel_1.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(320, 355, 170, 30);
		panel_1.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(600, 355, 170, 30);
		panel_1.add(textField_16);
		textField_16.setColumns(10);
		
		JButton btnNewButton = new JButton("Xem Thông Tin");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(320, 408, 170, 70);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon("D:\\java\\graduated (1).png"));
		lblNewLabel_17.setBounds(558, 63, 256, 256);
		panel_1.add(lblNewLabel_17);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String idsv=textField.getText();
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vietviet","root","");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select *from sinhvien inner join ketqua where sinhvien.idsv='"+idsv+"' and ketqua.idsv='"+idsv+"'");
					if(rs.next()) {
//						textField.setText(rs.getString(1));
						textField_1.setText(rs.getString(2));
						textField_2.setText(rs.getString(3));
						textField_3.setText(rs.getString(4));
						textField_4.setText(rs.getString(5));
						textField_5.setText(rs.getString(6));
						textField_6.setText(rs.getString(7));
						textField_7.setText(rs.getString(8));
						
						textField_8.setText(rs.getString(10));
						textField_9.setText(rs.getString(11));
						textField_10.setText(rs.getString(12));
						textField_11.setText(rs.getString(13));
						textField_12.setText(rs.getString(14));
						textField_13.setText(rs.getString(15));
						textField_14.setText(rs.getString(16));
						
						int s1=Integer.parseInt(textField_8.getText());
						int s2=Integer.parseInt(textField_9.getText());
						int s3=Integer.parseInt(textField_10.getText());
						int s4=Integer.parseInt(textField_11.getText());
						int s5=Integer.parseInt(textField_12.getText());
						int s6=Integer.parseInt(textField_13.getText());
						int s7=Integer.parseInt(textField_14.getText());
						
						int ketqua=s1+s2+s3+s4+s5+s6+s7;
						String s=String.valueOf(ketqua);
						textField_15.setText(s);
						if (ketqua < 50) {
							textField_16.setText("Học Lại");
						} else {
							textField_16.setText("Đỗ");
						}
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Mã sinh viên không tìm thấy");
					}
				}
				catch (Exception v)
				{
					JOptionPane.showMessageDialog(null, "Kết nối thất bại");
				}
				
				textField_1.setEditable(false);
				textField_2.setEditable(false);
				textField_3.setEditable(false);
				textField_4.setEditable(false);
				textField_5.setEditable(false);
				textField_6.setEditable(false);
				textField_7.setEditable(false);
				textField_8.setEditable(false);
				textField_9.setEditable(false);
				textField_10.setEditable(false);
				textField_11.setEditable(false);
				textField_12.setEditable(false);
				textField_13.setEditable(false);
				textField_14.setEditable(false);
				textField_15.setEditable(false);
			}
		});
	}
}
