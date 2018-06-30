import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

@SuppressWarnings("serial")
class GUI4_01 extends JPanel {

	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		
		int width = getWidth();
		int height = getHeight();
		int wSteps = width / 15;
	    int hSteps = height / 15;

	    int xDelta = wSteps;
	    int yDelta = height;

	    // draw a series of lines fanning from top corner
	    //comment out last three lines in for loop for a single spectrum.
	    for(int i=0; i<15; i++){
	    g.drawLine(0, 0, xDelta, yDelta);
	    g.drawLine(400, 0, xDelta, xDelta);
	    g.drawLine(0, 400, yDelta, yDelta);
	    g.drawLine(400, 400, yDelta, xDelta);

	    xDelta += wSteps;
	    yDelta -= hSteps;
	    }
		
	}
}

public class GUI4_1{

	public static void main(String [] args)
	{
		GUI4_01 panel = new GUI4_01();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);
		application.setSize( 420, 450 );
		application.setVisible( true );
		
	}
}

