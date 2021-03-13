package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class studentIndex extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentIndex frame = new studentIndex();
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
	public studentIndex() {
		setTitle("Lê Viết Việt");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\java\\school (1).png"));
		setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 524, 400);
		panel.setForeground(Color.BLACK);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 6), "WELCOME STUDENT !", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		panel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(210, 81, 128, 128);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\java\\graduated (2).png"));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Chương Trình Quản Lý Điểm Sinh Viên");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(62, 10, 407, 61);
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 23));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Nhập Mã Sinh Viên");
		lblNewLabel_2.setBounds(192, 219, 158, 37);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textField.setBounds(169, 266, 200, 35);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Tìm Kiếm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String idsv=textField.getText();
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vietviet","root","");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select *from sinhvien inner join ketqua where sinhvien.idsv='"+idsv+"'");
					if(rs.next()) {
						setVisible(false);
						new studentHome().setVisible(true);
					}
					else 
						JOptionPane.showMessageDialog(null, "Mã sinh viên không tìm thấy");
					} 
				catch(Exception v)
					{
					JOptionPane.showMessageDialog(null, "Kết nối không thành công");
					}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(169, 333, 90, 30);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Quay Về");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Index().setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.setBounds(279, 333, 90, 30);
		panel.add(btnNewButton_1);
	}
}
