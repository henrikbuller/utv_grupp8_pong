package pong;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
	/**
	 * 
	 * @author jmlb
	 *
	 */
class BallTest {
	Ball theBall = new Ball(10, 10, 30, 30);
	int velocity = 2;
	
	@Test
	void testCreateBall() {
		assertEquals(10, theBall.getX());
		assertEquals(10, theBall.getY());
		assertEquals(30, theBall.getWidth());
		assertEquals(30, theBall.getHeight());
	}
	
	/**
	 * Test that the xVelocity/yVelocity in move() is equal to
	 *  x/y from the ball constructor + (randomNum * intialSpeed)
	 *  here replaced by 2. 
	 */
	@Test
	void initialMoveValueTest() {
		double move = theBall.getX() + velocity;
		assertEquals(12, move);
	}
	
}
