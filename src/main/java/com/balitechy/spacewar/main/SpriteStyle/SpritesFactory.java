package com.balitechy.spacewar.main.SpriteStyle;

import com.balitechy.spacewar.main.Interfaces.*;
import com.balitechy.spacewar.main.Game;

public class SpritesFactory implements GraphicFactory {

    @Override
    public PlayerGraphic createPlayerGraphic(Game game) {
        return new SpritesPlayerGraphic(game);
    }

    @Override
    public BulletGraphic createBulletGraphic(Game game) {
        return new SpritesBulletGraphic(game);
    }

    @Override
    public BackgroundGraphic createBackgroundGraphic(Game game) {
        return new SpritesBackgroundGraphic(game);
    }
}
