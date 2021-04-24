package com.company.view;

import com.company.view.draw.ViewCloud;
import com.company.view.draw.ViewGlitter;
import com.company.view.draw.ViewStar;
import com.company.view.draw.ViewWhale;

import javax.swing.*;
import java.awt.*;

public class RootPanel extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        System.out.println("RootPanel paintComponent(Graphics g) " + g.toString());
        ViewWhale drawWhale = View.instance().getDrawWhale();
        ViewCloud drawCloud = View.instance().getDrawCloud();
        ViewStar drawStar = View.instance().getDrawStar();
        ViewGlitter drawGlitter = View.instance().getDrawGlitter();
        g.drawImage(drawWhale.getImage(), drawWhale.currentX, drawWhale.currentY, this);
        g.drawImage(drawCloud.getImage(), drawCloud.currentX, drawCloud.currentY, this);
        g.drawImage(drawStar.getImage(), drawStar.currentX, drawStar.currentY, this);
        g.drawImage(drawGlitter.getImage(), drawGlitter.currentX, drawGlitter.currentY, this);
        System.out.println("RootPanel paintComponent(Graphics g) " + g.getColor());



    }
}
