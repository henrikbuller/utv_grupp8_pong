/**
 * This class creates the GameFrame and starts the game by creating an instance of GamePanel 
 * 
 * @author jmlb
 */

package pong;

import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame {
	private static final long serialVersionUID = -5967994939938066101L;
	GamePanel panel;

    
    GameFrame() {
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false); 
        this.setBackground(Color.blue.darker());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true); 
        this.setLocationRelativeTo(null);
    }
} 