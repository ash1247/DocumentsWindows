import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;


@SuppressWarnings("serial")
class GUI4_02 extends JPanel {

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
		    for(int i = 0; i < 15; i++ ){
		    g.drawLine(0, xDelta, yDelta, 0 );
		    g.drawLine(400, xDelta, xDelta, 0 );
		    g.drawLine(0, yDelta, yDelta, 400 );
		    g.drawLine(400, yDelta, xDelta, 400 );

		    xDelta += wSteps;
		    yDelta -= hSteps;
		    }
			
		}
	}

	public class GUI4_2{

		public static void main(String [] args)
		{
			GUI4_02 panel = new GUI4_02();
			
			JFrame application = new JFrame();
			
			application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			application.add(panel);
			application.setSize( 420, 450 );
			application.setVisible( true );
			
		}
	}



