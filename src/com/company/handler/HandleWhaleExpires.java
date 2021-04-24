package com.company.handler;

/**
 * Handles the whale expiring.
 */
public class HandleWhaleExpires {
    private static HandleWhaleExpires instance = null;

    private HandleWhaleExpires() {

    }

    public static HandleWhaleExpires instance() {
        if (instance == null)
            instance = new HandleWhaleExpires();
        return instance;
    }

    public void handle() {
        System.out.println("HandleWhaleExpires handle()  ");
    }
}
