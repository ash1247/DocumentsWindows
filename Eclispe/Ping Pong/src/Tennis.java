import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Tennis extends Applet implements Runnable, KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	final static int WIDTH = 720, HEIGHT = 480;
	
	Thread thread;
	HumanPaddle p1;
	AIPaddle p2;
	Ball b1;
	boolean gameStart;
	Graphics gfx;
	Image img;
	
	public void init() {
		
		this.resize(WIDTH, HEIGHT);
		
		this.addKeyListener( this );
		
		gameStart = false;
		
		p1 = new HumanPaddle(1);
		b1 = new Ball();
		p2 = new AIPaddle(2, b1);
		img = createImage( WIDTH, HEIGHT );
		gfx = img.getGraphics();
		
		thread = new Thread( this );
		thread.start();
	}
	
	
	public void paint(Graphics g) {
		
		gfx.setColor( Color.BLACK );
		gfx.fillRect(0, 0, WIDTH, HEIGHT);
		
		
		if( b1.getX() < -10 || b1.getX() > Tennis.WIDTH + 10 ) {
			gfx.setColor(Color.red);
			gfx.drawString("Game Over!!", Tennis.WIDTH / 2, Tennis.HEIGHT / 2);
		}
		else
		{
			p1.draw(gfx);
			p2.draw(gfx);
			b1.draw(gfx);
		}
		if( !gameStart )
		{
			gfx.setColor(Color.white);
			gfx.drawString("Tennis", Tennis.WIDTH / 2 - 40, Tennis.HEIGHT / 2 - 60);
			gfx.drawString("Press Enter to begin", Tennis.WIDTH / 2 - 40, Tennis.HEIGHT / 2 - 40 );
		}
		
		g.drawImage(img, 0, 0, this);
	}
	
	public void update(Graphics g) {
		
		paint(g);
	}


	@Override
	public void run() {
		
		for(; ;) {
			
			if( gameStart )
			{
				
			
				p1.move();
				p2.move();
				b1.move();
				b1.checkPaddleCollision(p1, p2);
			}
				repaint();
				
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
		}
	}


	@Override
	public void keyPressed(KeyEvent e) {
		
		if( e.getKeyCode() == KeyEvent.VK_UP ) {
			
			p1.setUpAccel(true);
			
		} 
		
		else if ( e.getKeyCode() == KeyEvent.VK_DOWN ) {
			p1.setDownAccel( true );
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_ENTER )
		{
			gameStart = true;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {

		if( e.getKeyCode() == KeyEvent.VK_UP ) {
		
			p1.setUpAccel(false);
			
		} 
		
		else if ( e.getKeyCode() == KeyEvent.VK_DOWN ) {
			
			p1.setDownAccel( false );
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_ENTER )
		{
			
		}
		
	}


	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
