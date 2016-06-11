/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Gyanraj.GameEngine.entity;

/**
 *
 * @author Admin
 */
public class Player {
    private String Name;
    /**
     * Default Constructor
     */

    public Player() {
        /**
         * @Overlaod Constructor
         */
    }

    public Player(String Name) {
        this.Name = Name;
        
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    
}
