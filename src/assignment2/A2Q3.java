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
        //city and robot
        City kw = new City();
        Robot bob = new Robot(kw, 5,8,Direction.WEST);
        //to move it back to avenue 0
        while(true){
        while(bob.getAvenue()>0){
            bob.move();
            break;
            
        }
        //make turn up so it can more to street 0
        if(bob.getAvenue()==0){
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        break;
                 
        }
       
    }
        //move to street 0
        while(true){
        while(bob.getStreet()>0){
        bob.move();
      }
    }
        
        
  }
}
