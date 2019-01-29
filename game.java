/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1;

/**
 *
 * @author ntrog
 */
public class game {

    /**
     * @param args the command line arguments
     * @return 
     */
    
    @Override
    public String toString()
    {
        return "none"; //not sure what to do with this right now
    }
    public static void main(String[] args) {
        rules.startRules(); //Calling Start Rules from rules
        player.players(); //Calling input from the player class
    }
    
}

