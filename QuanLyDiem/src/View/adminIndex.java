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
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class adminIndex extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminIndex frame = new adminIndex();
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
	public adminIndex() {
		setTitle("Lê Viết Việt");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\java\\school (1).png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 490);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(180, 20, 220, 220);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\abc\\Downloads\\picture\\user.png"));
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField.setBounds(290, 240, 170, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tài Khoản");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(120, 240, 100, 30);
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mật Khẩu");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(120, 300, 100, 30);
		lblNewLabel_2.setForeground(Color.CYAN);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 8), "WELCOME ADMIN !", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		panel.setBounds(0, 10, 574, 433);
		panel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Đăng Nhập");
		btnNewButton.setBounds(126, 360, 150, 40);
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JButton btnNewButton_1 = new JButton("Thoát");
		btnNewButton_1.setBounds(310, 360, 150, 40);
		panel.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Index().setVisible(true);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText();
				String password=passwordField.getText();
				if(username.equals("admin") && password.equals("pass")) {
					adminHome b = new adminHome();
					b.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Sai Mật Khẩu Hoặc Tài Khoản");
				}
			}
		});
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.BOLD, 20));
		passwordField.setEchoChar('*');
		passwordField.setBounds(290, 300, 170, 40);
		contentPane.add(passwordField);
	}
}
