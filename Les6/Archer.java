package Les6;

public class Archer extends Unit {

//    private String name;
//    private int health;
//    private int attack;
//    private int defence;
//    private int power;

    public Archer(String name, int health, int attack, int defence, int power) {
        super(name, health, attack, defence, power);
//        this.name = name;
//        this.health = health;
//        this.attack = attack;
//        this.power = defence;
//        this.defence = power;
    }

    @Override
    public void jump() {
        System.out.println(this.name + " jump-jump-jump");
    }

//    void speak() {
//        System.out.println("Hello. My name is " + name + ". My HP = " + health);
//    }
//
//    void getDamage() {
//        System.out.println(name + " has attack " + attack * power + " dmg");
//    }
//
//    void healSelf(int value) {
//        int tmp = value + defence;
//        health += tmp;
//        System.out.println(name + " heal-self at " + tmp + ". My HP now is " + health);
//    }
}
