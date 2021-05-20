package HW6;

public class Cats extends Animals {

    public static int countCat = 0; // статичная переменная класса

    public Cats(String name, float maxRun, float maxSwim) { // задаем объекту коты что может заполн
        super("Котяра", name, maxRun, maxSwim);
        ++countCat;
    }

    @Override
    public int swim(float distance) {// переопределенный метод
        return Animals.SWIM_NON; // типа у котика лапки
    }
}
