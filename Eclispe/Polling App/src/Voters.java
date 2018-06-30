import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;


public class Voters extends JFrame {

	private static final long serialVersionUID = 1L;
	private UserDataManipulations data = new UserDataManipulations();
	private ArrayList<String> voterList = new ArrayList<String>();
	private ArrayList<String> previousList = new ArrayList<String>();
	protected String marital = null;
	protected String gender = null;
	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldID;
	protected String dob = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Voters frame = new Voters();
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
	public Voters() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Voter List");
		setBounds(100, 100, 448, 538);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("dd-MMM-yyyy");
		dateChooser.getDateEditor().addPropertyChangeListener(
			    new PropertyChangeListener() {
			        @Override
			        public void propertyChange(PropertyChangeEvent e) {
			        	String s = null;
			            if ("date".equals(e.getPropertyName() ) ) {
			            		s =  ( format.format( (Date) e.getNewValue() ) );
			            		dob = s;
			            }
			        }
			    });
			
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		JRadioButton rdbtnOther = new JRadioButton("Other");
		JRadioButton rdbtnMale = new JRadioButton("Male");
		JRadioButton rdbtnMarried = new JRadioButton("Married");
		JRadioButton rdbtnUnmarried = new JRadioButton("Unmarried");
		
		previousList = data.getVoterID();
		
		JLabel lblAddVotersId = new JLabel("Type Voters Info Down Below");
		lblAddVotersId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		
		JButton btnAddVoter = new JButton("Add Voter");
		btnAddVoter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				voterList.addAll(previousList);
							
				String ID = textFieldID.getText();
				String name = textFieldName.getText();
				
				try
				{
					if( (!ID.isEmpty() & !voterList.contains( ID ) & ID.length() >= 8 & ID.matches("[0-9]+") ) & !name.isEmpty() & !dob.equals(null) & !marital.equals(null) & !gender.equals(null) )
					{
						voterList.add( ID );
						data.insertDataVoters(ID, name, dob, gender, "No", marital);
						
						Collections.sort( voterList );
						textFieldID.setText( "" );
						textFieldName.setText(""); 
						rdbtnMale.setSelected( false );
						rdbtnFemale.setSelected( false );
						rdbtnOther.setSelected( false );
						rdbtnMarried.setSelected( false );
						rdbtnUnmarried.setSelected( false );
					}
					else if( voterList.contains( ID ) )
					{
						JOptionPane.showMessageDialog(Voters.this, "ID already is in the list", null, JOptionPane.INFORMATION_MESSAGE);
					}
					else if( ID.length() <= 8 || !ID.matches( "[0-9]+")  )
					{
						JOptionPane.showMessageDialog(Voters.this, "Given ID Number Must Be Greater Than 7 Numbers.\n"
								+ "ID Numbers Should Only Consists Of Integers", null, JOptionPane.INFORMATION_MESSAGE);
					}
					previousList.removeAll(voterList);
				}
				catch(NullPointerException npe)
				{
					JOptionPane.showMessageDialog(Voters.this, "Please don't leave any field empty.", null, JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnAddVoter.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JButton button = new JButton("<- Go Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				dispose();		
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JButton buttonFinish = new JButton("Finish");
		buttonFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();

			}
		});
		
		buttonFinish.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JButton btnDeleteAll = new JButton("Delete All");
		btnDeleteAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				voterList.clear();
				data.clearDataVoters();
			}
		});
		btnDeleteAll.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldName.setColumns(10);
		
		JLabel lblName = new JLabel("Name"); 
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		getContentPane().add(dateChooser);
		
		JLabel lblDob = new JLabel("Date Of Birth");
		lblDob.setFont(new Font("Tahoma", Font.PLAIN, 18));
				
		rdbtnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if( rdbtnMale.isSelected() )
				{
					rdbtnFemale.setSelected(false);
					rdbtnOther.setSelected( false );
					gender = "Male";
				}
			}
		});
		rdbtnMale.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		rdbtnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if( rdbtnFemale.isSelected() )
				{
					rdbtnMale.setSelected(false);
					rdbtnOther.setSelected( false );
					gender = "Female";
				}
			}
		});
		rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		
		rdbtnOther.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if( rdbtnOther.isSelected() )
				{
					rdbtnMale.setSelected(false);
					rdbtnFemale.setSelected( false );
					gender = "Other";
				}
			}
		});
		rdbtnOther.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		textFieldID = new JTextField();
		textFieldID.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldID.setColumns(10);
		
		JLabel lblMaritalStatus = new JLabel("Marital Status");
		lblMaritalStatus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		rdbtnMarried.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( rdbtnMarried.isSelected() )
				{
					rdbtnUnmarried.setSelected( false );
					marital = "Married";
				}
			}
		});
		rdbtnMarried.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		rdbtnUnmarried.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( rdbtnUnmarried.isSelected() )
				{
					rdbtnMarried.setSelected( false );
					marital = "Unmarried";
				}
			}
		});
		rdbtnUnmarried.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnShowVoterList = new JButton("Show Voter List");
		btnShowVoterList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				TableFromDatabase table = new TableFromDatabase();
				table.setVisible( true );
				table.setTitle("Voters List");
				table.setBounds(200, 200, 800, 600);
			}
		});
		btnShowVoterList.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDob, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblGender, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMaritalStatus))
							.addGap(37)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(1)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(rdbtnMarried, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(rdbtnUnmarried, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(rdbtnMale)
											.addGap(18)
											.addComponent(rdbtnFemale)
											.addGap(18)
											.addComponent(rdbtnOther, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(textFieldID, Alignment.LEADING)
									.addComponent(textFieldName, Alignment.LEADING)
									.addComponent(dateChooser, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(84)
							.addComponent(lblAddVotersId)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
					.addComponent(buttonFinish, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(65)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnAddVoter, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
							.addGap(77))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnDeleteAll, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnShowVoterList, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(28)
					.addComponent(lblAddVotersId)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldID, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(13)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldName, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblDob, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGender, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnMale)
						.addComponent(rdbtnFemale)
						.addComponent(rdbtnOther))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMaritalStatus, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnMarried, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnUnmarried, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAddVoter)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnShowVoterList, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDeleteAll)
					.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonFinish)))
		);


		contentPane.setLayout(gl_contentPane);
		
	}
}
