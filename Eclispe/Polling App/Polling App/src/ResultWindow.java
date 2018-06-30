import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ResultWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private UserFileOperation operation = new UserFileOperation("Topic");
	private UserFileOperation operation1 = new UserFileOperation("Option1");
	private UserFileOperation operation2 = new UserFileOperation("Option2");
	private UserFileOperation operation3 = new UserFileOperation("Option3");
	private UserFileOperation operation4 = new UserFileOperation("Option4");
	private UserFileOperation operation5 = new UserFileOperation("Option5");
	private UserDataManipulations result = new UserDataManipulations();
	
	private VoteCount vote = new VoteCount();
	protected int option;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResultWindow frame = new ResultWindow();
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
	public ResultWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Vote Summary");
		setBounds(100, 100, 790, 808);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		option = WelcomeWindow.radioButton;
		
		JButton btnShowBarDiagram = new JButton("Show Bar Diagram");
		btnShowBarDiagram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BarChart bar = new BarChart();
				bar.setVisible(true);
				bar.setSize(800, 600);
			}
		});
		
		JButton btnShowPieDiagram = new JButton("Show Pie Diagram");
		btnShowPieDiagram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PieChart pie = new PieChart();
				pie.setVisible(true);
				pie.setSize(800, 600);
				
			}
		});
		
		JLabel lblVotingSummary = new JLabel("Voting Summary");
		lblVotingSummary.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel lblTopicOfVote = new JLabel("Topic Of Vote: ");
		lblTopicOfVote.setHorizontalAlignment(SwingConstants.CENTER);
		lblTopicOfVote.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblOption1Des = new JLabel("<html>Option 1 which was ' " + operation1.getUserData() + "', <br>Got " 
											+ String.format("%.2f", vote.count1Percentage()) + "% vote, "
											+ (int)vote.count1 + " voted in this option.</html>");
		
		lblOption1Des.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblOption2Des = new JLabel("<html>Option 2 which was ' " + operation2.getUserData() + "', <br>Got " 
										+ String.format("%.2f", vote.count2Percentage()) + "% vote, "
												+ (int)vote.count2 + " voted in this option.</html>");
		
		lblOption2Des.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblOption3Des = new JLabel("<html>Option 3 which was ' " + operation3.getUserData() + "', <br>Got " 
											+ String.format("%.2f", vote.count3Percentage()) + "% vote, "
													+ (int)vote.count3 + " voted in this option.</html>");
		
		lblOption3Des.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblOption4Des = new JLabel("<html>Option 4 which was ' " + operation4.getUserData() + "', <br>Got " 
											+ String.format("%.2f", vote.count4Percentage()) + "% vote, "
													+ (int)vote.count4 + " voted in this option.</html>");

		lblOption4Des.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblOption5Des = new JLabel("<html>Option 5 which was ' " + operation5.getUserData() + "', <br>Got " 
											+ String.format("%.2f", vote.count5Percentage()) + "% vote, "
													+ (int)vote.count5 + " voted in this option.</html>");
		
		lblOption5Des.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblVotingResult = new JLabel("Voting Result");
		lblVotingResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JTextArea textAreaTopic = new JTextArea();
		String text = operation.getUserData();
		textAreaTopic.setText("");
		textAreaTopic.setFont(new Font("Monospaced", Font.PLAIN, 17));
		textAreaTopic.setLineWrap(true);
		textAreaTopic.setEditable(false);
		textAreaTopic.setText(text);
		
		JLabel lblTotalVotersWere = new JLabel("Total Voters were " + (int)vote.count + ".");
		lblTotalVotersWere.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		String start = "Voting Results\n\nTopic was : ";
		String topic = textAreaTopic.getText().toString() + "\n";
		String total = lblTotalVotersWere.getText().toString() + "\n";
		String op1 = result.stringResizer( lblOption1Des.getText().toString() ) + "\n";
		String op2 = result.stringResizer( lblOption2Des.getText().toString() ) + "\n";
		String op3 = result.stringResizer( lblOption3Des.getText().toString() ) + "\n";
		String op4 = result.stringResizer( lblOption4Des.getText().toString() ) + "\n";
		String op5 = result.stringResizer( lblOption5Des.getText().toString() ) + "\n";
		String space = "\n\n\n\n";
		
		if(option == 2)
		{
			lblOption3Des.setVisible(false);
			lblOption4Des.setVisible(false);
			lblOption5Des.setVisible(false);
			result.saveUserResult(start);
			result.saveUserResult(topic);
			result.saveUserResult(total);
			result.saveUserResult(op1);
			result.saveUserResult(op2);
		}
		
		else if(option == 3)
		{
			lblOption4Des.setVisible(false);
			lblOption5Des.setVisible(false);
			result.saveUserResult(start);
			result.saveUserResult(topic);
			result.saveUserResult(total);
			result.saveUserResult(op1);
			result.saveUserResult(op2);
			result.saveUserResult(op3);
		}
		
		else if(option == 4)
		{
			lblOption5Des.setVisible(false);
			result.saveUserResult(start);
			result.saveUserResult(topic);
			result.saveUserResult(total);
			result.saveUserResult(op1);
			result.saveUserResult(op2);
			result.saveUserResult(op3);
			result.saveUserResult(op4);
		}
		
		else if(option == 5)
		{
			result.saveUserResult(start);
			result.saveUserResult(topic);
			result.saveUserResult(total);
			result.saveUserResult(op1);
			result.saveUserResult(op2);
			result.saveUserResult(op3);
			result.saveUserResult(op4);
			result.saveUserResult(op5);
		}
		
		result.saveUserResult(space);

				
				JButton btnExit = new JButton("Exit");
				btnExit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
				
						JOptionPane.showMessageDialog(ResultWindow.this, "Thank you for using our Application!!!!");
						result.addVoters("");
						result.writeVoterId();
						result.writeUserResult();
						
						System.exit(0);
					}
				});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTopicOfVote)
					.addGap(18)
					.addComponent(textAreaTopic, GroupLayout.PREFERRED_SIZE, 593, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(17, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(176)
					.addComponent(btnShowBarDiagram)
					.addGap(49)
					.addComponent(btnShowPieDiagram, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
					.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblOption1Des, GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblOption2Des, GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblOption3Des, GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblOption4Des, GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblOption5Des, GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(302)
					.addComponent(lblVotingSummary)
					.addContainerGap(286, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(320)
					.addComponent(lblVotingResult)
					.addContainerGap(324, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTotalVotersWere, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(577, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblVotingSummary)
							.addGap(18)
							.addComponent(textAreaTopic, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(103)
							.addComponent(lblTopicOfVote)))
					.addGap(18)
					.addComponent(lblVotingResult)
					.addGap(9)
					.addComponent(lblTotalVotersWere)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblOption1Des, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblOption2Des, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblOption3Des, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblOption4Des, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblOption5Des, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(39)
							.addComponent(btnExit))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnShowBarDiagram)
								.addComponent(btnShowPieDiagram))))
					.addGap(1))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
