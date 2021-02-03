/**
 * This class creates, designs and adjusts
 * the games two Paddles on the Y-axis
 * @author Alexander Gabay
 */


package pong;

import java.awt.*;
import java.awt.event.*;

public class Paddle extends Rectangle {

	int id;
	int yVelocity;
	int speed = 10;

	Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) {
		super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
		this.id = id;
	}
	
	
	
/** 
* @param This method reads the key input from
* the four different keys
* @return If one of the keys are pressed
* sets the movement on the Y-axis to the set speed.
*/	

	public void keyPressed(KeyEvent e) {
		switch (id) {
		case 1:
			if (e.getKeyCode() == KeyEvent.VK_W) {
				setYDirection(-speed);
				move();
			}
			if (e.getKeyCode() == KeyEvent.VK_S) { 
				setYDirection(speed);
				move();
			}
			break;

		case 2:
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				setYDirection(-speed);
				move();
			}
			if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				setYDirection(speed);
				move();
			}
			break;
		}

	}

/** 	
 * @param This method reads the key input from
 * the four different keys
 * @return If one of the keys are released
 * sets the movement on the Y-axis to 0.
 */
	public void keyReleased(KeyEvent e) {
		switch (id) {
		case 1:
			if (e.getKeyCode() == KeyEvent.VK_W) {
				setYDirection(0);
				move();
			}
			if (e.getKeyCode() == KeyEvent.VK_S) {
				setYDirection(0);
				move();
			}
			break;

		case 2:
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				setYDirection(0);
				move();
			}
			if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				setYDirection(0);
				move();
			}
			break;
		}

	}

	public void setYDirection(int yDirection) {
		yVelocity = yDirection;

	}

	public void move() {
		y = y + yVelocity;

	}

	/**
	 * 
	 * @param g This method paints the paddles
	 */
	public void draw(Graphics g) {
		if (id == 1)
			g.setColor(Color.blue);
		else
			g.setColor(Color.pink);

		g.fillRect(x, y, width, height);
	}

}
