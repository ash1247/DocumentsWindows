import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawPanel4_18 extends JPanel {

	public void paintComponent( Graphics g )
	{
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		
		g.drawLine( 0, 0, width, height );
		
		g.drawLine(0, width, height, 0);
		
	}
}
