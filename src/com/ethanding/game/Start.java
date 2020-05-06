package com.ethanding.game;

import javax.swing.*;

public class Start {

    public static void main(String[] args){
        Game game = new Game();

        Jframe window = new Jframe("2048");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setReiszeable(false);
        window.add(game);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVariable(true);

        game.start();
    }
}
