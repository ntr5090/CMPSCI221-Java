/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1;

import java.util.Scanner;

/**
 *
 * @author ntrog
 */
public class player extends game
{
    protected String playerName; //Names of players
    protected int playerScore; //Scores of player s
    
        
    /**
     *
     * @param name
     * @param score
     *
     */ 
    public player(String name, int score){
        this.playerName = name;
        this.playerScore = score;
               
    }       

    public static void players(){
        //player p1 = new player();
        //player p2 = new player();
        Scanner newsc = new Scanner(System.in);
        System.out.println("How many players are playing? ");
        int players = Integer.parseInt(newsc.next());
        if (players == 1){
            Scanner nameinput1 = new Scanner(System.in);
            System.out.println("What is your name player 1? ");
            String p1name1 = nameinput1.next();
        }else if (players == 2){
            Scanner nameinput2 = new Scanner(System.in);
            System.out.println("What is your name player 1? ");
            String p1name2 = nameinput2.next();
            System.out.println("What is your name player 2? ");
            String p2name2 = nameinput2.next();
        }
        
    }
        
        
}

