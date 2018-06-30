import javax.swing.JFrame;

public class DrawSmileyTest6_12 {

	public static void main(String [] args)
	{
		DrawSmiley6_11 panel = new DrawSmiley6_11();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300, 350);
		application.setVisible(true);
	}
}
