package com.hacktheburgh.skb;

import de.gurkenlabs.litiengine.graphics.TextRenderer;
import de.gurkenlabs.litiengine.gui.screens.GameScreen;
import de.gurkenlabs.litiengine.resources.Resources;

import java.awt.*;

public class MainGameScreen extends GameScreen {

    public MainGameScreen() {
        super("MAIN");
    }
    @Override
    public void render(final Graphics2D g) {
        super.render(g);
        //g.setFont(Resources.fonts().get("customfont.ttf",32f));
        g.setColor(Color.RED);
        TextRenderer.render(g, "Appleton: Occupied", 100, 100);
    }
}
