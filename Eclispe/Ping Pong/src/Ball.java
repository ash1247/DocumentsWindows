import java.awt.Color;
import java.awt.Graphics;

public class Ball {

	double xVel, yVel, x, y;
	
	public Ball() {
		x = Tennis.WIDTH / 2;
		y = Tennis.HEIGHT / 2;
		xVel = getRandomSpeed() * getRandomDirection();
		yVel = getRandomSpeed() * getRandomDirection();
		
	}
	
	public double getRandomSpeed() {
		return(Math.random() *3 + 2);
	}
	
	public int getRandomDirection()
	{
		int rand = (int)(Math.random() * 2);
		if(rand == 1)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	public void checkPaddleCollision(Paddle p1, Paddle p2)
	{
		if( x <= 50)
		{
			if( y >= p1.getY() && y <= p1.getY() + 80)
			{
				xVel = - xVel;
			}
		}
		else if( x >= Tennis.WIDTH - 50 )
		{
			if( y >= p2.getY() && y <= p2.getY() + 80)
			{
				xVel = - xVel;
			}
		}
	}
	
	public void draw( Graphics g )
	{
		g.setColor(Color.white);
		g.fillOval((int)x - 10, (int)y - 10, 20, 20);
	}
	
	public void move() {
		x += xVel;
		y += yVel;
		
		if( y < 10 )
		{
			yVel = -yVel;
		}
		if( y > Tennis.HEIGHT - 10 )
		{
			yVel = -yVel;
		}
	}
	
	public int getX() {
		
		return (int)x;
	}
	
	public int getY() {
		
		return (int)y;
	}
}
