package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class admin extends JFrame {

	private JPanel contentPane;
	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rs=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin frame = new admin();
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
	public admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblWelcomeAdmin = new JLabel("WELCOME ADMIN");
		
		JButton btnViewBids = new JButton("View Bids");
		btnViewBids.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					//String query="SELECT * FROM USER";
					Statement stmt = con.createStatement();
			         ResultSet rs = stmt.executeQuery("SELECT * FROM auction");
					con=DriverManager.getConnection(
							"jdbc:mysql://localhost:3306/proj","root","h080400984");			
					rs=pst.executeQuery();
					if(rs.next()){
						
				         System.out.println("itemno name cost");
				         
				         while (rs.next()) {
				       
				            String name = rs.getString("itemno");
				            String pass = rs.getString("name");
				            String cost=rs.getString(3);
				            System.out.println(name+pass);
				
					}
					}
					else
						JOptionPane.showMessageDialog(null, "No content");
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null,ex.getMessage());
				}
			}
		});
		
		JButton btnViewUsers = new JButton("View USERS");
		btnViewUsers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					//String query="SELECT * FROM USER";
					Statement stmt = con.createStatement();
			         ResultSet rs = stmt.executeQuery("SELECT * FROM user");
					con=DriverManager.getConnection(
							"jdbc:mysql://localhost:3306/proj","root","h080400984");			
					rs=pst.executeQuery();
					if(rs.next()){
						
				         System.out.println("id pass");
				         
				         while (rs.next()) {
				       
				            String name = rs.getString("username");
				            String pass = rs.getString("password");
				            System.out.println(name+pass);
				
					}
					}
					else
						JOptionPane.showMessageDialog(null, "No content");
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null,ex.getMessage());
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(65)
					.addComponent(btnViewUsers)
					.addPreferredGap(ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
					.addComponent(btnViewBids)
					.addGap(83))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(213, Short.MAX_VALUE)
					.addComponent(lblWelcomeAdmin)
					.addGap(210))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblWelcomeAdmin)
					.addGap(96)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnViewBids)
						.addComponent(btnViewUsers))
					.addContainerGap(155, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
