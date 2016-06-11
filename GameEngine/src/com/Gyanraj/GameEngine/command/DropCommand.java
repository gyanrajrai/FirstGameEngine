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
public class DropCommand extends GameCommand {
    public DropCommand(Scanner scan){
        super(scan);
    }

  
    public void execute(Player player,String[] param) {
            System.out.println(player.getName() +"Has Dropped"+param[1]);
    }
    
}
