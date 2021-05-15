package Les5.Object;

public class Robot {

    private String name;
    private int health;
    private int energy;
    private int speed;
    private String color;
    private Leg legs = new Leg();

    public Robot() {
//        color = "Yellow";
    }

    public Robot(String name, int health, int energy, int speed, String color) {
        this.name = name;
        this.health = health;
        this.energy = energy;
        this.speed = speed;
        this.color = color;
        legs = new Leg();
        shooting();

    }

     void shooting() {
        energy -= 10;
        System.out.println(name + " has shoot! Energy now is " + energy);
    }

    void speak() {
        System.out.println(name + " says Hello");
    }

    void move() {
        System.out.println(name + " has moved on speed " + speed);
    }

    public class Leg {
        String color;
        int length;
        int weight;

        void jump() {
            System.out.println("This leg jump");
        }
    }

    // getter отдают значение приватных полей класса
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(String Ccolor) {
        this.color = color;
    }


}
