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
public class rules extends game{
    
    /**
     * 
     */
    public static void startRules(){
        System.out.println("Rules you need to know:");
        System.out.println("On your turn you will roll 6 dice each with a different possible value");
        System.out.println("5 = 50 points");
        System.out.println("1 = 100 points");
        System.out.println("3 1's = 200 points |" + " 4 of any number = 1000 points");
        System.out.println("3 2's = 200 points |" + " 5 of any number = 2000 points");
        System.out.println("3 3's = 300 points |" + " 6 of any number = 3000 points");
        System.out.println("3 4's = 400 points |" + " 1-6 = 1500 points");
        System.out.println("3 5's = 500 points |" + " 3 Pairs = 1500 points");
        System.out.println("3 6's = 600 points |" + " Four of any number with a pair = 1500 points");
        System.out.println("Two Triplets = 2500 points");
        System.out.println("First person to reach 10000 points wins!");
                
    }
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args){
        startRules();
    }
}
