package HW6;

public class HW6 {

    public static void main(String[] args) {

        String tempWinEvent = " это успех!!!";
        String tempLossEvent = " это провал!!!";
        String eventName;
        String eventResult;

        Cats cat1 = new Cats("Рыжая Морда", 200, 1); // создаем объект участника действий кота1
        Cats cat2 = new Cats("Шерстяной гавнюк", 300, 4); // создаем объект участника действий кота2
        Dogs dog1 = new Dogs("Хороший мальчик", 600, 11); // создаем объект участника действий собакен1
        Dogs dog2 = new Dogs("Маленькая швабра", 500, 8); // создаем объект участника действий собакен2

        Animals[] animals = {cat1, cat2, dog1, dog2}; // массив из котеек и собакенов

        float runLength = 250; // значения успеха по бегу
        float swimLength = 8; // значение успеха по заплыву

        for (int i = 0; i < animals.length; i++) { // включаем цикл, который проходит по участникам этого испытания "Игра началась! ха-ха!"
            String nameString = animals[i].getType() + " " + animals[i].getName() + " может "; // вывод в консоль вид животинки, с кличкой

            eventName = " пробежать на " + animals[i].getMaxRun() + " м. Пытается пробежать на "; // тут вывож в консоль продолжение действий по бегу по условиям
            eventResult = animals[i].run(runLength) ? tempWinEvent : tempLossEvent;
            result(nameString, eventName, runLength,eventResult);

            int swimResult = animals[i].swim(swimLength);
            eventName = " Проплыть на " + animals[i].getMaxSwim() + " м. Попытка проплыть на "; // тут вывож в консоль продолжение действий по заплыву по условиям
            eventResult = (swimResult == Animals.SWIM_OK) ? tempWinEvent : tempLossEvent;

            if (swimResult == Animals.SWIM_NON) // условие если по плаванию плохо, то вывести ниже написанную фразу
                eventResult = " это не получилось, т.к. не умеет плавать";
            result(nameString, eventName, swimLength, eventResult);
        }

        System.out.println("Все животинки =" + Animals.countAnimal + " . cat count = " + Cats.countCat + " dog count = " + Dogs.countDog); // вывод в консоль колличества участников

    }

    private static void result(String nameAnimal, String event, float eventLength, String resultEvent) { // метод результат
        System.out.println(nameAnimal + event + eventLength + " и "  + resultEvent);
    }


}
