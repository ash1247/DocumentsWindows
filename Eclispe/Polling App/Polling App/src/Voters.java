import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Voters extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserFileOperation opVoter = new UserFileOperation( "Voters");
	private UserDataManipulations dataList = new UserDataManipulations();
	private ArrayList<String> voterList = new ArrayList<String>();
	private ArrayList<String> previousList = new ArrayList<String>();
	
	private JPanel contentPane;
	private JTextField textField;

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
		setBounds(100, 100, 530, 562);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		
		previousList = opVoter.getVoters();
		
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		
		JLabel lblVotersList = new JLabel("Voters List (ID)");
		lblVotersList.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JLabel lblAddVotersId = new JLabel("Type Voters ID Down Below");
		lblAddVotersId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JList<String> list = new JList<String>(listModel);
		
		if( !previousList.isEmpty() )
		{
			for( String tmpId : previousList)
			{
				listModel.addElement(tmpId);
			}
		}
		
		JButton btnAddVoter = new JButton("Add Voter");
		
		btnAddVoter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				voterList.addAll(previousList);
				
				for( String tmpId : voterList)
				{
					listModel.addElement(tmpId);
				}
						
				listModel.removeAllElements(); 
				
				
				String input;
				input = textField.getText();
				
				if( !input.isEmpty() && !voterList.contains( input ) && input.length() >= 8 && input.matches("[0-9]+") )
				{
					voterList.add( input );
				
					Collections.sort( voterList );
					textField.setText( "" );
				}
				else if( input.length() <= 8 || !input.matches( "[0-9]+")  )
				{
					JOptionPane.showMessageDialog(Voters.this, "Given ID Number Must Be Greater Than 7 Numbers.\n"
							+ "ID Numbers Should Only Consists Of Integers", null, JOptionPane.INFORMATION_MESSAGE);
				}
				
				else if( voterList.contains( input ) )
				{
					JOptionPane.showMessageDialog(Voters.this, "ID already is in the list", null, JOptionPane.INFORMATION_MESSAGE);
					textField.setText( "" );
				}
				else if( input.isEmpty() )
				{
					JOptionPane.showMessageDialog(Voters.this, "Please don't leave the textfield empty.", null, JOptionPane.WARNING_MESSAGE);
				}
				
				for( String tmpId : voterList)
				{
					listModel.addElement(tmpId);
				}
				
				previousList.removeAll(voterList);
				
			}
		});
		btnAddVoter.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JButton buttonDelVoter = new JButton("Delete Voter");
		buttonDelVoter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if( list.isSelectionEmpty() )
				{
					JOptionPane.showMessageDialog(Voters.this, "Please Select an ID first to delete", null, JOptionPane.WARNING_MESSAGE);
				}
				
				voterList.remove( list.getSelectedValue() );
				previousList.remove( list.getSelectedValue() );
				
				voterList.addAll( previousList );
				previousList.clear();
				listModel.removeAllElements();
				
				for( String tmpId : voterList)
				{
					listModel.addElement(tmpId);
				}
			}
		});
		
		buttonDelVoter.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JButton button = new JButton("<- Go Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				for( String tmpId : voterList)
				{
					dataList.addVoters( tmpId );
				}
				
				for( String tmpId : previousList)
				{
					dataList.addVoters( tmpId );
				}
				
				dataList.writeVoterId();
				
				dispose();
					
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setColumns(10);
		
		JButton buttonFinish = new JButton("Finish");
		buttonFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for( String tmpId : voterList)
				{
					dataList.addVoters( tmpId );
				}
				for( String tmpId : previousList)
				{
					dataList.addVoters( tmpId );
				}
				
				dataList.writeVoterId();
				
				dispose();

			}
		});
		
		buttonFinish.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JButton btnDeleteAll = new JButton("Delete All");
		btnDeleteAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				voterList.clear();
				listModel.removeAllElements();
				
				for( String tmpId : voterList)
				{
					listModel.addElement(tmpId);
				}
			}
		});
		btnDeleteAll.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(52)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(btnAddVoter, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(buttonDelVoter, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
										.addComponent(button, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnDeleteAll, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
										.addComponent(buttonFinish, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(textField, Alignment.LEADING, 224, 224, 224)
										.addComponent(lblAddVotersId, Alignment.LEADING)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(44)
							.addComponent(lblVotersList)))
					.addContainerGap(29, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(104)
					.addComponent(lblAddVotersId)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(btnAddVoter)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(buttonDelVoter, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDeleteAll, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
					.addComponent(buttonFinish, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(25))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblVotersList)
					.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 441, GroupLayout.PREFERRED_SIZE))
		);
		
		
		list.setFont(new Font("Tahoma", Font.PLAIN, 18));
		scrollPane.setViewportView(list);
		contentPane.setLayout(gl_contentPane);
		
	}
}
