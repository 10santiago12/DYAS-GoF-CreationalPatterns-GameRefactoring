package com.balitechy.spacewar.main.ColorfulVectorial;

import com.balitechy.spacewar.main.Interfaces.PlayerGraphic;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class ColorfulPlayerGraphic implements PlayerGraphic {

    @Override
    public void render(Graphics g, double x, double y) {
        Graphics2D g2 = (Graphics2D) g;
        int cx = (int) x;
        int cy = (int) y;

        g2.setColor(new Color(30, 144, 255));
        int[] px = {cx, cx - 20, cx + 20};
        int[] py = {cy - 30, cy + 20, cy + 20};
        g2.fillPolygon(px, py, 3);

        g2.setColor(Color.YELLOW);
        g2.setStroke(new BasicStroke(2f));
        g2.drawPolygon(px, py, 3);

        g2.setColor(new Color(255, 215, 0, 180));
        g2.fillOval(cx - 6, cy - 15, 12, 12);
    }
}