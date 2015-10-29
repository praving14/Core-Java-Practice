package com.practice.MakeAGame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Pravin on 10/12/2015.
 */
public class CheckerBoard extends JPanel {
    private int x =0,
                y= 0,
                HEIGHT = 400,
                NROWS = 8,
                NCOLUMN = 8,
                sqSize = HEIGHT / NROWS;

    public CheckerBoard(){
        super.setDoubleBuffered(true);
    }

    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setBackground(Color.YELLOW);
        for (int i=0; i< NROWS ;i++)
            for (int j=0;j<NCOLUMN; j++) {
                x = j*sqSize;
                y = i*sqSize;
                if (((i+j)%2)==0) {
                    g2d.drawRect(x, y, sqSize, sqSize);
                } else
                {
                    g2d.fillRect(x,y,sqSize,sqSize);
                }

            }
    }
}
