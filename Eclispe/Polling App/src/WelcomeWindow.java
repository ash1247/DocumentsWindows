import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomeWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static int radioButton = 0;
	private UserDataManipulations data = new UserDataManipulations();
	protected int mode;
	private JTextArea textArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeWindow frame = new WelcomeWindow();
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
	public WelcomeWindow() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Welcome (Admin)");
		setBounds(100, 100, 683, 442);
		getContentPane().setLayout(new MigLayout("", "[662px,grow]", "[31px][][][][grow][][][grow][][grow]"));
		
		mode = LoginWindow.radioModeButton;
	
		
		if (mode == 1)
		{
			JLabel lblWelcomeToThe = new JLabel("Welcome to the Polling Application");
			lblWelcomeToThe.setFont(new Font("Tahoma", Font.PLAIN, 25));
			lblWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
			getContentPane().add(lblWelcomeToThe, "cell 0 0,growx,aligny top");
			
			JLabel lblEnterTheTopic = new JLabel("                 Enter the topic in which you want to conduct the Polling");
			lblEnterTheTopic.setHorizontalAlignment(SwingConstants.CENTER);
			lblEnterTheTopic.setFont(new Font("Tahoma", Font.PLAIN, 18));
			getContentPane().add(lblEnterTheTopic, "cell 0 2");
			
		}
		else if (mode == 2)
		{
			JLabel lblWelcomeToThe = new JLabel("Welcome to the Voting Application");
			lblWelcomeToThe.setFont(new Font("Tahoma", Font.PLAIN, 25));
			lblWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
			getContentPane().add(lblWelcomeToThe, "cell 0 0,growx,aligny top");
			
			JLabel lblEnterTheTopic = new JLabel("                 Enter the topic in which you want to conduct the Voting");
			lblEnterTheTopic.setHorizontalAlignment(SwingConstants.CENTER);
			lblEnterTheTopic.setFont(new Font("Tahoma", Font.PLAIN, 18));
			getContentPane().add(lblEnterTheTopic, "cell 0 2");
		}
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, "cell 0 4,grow");
		
		setTextArea(new JTextArea());
		getTextArea().setLineWrap(true);
		getTextArea().setFont(new Font("Monospaced", Font.PLAIN, 14));
		
		JLabel lblHowManyOptions = new JLabel("                                How many options do you want ?");
		lblHowManyOptions.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHowManyOptions.setHorizontalAlignment(SwingConstants.CENTER);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblHowManyOptions)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(12)
							.addComponent(getTextArea(), GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(getTextArea(), GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
					.addComponent(lblHowManyOptions))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, "cell 0 5,grow");
		
		JRadioButton radioButton2 = new JRadioButton("2");
		radioButton2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JRadioButton radioButton3 = new JRadioButton("3");
		radioButton3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JRadioButton radioButton4 = new JRadioButton("4");
		radioButton4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JRadioButton radioButton5 = new JRadioButton("5");
		radioButton5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		radioButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioButton2.isSelected() )
				{
					radioButton3.setSelected(false);
					radioButton4.setSelected(false);
					radioButton5.setSelected(false);
					radioButton = 2;
				}
			}
		});
		
		radioButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioButton3.isSelected() )
				{
					radioButton2.setSelected(false);
					radioButton4.setSelected(false);
					radioButton5.setSelected(false);
					radioButton = 3;
				}
			}
		});
		
		radioButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioButton4.isSelected() )
				{
					radioButton2.setSelected(false);
					radioButton3.setSelected(false);
					radioButton5.setSelected(false);
					radioButton = 4;
				}
			}
		});
		
		radioButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioButton5.isSelected() )
				{
					radioButton2.setSelected(false);
					radioButton3.setSelected(false);
					radioButton4.setSelected(false);
					radioButton = 5;
				}
			}
		});
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(81)
					.addComponent(radioButton2)
					.addGap(116)
					.addComponent(radioButton3)
					.addPreferredGap(ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
					.addComponent(radioButton4)
					.addGap(105)
					.addComponent(radioButton5)
					.addGap(82))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(radioButton2)
						.addComponent(radioButton5)
						.addComponent(radioButton3)
						.addComponent(radioButton4))
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2, "cell 0 7,grow");
		
		JButton btnClickHereTo = new JButton("Click here to set options");
		btnClickHereTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if( mode == 1)
				{
					data.insertDataVoters("00000000", "poll", "0000-00-00", "poll", "poll", "poll");
				}
				
				if(!getTextArea().getText().toString().isEmpty() & !data.getVoterID().isEmpty()  & (radioButton2.isSelected() || radioButton3.isSelected() || radioButton4.isSelected() || radioButton5.isSelected() ) )
				{
					String topic = getTextArea().getText().toString();
					data.insertDataOp( 0 ,topic, 0, (float) 0.00 );
					OptionSetWindow5 option = new OptionSetWindow5();
					option.setVisible(true);
					option.setResizable(false);
					dispose();	
				}
				else if( getTextArea().getText().toString().isEmpty() )
				{
					JOptionPane.showMessageDialog(WelcomeWindow.this, "Please write a topic to continue.", null, JOptionPane.WARNING_MESSAGE);
				}
				
				else if( !radioButton2.isSelected() & !radioButton3.isSelected() & !radioButton4.isSelected() & !radioButton5.isSelected() )
				{
					JOptionPane.showMessageDialog(WelcomeWindow.this, "Please select an option to continue.", null, JOptionPane.WARNING_MESSAGE);
				}
				
				if( mode == 2 )
				{
					if( data.getVoterID().isEmpty() )
					{
						JOptionPane.showMessageDialog(WelcomeWindow.this, "Please add voters to continue.", null, JOptionPane.WARNING_MESSAGE);
					}
				}	
			}
		});
		btnClickHereTo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnAddVoters = new JButton("Add Voters");
		btnAddVoters.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Voters voter = new Voters();
				voter.setVisible(true);
				voter.setResizable(false);
				voter.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
			}
		});
		btnAddVoters.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnShowVoterList = new JButton("Show Voter List");
		btnShowVoterList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				TableFromDatabase table = new TableFromDatabase();
				table.setTitle("Voters List");
				table.setVisible( true ); 
				table.setBounds(200, 200, 800, 600);
			}
		});
		btnShowVoterList.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		if( mode == 1 )
		{
			btnAddVoters.setVisible(false);
			btnShowVoterList.setVisible( false );
		}
		
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
					.addContainerGap(78, Short.MAX_VALUE)
					.addComponent(btnAddVoters)
					.addGap(18)
					.addComponent(btnClickHereTo)
					.addGap(18)
					.addComponent(btnShowVoterList)
					.addGap(38))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnClickHereTo, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(btnShowVoterList, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAddVoters, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		getContentPane().add(panel_3, "cell 0 9,grow");
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap(530, Short.MAX_VALUE)
					.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnExit))
		);
		panel_3.setLayout(gl_panel_3);
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}
}
