package com.company.view.draw;

/**
 * Factory class for creating drawing components in the View.
 */
public class DrawFactory {
    public static ViewWhale createDrawWhale() {
        ViewWhale drawWhale = new ViewWhale();
        return drawWhale;
    }

    public static ViewCloud createDrawCloud() {
        ViewCloud drawCloud = new ViewCloud();
        return drawCloud;
    }
    
    public static ViewStar createDrawStar() {
        ViewStar drawStar = new ViewStar();
        return drawStar;
    }

    public static ViewGlitter createDrawGlitter() {
        ViewGlitter drawGlitter = new ViewGlitter();
        return drawGlitter;
    }
    
    
}
