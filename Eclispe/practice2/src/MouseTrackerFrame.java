import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseTrackerFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel mousePanel;
	private JLabel statusBar;
	
	public MouseTrackerFrame()
	{
		super("Mouse Events");
		
		mousePanel = new JPanel();
		mousePanel.setBackground(Color.WHITE);
		add( mousePanel, BorderLayout.CENTER);
		
		statusBar = new JLabel("Mouse outside JPanel");
		add( statusBar, BorderLayout.SOUTH);
		
		MouseHandler handler = new MouseHandler();
		mousePanel.addMouseListener( handler );
		mousePanel.addMouseMotionListener( handler );
		
	}
	
	private class MouseHandler implements MouseListener, MouseMotionListener
	{
		public void mouseClicked(MouseEvent event )
		{
			statusBar.setText( String.format("Clicked at [%d, %d]", event.getX(), event.getY() ) ); 
		}

		@Override
		public void mouseDragged(MouseEvent event) {
			
			statusBar.setText( String.format("Dragged at [%d, %d]", event.getX(), event.getY() ) ); 
			
		}

		@Override
		public void mouseMoved(MouseEvent event) {
			
			statusBar.setText( String.format("Moved at [%d, %d]", event.getX(), event.getY() ) ); 
			
		}

		@Override
		public void mouseEntered(MouseEvent event) {
			
			statusBar.setText( String.format("Entered at [%d, %d]", event.getX(), event.getY() ) ); 
			mousePanel.setBackground( Color.GRAY );
		}

		@Override
		public void mouseExited(MouseEvent arg0) {

			statusBar.setText( "Mouse Outside JPanel" );
			mousePanel.setBackground( Color.white );
		}

		@Override
		public void mousePressed(MouseEvent event) {
			statusBar.setText( String.format("Pressed at [%d, %d]", event.getX(), event.getY() ) ); 
			
		}

		@Override
		public void mouseReleased(MouseEvent event) {
			statusBar.setText( String.format("Released at [%d, %d]", event.getX(), event.getY() ) ); 
			
		}
	}
}
