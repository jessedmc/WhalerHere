package com.company.view.draw;

/**
 * Factory class for creating drawing components in the View.
 */
public class DrawFactory {
    /**
     * Creates whale character.
     * @return drawWhale, the whale character.
     */
    public static ViewWhale createDrawWhale() {
        ViewWhale drawWhale = new ViewWhale();
        return drawWhale;
    }
    /**
     * Creates cloud character.
     * @return drawCloud, the cloud character.
     */
    public static ViewCloud createDrawCloud() {
        ViewCloud drawCloud = new ViewCloud();
        return drawCloud;
    }
    /**
     * Creates star character.
     * @return drawStar, the star character.
     */
    public static ViewStar createDrawStar() {
        ViewStar drawStar = new ViewStar();
        return drawStar;
    }
    /**
     * Creates glitter character.
     * @return drawGlitter, the glitter character.
     */
    public static ViewGlitter createDrawGlitter() {
        ViewGlitter drawGlitter = new ViewGlitter();
        return drawGlitter;
    }
    
    
}
