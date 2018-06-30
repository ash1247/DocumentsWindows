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
	protected UserDataManipulations data = new UserDataManipulations();
	private ArrayList<String> voterList = new ArrayList<String>();
	private ArrayList<String> removedList = new ArrayList<String>();
	private JPasswordField passwordField;
	private int size;
	static String ID = null;
	protected int count = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
	
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
		
		voterList = data.getVoterID();
		
		size = voterList.size();
		
		JLabel lblVotersRemaining = new JLabel("             Voters remaining : " + size);
		lblVotersRemaining.setFont(new Font("Tahoma", Font.PLAIN, 18));
	
		JButton btnCheckYourId = new JButton("Check Your ID");
		btnCheckYourId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ID = String.valueOf( passwordField.getPassword() );
				
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
				ID = String.valueOf( passwordField.getPassword() );
				if( voterList.contains( ID ) )  
				{	
					JOptionPane.showMessageDialog(AuthenticationVoters.this, "Login Succeeded." , null, JOptionPane.INFORMATION_MESSAGE);
					data.updateDataVoters( ID );
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
					
				ArrayList<String> password = new ArrayList<String>();
				password = data.getPassAdmin();

			
				String message = JOptionPane.showInputDialog(AuthenticationVoters.this,"Enter your Password.");
				
				if ( (message != null) && (message.length() > 0)  ) {
				
					if(password.contains( message ) )
					{
						count1 = Voting.count1;
						count2 = Voting.count2;
						count3 = Voting.count3;
						count4 = Voting.count4;
						count5 = Voting.count5;
						
						count = count1 + count2 + count3 + count4 + count5;
						
						data.updateOptionCount(1, count1);
						data.updateOptionCount(2, count2);
						data.updateOptionCount(3, count3);
						data.updateOptionCount(4, count4);
						data.updateOptionCount(5, count5);
						
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
