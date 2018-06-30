import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawPanel8_19 extends JPanel {

	private Random randomNumbers = new Random();
	private MyLine8_18[] lines;
	
	public DrawPanel8_19()
	{
		setBackground( Color.WHITE );
		
		lines = new MyLine8_18[ 5 + randomNumbers.nextInt( 5 )];
		
		for (int count = 0; count < lines.length; count++)
		{
			int x1 = randomNumbers.nextInt( 300 );
			int y1 = randomNumbers.nextInt( 300 );
			int x2 = randomNumbers.nextInt( 300 );
			int y2 = randomNumbers.nextInt( 300 );
			
			Color color = new Color( randomNumbers.nextInt(256),
					randomNumbers.nextInt(256), randomNumbers.nextInt(256) );
			
			lines[ count ] = new MyLine8_18( x1, y1, x2, y2, color );
					
		}
	}
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		
		for( MyLine8_18 line : lines )
			line.draw( g );
	}
}
