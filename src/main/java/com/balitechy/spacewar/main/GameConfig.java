package com.balitechy.spacewar.main;

import com.balitechy.spacewar.main.Interfaces.GraphicFactory;
import com.balitechy.spacewar.main.SpriteStyle.SpritesFactory;
import com.balitechy.spacewar.main.VectorialStyle.VectorialFactory;
import com.balitechy.spacewar.main.ColorfulVectorial.ColorfulVectorialFactory;

public class GameConfig {

    public enum Style {
        SPRITES, VECTORIAL, COLORFUL_VECTORIAL
    }

    public static final Style DEFAULT_STYLE = Style.VECTORIAL;

    public static GraphicFactory getFactory() {
        switch (DEFAULT_STYLE) {
            case VECTORIAL:
                return new VectorialFactory();
            case COLORFUL_VECTORIAL:
                return new ColorfulVectorialFactory();
            case SPRITES:
            default:
                return new SpritesFactory();
        }
    }
}
