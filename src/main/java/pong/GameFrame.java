package src.main.java.pong;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends Jframe {

    GamePanel panel;

    GameFrame() {
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable("false");
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
        this.pack();
        this.setVisable(true);
        this.setLocationRelativeTo(null);
    }
}