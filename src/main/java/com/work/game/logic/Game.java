package com.work.game.logic;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.SwingConstants.CENTER;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author linux
 */
public class Game {

    private JLabel statusBar;

    public void play() {
        JFrame frame = new JFrame("Tetris");
        statusBar = new JLabel(" Line: 0", CENTER);
        Board board = new Board(this);
        board.start();
        frame.setLayout(new BorderLayout());
        frame.add(statusBar, BorderLayout.SOUTH);
        frame.add(board, BorderLayout.CENTER);
        frame.setResizable(false);
        frame.setSize(500, 800);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public JLabel getStatusBar() {
        return statusBar;
    }

}
