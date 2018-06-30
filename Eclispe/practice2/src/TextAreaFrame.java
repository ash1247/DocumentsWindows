import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextAreaFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea textArea1;
	private JTextArea textArea2;
	private JButton copyJButton;
	
	public TextAreaFrame()
	{
		super( "TextArea Demo" );
		Box box = Box.createHorizontalBox();
		String demo = "ads asdasd asd asdasda dfs\n"
				+ "asakjfasl seofidh f waoji asojfi\n"
				+ "asifowehgoijsd aojfis o \neafuioasfuoai jds aslkdjsa lkdasj laj l";
		
		textArea1 = new JTextArea( demo, 10, 15);
		box.add( new JScrollPane( textArea1 ) );
		
		copyJButton = new JButton( "Copy >>>" );
		box.add( copyJButton );
		copyJButton.addActionListener(
				
				new ActionListener()
				{
					public void actionPerformed( ActionEvent event )
					{
						textArea2.setText( textArea1.getSelectedText() );
					}
				});
		
		textArea2 = new JTextArea(10, 15);
		textArea2.setEditable( false );
		box.add( new JScrollPane (textArea2 ) );
		
		add( box );
	}
}
