import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class AuthenticationVoters extends JDialog {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserFileOperation operation = new UserFileOperation("Voters");
	private ArrayList<String> voterList = new ArrayList<String>();
	private ArrayList<String> removedList = new ArrayList<String>();
	private JPasswordField passwordField;
	private int size;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AuthenticationVoters dialog = new AuthenticationVoters();
			dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AuthenticationVoters() {
		setBounds(100, 100, 453, 315);
		setTitle("Login (Voters)");
		JLabel lblPleaseEnterYour = new JLabel("Please Enter Your Voter ID To Vote");
		lblPleaseEnterYour.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseEnterYour.setFont(new Font("Tahoma", Font.BOLD, 21));
		
		voterList = operation.getVoters();
		
		size = voterList.size();
		JLabel lblVotersRemaining = new JLabel("             Voters remaining : " + size);
		lblVotersRemaining.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		
	
		JButton btnCheckYourId = new JButton("Check Your ID");
		btnCheckYourId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ID = String.valueOf( passwordField.getPassword() );
				
				if( voterList.contains( ID ) ) 
				{
					JOptionPane.showMessageDialog(AuthenticationVoters.this, "Your ID is Valid.", null, JOptionPane.INFORMATION_MESSAGE);
					
				}
				else if ( ID.isEmpty() )
				{
					JOptionPane.showMessageDialog(AuthenticationVoters.this, "Please Enter Your ID.", null, JOptionPane.WARNING_MESSAGE);
				}
				else if( removedList.contains( ID ) )
				{
					JOptionPane.showMessageDialog(AuthenticationVoters.this, "You already voted!!", null, JOptionPane.WARNING_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(AuthenticationVoters.this, "Your ID is not available Or Check For Mistakes.", null, JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		btnCheckYourId.setFont(new Font("Tahoma", Font.PLAIN, 19));
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ID = String.valueOf( passwordField.getPassword() );
				if( voterList.contains( ID ) )  
				{	
					JOptionPane.showMessageDialog(AuthenticationVoters.this, "Login Succeeded.", null, JOptionPane.INFORMATION_MESSAGE);
					size = size - 1;
					lblVotersRemaining.setText("             Voters remaining : " + size );
					
					if( size == 0 )
					{
						lblVotersRemaining.setText("    All the Voters finished their voting.\n");
					}
					
					voterList.remove( ID );
					removedList.add( ID );
					
					passwordField.setText("");
					
					Voting voting = new Voting();
					voting.setVisible(true);
					voting.setResizable(false);
				}
				
				else if ( ID.isEmpty() )
				{
					JOptionPane.showMessageDialog(AuthenticationVoters.this, "Please Enter Your ID.", null, JOptionPane.WARNING_MESSAGE);
				}
				else if( removedList.contains( ID ) )
				{
					JOptionPane.showMessageDialog(AuthenticationVoters.this, "You already voted!!", null, JOptionPane.WARNING_MESSAGE);
				}
				else
				{   
					JOptionPane.showMessageDialog(AuthenticationVoters.this, "Your ID is not available Or Check For Mistakes.\n", null, JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 19));
		
		JButton btnStopVoting = new JButton("Stop Voting!!!");
		btnStopVoting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				UserFileOperation operation = new UserFileOperation("Admin");
				
				String password = operation.getUserPassword();

			
				String message = JOptionPane.showInputDialog(AuthenticationVoters.this,"Enter your Password.");
				
				if ((message != null) && (message.length() > 0) ) {
				
					if(message.equals(password) )
					{
						JOptionPane.showMessageDialog(AuthenticationVoters.this, "Voting has been stopped");
						ResultWindow result = new ResultWindow();
						result.setVisible(true);
						result.setResizable(false);
						dispose();
						
					}
					
					else
					{
						JOptionPane.showMessageDialog(AuthenticationVoters.this, "Password did not match");
					}
				}	
				else
				{
					JOptionPane.showMessageDialog(AuthenticationVoters.this, "Please enter the Password to stop voting.");
				}
			}
		});
		btnStopVoting.setFont(new Font("Tahoma", Font.PLAIN, 19));
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 19));
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(37, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
								.addComponent(btnStopVoting)
								.addGap(143))
							.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblPleaseEnterYour)
									.addComponent(passwordField, 367, 367, 367)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(btnCheckYourId)
										.addGap(18)
										.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
										.addGap(22)))
								.addGap(31)))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(lblVotersRemaining, GroupLayout.PREFERRED_SIZE, 322, GroupLayout.PREFERRED_SIZE)
							.addGap(54))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblVotersRemaining)
					.addGap(18)
					.addComponent(lblPleaseEnterYour)
					.addGap(12)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCheckYourId, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnStopVoting, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(18))
		);
		getContentPane().setLayout(groupLayout);
	}
}
