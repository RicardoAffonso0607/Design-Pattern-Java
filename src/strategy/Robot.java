package strategy;

public class Robot {
    
    private Movement movement;

    public void setMovement(Movement movement) {
        this.movement = movement;
    }

    public void move() {
        movement.move();
    }

}
