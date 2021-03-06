import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class OptionSetWindow5 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;
	private UserDataManipulations data = new UserDataManipulations();
	protected int option;
	protected int mode;
	protected static AuthenticationVoters atcn = new AuthenticationVoters();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OptionSetWindow5 frame = new OptionSetWindow5();
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
	public OptionSetWindow5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Make your Options (Admin Mode)");
		setBounds(100, 100, 624, 605);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		option = WelcomeWindow.radioButton;
		mode = LoginWindow.radioModeButton;
		
		
		JLabel lblOption1 = new JLabel("Option 1 :");
		lblOption1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField1 = new JTextField();
		textField1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField1.setColumns(10);
		
		JLabel lblOption2 = new JLabel("Option 2 :");
		lblOption2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField2 = new JTextField();
		textField2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField2.setColumns(10);
		
		JLabel lblOption3 = new JLabel("Option 3 :");
		lblOption3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField3 = new JTextField();
		textField3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField3.setColumns(10);
		
		JLabel lblOption4 = new JLabel("Option 4 :");
		lblOption4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField4 = new JTextField();
		textField4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField4.setColumns(10);
		
		JLabel lblOption5 = new JLabel("Option 5 :");
		lblOption5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField5 = new JTextField();
		textField5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField5.setColumns(10);
		
		if(option == 2)
		{
			lblOption3.setVisible(false);
			textField3.setText("\n");
			textField3.setVisible(false);
			
			lblOption4.setVisible(false);
			textField4.setText("\n");
			textField4.setVisible(false);
			
			lblOption5.setVisible(false);
			textField5.setText("\n");
			textField5.setVisible(false);
			
		}
		
		if(option == 3)
		{
			lblOption4.setVisible(false);
			textField4.setText("\n");
			textField4.setVisible(false);
			
			lblOption5.setVisible(false);
			textField5.setText("\n");
			textField5.setVisible(false);
		}
		
		if(option == 4)
		{
			lblOption5.setVisible(false);
			textField5.setText("\n");
			textField5.setVisible(false);
		}
		
		JLabel lblInfo = new JLabel("Please set the options here");
		lblInfo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JButton btnpublic = new JButton("Make it Public !");
		btnpublic.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				if(!textField1.getText().toString().isEmpty() && !textField2.getText().toString().isEmpty() && !textField3.getText().toString().isEmpty() && !textField4.getText().toString().isEmpty() && !textField5.getText().toString().isEmpty())
				{
					
					data.insertDataOp(1, textField1.getText().toString(), 0, (float) 0.00 );
					
					data.insertDataOp(2, textField2.getText().toString(), 0, (float) 0.00 );
					
					data.insertDataOp(3, textField3.getText().toString(), 0, (float) 0.00 );
					
					data.insertDataOp(4, textField4.getText().toString(), 0, (float) 0.00 );
					
					data.insertDataOp(5, textField5.getText().toString(), 0, (float) 0.00 );
					
					int dialogResult = JOptionPane.showConfirmDialog(OptionSetWindow5.this, "Are you sure you want to make the voting public?");
					
					if(dialogResult == JOptionPane.YES_OPTION)
					{
						if( mode == 1 )
						{
							Voting voting = new Voting();
							voting.setVisible(true);
							voting.setResizable(false);
							dispose();
						}
						else if( mode == 2 )
						{
							atcn.setVisible(true);
							atcn.setResizable(false);
							atcn.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
							dispose();
						}
					}
					
				}
				
				else
				{
					JOptionPane.showMessageDialog(OptionSetWindow5.this, "Don't leave the textfields empty.");
				}
			}
		});
		
		btnpublic.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton buttongoBack = new JButton("<- Go Back");
		buttongoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WelcomeWindow window = new WelcomeWindow();
				window.setVisible(true);
				window.setResizable(false);
				window.getTextArea().setText( data.getTopicAndOption( 0 ) );
				dispose();
			}
		});
		buttongoBack.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblwrittenTopic = new JLabel("Topic Description");
		lblwrittenTopic.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		String text = data.getTopicAndOption( 0 );
		
		JTextArea TextArea = new JTextArea();
		TextArea.setText("");
		TextArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		TextArea.setLineWrap(true);
		TextArea.setEditable(false);
		TextArea.setText(text);
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(213)
							.addComponent(lblwrittenTopic))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(39)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(buttongoBack, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblOption3, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(lblOption5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(lblOption4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
									.addGap(62)
									.addComponent(btnpublic)
									.addGap(52)
									.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
								.addComponent(TextArea, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 531, GroupLayout.PREFERRED_SIZE)
								.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblOption2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblOption1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGap(27)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textField1, GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
										.addComponent(textField3, GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
										.addComponent(textField4, GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
										.addComponent(textField5, GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
										.addComponent(textField2, GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE))))
							.addGap(57))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(175)
							.addComponent(lblInfo)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblwrittenTopic)
					.addGap(18)
					.addComponent(TextArea, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblInfo)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOption1)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblOption2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOption3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOption4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOption5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttongoBack, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnpublic))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
