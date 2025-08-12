package com.balitechy.spacewar.main.VectorialStyle;

import com.balitechy.spacewar.main.Interfaces.PlayerGraphic;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class VectorialPlayer implements PlayerGraphic {

    @Override
    public void render(Graphics g, double x, double y) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(2f));
        // simple retro ship: triangle
        int cx = (int) x;
        int cy = (int) y;
        int[] xs = {cx, cx + 28, cx + 56};
        int[] ys = {cy + 28, cy, cy + 28};
        g2.drawPolygon(xs, ys, 3);
        // center line
        g2.drawLine(cx + 28, cy + 4, cx + 28, cy + 24);
    }
}
