/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author jonej9442
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//new city
        City kw = new City();
        //new robot
        Robot bob = new Robot(kw, 3, 1, Direction.EAST);

        //creating the hurdles and ground
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 9, Direction.SOUTH);
        new Wall(kw, 3, 8, Direction.SOUTH);
        new Wall(kw, 3, 7, Direction.SOUTH);
        new Wall(kw, 3, 6, Direction.SOUTH);
        new Wall(kw, 3, 5, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.EAST);
        new Wall(kw, 3, 2, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 3, 7, Direction.EAST);

        //creating the finish line
        new Thing(kw, 3, 9);

        //loop
        while (true) {
            // if it isn't clear it goes around the one in front & moves to next spot
            if (bob.frontIsClear() == false) {
                bob.turnLeft();
                bob.move();
                bob.turnLeft();
                bob.turnLeft();
                bob.turnLeft();
                bob.move();
                bob.turnLeft();
                bob.turnLeft();
                bob.turnLeft();
                bob.move();
                bob.turnLeft();



            // moves to next spot if clear
            } else if (bob.frontIsClear() == true) {
                bob.move();
            }
            // when in the last spot it stops
            if (bob.getAvenue() == 9) {
                break;
            }
        }

    }
}
