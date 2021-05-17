package Les6;

public class Titan extends Paladin {

    public Titan(String name, int health, int attack, int defence, int power, int level) {
        super(name, health, attack, defence, power, level);
    }

    public void superDamage() {
        System.out.println(this.name + " deal super attack at " + this.attack * this.power * 150);
    }

    @Override
    public void healSelf(int value) {
        System.out.println("I don't have idea - what is Heal-Self");
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Hello from Override from Titan");
    }

    @Override
    public void jump() {
        System.out.println("Titan not jump");
    }
}
