package com.work.game.logic;

import com.work.game.logic.Shape.Tetrominoes;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class NextShape extends JPanel {

    private Shape nextPiece;

    public NextShape() {
        setPreferredSize(new Dimension(90, 90));
        nextPiece = new Shape();
    }

    public void setNextPiece(Shape piece) {
        this.nextPiece = piece;
    }

    public void draw(Graphics g) {
        if (nextPiece != null) {
            drawNextPiece(g);
        }
    }

    private void drawNextPiece(Graphics g) {
        int squareWidth = getWidth() / 8;  
        int squareHeight = getHeight() / 8; 
        int offsetX = getWidth() / 2 - (squareWidth * 2);  
        int offsetY = getHeight() / 2 - (squareHeight * 2); 
        for (int i = 0; i < 4; i++) {
            int x = nextPiece.x(i);  
            int y = nextPiece.y(i);  
            drawSquare(g, offsetX + x * squareWidth, offsetY + y * squareHeight, nextPiece.getShape());
        }
    }

    private void drawSquare(Graphics g, int x, int y, Tetrominoes shape) {
        Color[] colors = {new Color(0, 0, 0), new Color(204, 102, 102),
            new Color(102, 204, 102), new Color(102, 102, 204),
            new Color(204, 204, 102), new Color(204, 102, 204),
            new Color(102, 204, 204), new Color(218, 170, 0)};

        var color = colors[shape.ordinal()];
        g.setColor(color);
        g.fillRect(x + 1, y + 1, getWidth() / 8 - 2, getHeight() / 8 - 2);
    }
}
