package com.company.model;

import com.company.extra.Layout;
import com.company.view.View;

/**
 * This class is the top level environment for the model of program. Data store in the model
 * mainly consists of the whale's health and score as opposed to character positions and dimensions.
 */
public class Model {
    /**
     * Singleton instance
     */
    private static Model instance = null;
    /**
     * The cloud character in the model.
     */
    private ModelCharacter modelCloud;
    /**
     * The star character in the model.
     */
    private ModelCharacter modelStar;
    /**
     * The glitter character in the model.
     */
    private ModelCharacter modelGlitter;
    /**
     * The whale character in the model.
     */
    private ModelCharacter modelWhale;
    /**
     * The game mode.
     */
    private String gameMode = "start";
    /**
     * The health of the whale.
     */
    private int health = 3;
    /**
     * The score of the game.
     */
    private int score = 0;
    /**
     * The whale's invincibility status.
     */
    private boolean invincible = false;
    /**
     * The amount of points accumulated for hitting a star.
     */
    public final int SCORE_INC_FROM_STAR_HIT = 1000;

    /**
     * Singleton constructor
     */
    private Model() {

    }

    /**
     * Singleton instance call.
     * @return singleton instance.
     */
    public static Model instance() {
        if (instance == null)
            instance = new Model();
        return instance;
    }

    /**
     * Initialize the Model.
     */
    public void init() {
        this.modelCloud = new ModelCloud("cloudOne");
        this.modelStar = new ModelStar("starOne");
        this.modelGlitter = new ModelGlitter("glitterOne");
        this.modelWhale = new ModelWhale("whale");
        this.setGameModeToStart();

    }


    /**
     * Sets the starting mode of the game.
     */
    public void setGameModeToStart() {
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

    }

    /**
     * Initially sets the game mode to playing.
     */
    public void setGameModeToPlay() {
        // set initial positions of characters to values stored in Layout
        this.modelWhale.setCurrentX(Layout.instance().WHALE_INITIAL_X_POS);
        this.modelWhale.setCurrentY(Layout.instance().WHALE_INITIAL_Y_POS);
        this.modelStar.setCurrentX(Layout.instance().STAR_INITIAL_X_POS);
        this.modelStar.setCurrentY(Layout.instance().STAR_INITIAL_Y_POS);
        this.modelCloud.setCurrentX(Layout.instance().CLOUD_INITIAL_X_POS);
        this.modelCloud.setCurrentY(Layout.instance().CLOUD_INITIAL_Y_POS);
        this.modelGlitter.setCurrentX(Layout.instance().GLITTER_INITIAL_X_POS);
        this.modelGlitter.setCurrentY(Layout.instance().GLITTER_INITIAL_Y_POS);

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


    /**
     * Retrieve model cloud.
     * @return Model cloud.
     */
    public ModelCharacter getModelCloud() {
        return modelCloud;
    }
    /**
     * Retrieve model star.
     * @return Model star.
     */
    public ModelCharacter getModelStar() {
        return modelStar;
    }
    /**
     * Retrieve model glitter.
     * @return Model glitter.
     */
    public ModelCharacter getModelGlitter() {
        return modelGlitter;
    }
    /**
     * Retrieve model whale.
     * @return Model whale.
     */
    public ModelCharacter getModelWhale() {
        return modelWhale;
    }
    /**
     * Retrieve game mode.
     * @return Game mode.
     */
    public String getGameMode() {
        return gameMode;
    }

    /**
     * Sets the game mode to continue.
     */
    public void setGameModeToContinue() {
        this.gameMode = "continue";
    }
    /**
     * Retrieve the health of the whale.
     * @return The health of the whale.
     */
    public int getHealth() {
        return health;
    }
    /**
     * Set the value of the health of the whale.
     * @param health, The health of the whale.
     */
    public void setHealth(int health) {
        this.health = health;
    }
    /**
     * Retrieve the score of the game.
     * @return The score of the game.
     */
    public int getScore() {
        return score;
    }
    /**
     * Set the value of the score of the game.
     * @param score, The score of the game.
     */
    public void setScore(int score) {
        this.score = score;
    }
    /**
     * Retrieve the invincibility of the whale.
     * @return The invincibility of the whale.
     */
    public boolean isInvincible() {
        return invincible;
    }
    /**
     * Set the invincibility of the whale.
     * @param invincible, The invincibility of the whale.
     */
    public void setInvincible(boolean invincible) {
        this.invincible = invincible;
    }
}
