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
		assertTrue(panel.ball.x <= GamePanel.GAME_WIDTH - GamePanel.BALL_DIAMETER);
	}

	@Test
	void testPanelIsFocusable() {
		GamePanel panel = new GamePanel();
		assertTrue(panel.isFocusable());

	}

	void testPanelIsCorrectSize() {
		GamePanel panel = new GamePanel();
		assertEquals(GamePanel.SCREEN_SIZE, panel.getPreferredSize());

	}
	
	

}