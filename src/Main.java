import singleton.Singleton;
import strategy.BackwardsMovement;
import strategy.ForwardsMovement;
import strategy.Movement;
import strategy.Robot;
import strategy.SidewardsMovement;

public class Main {
    public static void main(String[] args) throws Exception {

        // Space to test the patterns

        /*
         * Singleton 
        */

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
        // Same address (both are the same instance)

        /*
         * Strategy Pattern
        */

        Movement forwards = new ForwardsMovement();
        Movement backwards = new BackwardsMovement();
        Movement sidewards = new SidewardsMovement();

        Robot robot = new Robot();
        robot.setMovement(forwards); 
        robot.move();
        robot.setMovement(backwards); 
        robot.move();
        robot.setMovement(sidewards); 
        robot.move();
    }
}
