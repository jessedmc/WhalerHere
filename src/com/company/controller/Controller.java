package com.company.controller;

import com.company.view.View;

public class Controller {

    private static Controller instance = null;


    private Controller() {

    }


    public static Controller instance() {
        if (instance == null)
            instance = new Controller();
        return instance;
    }



}
