package software;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.event.HierarchyBoundsAdapter;
import java.awt.event.HierarchyEvent;
import java.awt.FlowLayout;

public class MainProject extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainProject frame = new MainProject();
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
	public MainProject() {
		setTitle("UniVibe");
		setFont(new Font("Cambria", Font.BOLD, 17));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,1279,723);

		
		
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(17, 20, 137));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new RoundPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(25, 9, 1015, 159);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_3 = new ClubButton("New button");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Asus\\OneDrive\\Desktop\\TO BE USED\\WhatsApp Image 2023-08-01 at 00.57.21-modified.png"));
		btnNewButton_3.setText("");
		btnNewButton_3.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_3.setBorder(null);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBackground(Color.GRAY);
		btnNewButton_3.setBounds(10, 10, 131, 120);
		panel.add(btnNewButton_3);
		
		ClubButton btnNewButton_3_1 = new ClubButton("New button");
		btnNewButton_3_1.setBorder(null);
		btnNewButton_3_1.setBackground(Color.GRAY);
		btnNewButton_3_1.setFocusPainted(false);
		btnNewButton_3_1.setBounds(151, 10, 131, 120);
		panel.add(btnNewButton_3_1);
		
		ClubButton btnNewButton_3_2 = new ClubButton("New button");
		btnNewButton_3_2.setBorder(null);
		btnNewButton_3_2.setBackground(Color.GRAY);
		btnNewButton_3_2.setFocusPainted(false);
		btnNewButton_3_2.setBounds(292, 10, 131, 120);
		panel.add(btnNewButton_3_2);
		
		ClubButton btnNewButton_3_3 = new ClubButton("New button");
		btnNewButton_3_3.setBorder(null);
		btnNewButton_3_3.setBackground(Color.GRAY);
		btnNewButton_3_3.setFocusPainted(false);
		btnNewButton_3_3.setBounds(433, 10, 131, 120);
		panel.add(btnNewButton_3_3);
		
		ClubButton btnNewButton_3_4 = new ClubButton("New button");
		btnNewButton_3_4.setBorder(null);
		btnNewButton_3_4.setBackground(Color.GRAY);
		btnNewButton_3_4.setFocusPainted(false);
		btnNewButton_3_4.setBounds(574, 10, 131, 120);
		panel.add(btnNewButton_3_4);
		
		ClubButton btnNewButton_3_5 = new ClubButton("New button");
		btnNewButton_3_5.setBorder(null);
		btnNewButton_3_5.setBackground(Color.GRAY);
		btnNewButton_3_5.setFocusPainted(false);
		btnNewButton_3_5.setBounds(715, 10, 131, 120);
		panel.add(btnNewButton_3_5);
		
		ClubButton btnNewButton_3_5_1 = new ClubButton("New button");
		btnNewButton_3_5_1.setBorder(null);
		btnNewButton_3_5_1.setBackground(Color.GRAY);
		btnNewButton_3_5_1.setFocusPainted(false);
		btnNewButton_3_5_1.setBounds(856, 10, 131, 120);
		panel.add(btnNewButton_3_5_1);
		
		JPanel panel_1 = new RoundPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(1056, 0, 191, 575);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(25, 245, 1015, 431);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		RoundPanel panel_2 = new RoundPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.CYAN);
		layeredPane.add(panel_2, "name_363207062992400");
		
		JPanel panel_4 = new RoundPanel();
		panel_4.setBackground(Color.RED);
		panel_4.setForeground(Color.BLACK);
		layeredPane.add(panel_4, "name_363291651301300");
		panel_4.setLayout(null);
		
		JPanel panel_5 = new RoundPanel();
		panel_5.setBackground(Color.YELLOW);
		layeredPane.add(panel_5, "name_363395450215900");
		panel_5.setLayout(null);
		
		
		JButton btnNewButton = new RoundButton("Club Info");
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton.setFocusPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				layeredPane.removeAll();
				layeredPane.add(panel_5);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnNewButton.setBounds(10, 196, 171, 43);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(130, 126, 0, 0);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new RoundButton("Announcements");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBounds(10, 249, 171, 43);
		panel_1.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_2);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		
		JButton btnNewButton_1_1 = new RoundButton("Group Info");
		btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_1_1.setBackground(Color.GRAY);
		btnNewButton_1_1.setFocusPainted(false);
		btnNewButton_1_1.setBounds(10, 302, 171, 43);
		panel_1.add(btnNewButton_1_1);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				layeredPane.removeAll();
				layeredPane.add(panel_4);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		
		JButton btnNewButton_1_2 = new RoundButton("Member Info");
		btnNewButton_1_2.setForeground(new Color(255, 255, 255));
		btnNewButton_1_2.setBorder(null);
		btnNewButton_1_2.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_1_2.setBackground(Color.GRAY);
		btnNewButton_1_2.setFocusPainted(false);
		btnNewButton_1_2.setBounds(10, 355, 171, 43);
		panel_1.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new RoundButton("Chat Box");
		btnNewButton_1_3.setForeground(new Color(255, 255, 255));
		btnNewButton_1_3.setBorder(null);
		btnNewButton_1_3.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_1_3.setBackground(Color.GRAY);
		btnNewButton_1_3.setFocusPainted(false);
		btnNewButton_1_3.setBounds(10, 408, 171, 43);
		panel_1.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new RoundButton("Upcoming Events");
		btnNewButton_1_4.setForeground(new Color(255, 255, 255));
		btnNewButton_1_4.setBorder(null);
		btnNewButton_1_4.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_1_4.setBackground(Color.GRAY);
		btnNewButton_1_4.setFocusPainted(false);
		btnNewButton_1_4.setBounds(10, 461, 171, 43);
		panel_1.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new RoundButton("Your Profile");
		btnNewButton_1_5.setForeground(new Color(255, 255, 255));
		btnNewButton_1_5.setBorder(null);
		btnNewButton_1_5.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_1_5.setBackground(Color.GRAY);
		btnNewButton_1_5.setFocusPainted(false);
		btnNewButton_1_5.setBounds(10, 514, 171, 43);
		panel_1.add(btnNewButton_1_5);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setText("");
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Asus\\OneDrive\\Desktop\\download.png"));
		btnNewButton_2.setBounds(20, 20, 150, 155);
		panel_1.add(btnNewButton_2);
		
		JPanel panel_3 = new RoundPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(25, 178, 1015, 57);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_4 = new RoundButton1("New button");
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_4.setBackground(Color.GRAY);
		btnNewButton_4.setFocusPainted(false);
		btnNewButton_4.setBounds(22, 11, 130, 32);
		panel_3.add(btnNewButton_4);
		
		software.RoundButton1 btnNewButton_4_1 = new software.RoundButton1("New button");
		btnNewButton_4_1.setBorder(null);
		btnNewButton_4_1.setForeground(Color.WHITE);
		btnNewButton_4_1.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_4_1.setBackground(Color.GRAY);
		btnNewButton_4_1.setFocusPainted(false);
		btnNewButton_4_1.setBounds(174, 11, 130, 32);
		panel_3.add(btnNewButton_4_1);
		
		software.RoundButton1 btnNewButton_4_2 = new software.RoundButton1("New button");
		btnNewButton_4_2.setBorder(null);
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4_2.setForeground(Color.WHITE);
		btnNewButton_4_2.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_4_2.setBackground(Color.GRAY);
		btnNewButton_4_2.setFocusPainted(false);
		btnNewButton_4_2.setBounds(326, 11, 130, 32);
		panel_3.add(btnNewButton_4_2);
		
		software.RoundButton1 btnNewButton_4_3 = new software.RoundButton1("New button");
		btnNewButton_4_3.setBorder(null);
		btnNewButton_4_3.setForeground(Color.WHITE);
		btnNewButton_4_3.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_4_3.setBackground(Color.GRAY);
		btnNewButton_4_3.setFocusPainted(false);
		btnNewButton_4_3.setBounds(478, 11, 130, 32);
		panel_3.add(btnNewButton_4_3);
		
		software.RoundButton1 btnNewButton_4_4 = new software.RoundButton1("New button");
		btnNewButton_4_4.setBorder(null);
		btnNewButton_4_4.setForeground(Color.WHITE);
		btnNewButton_4_4.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_4_4.setBackground(Color.GRAY);
		btnNewButton_4_4.setFocusPainted(false);
		btnNewButton_4_4.setBounds(630, 11, 130, 32);
		panel_3.add(btnNewButton_4_4);
		
		software.RoundButton1 btnNewButton_4_5 = new software.RoundButton1("New button");
		btnNewButton_4_5.setBorder(null);
		btnNewButton_4_5.setForeground(Color.WHITE);
		btnNewButton_4_5.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_4_5.setBackground(Color.GRAY);
		btnNewButton_4_5.setFocusPainted(false);
		btnNewButton_4_5.setBounds(782, 11, 130, 32);
		panel_3.add(btnNewButton_4_5);
		
		ClubButton btnNewButton_3_5_1_1 = new ClubButton("New button");
		btnNewButton_3_5_1_1.setIcon(new ImageIcon("C:\\Users\\Asus\\OneDrive\\Desktop\\images.png"));
		btnNewButton_3_5_1_1.setFocusPainted(false);
		btnNewButton_3_5_1_1.setBorder(null);
		btnNewButton_3_5_1_1.setBackground(Color.GRAY);
		btnNewButton_3_5_1_1.setBounds(930, 11, 60, 37);
		panel_3.add(btnNewButton_3_5_1_1);
	
		
		
		
	}
}
