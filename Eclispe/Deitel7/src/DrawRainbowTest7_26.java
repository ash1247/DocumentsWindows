import javax.swing.JFrame;

public class DrawRainbowTest7_26 {

	public static void main( String[] args )
	{
		DrawRainbow7_25 panel = new DrawRainbow7_25();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(800, 500);
		application.setVisible(true);
	}
}
