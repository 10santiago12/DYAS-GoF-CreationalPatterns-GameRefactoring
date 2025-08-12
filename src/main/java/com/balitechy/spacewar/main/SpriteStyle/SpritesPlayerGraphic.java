package com.balitechy.spacewar.main.SpriteStyle;

import com.balitechy.spacewar.main.Interfaces.PlayerGraphic;
import com.balitechy.spacewar.main.Game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class SpritesPlayerGraphic implements PlayerGraphic {
    private Game game;
    private BufferedImage img;
    public static final int WIDTH = 56;
    public static final int HEIGHT = 28;

    public SpritesPlayerGraphic(Game game) {
        this.game = game;
        // Use the sprites sheet
        img = game.getSprites().getImage(219, 304, WIDTH, HEIGHT);
    }

    @Override
    public void render(Graphics g, double x, double y) {
        g.drawImage(img, (int) x, (int) y, null);
    }
}
