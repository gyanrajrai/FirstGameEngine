/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Gyanraj.GameEngine.command;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class GameCommandFactory {
    //for combining all command in one factory
    public static GameCommand get(String cmd,Scanner scan){
        if(cmd.equalsIgnoreCase("Walk")){
        return new WalkCommand(scan);
        
    }
        else      if(cmd.equalsIgnoreCase("Drop")){
        return new DropCommand(scan);
        
    }
        else      if(cmd.equalsIgnoreCase("Run")){
        return new RunCommand(scan);
        
    }
        else     if(cmd.equalsIgnoreCase("Pick")){
        return new PickCommand(scan);
        
    }
         else   if(cmd.equalsIgnoreCase("Exit")){
        return new ExitCommand(scan);
         }
        return null;
    
}
}
