package pong;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BallTest {

	@Test
	public void testCreateBall() {
		Ball theBall = new Ball(10, 20, 30, 40);
		assertEquals(10, theBall.getX());
		assertEquals(20, theBall.getY());
		assertEquals(30, theBall.getWidth());
		assertEquals(40, theBall.getHeight());
	}
	
	
	
}
