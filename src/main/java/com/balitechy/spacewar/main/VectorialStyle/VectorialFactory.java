package com.balitechy.spacewar.main.VectorialStyle;

import com.balitechy.spacewar.main.Interfaces.*;
import com.balitechy.spacewar.main.Game;

public class VectorialFactory implements GraphicFactory {

    @Override
    public PlayerGraphic createPlayerGraphic(Game game) {
        return new VectorialPlayer();
    }

    @Override
    public BulletGraphic createBulletGraphic(Game game) {
        return new VectorialBullet();
    }

    @Override
    public BackgroundGraphic createBackgroundGraphic(Game game) {
        return new VectorialBackground();
    }
}
