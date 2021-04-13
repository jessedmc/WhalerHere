package com.company.view.draw;

public class DrawFactory {
    public static DrawCompWhale createDrawWhale() {
        DrawCompWhale drawWhale = new DrawCompWhale();



        return drawWhale;
    }

    public static DrawCompCloud createDrawCloud() {
        DrawCompCloud drawCloud = new DrawCompCloud();
        return drawCloud;
    }
    
    public static DrawCompStar createDrawStar() {
        DrawCompStar drawStar = new DrawCompStar();
        return drawStar;
    }
    
    
}
