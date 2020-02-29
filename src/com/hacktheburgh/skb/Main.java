package com.hacktheburgh.skb;

import de.gurkenlabs.litiengine.Game;

public class Main {

    public static void main(String[] args) {
        Game.init();
        Game.screens().add(new MainGameScreen());
        Game.screens().display("MAIN");
        Game.start( );
    }
}
