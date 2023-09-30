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
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MainProject extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	
	public JPanel getContentPane() {
	    return contentPane;
	
}

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
		
		JButton btnNewButton_3_0 = new ClubButton("New button");
		btnNewButton_3_0.setIcon(new ImageIcon("C:\\Users\\Asus\\OneDrive\\Desktop\\TO BE USED\\WhatsApp Image 2023-08-01 at 00.57.21-modified.png"));
		btnNewButton_3_0.setText("");
		btnNewButton_3_0.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_3_0.setBorder(null);
		btnNewButton_3_0.setBackground(Color.GRAY);
		btnNewButton_3_0.setBounds(10, 10, 131, 120);
		btnNewButton_3_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				}
		});
		panel.add(btnNewButton_3_0);
		
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
		
		ClubButton btnNewButton_3_6 = new ClubButton("New button");
		btnNewButton_3_6.setBorder(null);
		btnNewButton_3_6.setBackground(Color.GRAY);
		btnNewButton_3_6.setFocusPainted(false);
		btnNewButton_3_6.setBounds(856, 10, 131, 120);
		panel.add(btnNewButton_3_6);
		
		JPanel panel_1 = new RoundPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(1056, 0, 191, 575);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(25, 245, 1015, 431);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		RoundPanel Announcem = new RoundPanel();
		Announcem.setLayout(null);
		Announcem.setBackground(Color.CYAN);
		layeredPane.add(Announcem, "name_363207062992400");
		
		JPanel GroupInfo = new RoundPanel();
		GroupInfo.setBackground(Color.RED);
		GroupInfo.setForeground(Color.BLACK);
		layeredPane.add(GroupInfo, "name_363291651301300");
		GroupInfo.setLayout(null);
		
		JPanel ClubInfo = new RoundPanel();
		ClubInfo.setLayout(null);
		ClubInfo.setBackground(new Color(255, 255, 255));
		layeredPane.add(ClubInfo, "name_363395450215900");
		
		ClubLogo btnNewButton_clublogo = new ClubLogo("New button");
		btnNewButton_clublogo.setForeground(new Color(255, 255, 255));
		btnNewButton_clublogo.setIcon(new ImageIcon("D:\\SEM 3\\shakti\\Downloads\\editicon (2).jpg"));
		btnNewButton_clublogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_clublogo.setText("Club Logo");
		btnNewButton_clublogo.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_clublogo.setBorder(null);
		btnNewButton_clublogo.setBackground(new Color(17, 20, 137));
		btnNewButton_clublogo.setBounds(395, 10, 170, 200);
		ClubInfo.add(btnNewButton_clublogo);
		
		RoundPanel panel_descr = new RoundPanel();
		panel_descr.setLayout(null);
		panel_descr.setBackground(new Color(17, 20, 137));
		panel_descr.setBounds(106, 270, 803, 151);
		ClubInfo.add(panel_descr);
		
		JLabel lblClubName_1_1 = new JLabel(" Description of the Club");
		lblClubName_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblClubName_1_1.setIcon(new ImageIcon("D:\\SEM 3\\shakti\\Downloads\\editicon (2).jpg"));
		lblClubName_1_1.setIconTextGap(10);
		lblClubName_1_1.setForeground(Color.WHITE);
		lblClubName_1_1.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblClubName_1_1.setBounds(208, 50, 397, 62);
		panel_descr.add(lblClubName_1_1);
		
		JLabel lblClubName = new JLabel(" Name of the Club");
		lblClubName.setHorizontalAlignment(SwingConstants.CENTER);
		lblClubName.setIconTextGap(10);
		lblClubName.setForeground(new Color(17, 20, 137));
		lblClubName.setFont(new Font("Cambria", Font.BOLD, 35));
		lblClubName.setIcon(null);
		lblClubName.setBounds(304, 199, 375, 62);
		ClubInfo.add(lblClubName);
		
		JLabel lblClubName_1 = new JLabel(" Name of the Club");
		lblClubName_1.setIconTextGap(10);
		lblClubName_1.setForeground(new Color(255, 255, 255));
		lblClubName_1.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblClubName_1.setBounds(242, 200, 424, 62);
		ClubInfo.add(lblClubName_1);
		
		RoundPanel Upcoming = new RoundPanel();
		Upcoming.setLayout(null);
		Upcoming.setBackground(Color.WHITE);
		layeredPane.add(Upcoming, "name_349324851633600");
		
		RoundPanel panel_3_1 = new RoundPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setForeground(Color.WHITE);
		panel_3_1.setBackground(new Color(243, 243, 253));
		panel_3_1.setBounds(10, 11, 995, 56);
		Upcoming.add(panel_3_1);
		
		RoundButton2 btnNewButton_5 = new RoundButton2("GraVitas");
		btnNewButton_5.setSelected(true);
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_5.setFocusPainted(false);
		btnNewButton_5.setBorder(null);
		btnNewButton_5.setBackground(Color.GRAY);
		btnNewButton_5.setBounds(10, 7, 167, 40);
		panel_3_1.add(btnNewButton_5);
		
		RoundButton2 btnNewButton_5_1 = new RoundButton2("Yantra");
		btnNewButton_5_1.setSelected(true);
		btnNewButton_5_1.setForeground(Color.WHITE);
		btnNewButton_5_1.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_5_1.setFocusPainted(false);
		btnNewButton_5_1.setBorder(null);
		btnNewButton_5_1.setBackground(Color.GRAY);
		btnNewButton_5_1.setBounds(200, 7, 167, 40);
		panel_3_1.add(btnNewButton_5_1);
		
		RoundButton2 btnNewButton_5_2 = new RoundButton2("Riveria");
		btnNewButton_5_2.setSelected(true);
		btnNewButton_5_2.setForeground(Color.WHITE);
		btnNewButton_5_2.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_5_2.setFocusPainted(false);
		btnNewButton_5_2.setBorder(null);
		btnNewButton_5_2.setBackground(Color.GRAY);
		btnNewButton_5_2.setBounds(390, 7, 167, 40);
		panel_3_1.add(btnNewButton_5_2);
		
		RoundButton2 btnNewButton_5_3 = new RoundButton2("Club Event");
		btnNewButton_5_3.setSelected(true);
		btnNewButton_5_3.setForeground(Color.WHITE);
		btnNewButton_5_3.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_5_3.setFocusPainted(false);
		btnNewButton_5_3.setBorder(null);
		btnNewButton_5_3.setBackground(Color.GRAY);
		btnNewButton_5_3.setBounds(580, 7, 167, 40);
		panel_3_1.add(btnNewButton_5_3);
		
		RoundButton2 btnNewButton_5_4 = new RoundButton2("Event Category");
		btnNewButton_5_4.setSelected(true);
		btnNewButton_5_4.setForeground(Color.WHITE);
		btnNewButton_5_4.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_5_4.setFocusPainted(false);
		btnNewButton_5_4.setBorder(null);
		btnNewButton_5_4.setBackground(Color.GRAY);
		btnNewButton_5_4.setBounds(770, 7, 167, 40);
		panel_3_1.add(btnNewButton_5_4);
		
		CircleButton btnNewButton_4_5_1 = new CircleButton("-->");
		btnNewButton_4_5_1.setSelected(true);
		btnNewButton_4_5_1.setForeground(Color.BLACK);
		btnNewButton_4_5_1.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_4_5_1.setFocusPainted(false);
		btnNewButton_4_5_1.setBorder(null);
		btnNewButton_4_5_1.setBackground(new Color(243, 243, 253));
		btnNewButton_4_5_1.setBounds(949, 11, 36, 32);
		panel_3_1.add(btnNewButton_4_5_1);
		
		RoundPanel panel_4_2 = new RoundPanel();
		panel_4_2.setLayout(null);
		panel_4_2.setForeground(Color.WHITE);
		panel_4_2.setBackground(new Color(217, 217, 217));
		panel_4_2.setBounds(10, 78, 995, 33);
		Upcoming.add(panel_4_2);
		
		CircleButton2 btnNewButton_6 = new CircleButton2("");
		btnNewButton_6.setText("");
		btnNewButton_6.setSelected(true);
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setBorderPainted(false);
		btnNewButton_6.setBorder(null);
		btnNewButton_6.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_6.setBounds(23, 5, 23, 23);
		panel_4_2.add(btnNewButton_6);
		
		textField = new JTextField("Type Club name, Event Name, Venue, Time, Type of Event  to filter....");
		textField.setForeground(new Color(102, 102, 102));
		textField.setFont(new Font("Calibri", Font.BOLD, 13));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(new Color(217, 217, 217));
		textField.setBounds(53, 8, 899, 20);
		panel_4_2.add(textField);
		
		CircleButton2 btnNewButton_7 = new CircleButton2("");
		btnNewButton_7.setText("");
		btnNewButton_7.setSelected(true);
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setBorderPainted(false);
		btnNewButton_7.setBorder(null);
		btnNewButton_7.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_7.setBounds(954, 4, 23, 23);
		panel_4_2.add(btnNewButton_7);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(10, 116, 995, 305);
		Upcoming.add(scrollPane);
		scrollPane.setLayout(null);
		
		JButton btnNewButton_8 = new JButton("Event Image");
		btnNewButton_8.setFont(new Font("Candara", Font.BOLD, 14));
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.setFocusPainted(false);
		btnNewButton_8.setSelected(false);
		btnNewButton_8.setBorder(null);
		btnNewButton_8.setBackground(new Color(145, 145, 145));
		btnNewButton_8.setBounds(17, 6, 143, 143);
		scrollPane.add(btnNewButton_8);
		
		JButton btnNewButton_8_1 = new JButton("Event Image");
		btnNewButton_8_1.setFont(new Font("Candara", Font.BOLD, 14));
		btnNewButton_8_1.setBounds(17, 160, 143, 143);
		btnNewButton_8_1.setBorderPainted(false);
		btnNewButton_8_1.setFocusPainted(false);
		btnNewButton_8_1.setSelected(true);
		btnNewButton_8_1.setBorder(null);
		btnNewButton_8_1.setBackground(new Color(145, 145, 145));
		scrollPane.add(btnNewButton_8_1);
		
		JPanel panel_51 = new JPanel();
		panel_51.setBackground(new Color(0, 74, 173));
		panel_51.setBounds(170, 6, 785, 143);
		scrollPane.add(panel_51);
		panel_51.setLayout(null);
		
		JTextArea textArea = new JTextArea("Description of Event");
		textArea.setForeground(Color.WHITE);
		textArea.setFont(textArea.getFont().deriveFont(17f));
		textArea.setFocusable(false);
		textArea.setBorder(null);
		textArea.setBackground(new Color(17, 20, 137));
		textArea.setBounds(10, 10, 641, 95);
		panel_51.add(textArea);
		
		JTextArea textArea_1 = new JTextArea("More Info");
		textArea_1.setForeground(Color.WHITE);
		textArea_1.setFont(new Font("Cambria", Font.PLAIN, 17));
		textArea_1.setBounds(10, 109, 132, 26);
		textArea_1.setFont(new Font("Cambria", Font.PLAIN, 17));
		textArea_1.setFocusable(false);
		textArea_1.setBorder(null);
		textArea_1.setBackground(new Color(17, 20, 137));
		panel_51.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea("Fees of Event");
		textArea_2.setForeground(Color.WHITE);
		textArea_2.setFont(textArea.getFont().deriveFont(17f));
		textArea_2.setBounds(661, 11, 114, 41);
		textArea_2.setFont(new Font("Cambria", Font.PLAIN, 17));
		textArea_2.setFocusable(false);
		textArea_2.setBorder(null);
		textArea_2.setBackground(new Color(17, 20, 137));
		panel_51.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea("Date of Event");
		textArea_3.setForeground(Color.WHITE);
		textArea_3.setFont(textArea.getFont().deriveFont(17f));
		textArea_3.setBounds(661, 56, 114, 41);
		textArea_3.setFont(new Font("Cambria", Font.PLAIN, 17));
		textArea_3.setFocusable(false);
		textArea_3.setBorder(null);
		textArea_3.setBackground(new Color(17, 20, 137));
		panel_51.add(textArea_3);
		
		JTextArea textArea_4 = new JTextArea("Venue of Event");
		textArea_4.setForeground(Color.WHITE);
		textArea_4.setFont(textArea.getFont().deriveFont(17f));
		textArea_4.setBounds(152, 109, 499, 26);
		textArea_4.setFont(new Font("Cambria", Font.PLAIN, 17));
		textArea_4.setFocusable(false);
		textArea_4.setBorder(null);
		textArea_4.setBackground(new Color(17, 20, 137));
		panel_51.add(textArea_4);
		
		JButton btnNewButton_9 = new JButton("Register");
		btnNewButton_9.setForeground(Color.WHITE);
		btnNewButton_9.setBorderPainted(false);
		btnNewButton_9.setFocusPainted(false);
		btnNewButton_9.setSelected(true);
		btnNewButton_9.setFont(new Font("Calibri", Font.PLAIN, 17));
		btnNewButton_9.setBackground(new Color(17, 20, 137));
		btnNewButton_9.setBorder(null);
		btnNewButton_9.setBounds(661, 101, 114, 34);
		panel_51.add(btnNewButton_9);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setLayout(null);
		panel_5_1.setBackground(new Color(0, 74, 173));
		panel_5_1.setBounds(170, 160, 785, 143);
		scrollPane.add(panel_5_1);
		
		JTextArea textArea_6 = new JTextArea("Description of Event");
		textArea_6.setForeground(Color.WHITE);
		textArea_6.setFont(textArea.getFont().deriveFont(17f));
		textArea_6.setFont(new Font("Cambria", Font.PLAIN, 17));
		textArea_6.setFocusable(false);
		textArea_6.setBorder(null);
		textArea_6.setBackground(new Color(17, 20, 137));
		textArea_6.setBounds(10, 11, 641, 95);
		panel_5_1.add(textArea_6);
		
		JTextArea textArea_1_1 = new JTextArea("More Info");
		textArea_1_1.setForeground(Color.WHITE);
		textArea_1_1.setFont(textArea.getFont().deriveFont(17f));
		textArea_1_1.setFont(new Font("Cambria", Font.PLAIN, 17));
		textArea_1_1.setFocusable(false);
		textArea_1_1.setBorder(null);
		textArea_1_1.setBackground(new Color(17, 20, 137));
		textArea_1_1.setBounds(10, 109, 132, 26);
		panel_5_1.add(textArea_1_1);
		
		JTextArea textArea_2_1 = new JTextArea("Fees of Event");
		textArea_2_1.setForeground(Color.WHITE);
		textArea_2_1.setFont(textArea.getFont().deriveFont(17f));
		textArea_2_1.setFont(new Font("Cambria", Font.PLAIN, 17));
		textArea_2_1.setFocusable(false);
		textArea_2_1.setBorder(null);
		textArea_2_1.setBackground(new Color(17, 20, 137));
		textArea_2_1.setBounds(661, 11, 114, 41);
		panel_5_1.add(textArea_2_1);
		
		JTextArea textArea_3_1 = new JTextArea("Date of Event");
		textArea_3_1.setForeground(Color.WHITE);
		textArea_3_1.setFont(textArea.getFont().deriveFont(17f));
		textArea_3_1.setFont(new Font("Cambria", Font.PLAIN, 17));
		textArea_3_1.setFocusable(false);
		textArea_3_1.setBorder(null);
		textArea_3_1.setBackground(new Color(17, 20, 137));
		textArea_3_1.setBounds(661, 56, 114, 41);
		panel_5_1.add(textArea_3_1);
		
		JTextArea textArea_4_1 = new JTextArea("Venue of Event");
		textArea_4_1.setForeground(Color.WHITE);
		textArea_4_1.setFont(textArea.getFont().deriveFont(17f));
		textArea_4_1.setFont(new Font("Cambria", Font.PLAIN, 17));
		textArea_4_1.setFocusable(false);
		textArea_4_1.setBorder(null);
		textArea_4_1.setBackground(new Color(17, 20, 137));
		textArea_4_1.setBounds(152, 109, 499, 26);
		panel_5_1.add(textArea_4_1);
		
		JButton btnNewButton_9_1 = new JButton("Register");
		btnNewButton_9_1.setForeground(Color.WHITE);
		btnNewButton_9_1.setBorderPainted(false);
		btnNewButton_9_1.setFocusPainted(false);
		btnNewButton_9_1.setSelected(true);
		btnNewButton_9_1.setFont(new Font("Calibri", Font.PLAIN, 17));
		btnNewButton_9_1.setBorder(null);
		btnNewButton_9_1.setBackground(new Color(17, 20, 137));
		btnNewButton_9_1.setActionCommand("Register");
		btnNewButton_9_1.setBounds(661, 101, 114, 34);
		panel_5_1.add(btnNewButton_9_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(965, 6, 17, 297);
		scrollPane.add(scrollBar);
		
		
		JButton btnNewButton = new RoundButton("Club Info");
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton.setFocusPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					layeredPane.removeAll();
					layeredPane.add(ClubInfo);
					layeredPane.repaint();
					layeredPane.revalidate();
				}
			});
		btnNewButton.setBounds(10, 196, 171, 43);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1_0 = new RoundButton("Announcements");
		btnNewButton_1_0.setForeground(new Color(255, 255, 255));
		btnNewButton_1_0.setBorder(null);
		btnNewButton_1_0.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_1_0.setBackground(Color.GRAY);
		btnNewButton_1_0.setFocusPainted(false);
		btnNewButton_1_0.setBounds(10, 249, 171, 43);
		panel_1.add(btnNewButton_1_0);
		btnNewButton_1_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Announcem);
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
				layeredPane.add(GroupInfo);
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
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				layeredPane.removeAll();
				layeredPane.add(Upcoming);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		panel_1.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new RoundButton("Your Profile");
		btnNewButton_1_5.setForeground(new Color(255, 255, 255));
		btnNewButton_1_5.setBorder(null);
		btnNewButton_1_5.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_1_5.setBackground(Color.GRAY);
		btnNewButton_1_5.setFocusPainted(false);
		btnNewButton_1_5.setBounds(10, 514, 171, 43);
		panel_1.add(btnNewButton_1_5);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setText("");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setIcon(new ImageIcon("D:\\SEM 3\\shakti\\Downloads\\logo.png"));
		btnNewButton_1.setBounds(20, 20, 150, 155);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_4 = new RoundPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(25, 178, 1015, 57);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton_4_0 = new RoundButton1("New button");
		btnNewButton_4_0.setBorder(null);
		btnNewButton_4_0.setForeground(Color.WHITE);
		btnNewButton_4_0.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_4_0.setBackground(Color.GRAY);
		btnNewButton_4_0.setFocusPainted(false);
		btnNewButton_4_0.setBounds(20, 11, 130, 32);
		panel_4.add(btnNewButton_4_0);
		
		software.RoundButton1 btnNewButton_4_1 = new software.RoundButton1("New button");
		btnNewButton_4_1.setBorder(null);
		btnNewButton_4_1.setForeground(Color.WHITE);
		btnNewButton_4_1.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_4_1.setBackground(Color.GRAY);
		btnNewButton_4_1.setFocusPainted(false);
		btnNewButton_4_1.setBounds(168, 11, 130, 32);
		panel_4.add(btnNewButton_4_1);
		
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
		btnNewButton_4_2.setBounds(318, 11, 130, 32);
		panel_4.add(btnNewButton_4_2);
		
		software.RoundButton1 btnNewButton_4_3 = new software.RoundButton1("New button");
		btnNewButton_4_3.setBorder(null);
		btnNewButton_4_3.setForeground(Color.WHITE);
		btnNewButton_4_3.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_4_3.setBackground(Color.GRAY);
		btnNewButton_4_3.setFocusPainted(false);
		btnNewButton_4_3.setBounds(468, 11, 130, 32);
		panel_4.add(btnNewButton_4_3);
		
		software.RoundButton1 btnNewButton_4_4 = new software.RoundButton1("New button");
		btnNewButton_4_4.setBorder(null);
		btnNewButton_4_4.setForeground(Color.WHITE);
		btnNewButton_4_4.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_4_4.setBackground(Color.GRAY);
		btnNewButton_4_4.setFocusPainted(false);
		btnNewButton_4_4.setBounds(618, 11, 130, 32);
		panel_4.add(btnNewButton_4_4);
		
		software.RoundButton1 btnNewButton_4_5 = new software.RoundButton1("New button");
		btnNewButton_4_5.setBorder(null);
		btnNewButton_4_5.setForeground(Color.WHITE);
		btnNewButton_4_5.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_4_5.setBackground(Color.GRAY);
		btnNewButton_4_5.setFocusPainted(false);
		btnNewButton_4_5.setBounds(768, 11, 130, 32);
		panel_4.add(btnNewButton_4_5);
	}
}
