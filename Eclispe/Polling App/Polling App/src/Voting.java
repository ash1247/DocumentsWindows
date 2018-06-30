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
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Voting extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	protected int option;
	
	protected static int count = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
	
	protected WelcomeWindow welcomeWindow = new WelcomeWindow();
	private UserFileOperation operation = new UserFileOperation("Topic");
	private UserFileOperation operation1 = new UserFileOperation("Option1");
	private UserFileOperation operation2 = new UserFileOperation("Option2");
	private UserFileOperation operation3 = new UserFileOperation("Option3");
	private UserFileOperation operation4 = new UserFileOperation("Option4");
	private UserFileOperation operation5 = new UserFileOperation("Option5");
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
		setBounds(100, 100, 719, 749);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		option = WelcomeWindow.radioButton;
		mode = LoginWindow.radioModeButton;
		
		String Option1 = operation1.getUserData();
		String Option2 = operation2.getUserData();
		String Option3 = operation3.getUserData();
		String Option4 = operation4.getUserData();
		String Option5 = operation5.getUserData();
		
		
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
		
		count = count1 + count2 + count3 + count4 + count5;
		
		
		JButton btnStop = new JButton("Stop Voting!!");
		if( mode == 2 )
		{
			btnStop.setVisible(false);
		}
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				UserFileOperation operation = new UserFileOperation("Admin");
				
				String password = operation.getUserPassword();

			
				String message = JOptionPane.showInputDialog(Voting.this,"Enter your Password.");
				
				if ((message != null) && (message.length() > 0) ) {
				
					if(message.equals(password) )
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
		String text = operation.getUserData();
		textTopic.setText("");
		textTopic.setLineWrap(true);
		textTopic.setText(text);
		
		JLabel lblTopicOfVote = new JLabel("Topic Of Vote");
		lblTopicOfVote.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JLabel lblClickOnAny = new JLabel("Click on any Option below to vote");
		lblClickOnAny.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnStop)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(textTopic, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(256)
							.addComponent(lblTopicOfVote))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnOption1, GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnOption2, GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnOption3, GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnOption4, GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnOption5, GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(175)
							.addComponent(lblClickOnAny)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addComponent(btnStop)
					.addGap(16)
					.addComponent(lblTopicOfVote)
					.addGap(18)
					.addComponent(textTopic, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
					.addGap(22)
					.addComponent(lblClickOnAny)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnOption1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnOption2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnOption3, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnOption4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnOption5, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}