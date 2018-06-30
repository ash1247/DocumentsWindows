import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class LoginWindow {

	private JFrame frame;
	private JPasswordField passwordField;
	private JButton info;
	private UserDataManipulations data = new UserDataManipulations();
	protected static int radioModeButton = 0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindow window = new LoginWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				try {
				    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				        if ("Nimbus".equals(info.getName())) {
				            UIManager.setLookAndFeel(info.getClassName());
				            break;
				        }
				    }
				} catch (UnsupportedLookAndFeelException e) {
				    // handle exception
				} catch (ClassNotFoundException e) {
				    // handle exception
				} catch (InstantiationException e) {
				    // handle exception
				} catch (IllegalAccessException e) {
				    // handle exception
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Login");
		frame.setBounds(100, 100, 416, 381);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JRadioButton rdbtnPollMode = new JRadioButton("Poll Mode");
		rdbtnPollMode.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JRadioButton rdbtnElectionMode = new JRadioButton("Election Mode");
		rdbtnElectionMode.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		rdbtnPollMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if( rdbtnPollMode.isSelected() )
				{
					rdbtnElectionMode.setSelected(false);
					radioModeButton = 1;
				}
			}
		});
		
		rdbtnElectionMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if( rdbtnElectionMode.isSelected() )
				{
					rdbtnPollMode.setSelected(false);
					radioModeButton = 2;
				}
			}
		});
		
		JButton btnLogin = new JButton("Enter");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogin.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				if(!String.valueOf(passwordField.getPassword()).isEmpty() && !String.valueOf(passwordField.getPassword()).contains(" ") && (rdbtnPollMode.isSelected() || rdbtnElectionMode.isSelected() ))
				{				
					String password = String.valueOf(passwordField.getPassword());
					
					JOptionPane.showMessageDialog(btnLogin, "Please remember the Password.");
					
					data.saveUserData(password);
					data.writeUserFile();
					
					passwordField.setText("");
					
					WelcomeWindow welcomeWindow = new WelcomeWindow();
					welcomeWindow.setVisible(true);
					welcomeWindow.setResizable(false);
					frame.dispose();				
				}
				else if(String.valueOf(passwordField.getPassword()).contains(" "))
				{
					JOptionPane.showMessageDialog(btnLogin, "Enter a password without any spaces.", null, JOptionPane.WARNING_MESSAGE);
				}
				else if(String.valueOf(passwordField.getPassword()).isEmpty() )
				{
					JOptionPane.showMessageDialog(btnLogin, "Please type in password.", null, JOptionPane.WARNING_MESSAGE);
					passwordField.setText("");
				}
				else
				{
					JOptionPane.showMessageDialog(btnLogin, "Please select a mode to continue.", null, JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		info = new JButton("How to use");
		info.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				InfoWindow infoWindow = new InfoWindow();
				infoWindow.setVisible(true);
				infoWindow.setResizable(false);
			}
		});
		
		JButton btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				About about = new About();
				about.setResizable(false);
				about.setVisible(true);
			}
		});
		btnAbout.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblSelect = new JLabel("Please select an option below");
		lblSelect.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSelect.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblEquity = new JLabel("equity 2.0");
		lblEquity.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 28));
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(91)
							.addComponent(rdbtnPollMode)
							.addGap(18)
							.addComponent(rdbtnElectionMode))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(140)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
								.addComponent(info, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(76, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(78, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblSelect, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE))
					.addGap(77))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(166)
					.addComponent(btnAbout)
					.addContainerGap(172, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(166)
					.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(166, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(127)
					.addComponent(lblEquity, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(127, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(16)
					.addComponent(lblEquity)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblSelect, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnPollMode)
						.addComponent(rdbtnElectionMode))
					.addGap(18)
					.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(info, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAbout)
					.addGap(6))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
	

