import javax.swing.JFrame;

public class TestDraw8_20 {

	public static void main( String[] args )
	{
		DrawPanel8_19 panel = new DrawPanel8_19();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add( panel );
		application.setSize( 300 , 300 );
		application.setVisible(true);
	}
}
