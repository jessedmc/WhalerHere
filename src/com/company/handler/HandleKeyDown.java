package com.company.handler;

import com.company.view.View;

public class HandleKeyDown {


    private static HandleKeyDown instance = null;


    private HandleKeyDown() {

    }


    public static HandleKeyDown instance() {
        if (instance == null)
            instance = new HandleKeyDown();
        return instance;
    }
    public void handle (int direction){
        System.out.println("HandleKeyDown handle() direction " + direction);
        if (direction == Handler.instance().KEY_DOWN_DOWN){
            System.out.println("HandleKeyDown handle() KEY_DOWN_DOWN " );
            View.instance().starFloatLeft();
        }
        else if (direction == Handler.instance().KEY_DOWN_LEFT){
            System.out.println("HandleKeyDown handle() KEY_DOWN_LEFT " );
            View.instance().cloudFloatLeft();
            //View.instance().update();
        }
        else if (direction == Handler.instance().KEY_DOWN_RIGHT){
            System.out.println("HandleKeyDown handle() KEY_DOWN_RIGHT " );
            View.instance().whaleStepRight();
            //View.instance().update();
        }
        
    }
}
