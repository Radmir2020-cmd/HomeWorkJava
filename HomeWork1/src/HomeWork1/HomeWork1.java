package HomeWork1;

public class HomeWork1 {

    public static void main(String[] args) {
        printThreeWords(); // Имя метода
        checkSumSing(); // Имя метода
        printColor(); // Имя метода
        compareNumbers(); // Имя метода
    }

    public static void printThreeWords() { // Тело метода
        System.out.println("Orange"); // Вывод в консоль Orange
        System.out.println("Banana"); // Вывод в консоль Banana
        System.out.println("Apple"); // Вывод в консоль Apple
    }


    public static void checkSumSing() { // Тело метода
        int a = 10; // переменная a
        int b = 20; // переменная b
        int c = a + b;
        System.out.println(c);// Вывод в консоль переменную с

        if (c >= 0) { // если с больше или равна 0
            System.out.println("Сумма положительная");
        } else if (c < 0) { // если с меньше 0
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor() { // Тело метода
        int value = 105; // переменная value
        if (value <= 0) {// если с меньше или равна 0
            System.out.println("Красный"); // то вывод в консоль Красный
        }
        if (value > 0 && value <= 100) { // если value больше 0 или меньше или равно 100
            System.out.println("Желтый"); // то вывод в консоль Желтый
        }
        if (value > 100) { // если value больше 100
            System.out.println("Зеленый"); // то вывод в консоль Зеленый
        }
    }

    public static void compareNumbers() { // Тело метода
        int a = 30; // переменная a
        int b = 20; // переменная b
        if (a >= b) { // если a больше или равно b
            System.out.println("a >= b"); // то в консоль выводится a >= b
        } else { // иначе
            System.out.println("a < b"); // в консоль выводится a < b
        }
    }
}

