package com.balitechy.spacewar.main.ColorfulVectorial;

import com.balitechy.spacewar.main.Interfaces.BackgroundGraphic;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import java.io.IOException;
import java.util.Random;

public class ColorfulBackgroundGraphic implements BackgroundGraphic {

    @Override
    public void render(Graphics g, Canvas c) throws IOException {
        // Fondo con bandas horizontales de colores
        for (int y = 0; y < c.getHeight(); y += 8) {
            float hue = (y / (float)c.getHeight());
            g.setColor(Color.getHSBColor(hue, 0.6f, 0.8f));
            g.fillRect(0, y, c.getWidth(), 8);
        }

        // Estrellas aleatorias de colores
        Random r = new Random(12345);
        for (int i = 0; i < 120; i++) {
            int sx = r.nextInt(c.getWidth());
            int sy = r.nextInt(c.getHeight());
            g.setColor(new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
            g.drawLine(sx, sy, sx, sy); // punto de color
        }

        g.setColor(Color.BLUE);
        g.fillOval(20, 20, 100, 100);
        g.setColor(Color.BLACK);
        g.drawOval(20, 20, 100, 100);
    }
}
