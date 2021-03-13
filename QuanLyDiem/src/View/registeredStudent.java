package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class registeredStudent extends javax.swing.JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	 Connection Con = null;
	 Statement St = null;
	 ResultSet Rs = null;
	 private javax.swing.JTextField idsv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registeredStudent frame = new registeredStudent();
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
	public registeredStudent() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\java\\school (1).png"));
		setTitle("Lê Viết Việt");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 500);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(new Color(255, 255, 255), 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBorder(new LineBorder(null, 6));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 168, 463);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("Thêm Sinh Viên");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new adminHome().setVisible(true);
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(12, 47, 148, 30);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Thêm Điểm Sinh Viên");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new insertNewResult().setVisible(true);
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.setBounds(12, 103, 148, 30);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Danh Sách Sinh Viên");
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_2.setBounds(10, 162, 148, 30);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Điểm Sinh Viên");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new allStudentResult().setVisible(true);
			}
		});
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(172, 50, 655, 305);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 Sinh Vi\u00EAn", "H\u1ECD V\u00E0 T\u00EAn", "L\u1EDBp", "Khoa", "\u0110\u1ECBa Ch\u1EC9", "Ng\u00E0y Sinh", "Gi\u1EDBi T\u00EDnh", "S\u1ED1 \u0110i\u1EC7n Tho\u1EA1i"
			}
		));
		table.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblNewLabel = new JLabel("Danh Sách Sinh Viên");
		lblNewLabel.setForeground(new Color(135, 206, 250));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBounds(172, 10, 655, 42);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_4_1 = new JButton("Xem");
		btnNewButton_4_1.setIcon(new ImageIcon("D:\\java\\observation.png"));
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vietviet","root","");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select *from sinhvien");
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}
				catch (Exception v)
				{
					JOptionPane.showMessageDialog(null, "Kết nối thất bại");
				}
				table.setEnabled(false);
			}
		});
		btnNewButton_4_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_4_1.setBounds(495, 365, 160, 88);
		contentPane.add(btnNewButton_4_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(172, 414, 143, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_4_1_1 = new JButton("Tìm Kiếm");
		btnNewButton_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4_1_1.setIcon(new ImageIcon("D:\\java\\search.png"));
		btnNewButton_4_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_4_1_1.setBounds(325, 365, 160, 88);
		contentPane.add(btnNewButton_4_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập Mã Sinh Viên");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(172, 368, 143, 21);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_5_2 = new JButton("Xóa");
		btnNewButton_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String idsv=textField.getText();
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vietviet","root","");
					String query = "DELETE FROM `sinhvien` WHERE idsv=?";
				    PreparedStatement pst = con.prepareStatement(query);
					pst.setString(1,idsv);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Đã Xóa Thành Công");
				}
				catch(Exception v) {
					JOptionPane.showMessageDialog(null, "Kết Nối Thất Bại");
					
				}
			}
		});
		btnNewButton_5_2.setIcon(new ImageIcon("D:\\java\\delete-friend.png"));
		btnNewButton_5_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_5_2.setBounds(665, 365, 160, 88);
		contentPane.add(btnNewButton_5_2);
	}
}

