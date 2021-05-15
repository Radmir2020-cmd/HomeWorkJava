package Les5.Object;

public class RobotsFabric {

    public static void main(String[] args) {
//        System.out.println(("Program Start"));

        Robot robot1 = new Robot("Harry", 999,450,9000, "White");
        Robot robot2 = new Robot();

//        robot1.name = "Harry";
//        robot1.health = 999;
//        robot1.energy = 450;
//        robot1.speed = 9000;
//        robot1.color = "White";

//        robot2.name = "Terminator";
//        robot2.health = 350;
//        robot2.energy = 50;
//        robot2.speed = 123;
//        robot2.color = "Red";
        robot2.setName("Terminator");
        robot2.setHealth(350);
        robot2.setEnergy(50);
        robot2.setSpeed(123);
        robot2.setColor("Red");

        System.out.println("This is getter class Robot: " + robot2.getName());
//
//        System.out.println("My name is " + robot1.name);
//        System.out.println("My health is " + robot1.health + " health points");
//        System.out.println("My energy is " + robot1.energy + " energy points");
//        System.out.println("My name is " + robot1.name + " my color is " + robot1.color);

//        System.out.println("My name is " + robot2.name);
//        System.out.println("My health is " + robot2.health + " health points");
//        System.out.println("My energy is " + robot2.energy + " energy points");
//        System.out.println("My name is " + robot2.name + " my color is" + robot1.color);

        robot1.shooting();
//        robot1.speak();
//        robot1.move();
//        System.out.println("-----------------");
//        robot2.speak();
//        robot2.move();
//        robot2.shooting();
//
//        robot1.legs.color = "Yellow";
//        robot1.legs.length = 15;
//        robot1.legs.weight = 112;
//
//        robot1.legs.jump();


//        System.out.println(("Program End"));
    }
}
