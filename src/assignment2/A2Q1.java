/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author jonej9442
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //city and robot
        City kw = new City();
        
        Robot bob = new Robot(kw,1,1,Direction.EAST); 
        // creating all the things
        new Thing(kw,1,2);
        new Thing(kw,1,3);
        new Thing(kw,1,4);
        new Thing(kw,1,5);
        new Thing(kw,1,6);
        new Thing(kw,1,7);
        new Thing(kw,1,8);
        new Thing(kw,1,9);
        new Thing(kw,1,10);
        new Thing(kw,1,11);
        
        //looping it to pick up all the things until the 7th one 
        while(true){
        
        while(bob.canPickThing()){
            bob.pickThing();
        }
        bob.move();
        //breaks after picking up the 7th item
        if(bob.countThingsInBackpack()==7){
           break;
            
        }
        
       
        
        
       
    }
        // after done picking thing up 
        while(bob.canPickThing()){
            bob.move();
        }
    }
} 