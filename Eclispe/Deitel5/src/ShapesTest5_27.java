import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest5_27 {

	public static void main(String [] args)
	{
		String input = JOptionPane.showInputDialog("Enter 1 to draw rectangles\n" 
											 	 + "Enter 2 to draw ovals");
		
		int choice = Integer.parseInt( input );
		
		Shapes5_26 panel = new Shapes5_26( choice );
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(1000, 1000);
		application.setVisible(true);
		
	}
}
