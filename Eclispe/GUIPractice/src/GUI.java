import javax.swing.JFrame;

public class GUI
{
	
	public static void main( String[] args )
 	{
		TextFieldFrame textFieldFrame = new TextFieldFrame();
		textFieldFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		textFieldFrame.setSize( 720, 320 ); 
		textFieldFrame.setResizable( false ); 
		textFieldFrame.setVisible( true ); 
		
	} // end main
} // end class TextFieldTest