package HW6;

public abstract class Animals {

    static final int SWIM_FAIL = 0;
    static final int SWIM_OK = 1;
    static final int SWIM_NON = -1;

    private String type; // поля которые пойдут в конструктор
    private String name;  // поля..
    private float maxRun; // поля..
    private float maxSwim; // поля..

    public static int countAnimal = 0; // переменная для подсчета

    public Animals(String type, String name, float maxRun, float maxSwim) { // Конструктор
        this.type = type;
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        ++countAnimal;
    }

    String getName() { // метод по выводу имени животинки
        return this.name;
    }

    String getType() { // метод по выводу типа животинки
        return this.type;
    }

    float getMaxRun() { // метод по выводу возможности бегать животинки
        return this.maxRun;
    }

    float getMaxSwim() { // метод по выводу макс возмоности плавать животинки
        return this.maxSwim;
    }

    protected boolean run(float distance) {
        return (distance <= maxRun); // возврат логического выражения
    }

    protected int swim(float distance) {
        return (distance <= maxSwim) ? SWIM_OK : SWIM_FAIL; // возврат логического выражения
    }


}
