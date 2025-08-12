package com.balitechy.spacewar.main.ColorfulVectorial;

import com.balitechy.spacewar.main.Interfaces.BulletGraphic;

import java.awt.Graphics;
import java.awt.Color;

public class ColorfulBulletGraphic implements BulletGraphic {

    @Override
    public void render(Graphics g, double x, double y) {
        g.setColor(Color.ORANGE);
        g.fillOval((int)x, (int)y, 6, 10);
        g.setColor(Color.YELLOW);
        g.drawOval((int)x, (int)y, 6, 10);
    }
}