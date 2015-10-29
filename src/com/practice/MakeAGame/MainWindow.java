package com.practice.MakeAGame;

import javax.swing.*;

/**
 * Created by Pravin on 10/11/2015.
 */
public class MainWindow extends JFrame {
//Creating a main window for the game.
    public MainWindow(){
        super.setTitle("Chess Game");
        super.setSize(600, 600);
        super.setResizable(true);
        //super.add(new Contents());
        super.add(new CheckerBoard());
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);


    }

    public static void main(String[] args){
        new MainWindow();
    }
}
