package Les2;

public class HW2 {

    public static void main(String[] args) {
        System.out.println(" 1 > " + twoNumbers(5, -15)); // просим оператора вывести результат с переменными вводными данными
        System.out.println("**************************"); // У тебя подсмотрел как отделить ответы
        checkOn(-10);
        System.out.println("**************************");
        System.out.println(checkOn2(-5)); //просим оператора вывести результат с переменными вводными данными
        System.out.println("**************************");
        printWordNTimes("That string", 10); //
        System.out.println("**************************");
        int currentYear = 2010;
        System.out.println("Year " + currentYear + " is leap? > " + visOrNotVis(currentYear));
    }

    public static boolean twoNumbers(int first, int second) { // метод с булево
        int sum = first + second; // сумма первого и второго числа
        return (sum <= 20) && (sum >= 10); // оператор реторн для возврата после проверки (вроде так)
    }

    public static void checkOn(int variable) { // метод с переменным числом
        if (variable >= 0) { // если число больше или равно 0
            System.out.println(variable + " is positive"); // то выводим позитив
        } else { //иначе
            System.out.println(variable + " is negative"); //  выводим негатив
        }

    }

    public static boolean checkOn2(int number) { //метод с булево
        if (number < 0) {  // если число меньше 0 то будет тру
            return true;
        }
        return false; // если нет то фолс
    }

    public static void printWordNTimes(String word, int times) { // метод в переменными word и times
        for (int i = 0; i < times; i++) { // запускаем счетчик (цикл for)
            System.out.println("String #" + i + ": " + word); // выводим в консоль String # плюс счетчик плюс название строки (как то так)
        }
    }

    public static boolean visOrNotVis(int year) { // метод  с булево
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0); // если текущий год делится на 4 без остатка "И" год
        // делится на 100 на цело "ИЛИ" год делится на 400 без остатка ( как то так)
    }




}
