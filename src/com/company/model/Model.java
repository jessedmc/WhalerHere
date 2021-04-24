package com.company.model;

import com.company.extra.Layout;
import com.company.view.View;

/**
 * This class is the top level environment for the model of program. Data store in the model
 * mainly consists of the whale's health and score as opposed to character positions and dimensions.
 */
public class Model {
    private static Model instance = null;
    private ModelCharacter modelCloud;
    private ModelCharacter modelStar;
    private ModelCharacter modelGlitter;
    private ModelCharacter modelWhale;
    private String gameMode = "start";
    private int health = 3;
    private int score = 0;
    private boolean invincible = false;
    public final int SCORE_INC_FROM_STAR_HIT = 1000;


    private Model() {

    }


    public static Model instance() {
        if (instance == null)
            instance = new Model();
        return instance;
    }

    public void init() {
        System.out.println("Model init() ");
        this.modelCloud = new ModelCloud("cloudOne");
        this.modelStar = new ModelStar("starOne");
        this.modelGlitter = new ModelGlitter("glitterOne");
        this.modelWhale = new ModelWhale("whale");
        this.setGameModeToStart();

    }



    public void setGameModeToStart() {
        System.out.println("Model setGameModeToStart() ");

        // character positions at start game are not seen by the model
        // set dimensions of characters, dimensions are stored in Layout
        this.modelWhale.setCurrentHeight(Layout.instance().WHALE_HEIGHT);
        this.modelWhale.setCurrentWidth(Layout.instance().WHALE_WIDTH);
        this.modelStar.setCurrentHeight(Layout.instance().STAR_HEIGHT);
        this.modelStar.setCurrentWidth(Layout.instance().STAR_WIDTH);
        this.modelCloud.setCurrentHeight(Layout.instance().CLOUD_HEIGHT);
        this.modelCloud.setCurrentWidth(Layout.instance().CLOUD_WIDTH);
        this.modelGlitter.setCurrentHeight(Layout.instance().GLITTER_HEIGHT);
        this.modelGlitter.setCurrentWidth(Layout.instance().GLITTER_WIDTH);

        System.out.println("Model setGameModeToStart()      this.modelWhale.getCurrentX() " + this.modelWhale.getCurrentX());
        System.out.println("Model setGameModeToStart()      this.modelWhale.getCurrentY() " + this.modelWhale.getCurrentY());
        System.out.println("Model setGameModeToStart()      this.modelWhale.getCurrentWidth() " + this.modelWhale.getCurrentWidth());
        System.out.println("Model setGameModeToStart()      this.modelWhale.getCurrentHeight() " + this.modelWhale.getCurrentHeight());
        System.out.println("Model setGameModeToStart()      this.modelStar.getCurrentX() " + this.modelStar.getCurrentX());
        System.out.println("Model setGameModeToStart()      this.modelStar.getCurrentY() " + this.modelStar.getCurrentY());
        System.out.println("Model setGameModeToStart()      this.modelStar.getCurrentWidth() " + this.modelStar.getCurrentWidth());
        System.out.println("Model setGameModeToStart()      this.modelStar.getCurrentHeight() " + this.modelStar.getCurrentHeight());
        System.out.println("Model setGameModeToStart()      this.modelCloud.getCurrentX() " + this.modelCloud.getCurrentX());
        System.out.println("Model setGameModeToStart()      this.modelCloud.getCurrentY() " + this.modelCloud.getCurrentY());
        System.out.println("Model setGameModeToStart()      this.modelCloud.getCurrentWidth() " + this.modelCloud.getCurrentWidth());
        System.out.println("Model setGameModeToStart()      this.modelCloud.getCurrentHeight() " + this.modelCloud.getCurrentHeight());
        System.out.println("Model setGameModeToStart()      this.modelGlitter.getCurrentX() " + this.modelGlitter.getCurrentX());
        System.out.println("Model setGameModeToStart()      this.modelGlitter.getCurrentY() " + this.modelGlitter.getCurrentY());
        System.out.println("Model setGameModeToStart()      this.modelGlitter.getCurrentWidth() " + this.modelGlitter.getCurrentWidth());
        System.out.println("Model setGameModeToStart()      this.modelGlitter.getCurrentHeight() " + this.modelGlitter.getCurrentHeight());


    }

