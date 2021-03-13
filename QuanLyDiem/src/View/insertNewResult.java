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
import java.sql.DriverManager;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class insertNewResult extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel dateTime;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					insertNewResult frame = new insertNewResult();
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
	public insertNewResult() {
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new adminHome().setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(12, 47, 148, 30);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Thêm Điểm Sinh Viên");
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.setForeground(Color.RED);
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
		
		textField_3 = new JTextField();
		textField_3.setBounds(362, 228, 180, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel idsv = new JLabel("Mã Sinh Viên");
		idsv.setFont(new Font("Times New Roman", Font.BOLD, 12));
		idsv.setBounds(178, 84, 135, 20);
		contentPane.add(idsv);
		
		JLabel csdl = new JLabel("Cơ Sở Dữ Liệu");
		csdl.setFont(new Font("Times New Roman", Font.BOLD, 12));
		csdl.setBounds(178, 133, 135, 20);
		contentPane.add(csdl);
		
		JLabel java = new JLabel("Java Cơ Bản");
		java.setFont(new Font("Times New Roman", Font.BOLD, 12));
		java.setBounds(178, 179, 135, 20);
		contentPane.add(java);
		
		JLabel mang = new JLabel("Mạng Máy Tính");
		mang.setFont(new Font("Times New Roman", Font.BOLD, 12));
		mang.setBounds(178, 227, 135, 20);
		contentPane.add(mang);
		
		JLabel tin = new JLabel("Tin Học Đại Cương");
		tin.setFont(new Font("Times New Roman", Font.BOLD, 12));
		tin.setBounds(178, 280, 135, 20);
		contentPane.add(tin);
		
		JLabel tienganh = new JLabel("Tiếng Anh 1");
		tienganh.setFont(new Font("Times New Roman", Font.BOLD, 12));
		tienganh.setBounds(178, 325, 135, 20);
		contentPane.add(tienganh);
		
		JLabel vatly = new JLabel("Vật Lý");
		vatly.setFont(new Font("Times New Roman", Font.BOLD, 12));
		vatly.setBounds(178, 369, 135, 20);
		contentPane.add(vatly);
		
		JLabel web = new JLabel("Công Nghệ Web");
		web.setFont(new Font("Times New Roman", Font.BOLD, 12));
		web.setBounds(178, 413, 135, 20);
		contentPane.add(web);
		
		textField_4 = new JTextField();
		textField_4.setBounds(362, 281, 180, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Nhập điểm sinh viên");
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
//				if (idsv.getText().equals("")||csdl.getText().equals("")||java.getText().equals("")||mang.getText().equals("")
//						||tin.getText().equals("")||tienganh.getText().equals("")||vatly.getText().equals("")||web.getText().equals(""));
//						{
//							JOptionPane.showMessageDialog(null, "Vui Lòng Nhập Đầy Đủ Thông Tin");
//						}
//						
						
				String idsv=textField.getText();
				String csdl=textField_1.getText();
				String java=textField_2.getText();
				String mang=textField_3.getText();
				String tin=textField_4.getText();
				String tienganh=textField_5.getText();
				String vatly=textField_6.getText();
				String web=textField_7.getText();
						
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vietviet","root","");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select *from sinhvien where idsv='"+idsv+"'");
					if(rs.next()) {
						st.executeUpdate("insert into ketqua (idsv,csdl,java,mang,tin,tienganh,vatly,web) values('"+idsv+"','"+csdl+"','"+java+"','"+mang+"','"+tin+"','"+tienganh+"','"+vatly+"','"+web+"')");
						JOptionPane.showMessageDialog(null, "Đã thêm thành công");
						setVisible(false);
						new insertNewResult().setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Mã sinh viên không tìm thấy");
					}
				}
				catch (Exception v)
				{
					JOptionPane.showMessageDialog(null, "Kết nối thất bại");
				}
				}
			
		});
		btnNewButton_5.setBounds(655, 89, 135, 65);
		contentPane.add(btnNewButton_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(362, 326, 180, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(362, 370, 180, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(362, 414, 180, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton_5_1 = new JButton("Sửa");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_5_1.setIcon(new ImageIcon("D:\\java\\reload.png"));
		btnNewButton_5_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_5_1.setBounds(655, 227, 135, 65);
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
				textField_6.setText("");
				textField_7.setText("");
			}
		});
		btnNewButton_5_2.setIcon(new ImageIcon("D:\\java\\reset.png"));
		btnNewButton_5_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_5_2.setBounds(655, 351, 135, 65);
		contentPane.add(btnNewButton_5_2);
	}
	
}
