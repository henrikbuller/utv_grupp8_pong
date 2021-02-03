package pong;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;


class GamePanelTest {

	
	@Test
	void testGamePanelConstructorCreatesNewBallInsideGamePanel() {
		GamePanel panel = new GamePanel();
		// ball is not outside left of GamePanel
		assertTrue(panel.ball.x >= 0);
		// ball is not outside right of GamePanel
		assertTrue(panel.ball.x <= panel.GAME_WIDTH - panel.BALL_DIAMETER);
	}

	@Test
	void testPanelIsFocusable() {
		GamePanel panel = new GamePanel();
		assertTrue(panel.isFocusable());

	}

	void testPanelIsCorrectSize() {
		GamePanel panel = new GamePanel();
		assertEquals(panel.SCREEN_SIZE, panel.getPreferredSize());

	}
	
	

}