    public void setGameModeToPlay() {
        System.out.println("Model setGameModeToPlay() ");
        // set initial positions of characters to values stored in Layout
        this.modelWhale.setCurrentX(Layout.instance().WHALE_INITIAL_X_POS);
        this.modelWhale.setCurrentY(Layout.instance().WHALE_INITIAL_Y_POS);
        this.modelStar.setCurrentX(Layout.instance().STAR_INITIAL_X_POS);
        this.modelStar.setCurrentY(Layout.instance().STAR_INITIAL_Y_POS);
        this.modelCloud.setCurrentX(Layout.instance().CLOUD_INITIAL_X_POS);
        this.modelCloud.setCurrentY(Layout.instance().CLOUD_INITIAL_Y_POS);
        this.modelGlitter.setCurrentX(Layout.instance().GLITTER_INITIAL_X_POS);
        this.modelGlitter.setCurrentY(Layout.instance().GLITTER_INITIAL_Y_POS);

        System.out.println("Model setGameModeToPlay()      this.modelWhale.getCurrentX() " + this.modelWhale.getCurrentX());
        System.out.println("Model setGameModeToPlay()      this.modelWhale.getCurrentY() " + this.modelWhale.getCurrentY());
        System.out.println("Model setGameModeToPlay()      this.modelWhale.getCurrentWidth() " + this.modelWhale.getCurrentWidth());
        System.out.println("Model setGameModeToPlay()      this.modelWhale.getCurrentHeight() " + this.modelWhale.getCurrentHeight());
        System.out.println("Model setGameModeToPlay()      this.modelStar.getCurrentX() " + this.modelStar.getCurrentX());
        System.out.println("Model setGameModeToPlay()      this.modelStar.getCurrentY() " + this.modelStar.getCurrentY());
        System.out.println("Model setGameModeToPlay()      this.modelStar.getCurrentWidth() " + this.modelStar.getCurrentWidth());
        System.out.println("Model setGameModeToPlay()      this.modelStar.getCurrentHeight() " + this.modelStar.getCurrentHeight());
        System.out.println("Model setGameModeToPlay()      this.modelCloud.getCurrentX() " + this.modelCloud.getCurrentX());
        System.out.println("Model setGameModeToPlay()      this.modelCloud.getCurrentY() " + this.modelCloud.getCurrentY());
        System.out.println("Model setGameModeToPlay()      this.modelCloud.getCurrentWidth() " + this.modelCloud.getCurrentWidth());
        System.out.println("Model setGameModeToPlay()      this.modelCloud.getCurrentHeight() " + this.modelCloud.getCurrentHeight());
        System.out.println("Model setGameModeToPlay()      this.modelGlitter.getCurrentX() " + this.modelGlitter.getCurrentX());
        System.out.println("Model setGameModeToPlay()      this.modelGlitter.getCurrentY() " + this.modelGlitter.getCurrentY());
        System.out.println("Model setGameModeToPlay()      this.modelGlitter.getCurrentWidth() " + this.modelGlitter.getCurrentWidth());
        System.out.println("Model setGameModeToPlay()      this.modelGlitter.getCurrentHeight() " + this.modelGlitter.getCurrentHeight());


        // set increments
        this.modelWhale.setIncX(Layout.instance().whaleIncX);
        this.modelWhale.setIncY(Layout.instance().whaleIncY);
        this.modelStar.setIncX(Layout.instance().starIncX);
        this.modelStar.setIncY(Layout.instance().starIncY);
        this.modelCloud.setIncX(Layout.instance().cloudIncX);
        this.modelCloud.setIncY(Layout.instance().cloudIncY);
        this.modelGlitter.setIncX(Layout.instance().glitterIncX);
        this.modelGlitter.setIncY(Layout.instance().glitterIncY);

        this.gameMode = "play";


    }

    public void setGameModeToEnd() {
        System.out.println("Model setGameModeToEnd() ");

    }

    public ModelCharacter getModelCloud() {
        return modelCloud;
    }

    public ModelCharacter getModelStar() {
        return modelStar;
    }

    public ModelCharacter getModelGlitter() {
        return modelGlitter;
    }

    public ModelCharacter getModelWhale() {
        return modelWhale;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameModeToContinue() {
        this.gameMode = "continue";
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isInvincible() {
        return invincible;
    }

    public void setInvincible(boolean invincible) {
        this.invincible = invincible;
    }
}
