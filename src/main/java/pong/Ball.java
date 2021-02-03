/**
 * This class creates a ball by extending Rectangle class and giving the ball 
 * an initial speed and direction which will increment by invoking move() method. 
 *  
 *  @author jmlb
 */
package pong;

import java.awt.*;
import java.util.*;

public class Ball extends Rectangle {

	private static final long serialVersionUID = 7923823614354986187L;
	Random random;
	int xVelocity;
	int yVelocity;
	int initialSpeed = 2;

	/**
	 * A Ball specifies an area in a coordinate space that is enclosed by the
	 * Ball's object's upper-left point (x,y) in the coordinate space, its width,
	 * and its height. Each Ball will have an initial speed and bearing along
	 * the (x,y) axle. 
	 * 
	 * {@inheritDoc}Rectangle
	 * 
	 */
	Ball(int x, int y, int width, int height) {
		super(x, y, width, height);
		random = new Random();
		int randomXDirection = random.nextInt(2);
		if (randomXDirection == 0) {
			randomXDirection--;
		}
		setXDirection(randomXDirection * initialSpeed);

		int randomYDirection = random.nextInt(2);
		if (randomYDirection == 0) {
			randomYDirection--;
		}
		setYDirection(randomYDirection * initialSpeed);

	}

	/**
	 * 
	 * @param randomXDirection sets the direction on x axle
	 */
	public void setXDirection(int randomXDirection) {
		xVelocity = randomXDirection;

	}

	/**
	 * 
	 * @param randomYDirection sets the direction on the y axle
	 */
	public void setYDirection(int randomYDirection) {
		yVelocity = randomYDirection;
	}

	/**
	 * Invoking move() will set the object moving along the 
	 * (x,y) axle, incrementing the speed each time move() is called.
	 */
	public void move() {
		x += xVelocity;
		y += yVelocity;
	}
	
	/**
	 * Calls draws objects by calling upon the paint method.
	 * 
	 * @param g the graphics to draw.
	 */
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(x, y, height, width);
	}

}
