/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Gyanraj.GameEngine.command;

import com.Gyanraj.GameEngine.entity.Player;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public abstract class GameCommand {
    protected Scanner scan;
    public  GameCommand(Scanner scan){
        this.scan=scan;
        
    }
    public abstract void execute(Player player,String[] param);

    }
    

