package com.balitechy.spacewar.main.VectorialStyle;

import com.balitechy.spacewar.main.Interfaces.BulletGraphic;

import java.awt.Color;
import java.awt.Graphics;

public class VectorialBullet implements BulletGraphic {

    @Override
    public void render(Graphics g, double x, double y) {
        g.setColor(Color.BLACK);
        g.fillOval((int)x, (int)y, 6, 10);
    }
}