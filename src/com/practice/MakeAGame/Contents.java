package com.practice.MakeAGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Pravin on 10/11/2015.
 */
public class Contents extends JPanel implements ActionListener{
    private Image hero;
    private int x = 100, y=100;
    private Timer t;
    public Contents(){
        super.setDoubleBuffered(true);
        t = new Timer(7,this);
        t.restart();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        ImageIcon imgcon = new ImageIcon(this.getClass().getResource("dot.png"));
        hero = imgcon.getImage();


        Graphics2D g2d = (Graphics2D)g;
        /* drawImage creates the image using the image that we uploaded as a parameter, along with the
        * x and y location. The last parameter is this. I really do not know why.
        */
        g2d.drawImage(hero,x,y,this);

        // drawing random sapes like oval, rectangle and filling them with color
        /* g2d.setBackground(Color.BLUE);
           g2d.fill3DRect(50, 100, 65, 180, false);
           g2d.setColor(Color.CYAN);
           g2d.fillOval(30, 50, 20, 20);
        */
    }
    //lets make this image move now
    private int xV = 1, yV = 1;

    public void moveTheImage(){
        x = x + xV;
        y = y + yV;
    }

    public void actionPerformed(ActionEvent g) {

        moveTheImage();
        // colison detector left and right
        if (x == 0) {
            xV = 1;
        } else if (x == 900 - 108) {
            xV = -1;
        }
        // collision detector up and down
        if (y == 0) {
            yV = 1;
        } else if (y == 600 - 105) {
            yV = -1;
        }

        repaint();
    }

}
