package com.work.game;

import com.work.game.logic.Game;
import java.awt.EventQueue;

public class Tetris {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Game game = new Game();
            game.play();
        });
    }
}
