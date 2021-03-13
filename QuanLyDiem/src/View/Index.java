package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Toolkit;

public class Index extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
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
	public Index() {
		setFont(new Font("Times New Roman", Font.BOLD, 12));
		setTitle("Lê Viết Việt");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\java\\school (1).png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 433);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new TitledBorder(new LineBorder(null, 7), "", TitledBorder.LEADING, TitledBorder.BELOW_TOP, null, new Color(255, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\abc\\Downloads\\picture\\1.jpg"));
		lblNewLabel.setBounds(155, 0, 378, 222);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Sinh Viên");
		btnNewButton.setIcon(new ImageIcon("D:\\java\\student (1).png"));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				studentIndex b = new studentIndex();
				b.setVisible(true);
			}
		});
		btnNewButton.setBounds(155, 255, 170, 65);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Quản Trị Viên");
		btnNewButton_1.setIcon(new ImageIcon("D:\\java\\teacher.png"));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminIndex b = new adminIndex();
				b.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(363, 255, 170, 65);
		contentPane.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 10, 638, 376);
		contentPane.add(panel);
	}
}
