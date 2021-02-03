/**
 * This class creates the GameFrame and starts the game by creating an instance of GamePanel 
 * 
 * @author jmlb
 */

package pong;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame {
    GamePanel panel;

    
    GameFrame() {
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false); 
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true); 
        this.setLocationRelativeTo(null);
    }
} 