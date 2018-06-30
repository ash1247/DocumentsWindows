// Fig. 14.9: TextFieldFrame.java
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class TextFieldFrame extends JFrame
{
	private JTextField textField1;
	private JTextField textField3; 
	private JTextField textField4; 
	private JTextField textField5; 
	private JTextField textField6; 
	private JTextField textField7; 
	private JTextField textField8; 
	private JTextField textField9; 
	private JTextField textField10; 
	private JTextField textField11; 
	private JTextField textField12; 
	private JTextField textField13; 
	private JTextField textField14; 
	private JTextField textField15, textField16, textField17,  textField18;
	private JTextField textField19, textField20, textField21,  textField22;
	private JTextField textField23, textField24, textField25;
	private JTextField textField27, textField28, textField29,  textField30;
	private JTextField textField31, textField32, textField33,  textField34;
	private JTextField textField35, textField36, textField37,  textField38;
	private JTextField textField39, textField40, textField41,  textField42;
	private JButton button;
	private JComboBox<Object> comboBox;
	
	private static final String[] names =
				{ "000000000000000000000000", "111111111111", "2222222222222", "33333333333333" };

	
	// TextFieldFrame constructor adds JTextFields to JFrame
	public TextFieldFrame()
	{	
		super( "Personal Profile" );
		setLayout( new FlowLayout() ); // set frame layout
	
		textField1 = new JTextField( "Scholar No." );
		textField1.setEditable( false ); // disable editing
		add( textField1 ); // add textField1 to JFrame
	
		comboBox = new JComboBox<Object>(names); // set up JComboBox
		comboBox.setMaximumRowCount( 3 ); // display three rows
		add(comboBox);
		
		textField3 = new JTextField( "Admission No.");
		textField3.setEditable( false ); // disable editing
		add( textField3 ); // add textField3 to JFrame
	
		textField4 = new JTextField( 22 );
		add(textField4 );
		
		button = new JButton( "<" );
		add( button ); // add plainJButton to JFrame
		
		textField5 = new JTextField( "Student Name");
		textField5.setEditable( false ); // disable editing
		add( textField5 ); // add textField5 to JFrame
		
		textField6 = new JTextField( 22 );
		add( textField6 ); // add textField6 to JFrame
		
		textField7 = new JTextField( "Roll No.");
		textField7.setEditable( false ); // disable editing
		add( textField7 ); // add textField7 to JFrame
		
		textField8 = new JTextField( 24);	
		add( textField8 );
		
		textField9 = new JTextField( "Date Of Admission");
		textField9.setEditable( false ); // disable editing
		add( textField9 ); 
		
		textField10 = new JTextField(16 );
		add( textField10 ); 
		
		textField11 = new JTextField( "Gender" );
		textField11.setEditable( false ); // disable editing
		add( textField11 );
		
		textField12 = new JTextField( 8);
		add( textField12 );
		
		textField13 = new JTextField( "Category");
		textField13.setEditable( false ); // disable editing
		add( textField13 ); 
		
		textField14 = new JTextField( 14);
		add( textField14 ); 
		
		textField15 = new JTextField( "Session");
		textField15.setEditable( false ); // disable editing
		add( textField15 ); 
		
		textField16 = new JTextField( 17);
		add( textField16 );
		
		textField17 = new JTextField( "DOB");
		textField17.setEditable( false ); // disable editing
		add( textField17 );
		
		textField18 = new JTextField( 14);
		add( textField18 );
		
		textField19 = new JTextField( "Religion");
		textField19.setEditable( false ); // disable editing
		add( textField19 );
		
		textField20 = new JTextField( 14);
		add( textField20 );
		
		textField21 = new JTextField( "Father's Name");
		textField21.setEditable( false ); // disable editing
		add( textField21 );
		
		textField22 = new JTextField( 22);
		add( textField22 );
		
		textField23 = new JTextField( "Mother's Name");
		textField23.setEditable( false ); // disable editing
		add( textField23 ); 
		
		textField24 = new JTextField( 21);
		add( textField24 );
		
		textField25 = new JTextField( "Address");
		textField25.setEditable( false ); // disable editing
		add( textField25 );
		
		Box box = Box.createVerticalBox(); // create box
		JTextArea textArea = new JTextArea( 2, 55 ); // create second textarea
		box.add( new JScrollPane( textArea ) ); // add scrollpane
		add( box );
		
		textField27 = new JTextField( "Course");
		textField27.setEditable( false ); // disable editing
		add( textField27 );
		
		textField28 = new JTextField( 10);
		add( textField28 );
		
		textField29 = new JTextField( "Branch");
		textField29.setEditable( false ); // disable editing
		add( textField29 );
		
		textField30 = new JTextField( 10);
		add( textField30 );
	
		textField31 = new JTextField( "Semester");
		textField31.setEditable( false ); // disable editing
		add( textField31 );
		
		textField32 = new JTextField( 10);
		add( textField32 );
		
		textField33 = new JTextField( "Section");
		textField33.setEditable( false ); // disable editing
		add( textField33 );
		
		textField34 = new JTextField( 9);
		add( textField34 );
		
		textField35 = new JTextField( "Documents Submitted");
		textField35.setEditable( false ); // disable editing
		add( textField35 );
		
		textField36 = new JTextField(46);
		add( textField36 );
		
		button = new JButton( "<" );
		add( button ); // add plainJButton to JFrame
		
		textField37 = new JTextField( "Contact No.");
		textField37.setEditable( false ); // disable editing
		add( textField37 );
		
		textField38 = new JTextField( 12);
		add( textField38 );
		
		textField39 = new JTextField( "Email");
		textField39.setEditable( false ); // disable editing
		add( textField39 );
		
		textField40 = new JTextField( 15);
		add( textField40 );
		
		textField41 = new JTextField( "Nationality");
		textField41.setEditable( false ); // disable editing
		add( textField41 );
		
		textField42 = new JTextField( 16);
		add( textField42 );
	
		
		}

} // end class TextFieldFrame
	