package Les6;

public class Paladin extends Unit {

    private int level;


//    private String name;
//    private int health;
//    private int attack;
//    private int defence;
//    private int power;

    public Paladin(String name, int health, int attack, int defence, int power) {
        super(name, health, attack, defence, power);
        this.level = -1;

//        this.name = name;
//        this.health = health;
//        this.attack = attack;
//        this.defence = defence;
//        this.power = power;
    }

    public Paladin(String name, int health, int attack, int defence, int power, int level) {
        super(name, health, attack, defence, power);
        this.level = level;
    }

    public void defenceSelf() {
        System.out.println(this.name + " has block" + this.defence);
    }

    public int getLevel() {
        return level;
    }

    @Override
    public void jump() {
        System.out.println(this.name + " jump");
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
