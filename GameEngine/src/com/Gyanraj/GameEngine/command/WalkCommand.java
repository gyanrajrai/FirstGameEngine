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
public class WalkCommand extends GameCommand {
public WalkCommand(Scanner scan){
        super(scan);
    }
  
  
    public void execute(Player player,String param[]) {
         if(param.length==1){
            System.out.println(player.getName()+"Is walking");
         }
          else
             if(param.length>=1){
                 
             
            
            System.out.println(player.getName() +"is walking"+param[1]);
             }        }
    
}
