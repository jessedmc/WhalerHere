package com.company.view;

import com.company.view.draw.DrawComp;
import com.company.view.draw.DrawCompCloud;
import com.company.view.draw.DrawCompWhale;

import javax.swing.*;
import java.awt.*;

public class RootPanel extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        System.out.println("RootPanel paintComponent(Graphics g) " + g.toString());
        DrawCompWhale drawWhale = View.instance().getDrawWhale();
        DrawCompCloud drawCloud = View.instance().getDrawCloud();
        g.drawImage(drawWhale.getImage(), drawWhale.currentX, drawWhale.currentY, this);
        g.drawImage(drawCloud.getImage(), drawCloud.currentX, drawCloud.currentY, this);
        System.out.println("RootPanel paintComponent(Graphics g) " + g.getColor());

    }
}
