/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Gyanraj.GameEngine;

import com.Gyanraj.GameEngine.command.GameCommand;
import com.Gyanraj.GameEngine.command.GameCommandFactory;
import com.Gyanraj.GameEngine.entity.Player;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Engine {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("======================");
        System.out.println("Welcome to Text Based game");
        System.out.println("=======================");
        Scanner scan=new Scanner(System.in);
        Player play=new Player();
        System.out.println("Enter the name of the character:");
        play.setName(scan.nextLine());
        System.out.println("Your character "+play.getName()+"is Ready");
        
        while(true){//unconditional loop
            System.out.println("Entr Commannd>");
            String cmd=scan.next();//command
            String[]params=cmd.split(" ");
            //Command give to GameFactory
            GameCommand gamecmd=GameCommandFactory.get(params[0],scan);
            if(gamecmd==null){
                System.out.println("Invalid Command");
                
            }
            else{
                
                gamecmd.execute(play,params);
                 }             
        }
    }
    
}
