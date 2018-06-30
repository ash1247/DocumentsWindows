import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes5_26 extends JPanel 
{
		private int choice;
	
	public Shapes5_26(int userChoice)
	{
		choice = userChoice;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	
	for (int i = 0; i < 10; i++)
	{
		switch (choice)
		{
		case 1:
			g.drawRect( 100 + i *10, 100 + i *10, 500 + i * 10, 500 + i * 10);
			break;
			
		case 2:
			g.drawOval(100 + i *10, 100 + i *10, 500 + i * 10, 500 + i * 10);
			break;
		}
	
	}
	}
}