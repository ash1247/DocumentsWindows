import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Voting extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	protected int option;
	
	protected static int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
	
	protected WelcomeWindow welcomeWindow = new WelcomeWindow();
	protected UserDataManipulations data = new UserDataManipulations();
	protected ArrayList<String> al = new ArrayList<String>();
	protected int mode;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Voting frame = new Voting();
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
	public Voting() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setTitle("(Public) Voting.......");
		setBounds(100, 100, 719, 773);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		option = WelcomeWindow.radioButton;
		mode = LoginWindow.radioModeButton;
		
		String s = AuthenticationVoters.ID;
		
		String name = null;
		String gender = null;
		String married = null;
		if( mode == 2)
		{
			al = data.getVoterData( s );
			name = al.get( 1 ) ;
			gender = al.get( 2 );
			married = al.get( 4 );
		}		
		
		String Option1 = data.getTopicAndOption(1);
		String Option2 = data.getTopicAndOption(2);
		String Option3 = data.getTopicAndOption(3);
		String Option4 = data.getTopicAndOption(4);
		String Option5 = data.getTopicAndOption(5);
		
		JLabel lblWelcome = new JLabel();
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		if( mode == 1)
		{
			lblWelcome.setText("Welcome");
		}
		else if( mode == 2)
		{
			if( married.equals( "Married" ) & gender.equals( "Female") )
			{
				lblWelcome.setText("Welcome Mrs. " + name);
			}
			else if( married.equals( "Unmarried" ) & gender.equals( "Female") )
			{
				lblWelcome.setText("Welcome Ms. " + name);
			}
			else
			{
				lblWelcome.setText("Welcome Mr. " + name);
			}
		}
		
		JButton btnOption1 = new JButton(Option1);
		btnOption1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				count1++;
				JOptionPane.showMessageDialog(Voting.this, "Thanks for your vote.");
				if( mode == 2 )
				{
					OptionSetWindow5.atcn.setVisible( true );
					setVisible(false);
				}
			}
		});
		btnOption1.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnOption2 = new JButton(Option2);
		btnOption2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count2++;
				JOptionPane.showMessageDialog(Voting.this, "Thanks for your vote.");
				if( mode == 2 )
				{
					OptionSetWindow5.atcn.setVisible( true );
					setVisible(false);
				}
			}
		});
		btnOption2.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnOption3 = new JButton(Option3);
		btnOption3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count3++;
				JOptionPane.showMessageDialog(Voting.this, "Thanks for your vote.");
				if( mode == 2 )
				{
					OptionSetWindow5.atcn.setVisible( true );
					setVisible(false);
				}
			}
		});
		btnOption3.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnOption4 = new JButton(Option4);
		btnOption4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count4++;		
				JOptionPane.showMessageDialog(Voting.this, "Thanks for your vote.");
				if( mode == 2 )
				{
					OptionSetWindow5.atcn.setVisible( true );
					setVisible(false);
				}
			}
		});
		btnOption4.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnOption5 = new JButton(Option5);
		btnOption5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count5++;
				JOptionPane.showMessageDialog(Voting.this, "Thanks for your vote.");
				if( mode == 2 )
				{
					OptionSetWindow5.atcn.setVisible( true );
					setVisible(false);
				}
			}
		});
		btnOption5.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		if(option == 2)
		{
			btnOption3.setVisible(false);
			btnOption4.setVisible(false);
			btnOption5.setVisible(false);
		}
		
		if(option == 3)
		{
			btnOption4.setVisible(false);
			btnOption5.setVisible(false);
			
		}
		
		if(option == 4)
		{
			btnOption5.setVisible(false);
		}
		
		JButton btnStop = new JButton("Stop Voting!!");
		if( mode == 2 )
		{
			btnStop.setVisible(false);
		}
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				data.updateOptionCount(1, count1);
				data.updateOptionCount(2, count2);
				data.updateOptionCount(3, count3);
				data.updateOptionCount(4, count4);
				data.updateOptionCount(5, count5);
				
				ArrayList<String> password = new ArrayList<String>();
				password = data.getPassAdmin();
				String message = JOptionPane.showInputDialog(Voting.this,"Enter your Password.");
				boolean check = false;
				
				for (String string : password) 
				{
					if(string.matches( message ))
					{
						check = true;
					}
				}

				
				if ( (message != null) && (message.length() > 0) ) {
				
					if( check == true )
					{
						JOptionPane.showMessageDialog(Voting.this, "Voting has been stopped");
						ResultWindow result = new ResultWindow();
						result.setVisible(true);
						result.setResizable(false);
						dispose();
						
					}
					
					else
					{
						JOptionPane.showMessageDialog(Voting.this, "Password did not match");
					}
				}	
				else
				{
					JOptionPane.showMessageDialog(Voting.this, "Please enter the Password to stop voting.");
				}
			}
		});
		btnStop.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JTextArea textTopic = new JTextArea();
		textTopic.setEditable(false);
		textTopic.setFont(new Font("Monospaced", Font.BOLD, 20));
		String text = data.getTopicAndOption(0);
		textTopic.setText("");
		textTopic.setLineWrap(true);
		textTopic.setText(text);
		
		JLabel lblTopicOfVote = new JLabel("Topic Of Vote");
		lblTopicOfVote.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JLabel lblClickOnAny = new JLabel("Click on any Option below to vote");
		lblClickOnAny.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnStop)
					.addContainerGap(542, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(268)
					.addComponent(lblTopicOfVote)
					.addContainerGap(275, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(textTopic, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(188, Short.MAX_VALUE)
					.addComponent(lblClickOnAny)
					.addGap(165))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnOption1, GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnOption2, GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnOption3, GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnOption4, GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnOption5, GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblWelcome, GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnStop)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblWelcome, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblTopicOfVote)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textTopic, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblClickOnAny)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnOption1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnOption2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnOption3, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnOption4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnOption5, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
