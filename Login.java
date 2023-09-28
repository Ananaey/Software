package software;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class Login {

private JFrame loginsdm;
private JTextField tf1;
private JPasswordField tf2;

Connection sdm;

/**
 * Launch the application.
 */

public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {

try {
Login window = new Login();

    window.loginsdm.setVisible(true);

} catch (Exception e) {

e.printStackTrace();
}

}
});
}

/**
 * Create the application.
 */

public Login() {

 sdm = (Connection) DataBaseConnection.dbConn();

initialize();

}


/**
 * Initialize the contents of the frame.
 */

private void initialize() {

loginsdm = new JFrame();
loginsdm.getContentPane().setBackground(new Color(0, 0, 128));
loginsdm.setTitle("UniVibe\r\n");
loginsdm.setBounds(100, 110, 1198, 727);
loginsdm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
loginsdm.getContentPane().setLayout(null);


JPanel panel = new RoundPanel();
panel.setBackground(new Color(255, 255, 255));
panel.setBounds(141, 84, 912, 519);
loginsdm.getContentPane().add(panel);


JButton logo = new JButton("");
logo.setBounds(380, 33, 151, 155);
logo.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	}
});
panel.setLayout(null);
panel.add(logo);
logo.setIcon(new ImageIcon("D:\\SEM 3\\shakti\\Downloads\\logo.png"));
logo.setBorder(null);
logo.setBackground(Color.WHITE);


JButton b = new JButton("Submit");
b.setBounds(390, 386, 157, 41);
panel.add(b);
b.setFont(new Font("Cambria", Font.BOLD, 21));
b.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

String q = "SELECT * from login where username = ? and pass = ?";

try {
PreparedStatement ps = sdm.prepareStatement(q);
ps.setString(1, tf1.getText());
ps.setString(2, String.valueOf(tf2.getPassword()));

//unPrepared statement has prepared: "SELECT * from login where username = "roshni@123" and pass ="roshni";

ResultSet rs = ps.executeQuery();

if(rs.next()) {

JOptionPane.showMessageDialog(null,"Welcome!");

loginsdm.setVisible(false);
new MainProject().setVisible(true);
    
}

else {

JOptionPane.showMessageDialog(null, "Username / Password Invalid!");

}

} catch (SQLException e1) {

// TODO Auto-generated catch block

e1.printStackTrace();

}


}

});

b.setForeground(new Color(0, 0, 0));
b.setBackground(new Color(192, 192, 192));


JLabel lblEnterPassword = new JLabel("Password: ");
lblEnterPassword.setBounds(233, 316, 136, 33);
panel.add(lblEnterPassword);
lblEnterPassword.setFont(new Font("Cambria", Font.PLAIN, 21));
lblEnterPassword.setForeground(new Color(0, 0, 0));


JLabel lblNewLabel = new JLabel("Username: ");
lblNewLabel.setBounds(233, 239, 136, 41);
panel.add(lblNewLabel);
lblNewLabel.setFont(new Font("Cambria", Font.PLAIN, 21));
lblNewLabel.setForeground(new Color(0, 0, 0));


tf1 = new JTextField();
tf1.setBounds(350, 239, 265, 41);
panel.add(tf1);
tf1.setColumns(10);


tf2 = new JPasswordField();
tf2.setBounds(350, 308, 265, 41);
panel.add(tf2);

}

}