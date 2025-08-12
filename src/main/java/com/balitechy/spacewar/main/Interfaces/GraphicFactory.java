package com.balitechy.spacewar.main.Interfaces;

import com.balitechy.spacewar.main.Game;

public interface GraphicFactory {
    PlayerGraphic createPlayerGraphic(Game game);
    BulletGraphic createBulletGraphic(Game game);
    BackgroundGraphic createBackgroundGraphic(Game game);
}