/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author jonej9442
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //robots and city
        City kw = new City();
        Robot bob = new Robot(kw, 0, 0, Direction.EAST);

        //creating first box
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 1, 1, Direction.SOUTH);
        //second box
        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.SOUTH);
        // third box
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.EAST);
        new Wall(kw, 4, 1, Direction.SOUTH);
        // forth box
        new Wall(kw, 4, 4, Direction.WEST);
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.EAST);
        new Wall(kw, 4, 4, Direction.SOUTH);
        //big box
        new Wall(kw, 2, 2, Direction.NORTH);
        new Wall(kw, 2, 2, Direction.WEST);
        new Wall(kw, 3, 2, Direction.WEST);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 2, 3, Direction.NORTH);

        while (true) {
         while(bob.getAvenue()<=1){

            bob.move();
            bob.move();
            bob.turnLeft();
            bob.turnLeft();
            bob.turnLeft();
            bob.move();
            bob.turnLeft();
            bob.move();
            bob.turnLeft();
            bob.move();
            bob.turnLeft();
            bob.turnLeft();
            bob.turnLeft();
            bob.move();
            bob.move();
            bob.turnLeft();
            bob.turnLeft();
            bob.turnLeft();
            bob.move();
            bob.move();

        }

    }
  }
}
