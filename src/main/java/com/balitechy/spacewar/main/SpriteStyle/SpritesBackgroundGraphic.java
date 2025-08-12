package com.balitechy.spacewar.main.SpriteStyle;

import com.balitechy.spacewar.main.Interfaces.BackgroundGraphic;
import com.balitechy.spacewar.main.SpritesImageLoader;
import com.balitechy.spacewar.main.Game;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SpritesBackgroundGraphic implements BackgroundGraphic {
    private Game game;
    private BufferedImage background;

    public SpritesBackgroundGraphic(Game game) {
        this.game = game;
        try {
            // Load background from resource bg.png (same approach you used)
            SpritesImageLoader loader = new SpritesImageLoader("/bg.png");
            loader.loadImage();
            background = loader.getImage(0, 0, 640, 480);
        } catch (IOException e) {
            background = null;
        }
    }

    @Override
    public void render(Graphics g, Canvas c) throws IOException {
        if (background != null) {
            g.drawImage(background, 0, 0, c.getWidth(), c.getHeight(), c);
        } else {
            // fallback plain black
            g.setColor(java.awt.Color.BLACK);
            g.fillRect(0, 0, c.getWidth(), c.getHeight());
        }
    }
}