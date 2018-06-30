import javax.swing.JFrame;

public class DrawPanelTest4_19{

	public static void main(String [] args)
	{
		DrawPanel4_18 panel = new DrawPanel4_18();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);
		application.setSize( 500, 500 );
		application.setVisible( true );
		
	}
}
