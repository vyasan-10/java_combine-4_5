abstract class RescueRobot {
    String id;
    public RescueRobot(String id) { this.id = id; }
    public void showDetails() { System.out.println("Rescue Robot ID: " + id); }
    public abstract void performMission();
}

// Interfaces
interface Flyable { void fly(); }
interface Swimmable { void swim(); }
interface Climbable { void climb(); }

// Robot classes
class FlyingRescueBot extends RescueRobot implements Flyable {
    public FlyingRescueBot(String id) { super(id); }
    public void performMission() { System.out.println("FlyingRescueBot performing aerial rescue"); }
    public void fly() { System.out.println("FlyingRescueBot flying..."); }
}

class SwimmingRescueBot extends RescueRobot implements Swimmable {
    public SwimmingRescueBot(String id) { super(id); }
    public void performMission() { System.out.println("SwimmingRescueBot performing water rescue"); }
    public void swim() { System.out.println("SwimmingRescueBot swimming..."); }
}

class ClimbingRescueBot extends RescueRobot implements Climbable {
    public ClimbingRescueBot(String id) { super(id); }
    public void performMission() { System.out.println("ClimbingRescueBot performing mountain rescue"); }
    public void climb() { System.out.println("ClimbingRescueBot climbing..."); }
}

class MultiRescueBot extends RescueRobot implements Flyable, Swimmable, Climbable {
    public MultiRescueBot(String id) { super(id); }
    public void performMission() { System.out.println("MultiRescueBot performing multi-terrain rescue"); }
    public void fly() { System.out.println("MultiRescueBot flying..."); }
    public void swim() { System.out.println("MultiRescueBot swimming..."); }
    public void climb() { System.out.println("MultiRescueBot climbing..."); }
}

// Main class
public class RescueRobott {
    public static void main(String[] args) {
        RescueRobot r1 = new FlyingRescueBot("FR-01");
        r1.showDetails(); r1.performMission(); ((Flyable)r1).fly();

        RescueRobot r2 = new SwimmingRescueBot("SR-02");
        r2.showDetails(); r2.performMission(); ((Swimmable)r2).swim();

        RescueRobot r3 = new ClimbingRescueBot("CR-03");
        r3.showDetails(); r3.performMission(); ((Climbable)r3).climb();

        RescueRobot r4 = new MultiRescueBot("MR-04");
        r4.showDetails(); r4.performMission();
        ((Flyable)r4).fly(); ((Swimmable)r4).swim(); ((Climbable)r4).climb();
    }
}
