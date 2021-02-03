package pong;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Color;

import javax.swing.*;

import org.junit.jupiter.api.Test;

class GameFrameTest extends JFrame {
	
	@Test
	void gameFrameTest() {
		GamePanel tester = new GamePanel();
		tester.setBackground(Color.black);
		assertEquals(Color.black, tester.getBackground() );
	}
	
}
