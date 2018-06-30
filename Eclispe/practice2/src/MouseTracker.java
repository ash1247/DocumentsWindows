import javax.swing.JFrame;

public class MouseTracker {

	public static void main( String[] args )
	{
		MouseTrackerFrame mouse = new MouseTrackerFrame();
		mouse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mouse.setSize(500, 300);
		mouse.setVisible(true);
	}
}
