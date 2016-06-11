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
public class ExitCommand extends GameCommand{
 public ExitCommand(Scanner scan){
        super(scan);
    }
    @Override
    public void execute(Player player,String param[]) {
        System.out.println("do you want to exit [Y/N]");
        if(!scan.next().equalsIgnoreCase("Y")){
        System.out.println("Game application is Closing Please wait ....");
        System.exit(0);
        }
        
    }
    
}
