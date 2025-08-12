package com.balitechy.spacewar.main.ColorfulVectorial;

import com.balitechy.spacewar.main.Interfaces.*;
import com.balitechy.spacewar.main.Game;

public class ColorfulVectorialFactory implements GraphicFactory {

    @Override
    public PlayerGraphic createPlayerGraphic(Game game) {
        return new ColorfulPlayerGraphic();
    }

    @Override
    public BulletGraphic createBulletGraphic(Game game) {
        return new ColorfulBulletGraphic();
    }

    @Override
    public BackgroundGraphic createBackgroundGraphic(Game game) {
        return new ColorfulBackgroundGraphic();
    }
}
