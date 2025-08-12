package com.balitechy.spacewar.main.VectorialStyle;

import com.balitechy.spacewar.main.Interfaces.BackgroundGraphic;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import java.io.IOException;

public class VectorialBackground implements BackgroundGraphic {

    @Override
    public void render(Graphics g, Canvas c) throws IOException {
        // Fondo blanco
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, c.getWidth(), c.getHeight());

        // Estrellas negras
        g.setColor(Color.BLACK);
        for (int i = 0; i < 80; i++) {
            int sx = (i * 37) % c.getWidth();
            int sy = (i * 59) % c.getHeight();
            g.drawLine(sx, sy, sx, sy); // un punto
        }

        // Luna: solo borde negro
        g.setColor(Color.BLACK);
        g.drawOval(20, 20, 100, 100);
    }
}