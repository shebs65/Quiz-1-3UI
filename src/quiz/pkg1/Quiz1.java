/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pkg1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author shebm3906
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City kw = new City();
        // create robot
        RobotSE matt = new RobotSE(kw, 4, 0, Direction.EAST);
        // create walls (staircase)
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 3, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 3, 6, Direction.EAST);
        new Wall(kw, 4, 7, Direction.NORTH);
        new Wall(kw, 4, 7, Direction.EAST);
        // create things (lights)
        new Thing(kw, 4, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 1, 4);
        // move robot up the staircase, picking up the lights
        matt.move();
        matt.pickThing();
        matt.turnLeft();
        matt.move();
        matt.turnRight();
        matt.move();
        matt.pickThing();
        matt.turnLeft();
        matt.move();
        matt.turnRight();
        matt.move();
        matt.pickThing();
        matt.turnLeft();
        matt.move();
        matt.turnRight();
        matt.move();
        matt.pickThing();
        // move robot down the staircase, placing the lights 
        matt.move();
        matt.putThing();
        matt.move();
        matt.turnRight();
        matt.move();
        matt.putThing();
        matt.turnLeft();
        matt.move();
        matt.turnRight();
        matt.move();
        matt.putThing();
        matt.turnLeft();
        matt.move();
        matt.turnRight();
        matt.move();
        matt.putThing();
        matt.turnLeft();
        matt.move();
    }
}
