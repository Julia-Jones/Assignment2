/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author jonej9442
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot bob = new Robot(kw, 5,8,Direction.WEST);
        
        while(true){
        while(bob.getAvenue()>0){
            bob.move();
            break;
            
        }
        
        if(bob.getAvenue()==0){
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        break;
                 
        }
       
    }
        
        while(true){
        while(bob.getStreet()>0){
        bob.move();
      }
    }
        
        
  }
}
