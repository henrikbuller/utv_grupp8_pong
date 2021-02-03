package pong;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.jupiter.api.Test;

class PaddleTest {
	
	
	
	@Test
	public void PaddelConstructorTest() {
		Paddle p1 = new Paddle(5, 5, 25, 100, 1);
		assertEquals(5, p1.getX());
		assertEquals(5, p1.getY());
		assertEquals(25, p1.getWidth());
		assertEquals(100, p1.getHeight());
		assertEquals(1, p1.id);
		
	}
	
	@Test
	public void setYDirectionTest() {
		Paddle p1 = new Paddle(5, 5, 25, 100, 1);
		p1.setYDirection(0);
		assertEquals(0, p1.yVelocity);
	}
	
	
	@Test
	public void moveTest() {
		Paddle p1 = new Paddle(5, 5, 25, 100, 1);
		p1.move();
		
	}

	/*@Test
	public void keyPressTest() throws AWTException {
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_W);
		rob.keyPress(KeyEvent.VK_S);
		rob.keyPress(KeyEvent.VK_UP);
		rob.keyPress(KeyEvent.VK_DOWN);
	}*/
		
		
		

}
