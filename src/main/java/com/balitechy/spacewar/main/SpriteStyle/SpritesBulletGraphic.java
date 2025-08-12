package com.balitechy.spacewar.main.SpriteStyle;

import com.balitechy.spacewar.main.Interfaces.BulletGraphic;
import com.balitechy.spacewar.main.Game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class SpritesBulletGraphic implements BulletGraphic {
    private Game game;
    private BufferedImage img;
    public static final int WIDTH = 11;
    public static final int HEIGHT = 21;

    public SpritesBulletGraphic(Game game) {
        this.game = game;
        img = game.getSprites().getImage(35, 52, WIDTH, HEIGHT);
    }

    @Override
    public void render(Graphics g, double x, double y) {
        g.drawImage(img, (int) x, (int) y, null);
    }
}