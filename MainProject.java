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
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ScrollPaneConstants;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Label;

public class MainProject extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
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
		
		JPanel ClubInfo = new RoundPanel();
		ClubInfo.setBackground(new Color(255, 255, 255));
		layeredPane.add(ClubInfo, "name_363395450215900");
		ClubInfo.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		ClubInfo.add(scrollPane_1);
		
		RoundPanel ClubInfo_1 = new RoundPanel();
		ClubInfo_1.setBorder(null);
		ClubInfo_1.setBackground(Color.WHITE);
		scrollPane_1.setViewportView(ClubInfo_1);
		
		ClubLogo btnNewButton_3_0_1 = new ClubLogo("New button");
		btnNewButton_3_0_1.setText("");
		btnNewButton_3_0_1.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_3_0_1.setBorder(null);
		btnNewButton_3_0_1.setBackground(new Color(17, 20, 137));
		
		RoundPanel panel_descr = new RoundPanel();
		panel_descr.setLayout(null);
		panel_descr.setBackground(new Color(17, 20, 137));
		
		JLabel lblClubName_1_1 = new JLabel(" Description of the Club");
		lblClubName_1_1.setIconTextGap(10);
		lblClubName_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblClubName_1_1.setForeground(Color.WHITE);
		lblClubName_1_1.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblClubName_1_1.setBounds(10, 10, 935, 205);
		panel_descr.add(lblClubName_1_1);
		
		SmallPanel eventhead = new SmallPanel();
		eventhead.setLayout(null);
		eventhead.setBackground(new Color(17, 20, 137));
		
		JLabel lblEventsOrganisedRecently = new JLabel("Events organised by the club recently");
		lblEventsOrganisedRecently.setHorizontalAlignment(SwingConstants.CENTER);
		lblEventsOrganisedRecently.setForeground(Color.WHITE);
		lblEventsOrganisedRecently.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblEventsOrganisedRecently.setBounds(10, 10, 539, 37);
		eventhead.add(lblEventsOrganisedRecently);
		
		SmallPanel eventhead_1_1_1 = new SmallPanel();
		eventhead_1_1_1.setLayout(null);
		eventhead_1_1_1.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblClubName_1_1_1 = new JLabel("Search for Other Clubs");
		lblClubName_1_1_1.setIconTextGap(10);
		lblClubName_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblClubName_1_1_1.setForeground(Color.WHITE);
		lblClubName_1_1_1.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblClubName_1_1_1.setBounds(562, -63, 390, 116);
		eventhead_1_1_1.add(lblClubName_1_1_1);
		
		JLabel lblEvent = new JLabel("List of Events");
		lblEvent.setHorizontalAlignment(SwingConstants.CENTER);
		lblEvent.setForeground(Color.WHITE);
		lblEvent.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblEvent.setBounds(0, 31, 549, 230);
		eventhead_1_1_1.add(lblEvent);
		
		SmallPanel eventhead_1 = new SmallPanel();
		eventhead_1.setLayout(null);
		eventhead_1.setBackground(new Color(17, 20, 137));
		
		JLabel lblNewLabel_8 = new JLabel("Search for Other Clubs");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblNewLabel_8.setBounds(10, 42, 374, 37);
		eventhead_1.add(lblNewLabel_8);
		
		SmallPanel eventhead_1_1 = new SmallPanel();
		eventhead_1_1.setLayout(null);
		eventhead_1_1.setBackground(new Color(17, 20, 137));
		
		JLabel lblAchievementsAndAccolades = new JLabel("Achievements and Accolades");
		lblAchievementsAndAccolades.setHorizontalAlignment(SwingConstants.CENTER);
		lblAchievementsAndAccolades.setForeground(Color.WHITE);
		lblAchievementsAndAccolades.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblAchievementsAndAccolades.setBounds(10, 39, 374, 37);
		eventhead_1_1.add(lblAchievementsAndAccolades);
		GroupLayout gl_ClubInfo_1 = new GroupLayout(ClubInfo_1);
		gl_ClubInfo_1.setHorizontalGroup(
			gl_ClubInfo_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 996, Short.MAX_VALUE)
				.addGroup(gl_ClubInfo_1.createSequentialGroup()
					.addGroup(gl_ClubInfo_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ClubInfo_1.createSequentialGroup()
							.addGap(408)
							.addComponent(btnNewButton_3_0_1, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_ClubInfo_1.createSequentialGroup()
							.addGap(10)
							.addComponent(panel_descr, GroupLayout.PREFERRED_SIZE, 965, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_ClubInfo_1.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_ClubInfo_1.createParallelGroup(Alignment.LEADING)
								.addComponent(eventhead, GroupLayout.PREFERRED_SIZE, 559, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_ClubInfo_1.createSequentialGroup()
									.addGap(10)
									.addComponent(eventhead_1_1_1, GroupLayout.PREFERRED_SIZE, 549, GroupLayout.PREFERRED_SIZE)))
							.addGap(12)
							.addGroup(gl_ClubInfo_1.createParallelGroup(Alignment.LEADING)
								.addComponent(eventhead_1, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)
								.addComponent(eventhead_1_1, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE))))
					.addGap(21))
		);
		gl_ClubInfo_1.setVerticalGroup(
			gl_ClubInfo_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 904, Short.MAX_VALUE)
				.addGroup(gl_ClubInfo_1.createSequentialGroup()
					.addGap(10)
					.addComponent(btnNewButton_3_0_1, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel_descr, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
					.addGap(73)
					.addGroup(gl_ClubInfo_1.createParallelGroup(Alignment.LEADING)
						.addComponent(eventhead, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_ClubInfo_1.createSequentialGroup()
							.addGap(63)
							.addComponent(eventhead_1_1_1, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_ClubInfo_1.createSequentialGroup()
							.addComponent(eventhead_1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(eventhead_1_1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))))
		);
		ClubInfo_1.setLayout(gl_ClubInfo_1);
		
		RoundPanel Announcem = new RoundPanel();
		Announcem.setForeground(Color.WHITE);
		Announcem.setBackground(Color.CYAN);
		layeredPane.add(Announcem, "name_363207062992400");
		Announcem.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		Announcem.add(scrollPane_2);
		
		RoundPanel Announcem_1 = new RoundPanel();
		Announcem_1.setBorder(null);
		Announcem_1.setBackground(Color.WHITE);
		scrollPane_2.setViewportView(Announcem_1);
		
		SmallPanel A1 = new SmallPanel();
		A1.setLayout(null);
		A1.setBackground(new Color(217, 217, 217));
		
		SmallPanel A1_2_1 = new SmallPanel();
		A1_2_1.setLayout(null);
		A1_2_1.setForeground(Color.WHITE);
		A1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		A1_2_1.setBackground(new Color(17, 20, 137));
		A1_2_1.setAlignmentX(1.0f);
		A1_2_1.setBounds(22, 13, 259, 210);
		A1.add(A1_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("Images");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(0, 0, 259, 210);
		A1_2_1.add(lblNewLabel_2);
		
		Label label_1_1_3 = new Label("Announcement 1");
		label_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1_1_3.setAlignment(Label.CENTER);
		label_1_1_3.setBounds(306, 13, 598, 210);
		A1.add(label_1_1_3);
		
		SmallPanel A1_1 = new SmallPanel();
		A1_1.setLayout(null);
		A1_1.setBackground(new Color(217, 217, 217));
		
		RoundPanel MemberInfo = new RoundPanel();
		MemberInfo.setBorder(null);
		MemberInfo.setBackground(Color.WHITE);
		MemberInfo.setBounds(-26, -581, 1015, 1283);
		A1_1.add(MemberInfo);
		
		RoundPanel panel_4_2_1_1 = new RoundPanel();
		panel_4_2_1_1.setLayout(null);
		panel_4_2_1_1.setForeground(Color.WHITE);
		panel_4_2_1_1.setBackground(new Color(217, 217, 217));
		
		CircleButton2 btnNewButton_6_1_1 = new CircleButton2("");
		btnNewButton_6_1_1.setText("");
		btnNewButton_6_1_1.setSelected(true);
		btnNewButton_6_1_1.setFocusPainted(false);
		btnNewButton_6_1_1.setBorderPainted(false);
		btnNewButton_6_1_1.setBorder(null);
		btnNewButton_6_1_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_6_1_1.setBounds(23, 5, 23, 23);
		panel_4_2_1_1.add(btnNewButton_6_1_1);
		
		textField_1 = new JTextField("Search by Name/Registration No.");
		textField_1.setForeground(new Color(102, 102, 102));
		textField_1.setFont(new Font("Calibri", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(new Color(217, 217, 217));
		textField_1.setBounds(56, 5, 899, 23);
		panel_4_2_1_1.add(textField_1);
		
		CircleButton2 btnNewButton_7_1_1 = new CircleButton2("");
		btnNewButton_7_1_1.setText("");
		btnNewButton_7_1_1.setSelected(true);
		btnNewButton_7_1_1.setFocusPainted(false);
		btnNewButton_7_1_1.setBorderPainted(false);
		btnNewButton_7_1_1.setBorder(null);
		btnNewButton_7_1_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_7_1_1.setBounds(954, 4, 23, 23);
		panel_4_2_1_1.add(btnNewButton_7_1_1);
		
		SmallPanel A1_7 = new SmallPanel();
		A1_7.setLayout(null);
		A1_7.setBackground(new Color(217, 217, 217));
		
		SmallPanel A1_2_7 = new SmallPanel();
		A1_2_7.setLayout(null);
		A1_2_7.setBackground(new Color(17, 20, 137));
		A1_2_7.setBounds(62, 8, 227, 40);
		A1_7.add(A1_2_7);
		
		JLabel lblNewLabel_6 = new JLabel("Member Name");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(10, 0, 195, 40);
		A1_2_7.add(lblNewLabel_6);
		
		SmallPanel A1_2_1_7 = new SmallPanel();
		A1_2_1_7.setLayout(null);
		A1_2_1_7.setBackground(new Color(17, 20, 137));
		A1_2_1_7.setBounds(554, 8, 207, 40);
		A1_7.add(A1_2_1_7);
		
		JLabel lblRegistrationNo = new JLabel("Registration No.");
		lblRegistrationNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo.setForeground(Color.WHITE);
		lblRegistrationNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationNo.setBounds(10, 0, 195, 40);
		A1_2_1_7.add(lblRegistrationNo);
		
		SmallPanel A1_2_1_1_6 = new SmallPanel();
		A1_2_1_1_6.setLayout(null);
		A1_2_1_1_6.setBackground(new Color(17, 20, 137));
		A1_2_1_1_6.setBounds(765, 8, 175, 40);
		A1_7.add(A1_2_1_1_6);
		
		JLabel lblRegistrationNo_1 = new JLabel("Time Table");
		lblRegistrationNo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo_1.setForeground(Color.WHITE);
		lblRegistrationNo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationNo_1.setBounds(0, 0, 175, 40);
		A1_2_1_1_6.add(lblRegistrationNo_1);
		
		JLabel lblClubRole = new JLabel("Club Role");
		lblClubRole.setHorizontalAlignment(SwingConstants.CENTER);
		lblClubRole.setForeground(Color.DARK_GRAY);
		lblClubRole.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblClubRole.setBounds(316, 8, 207, 40);
		A1_7.add(lblClubRole);
		
		SmallPanel A1_1_2 = new SmallPanel();
		A1_1_2.setLayout(null);
		A1_1_2.setBackground(new Color(217, 217, 217));
		
		SmallPanel A1_2_2_2 = new SmallPanel();
		A1_2_2_2.setLayout(null);
		A1_2_2_2.setBackground(new Color(17, 20, 137));
		A1_2_2_2.setBounds(62, 8, 227, 40);
		A1_1_2.add(A1_2_2_2);
		
		JLabel lblNewLabel_1_4 = new JLabel("Member Name");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_4.setBounds(10, 0, 195, 40);
		A1_2_2_2.add(lblNewLabel_1_4);
		
		SmallPanel A1_2_1_2_1 = new SmallPanel();
		A1_2_1_2_1.setLayout(null);
		A1_2_1_2_1.setBackground(new Color(17, 20, 137));
		A1_2_1_2_1.setBounds(554, 8, 207, 40);
		A1_1_2.add(A1_2_1_2_1);
		
		JLabel lblRegistrationNo_2 = new JLabel("Registration No.");
		lblRegistrationNo_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo_2.setForeground(Color.WHITE);
		lblRegistrationNo_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationNo_2.setBounds(10, 0, 195, 40);
		A1_2_1_2_1.add(lblRegistrationNo_2);
		
		SmallPanel A1_2_1_1_1_2 = new SmallPanel();
		A1_2_1_1_1_2.setLayout(null);
		A1_2_1_1_1_2.setBackground(new Color(17, 20, 137));
		A1_2_1_1_1_2.setBounds(765, 8, 175, 40);
		A1_1_2.add(A1_2_1_1_1_2);
		
		JLabel lblRegistrationNo_1_1 = new JLabel("Time Table");
		lblRegistrationNo_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo_1_1.setForeground(Color.WHITE);
		lblRegistrationNo_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationNo_1_1.setBounds(0, 0, 175, 40);
		A1_2_1_1_1_2.add(lblRegistrationNo_1_1);
		
		JLabel lblClubRole_1 = new JLabel("Club Role");
		lblClubRole_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblClubRole_1.setForeground(Color.DARK_GRAY);
		lblClubRole_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblClubRole_1.setBounds(316, 8, 207, 40);
		A1_1_2.add(lblClubRole_1);
		
		SmallPanel A1_3_2 = new SmallPanel();
		A1_3_2.setLayout(null);
		A1_3_2.setBackground(new Color(217, 217, 217));
		
		SmallPanel A1_2_3 = new SmallPanel();
		A1_2_3.setLayout(null);
		A1_2_3.setBackground(new Color(17, 20, 137));
		A1_2_3.setBounds(62, 8, 227, 40);
		A1_3_2.add(A1_2_3);
		
		JLabel lblNewLabel_2_2 = new JLabel("Member Name");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2.setBounds(10, 0, 195, 40);
		A1_2_3.add(lblNewLabel_2_2);
		
		SmallPanel A1_2_1_3 = new SmallPanel();
		A1_2_1_3.setLayout(null);
		A1_2_1_3.setBackground(new Color(17, 20, 137));
		A1_2_1_3.setBounds(554, 8, 207, 40);
		A1_3_2.add(A1_2_1_3);
		
		JLabel lblRegistrationNo_3 = new JLabel("Registration No.");
		lblRegistrationNo_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo_3.setForeground(Color.WHITE);
		lblRegistrationNo_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationNo_3.setBounds(10, 0, 195, 40);
		A1_2_1_3.add(lblRegistrationNo_3);
		
		SmallPanel A1_2_1_1_2 = new SmallPanel();
		A1_2_1_1_2.setLayout(null);
		A1_2_1_1_2.setBackground(new Color(17, 20, 137));
		A1_2_1_1_2.setBounds(765, 8, 175, 40);
		A1_3_2.add(A1_2_1_1_2);
		
		JLabel lblRegistrationNo_1_2 = new JLabel("Time Table");
		lblRegistrationNo_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo_1_2.setForeground(Color.WHITE);
		lblRegistrationNo_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationNo_1_2.setBounds(0, 0, 175, 40);
		A1_2_1_1_2.add(lblRegistrationNo_1_2);
		
		JLabel lblClubRole_2 = new JLabel("Club Role");
		lblClubRole_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblClubRole_2.setForeground(Color.DARK_GRAY);
		lblClubRole_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblClubRole_2.setBounds(316, 8, 207, 40);
		A1_3_2.add(lblClubRole_2);
		
		SmallPanel A1_4_2 = new SmallPanel();
		A1_4_2.setLayout(null);
		A1_4_2.setBackground(new Color(217, 217, 217));
		
		SmallPanel A1_2_4 = new SmallPanel();
		A1_2_4.setLayout(null);
		A1_2_4.setBackground(new Color(17, 20, 137));
		A1_2_4.setBounds(62, 8, 227, 40);
		A1_4_2.add(A1_2_4);
		
		JLabel lblNewLabel_3 = new JLabel("Member Name");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 0, 195, 40);
		A1_2_4.add(lblNewLabel_3);
		
		SmallPanel A1_2_1_4 = new SmallPanel();
		A1_2_1_4.setLayout(null);
		A1_2_1_4.setBackground(new Color(17, 20, 137));
		A1_2_1_4.setBounds(554, 8, 207, 40);
		A1_4_2.add(A1_2_1_4);
		
		JLabel lblRegistrationNo_4 = new JLabel("Registration No.");
		lblRegistrationNo_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo_4.setForeground(Color.WHITE);
		lblRegistrationNo_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationNo_4.setBounds(10, 0, 195, 40);
		A1_2_1_4.add(lblRegistrationNo_4);
		
		SmallPanel A1_2_1_1_3 = new SmallPanel();
		A1_2_1_1_3.setLayout(null);
		A1_2_1_1_3.setBackground(new Color(17, 20, 137));
		A1_2_1_1_3.setBounds(765, 8, 175, 40);
		A1_4_2.add(A1_2_1_1_3);
		
		JLabel lblRegistrationNo_1_3 = new JLabel("Time Table");
		lblRegistrationNo_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo_1_3.setForeground(Color.WHITE);
		lblRegistrationNo_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationNo_1_3.setBounds(0, 0, 175, 40);
		A1_2_1_1_3.add(lblRegistrationNo_1_3);
		
		JLabel lblClubRole_3 = new JLabel("Club Role");
		lblClubRole_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblClubRole_3.setForeground(Color.DARK_GRAY);
		lblClubRole_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblClubRole_3.setBounds(316, 8, 207, 40);
		A1_4_2.add(lblClubRole_3);
		
		SmallPanel A1_5 = new SmallPanel();
		A1_5.setLayout(null);
		A1_5.setBackground(new Color(217, 217, 217));
		
		SmallPanel A1_2_5 = new SmallPanel();
		A1_2_5.setLayout(null);
		A1_2_5.setBackground(new Color(17, 20, 137));
		A1_2_5.setBounds(62, 8, 227, 40);
		A1_5.add(A1_2_5);
		
		JLabel lblNewLabel_4 = new JLabel("Member Name");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(10, 0, 195, 40);
		A1_2_5.add(lblNewLabel_4);
		
		SmallPanel A1_2_1_5 = new SmallPanel();
		A1_2_1_5.setLayout(null);
		A1_2_1_5.setBackground(new Color(17, 20, 137));
		A1_2_1_5.setBounds(554, 8, 207, 40);
		A1_5.add(A1_2_1_5);
		
		JLabel lblRegistrationNo_5 = new JLabel("Registration No.");
		lblRegistrationNo_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo_5.setForeground(Color.WHITE);
		lblRegistrationNo_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationNo_5.setBounds(10, 0, 195, 40);
		A1_2_1_5.add(lblRegistrationNo_5);
		
		SmallPanel A1_2_1_1_4 = new SmallPanel();
		A1_2_1_1_4.setLayout(null);
		A1_2_1_1_4.setBackground(new Color(17, 20, 137));
		A1_2_1_1_4.setBounds(765, 8, 175, 40);
		A1_5.add(A1_2_1_1_4);
		
		JLabel lblRegistrationNo_1_4 = new JLabel("Time Table");
		lblRegistrationNo_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo_1_4.setForeground(Color.WHITE);
		lblRegistrationNo_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationNo_1_4.setBounds(0, 0, 175, 40);
		A1_2_1_1_4.add(lblRegistrationNo_1_4);
		
		JLabel lblClubRole_4 = new JLabel("Club Role");
		lblClubRole_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblClubRole_4.setForeground(Color.DARK_GRAY);
		lblClubRole_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblClubRole_4.setBounds(316, 8, 207, 40);
		A1_5.add(lblClubRole_4);
		
		SmallPanel A1_2 = new SmallPanel();
		A1_2.setLayout(null);
		A1_2.setBackground(new Color(217, 217, 217));
		
		SmallPanel A1_2_1_2_3 = new SmallPanel();
		A1_2_1_2_3.setLayout(null);
		A1_2_1_2_3.setBackground(new Color(17, 20, 137));
		A1_2_1_2_3.setBounds(22, 13, 259, 210);
		A1_2.add(A1_2_1_2_3);
		
		JLabel lblNewLabel_1_6 = new JLabel("Images");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setForeground(Color.WHITE);
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_6.setBounds(0, 0, 259, 210);
		A1_2_1_2_3.add(lblNewLabel_1_6);
		
		Label label_1_1_2 = new Label("Announcement 2");
		label_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1_1_2.setAlignment(Label.CENTER);
		label_1_1_2.setBounds(297, 13, 598, 210);
		A1_2.add(label_1_1_2);
		
		SmallPanel A1_6 = new SmallPanel();
		A1_6.setLayout(null);
		A1_6.setBackground(new Color(217, 217, 217));
		
		SmallPanel A1_2_6 = new SmallPanel();
		A1_2_6.setLayout(null);
		A1_2_6.setBackground(new Color(17, 20, 137));
		A1_2_6.setBounds(62, 8, 227, 40);
		A1_6.add(A1_2_6);
		
		JLabel lblNewLabel_5 = new JLabel("Member Name");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(10, 0, 195, 40);
		A1_2_6.add(lblNewLabel_5);
		
		SmallPanel A1_2_1_6 = new SmallPanel();
		A1_2_1_6.setLayout(null);
		A1_2_1_6.setBackground(new Color(17, 20, 137));
		A1_2_1_6.setBounds(554, 8, 207, 40);
		A1_6.add(A1_2_1_6);
		
		JLabel lblRegistrationNo_6 = new JLabel("Registration No.");
		lblRegistrationNo_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo_6.setForeground(Color.WHITE);
		lblRegistrationNo_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationNo_6.setBounds(10, 0, 195, 40);
		A1_2_1_6.add(lblRegistrationNo_6);
		
		SmallPanel A1_2_1_1_5 = new SmallPanel();
		A1_2_1_1_5.setLayout(null);
		A1_2_1_1_5.setBackground(new Color(17, 20, 137));
		A1_2_1_1_5.setBounds(765, 8, 175, 40);
		A1_6.add(A1_2_1_1_5);
		
		JLabel lblRegistrationNo_1_5 = new JLabel("Time Table");
		lblRegistrationNo_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo_1_5.setForeground(Color.WHITE);
		lblRegistrationNo_1_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationNo_1_5.setBounds(0, 0, 175, 40);
		A1_2_1_1_5.add(lblRegistrationNo_1_5);
		
		JLabel lblClubRole_5 = new JLabel("Club Role");
		lblClubRole_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblClubRole_5.setForeground(Color.DARK_GRAY);
		lblClubRole_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblClubRole_5.setBounds(316, 8, 207, 40);
		A1_6.add(lblClubRole_5);
		GroupLayout gl_MemberInfo = new GroupLayout(MemberInfo);
		gl_MemberInfo.setHorizontalGroup(
			gl_MemberInfo.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1015, Short.MAX_VALUE)
				.addGroup(gl_MemberInfo.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_MemberInfo.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_4_2_1_1, GroupLayout.PREFERRED_SIZE, 995, GroupLayout.PREFERRED_SIZE)
						.addComponent(A1_7, GroupLayout.PREFERRED_SIZE, 950, GroupLayout.PREFERRED_SIZE)
						.addComponent(A1_1_2, GroupLayout.PREFERRED_SIZE, 950, GroupLayout.PREFERRED_SIZE)
						.addComponent(A1_3_2, GroupLayout.PREFERRED_SIZE, 950, GroupLayout.PREFERRED_SIZE)
						.addComponent(A1_4_2, GroupLayout.PREFERRED_SIZE, 950, GroupLayout.PREFERRED_SIZE)
						.addComponent(A1_5, GroupLayout.PREFERRED_SIZE, 950, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_MemberInfo.createParallelGroup(Alignment.TRAILING)
							.addComponent(A1_2, GroupLayout.PREFERRED_SIZE, 930, GroupLayout.PREFERRED_SIZE)
							.addComponent(A1_6, GroupLayout.PREFERRED_SIZE, 950, GroupLayout.PREFERRED_SIZE))))
		);
		gl_MemberInfo.setVerticalGroup(
			gl_MemberInfo.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1283, Short.MAX_VALUE)
				.addGroup(gl_MemberInfo.createSequentialGroup()
					.addGap(27)
					.addComponent(panel_4_2_1_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(A1_7, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(A1_1_2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(A1_3_2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(A1_4_2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(A1_5, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(A1_6, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(66)
					.addComponent(A1_2, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(463, Short.MAX_VALUE))
		);
		MemberInfo.setLayout(gl_MemberInfo);
		
		RoundPanel panel_4_2_1 = new RoundPanel();
		panel_4_2_1.setLayout(null);
		panel_4_2_1.setForeground(Color.WHITE);
		panel_4_2_1.setBackground(new Color(217, 217, 217));
		
		CircleButton2 btnNewButton_6_1 = new CircleButton2("");
		btnNewButton_6_1.setText("");
		btnNewButton_6_1.setSelected(true);
		btnNewButton_6_1.setFocusPainted(false);
		btnNewButton_6_1.setBorderPainted(false);
		btnNewButton_6_1.setBorder(null);
		btnNewButton_6_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_6_1.setBounds(23, 5, 23, 23);
		panel_4_2_1.add(btnNewButton_6_1);
		
		textField_2 = new JTextField("Type Club name, Event Name, Venue, Time, Type of Event  to filter....");
		textField_2.setForeground(new Color(102, 102, 102));
		textField_2.setFont(new Font("Calibri", Font.BOLD, 13));
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBackground(new Color(217, 217, 217));
		textField_2.setBounds(56, 5, 899, 20);
		panel_4_2_1.add(textField_2);
		
		CircleButton2 btnNewButton_7_1 = new CircleButton2("");
		btnNewButton_7_1.setText("");
		btnNewButton_7_1.setSelected(true);
		btnNewButton_7_1.setFocusPainted(false);
		btnNewButton_7_1.setBorderPainted(false);
		btnNewButton_7_1.setBorder(null);
		btnNewButton_7_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_7_1.setBounds(954, 4, 23, 23);
		panel_4_2_1.add(btnNewButton_7_1);
		
		SmallPanel A1_2_8_1 = new SmallPanel();
		A1_2_8_1.setLayout(null);
		A1_2_8_1.setBackground(new Color(217, 217, 217));
		
		SmallPanel A1_2_1_2_3_1 = new SmallPanel();
		A1_2_1_2_3_1.setLayout(null);
		A1_2_1_2_3_1.setBackground(new Color(17, 20, 137));
		A1_2_1_2_3_1.setBounds(22, 13, 259, 210);
		A1_2_8_1.add(A1_2_1_2_3_1);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Images");
		lblNewLabel_1_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_3.setForeground(Color.WHITE);
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2_3.setBounds(0, 0, 259, 210);
		A1_2_1_2_3_1.add(lblNewLabel_1_2_3);
		
		Label label_1_1_1 = new Label("Announcement 4");
		label_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1_1_1.setAlignment(Label.CENTER);
		label_1_1_1.setBounds(305, 13, 598, 210);
		A1_2_8_1.add(label_1_1_1);
		
		SmallPanel A1_2_2_4 = new SmallPanel();
		A1_2_2_4.setLayout(null);
		A1_2_2_4.setBackground(new Color(217, 217, 217));
		
		SmallPanel A1_2_1_2_2_1 = new SmallPanel();
		A1_2_1_2_2_1.setLayout(null);
		A1_2_1_2_2_1.setBackground(new Color(17, 20, 137));
		A1_2_1_2_2_1.setBounds(22, 13, 259, 210);
		A1_2_2_4.add(A1_2_1_2_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Images");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(0, 0, 259, 210);
		A1_2_1_2_2_1.add(lblNewLabel_1_1_1);
		
		Label label_1_1 = new Label("Announcement 3");
		label_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1_1.setAlignment(Label.CENTER);
		label_1_1.setBounds(308, 13, 598, 210);
		A1_2_2_4.add(label_1_1);
		GroupLayout gl_Announcem_1 = new GroupLayout(Announcem_1);
		gl_Announcem_1.setHorizontalGroup(
			gl_Announcem_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1015, Short.MAX_VALUE)
				.addGroup(gl_Announcem_1.createSequentialGroup()
					.addGroup(gl_Announcem_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Announcem_1.createSequentialGroup()
							.addGap(30)
							.addComponent(A1, GroupLayout.PREFERRED_SIZE, 930, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Announcem_1.createSequentialGroup()
							.addGap(30)
							.addComponent(A1_1, GroupLayout.PREFERRED_SIZE, 930, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Announcem_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_4_2_1, GroupLayout.PREFERRED_SIZE, 987, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Announcem_1.createSequentialGroup()
							.addGap(38)
							.addGroup(gl_Announcem_1.createParallelGroup(Alignment.LEADING)
								.addComponent(A1_2_8_1, GroupLayout.PREFERRED_SIZE, 930, GroupLayout.PREFERRED_SIZE)
								.addComponent(A1_2_2_4, GroupLayout.PREFERRED_SIZE, 930, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		gl_Announcem_1.setVerticalGroup(
			gl_Announcem_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1347, Short.MAX_VALUE)
				.addGroup(gl_Announcem_1.createSequentialGroup()
					.addGap(27)
					.addComponent(panel_4_2_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(A1, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(A1_1, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(A1_2_2_4, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(A1_2_8_1, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
					.addGap(249))
		);
		Announcem_1.setLayout(gl_Announcem_1);
		
		JPanel GroupInfo = new RoundPanel();
		GroupInfo.setBackground(Color.RED);
		GroupInfo.setForeground(Color.BLACK);
		layeredPane.add(GroupInfo, "name_363291651301300");
		GroupInfo.setLayout(null);
		
		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1_1.setBounds(0, 0, 1015, 431);
		GroupInfo.add(scrollPane_1_1);
		
		RoundPanel GroupInfo_1 = new RoundPanel();
		GroupInfo_1.setBorder(null);
		GroupInfo_1.setBackground(Color.WHITE);
		scrollPane_1_1.setViewportView(GroupInfo_1);
		
		SmallPanel A1_4 = new SmallPanel();
		A1_4.setLayout(null);
		A1_4.setBackground(Color.GRAY);
		
		JLabel lblNewLabel_1 = new JLabel("Name of the Group");
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(22, 10, 294, 31);
		A1_4.add(lblNewLabel_1);
		
		SmallPanel A1_2_1_2 = new SmallPanel();
		A1_2_1_2.setLayout(null);
		A1_2_1_2.setBackground(Color.GRAY);
		
		JLabel lblNewLabel_1_2 = new JLabel("Media");
		lblNewLabel_1_2.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(10, 10, 192, 31);
		A1_2_1_2.add(lblNewLabel_1_2);
		
		SmallPanel A1_2_2 = new SmallPanel();
		A1_2_2.setLayout(null);
		A1_2_2.setBackground(Color.GRAY);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Links");
		lblNewLabel_1_2_1.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2_1.setBounds(10, 10, 192, 31);
		A1_2_2.add(lblNewLabel_1_2_1);
		
		SmallPanel A1_2_2_1 = new SmallPanel();
		A1_2_2_1.setLayout(null);
		A1_2_2_1.setBackground(Color.GRAY);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Docs");
		lblNewLabel_1_2_2.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2_2.setBounds(10, 10, 192, 31);
		A1_2_2_1.add(lblNewLabel_1_2_2);
		
		SmallPanel A1_3_1 = new SmallPanel();
		A1_3_1.setLayout(null);
		A1_3_1.setBackground(Color.GRAY);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Add Participants");
		lblNewLabel_1_3_1.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3_1.setBounds(10, 10, 294, 40);
		A1_3_1.add(lblNewLabel_1_3_1);
		
		SmallPanel A1_3_1_1 = new SmallPanel();
		A1_3_1_1.setLayout(null);
		A1_3_1_1.setBackground(Color.GRAY);
		
		JLabel lblNewLabel_1_3 = new JLabel("Remove Participants");
		lblNewLabel_1_3.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3.setBounds(10, 10, 294, 40);
		A1_3_1_1.add(lblNewLabel_1_3);
		
		SmallPanel A1_4_1 = new SmallPanel();
		A1_4_1.setLayout(null);
		A1_4_1.setBackground(Color.GRAY);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Create New Group");
		lblNewLabel_1_3_1_1.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_1_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3_1_1.setBounds(177, 0, 294, 50);
		A1_4_1.add(lblNewLabel_1_3_1_1);
		
		SmallPanel A1_2_1_1_1 = new SmallPanel();
		A1_2_1_1_1.setLayout(null);
		A1_2_1_1_1.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel_1_3_1_4 = new JLabel("Who can send messages?");
		lblNewLabel_1_3_1_4.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_1_3_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_3_1_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3_1_4.setBounds(0, 52, 317, 40);
		A1_2_1_1_1.add(lblNewLabel_1_3_1_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Admin Only");
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Anybody");
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Selected Members");
		rdbtnNewRadioButton_2.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel = new JLabel("Send Invites: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		SmallPanel A1_2_1_1_1_1 = new SmallPanel();
		A1_2_1_1_1_1.setLayout(null);
		A1_2_1_1_1_1.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel_1_3_1_3 = new JLabel("Comma seperated Reg. No.\r\n");
		lblNewLabel_1_3_1_3.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_1_3_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3_1_3.setBounds(0, 0, 249, 132);
		A1_2_1_1_1_1.add(lblNewLabel_1_3_1_3);
		
		JLabel lblOr = new JLabel("or");
		lblOr.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblUploadAnExcel = new JLabel("Upload an Excel file");
		lblUploadAnExcel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblEditGroupAdmins = new JLabel("Edit Group Admins: ");
		lblEditGroupAdmins.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		SmallPanel A1_4_1_1 = new SmallPanel();
		A1_4_1_1.setLayout(null);
		A1_4_1_1.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel_1_3_1_2 = new JLabel("Member List\r\n");
		lblNewLabel_1_3_1_2.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_1_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3_1_2.setBounds(89, 0, 294, 51);
		A1_4_1_1.add(lblNewLabel_1_3_1_2);
		
		SmallPanel A1_4_1_1_1 = new SmallPanel();
		A1_4_1_1_1.setLayout(null);
		A1_4_1_1_1.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblExitGroup = new JLabel("Exit Group ");
		lblExitGroup.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblExitGroup.setBounds(273, 0, 97, 42);
		A1_4_1_1_1.add(lblExitGroup);
		
		SmallPanel A1_1_1 = new SmallPanel();
		A1_1_1.setLayout(null);
		A1_1_1.setBackground(Color.GRAY);
		
		JLabel lblNewLabel_1_1 = new JLabel("Description");
		lblNewLabel_1_1.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(35, 10, 869, 134);
		A1_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_3_1_3_1 = new JLabel("");
		lblNewLabel_1_3_1_3_1.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_1_3_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GroupLayout gl_GroupInfo_1 = new GroupLayout(GroupInfo_1);
		gl_GroupInfo_1.setHorizontalGroup(
			gl_GroupInfo_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_GroupInfo_1.createSequentialGroup()
					.addGap(327)
					.addComponent(A1_4, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_GroupInfo_1.createSequentialGroup()
					.addGap(28)
					.addComponent(A1_1_1, GroupLayout.PREFERRED_SIZE, 939, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_GroupInfo_1.createSequentialGroup()
					.addGap(190)
					.addComponent(A1_2_1_2, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(A1_2_2, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(A1_2_2_1, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_GroupInfo_1.createSequentialGroup()
					.addGap(190)
					.addComponent(A1_3_1, GroupLayout.PREFERRED_SIZE, 322, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(A1_3_1_1, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_GroupInfo_1.createSequentialGroup()
					.addGap(190)
					.addComponent(A1_4_1, GroupLayout.PREFERRED_SIZE, 652, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_GroupInfo_1.createSequentialGroup()
					.addGap(238)
					.addComponent(A1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_GroupInfo_1.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnNewRadioButton_1, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnNewRadioButton_2, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_GroupInfo_1.createSequentialGroup()
					.addGap(190)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(A1_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
					.addGap(22)
					.addComponent(lblOr, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addGroup(gl_GroupInfo_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUploadAnExcel, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_GroupInfo_1.createSequentialGroup()
							.addGap(29)
							.addComponent(lblNewLabel_1_3_1_3_1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))))
				.addGroup(gl_GroupInfo_1.createSequentialGroup()
					.addGap(186)
					.addGroup(gl_GroupInfo_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_GroupInfo_1.createSequentialGroup()
							.addGap(171)
							.addComponent(A1_4_1_1, GroupLayout.PREFERRED_SIZE, 480, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblEditGroupAdmins, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_GroupInfo_1.createSequentialGroup()
					.addGap(190)
					.addComponent(A1_4_1_1_1, GroupLayout.PREFERRED_SIZE, 648, GroupLayout.PREFERRED_SIZE))
		);
		gl_GroupInfo_1.setVerticalGroup(
			gl_GroupInfo_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_GroupInfo_1.createSequentialGroup()
					.addGap(48)
					.addComponent(A1_4, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(A1_1_1, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addGroup(gl_GroupInfo_1.createParallelGroup(Alignment.LEADING)
						.addComponent(A1_2_1_2, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(A1_2_2, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(A1_2_2_1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_GroupInfo_1.createParallelGroup(Alignment.LEADING)
						.addComponent(A1_3_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(A1_3_1_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(A1_4_1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(58)
					.addGroup(gl_GroupInfo_1.createParallelGroup(Alignment.LEADING)
						.addComponent(A1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_GroupInfo_1.createSequentialGroup()
							.addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(rdbtnNewRadioButton_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(rdbtnNewRadioButton_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
					.addGap(29)
					.addGroup(gl_GroupInfo_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(A1_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_GroupInfo_1.createSequentialGroup()
							.addGap(45)
							.addComponent(lblOr, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_GroupInfo_1.createSequentialGroup()
							.addComponent(lblUploadAnExcel, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblNewLabel_1_3_1_3_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
					.addGap(23)
					.addGroup(gl_GroupInfo_1.createParallelGroup(Alignment.LEADING)
						.addComponent(A1_4_1_1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_GroupInfo_1.createSequentialGroup()
							.addGap(9)
							.addComponent(lblEditGroupAdmins, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
					.addGap(22)
					.addComponent(A1_4_1_1_1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
		);
		GroupInfo_1.setLayout(gl_GroupInfo_1);
		
		
		RoundPanel MembInfo = new RoundPanel();
		MembInfo.setBackground(Color.WHITE);
		layeredPane.add(MembInfo);
		MembInfo.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		MembInfo.add(scrollPane_3);
		
		RoundPanel MemberInfo_1 = new RoundPanel();
		MemberInfo_1.setBorder(null);
		MemberInfo_1.setBackground(Color.WHITE);
		scrollPane_3.setViewportView(MemberInfo_1);
		
		RoundPanel panel_4_2_1_2 = new RoundPanel();
		panel_4_2_1_2.setLayout(null);
		panel_4_2_1_2.setForeground(Color.WHITE);
		panel_4_2_1_2.setBackground(new Color(217, 217, 217));
		
		CircleButton2 btnNewButton_6_1_2 = new CircleButton2("");
		btnNewButton_6_1_2.setText("");
		btnNewButton_6_1_2.setSelected(true);
		btnNewButton_6_1_2.setFocusPainted(false);
		btnNewButton_6_1_2.setBorderPainted(false);
		btnNewButton_6_1_2.setBorder(null);
		btnNewButton_6_1_2.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_6_1_2.setBounds(23, 5, 23, 23);
		panel_4_2_1_2.add(btnNewButton_6_1_2);
		
		textField_3 = new JTextField("Search by Name/Registration No.");
		textField_3.setForeground(new Color(102, 102, 102));
		textField_3.setFont(new Font("Calibri", Font.BOLD, 15));
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBackground(new Color(217, 217, 217));
		textField_3.setBounds(56, 5, 899, 23);
		panel_4_2_1_2.add(textField_3);
		
		CircleButton2 btnNewButton_7_1_2 = new CircleButton2("");
		btnNewButton_7_1_2.setText("");
		btnNewButton_7_1_2.setSelected(true);
		btnNewButton_7_1_2.setFocusPainted(false);
		btnNewButton_7_1_2.setBorderPainted(false);
		btnNewButton_7_1_2.setBorder(null);
		btnNewButton_7_1_2.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_7_1_2.setBounds(954, 4, 23, 23);
		panel_4_2_1_2.add(btnNewButton_7_1_2);
		
		SmallPanel A1_8 = new SmallPanel();
		A1_8.setLayout(null);
		A1_8.setBackground(new Color(217, 217, 217));
		
		SmallPanel A1_2_8 = new SmallPanel();
		A1_2_8.setLayout(null);
		A1_2_8.setBackground(new Color(17, 20, 137));
		A1_2_8.setBounds(62, 8, 227, 40);
		A1_8.add(A1_2_8);
		
		JLabel lblNewLabel_7 = new JLabel("Member Name");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(10, 0, 195, 40);
		A1_2_8.add(lblNewLabel_7);
		
		SmallPanel A1_2_1_8 = new SmallPanel();
		A1_2_1_8.setLayout(null);
		A1_2_1_8.setBackground(new Color(17, 20, 137));
		A1_2_1_8.setBounds(554, 8, 207, 40);
		A1_8.add(A1_2_1_8);
		
		JLabel lblRegistrationNo_7 = new JLabel("Registration No.");
		lblRegistrationNo_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo_7.setForeground(Color.WHITE);
		lblRegistrationNo_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationNo_7.setBounds(10, 0, 195, 40);
		A1_2_1_8.add(lblRegistrationNo_7);
		
		SmallPanel A1_2_1_1_7 = new SmallPanel();
		A1_2_1_1_7.setLayout(null);
		A1_2_1_1_7.setBackground(new Color(17, 20, 137));
		A1_2_1_1_7.setBounds(765, 8, 175, 40);
		A1_8.add(A1_2_1_1_7);
		
		JLabel lblRegistrationNo_1_6 = new JLabel("Time Table");
		lblRegistrationNo_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo_1_6.setForeground(Color.WHITE);
		lblRegistrationNo_1_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationNo_1_6.setBounds(0, 0, 175, 40);
		A1_2_1_1_7.add(lblRegistrationNo_1_6);
		
		JLabel lblClubRole_6 = new JLabel("Club Role");
		lblClubRole_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblClubRole_6.setForeground(Color.DARK_GRAY);
		lblClubRole_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblClubRole_6.setBounds(316, 8, 207, 40);
		A1_8.add(lblClubRole_6);
		
		SmallPanel A1_1_3 = new SmallPanel();
		A1_1_3.setLayout(null);
		A1_1_3.setBackground(new Color(217, 217, 217));
		
		SmallPanel A1_2_2_3 = new SmallPanel();
		A1_2_2_3.setLayout(null);
		A1_2_2_3.setBackground(new Color(17, 20, 137));
		A1_2_2_3.setBounds(62, 8, 227, 40);
		A1_1_3.add(A1_2_2_3);
		
		JLabel lblNewLabel_1_5 = new JLabel("Member Name");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_5.setBounds(10, 0, 195, 40);
		A1_2_2_3.add(lblNewLabel_1_5);
		
		SmallPanel A1_2_1_2_2 = new SmallPanel();
		A1_2_1_2_2.setLayout(null);
		A1_2_1_2_2.setBackground(new Color(17, 20, 137));
		A1_2_1_2_2.setBounds(554, 8, 207, 40);
		A1_1_3.add(A1_2_1_2_2);
		
		JLabel lblRegistrationNo_2_1 = new JLabel("Registration No.");
		lblRegistrationNo_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo_2_1.setForeground(Color.WHITE);
		lblRegistrationNo_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationNo_2_1.setBounds(10, 0, 195, 40);
		A1_2_1_2_2.add(lblRegistrationNo_2_1);
		
		SmallPanel A1_2_1_1_1_3 = new SmallPanel();
		A1_2_1_1_1_3.setLayout(null);
		A1_2_1_1_1_3.setBackground(new Color(17, 20, 137));
		A1_2_1_1_1_3.setBounds(765, 8, 175, 40);
		A1_1_3.add(A1_2_1_1_1_3);
		
		JLabel lblRegistrationNo_1_1_1 = new JLabel("Time Table");
		lblRegistrationNo_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo_1_1_1.setForeground(Color.WHITE);
		lblRegistrationNo_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationNo_1_1_1.setBounds(0, 0, 175, 40);
		A1_2_1_1_1_3.add(lblRegistrationNo_1_1_1);
		
		JLabel lblClubRole_1_1 = new JLabel("Club Role");
		lblClubRole_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblClubRole_1_1.setForeground(Color.DARK_GRAY);
		lblClubRole_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblClubRole_1_1.setBounds(316, 8, 207, 40);
		A1_1_3.add(lblClubRole_1_1);
		
		SmallPanel A1_3_3 = new SmallPanel();
		A1_3_3.setLayout(null);
		A1_3_3.setBackground(new Color(217, 217, 217));
		
		SmallPanel A1_2_3_1 = new SmallPanel();
		A1_2_3_1.setLayout(null);
		A1_2_3_1.setBackground(new Color(17, 20, 137));
		A1_2_3_1.setBounds(62, 8, 227, 40);
		A1_3_3.add(A1_2_3_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Member Name");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(10, 0, 195, 40);
		A1_2_3_1.add(lblNewLabel_2_1);
		
		SmallPanel A1_2_1_3_1 = new SmallPanel();
		A1_2_1_3_1.setLayout(null);
		A1_2_1_3_1.setBackground(new Color(17, 20, 137));
		A1_2_1_3_1.setBounds(554, 8, 207, 40);
		A1_3_3.add(A1_2_1_3_1);
		
		JLabel lblRegistrationNo_3_1 = new JLabel("Registration No.");
		lblRegistrationNo_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo_3_1.setForeground(Color.WHITE);
		lblRegistrationNo_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationNo_3_1.setBounds(10, 0, 195, 40);
		A1_2_1_3_1.add(lblRegistrationNo_3_1);
		
		SmallPanel A1_2_1_1_2_1 = new SmallPanel();
		A1_2_1_1_2_1.setLayout(null);
		A1_2_1_1_2_1.setBackground(new Color(17, 20, 137));
		A1_2_1_1_2_1.setBounds(765, 8, 175, 40);
		A1_3_3.add(A1_2_1_1_2_1);
		
		JLabel lblRegistrationNo_1_2_1 = new JLabel("Time Table");
		lblRegistrationNo_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo_1_2_1.setForeground(Color.WHITE);
		lblRegistrationNo_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationNo_1_2_1.setBounds(0, 0, 175, 40);
		A1_2_1_1_2_1.add(lblRegistrationNo_1_2_1);
		
		JLabel lblClubRole_2_1 = new JLabel("Club Role");
		lblClubRole_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblClubRole_2_1.setForeground(Color.DARK_GRAY);
		lblClubRole_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblClubRole_2_1.setBounds(316, 8, 207, 40);
		A1_3_3.add(lblClubRole_2_1);
		
		SmallPanel A1_4_3 = new SmallPanel();
		A1_4_3.setLayout(null);
		A1_4_3.setBackground(new Color(217, 217, 217));
		
		SmallPanel A1_2_4_1 = new SmallPanel();
		A1_2_4_1.setLayout(null);
		A1_2_4_1.setBackground(new Color(17, 20, 137));
		A1_2_4_1.setBounds(62, 8, 227, 40);
		A1_4_3.add(A1_2_4_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Member Name");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(10, 0, 195, 40);
		A1_2_4_1.add(lblNewLabel_3_1);
		
		SmallPanel A1_2_1_4_1 = new SmallPanel();
		A1_2_1_4_1.setLayout(null);
		A1_2_1_4_1.setBackground(new Color(17, 20, 137));
		A1_2_1_4_1.setBounds(554, 8, 207, 40);
		A1_4_3.add(A1_2_1_4_1);
		
		JLabel lblRegistrationNo_4_1 = new JLabel("Registration No.");
		lblRegistrationNo_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo_4_1.setForeground(Color.WHITE);
		lblRegistrationNo_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationNo_4_1.setBounds(10, 0, 195, 40);
		A1_2_1_4_1.add(lblRegistrationNo_4_1);
		
		SmallPanel A1_2_1_1_3_1 = new SmallPanel();
		A1_2_1_1_3_1.setLayout(null);
		A1_2_1_1_3_1.setBackground(new Color(17, 20, 137));
		A1_2_1_1_3_1.setBounds(765, 8, 175, 40);
		A1_4_3.add(A1_2_1_1_3_1);
		
		JLabel lblRegistrationNo_1_3_1 = new JLabel("Time Table");
		lblRegistrationNo_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo_1_3_1.setForeground(Color.WHITE);
		lblRegistrationNo_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationNo_1_3_1.setBounds(0, 0, 175, 40);
		A1_2_1_1_3_1.add(lblRegistrationNo_1_3_1);
		
		JLabel lblClubRole_3_1 = new JLabel("Club Role");
		lblClubRole_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblClubRole_3_1.setForeground(Color.DARK_GRAY);
		lblClubRole_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblClubRole_3_1.setBounds(316, 8, 207, 40);
		A1_4_3.add(lblClubRole_3_1);
		
		SmallPanel A1_5_1 = new SmallPanel();
		A1_5_1.setLayout(null);
		A1_5_1.setBackground(new Color(217, 217, 217));
		
		SmallPanel A1_2_5_1 = new SmallPanel();
		A1_2_5_1.setLayout(null);
		A1_2_5_1.setBackground(new Color(17, 20, 137));
		A1_2_5_1.setBounds(62, 8, 227, 40);
		A1_5_1.add(A1_2_5_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Member Name");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_1.setBounds(10, 0, 195, 40);
		A1_2_5_1.add(lblNewLabel_4_1);
		
		SmallPanel A1_2_1_5_1 = new SmallPanel();
		A1_2_1_5_1.setLayout(null);
		A1_2_1_5_1.setBackground(new Color(17, 20, 137));
		A1_2_1_5_1.setBounds(554, 8, 207, 40);
		A1_5_1.add(A1_2_1_5_1);
		
		JLabel lblRegistrationNo_5_1 = new JLabel("Registration No.");
		lblRegistrationNo_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo_5_1.setForeground(Color.WHITE);
		lblRegistrationNo_5_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationNo_5_1.setBounds(10, 0, 195, 40);
		A1_2_1_5_1.add(lblRegistrationNo_5_1);
		
		SmallPanel A1_2_1_1_4_1 = new SmallPanel();
		A1_2_1_1_4_1.setLayout(null);
		A1_2_1_1_4_1.setBackground(new Color(17, 20, 137));
		A1_2_1_1_4_1.setBounds(765, 8, 175, 40);
		A1_5_1.add(A1_2_1_1_4_1);
		
		JLabel lblRegistrationNo_1_4_1 = new JLabel("Time Table");
		lblRegistrationNo_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo_1_4_1.setForeground(Color.WHITE);
		lblRegistrationNo_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationNo_1_4_1.setBounds(0, 0, 175, 40);
		A1_2_1_1_4_1.add(lblRegistrationNo_1_4_1);
		
		JLabel lblClubRole_4_1 = new JLabel("Club Role");
		lblClubRole_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblClubRole_4_1.setForeground(Color.DARK_GRAY);
		lblClubRole_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblClubRole_4_1.setBounds(316, 8, 207, 40);
		A1_5_1.add(lblClubRole_4_1);
		
		SmallPanel A1_6_1 = new SmallPanel();
		A1_6_1.setLayout(null);
		A1_6_1.setBackground(new Color(217, 217, 217));
		
		SmallPanel A1_2_6_1 = new SmallPanel();
		A1_2_6_1.setLayout(null);
		A1_2_6_1.setBackground(new Color(17, 20, 137));
		A1_2_6_1.setBounds(62, 8, 227, 40);
		A1_6_1.add(A1_2_6_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Member Name");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5_1.setBounds(10, 0, 195, 40);
		A1_2_6_1.add(lblNewLabel_5_1);
		
		SmallPanel A1_2_1_6_1 = new SmallPanel();
		A1_2_1_6_1.setLayout(null);
		A1_2_1_6_1.setBackground(new Color(17, 20, 137));
		A1_2_1_6_1.setBounds(554, 8, 207, 40);
		A1_6_1.add(A1_2_1_6_1);
		
		JLabel lblRegistrationNo_6_1 = new JLabel("Registration No.");
		lblRegistrationNo_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo_6_1.setForeground(Color.WHITE);
		lblRegistrationNo_6_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationNo_6_1.setBounds(10, 0, 195, 40);
		A1_2_1_6_1.add(lblRegistrationNo_6_1);
		
		SmallPanel A1_2_1_1_5_1 = new SmallPanel();
		A1_2_1_1_5_1.setLayout(null);
		A1_2_1_1_5_1.setBackground(new Color(17, 20, 137));
		A1_2_1_1_5_1.setBounds(765, 8, 175, 40);
		A1_6_1.add(A1_2_1_1_5_1);
		
		JLabel lblRegistrationNo_1_5_1 = new JLabel("Time Table");
		lblRegistrationNo_1_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo_1_5_1.setForeground(Color.WHITE);
		lblRegistrationNo_1_5_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationNo_1_5_1.setBounds(0, 0, 175, 40);
		A1_2_1_1_5_1.add(lblRegistrationNo_1_5_1);
		
		JLabel lblClubRole_5_1 = new JLabel("Club Role");
		lblClubRole_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblClubRole_5_1.setForeground(Color.DARK_GRAY);
		lblClubRole_5_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblClubRole_5_1.setBounds(316, 8, 207, 40);
		A1_6_1.add(lblClubRole_5_1);
		
		SmallPanel A1_6_1_1 = new SmallPanel();
		A1_6_1_1.setLayout(null);
		A1_6_1_1.setBackground(new Color(217, 217, 217));
		
		SmallPanel A1_2_6_1_1 = new SmallPanel();
		A1_2_6_1_1.setLayout(null);
		A1_2_6_1_1.setBackground(new Color(17, 20, 137));
		A1_2_6_1_1.setBounds(62, 8, 227, 40);
		A1_6_1_1.add(A1_2_6_1_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Member Name");
		lblNewLabel_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5_1_1.setBounds(10, 0, 195, 40);
		A1_2_6_1_1.add(lblNewLabel_5_1_1);
		
		SmallPanel A1_2_1_6_1_1 = new SmallPanel();
		A1_2_1_6_1_1.setLayout(null);
		A1_2_1_6_1_1.setBackground(new Color(17, 20, 137));
		A1_2_1_6_1_1.setBounds(554, 8, 207, 40);
		A1_6_1_1.add(A1_2_1_6_1_1);
		
		JLabel lblRegistrationNo_6_1_1 = new JLabel("Registration No.");
		lblRegistrationNo_6_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo_6_1_1.setForeground(Color.WHITE);
		lblRegistrationNo_6_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationNo_6_1_1.setBounds(10, 0, 195, 40);
		A1_2_1_6_1_1.add(lblRegistrationNo_6_1_1);
		
		SmallPanel A1_2_1_1_5_1_1 = new SmallPanel();
		A1_2_1_1_5_1_1.setLayout(null);
		A1_2_1_1_5_1_1.setBackground(new Color(17, 20, 137));
		A1_2_1_1_5_1_1.setBounds(765, 8, 175, 40);
		A1_6_1_1.add(A1_2_1_1_5_1_1);
		
		JLabel lblRegistrationNo_1_5_1_1 = new JLabel("Time Table");
		lblRegistrationNo_1_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo_1_5_1_1.setForeground(Color.WHITE);
		lblRegistrationNo_1_5_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationNo_1_5_1_1.setBounds(0, 0, 175, 40);
		A1_2_1_1_5_1_1.add(lblRegistrationNo_1_5_1_1);
		
		JLabel lblClubRole_5_1_1 = new JLabel("Club Role");
		lblClubRole_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblClubRole_5_1_1.setForeground(Color.DARK_GRAY);
		lblClubRole_5_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblClubRole_5_1_1.setBounds(316, 8, 207, 40);
		A1_6_1_1.add(lblClubRole_5_1_1);
		GroupLayout gl_MemberInfo_1 = new GroupLayout(MemberInfo_1);
		gl_MemberInfo_1.setHorizontalGroup(
			gl_MemberInfo_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1015, Short.MAX_VALUE)
				.addGap(0, 1015, Short.MAX_VALUE)
				.addGap(0, 1015, Short.MAX_VALUE)
				.addGroup(gl_MemberInfo_1.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_MemberInfo_1.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_4_2_1_2, GroupLayout.PREFERRED_SIZE, 995, GroupLayout.PREFERRED_SIZE)
						.addComponent(A1_8, GroupLayout.PREFERRED_SIZE, 950, GroupLayout.PREFERRED_SIZE)
						.addComponent(A1_1_3, GroupLayout.PREFERRED_SIZE, 950, GroupLayout.PREFERRED_SIZE)
						.addComponent(A1_3_3, GroupLayout.PREFERRED_SIZE, 950, GroupLayout.PREFERRED_SIZE)
						.addComponent(A1_4_3, GroupLayout.PREFERRED_SIZE, 950, GroupLayout.PREFERRED_SIZE)
						.addComponent(A1_5_1, GroupLayout.PREFERRED_SIZE, 950, GroupLayout.PREFERRED_SIZE)
						.addComponent(A1_6_1, GroupLayout.PREFERRED_SIZE, 950, GroupLayout.PREFERRED_SIZE)
						.addComponent(A1_6_1_1, GroupLayout.PREFERRED_SIZE, 950, GroupLayout.PREFERRED_SIZE)))
		);
		gl_MemberInfo_1.setVerticalGroup(
			gl_MemberInfo_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1283, Short.MAX_VALUE)
				.addGap(0, 1283, Short.MAX_VALUE)
				.addGap(0, 1283, Short.MAX_VALUE)
				.addGroup(gl_MemberInfo_1.createSequentialGroup()
					.addGap(27)
					.addComponent(panel_4_2_1_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(A1_8, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(A1_1_3, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(A1_3_3, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(A1_4_3, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(A1_5_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(A1_6_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(A1_6_1_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
		);
		MemberInfo_1.setLayout(gl_MemberInfo_1);
		
		
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
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				layeredPane.removeAll();
				layeredPane.add(MembInfo);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
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
		panel_4.setBounds(35, 178, 1015, 57);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		CircleButton btnNewButton_next = new CircleButton("-->");
		btnNewButton_next.setSelected(true);
		btnNewButton_next.setForeground(Color.WHITE);
		btnNewButton_next.setFont(new Font("Cambria", Font.BOLD, 17));
		btnNewButton_next.setFocusPainted(false);
		btnNewButton_next.setBorder(null);
		btnNewButton_next.setBackground(Color.GRAY);
		btnNewButton_next.setBounds(930, 10, 36, 32);
		panel_4.add(btnNewButton_next);
		
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
