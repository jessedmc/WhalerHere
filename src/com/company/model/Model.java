package com.company.model;

import com.company.view.View;

public class Model {



    private static Model instance = null;


    private Model() {

    }


    public static Model instance() {
        if (instance == null)
            instance = new Model();
        return instance;
    }

}
