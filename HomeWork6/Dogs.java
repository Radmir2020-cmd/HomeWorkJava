package HW6;

public class Dogs extends Animals {

    public static int countDog = 0; // статичная переменная класса

    Dogs(String name, float maxRun, float maxSwim) {
        super("Собакен", name, maxRun, maxSwim); // родительский конструктор
        ++countDog;
    }



}
