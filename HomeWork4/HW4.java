package Les4;

/** Итак, что нам надо...
 * поле на котором играть, и оно должно иметь размеры
 * чем вводить значения
 * игроки
 *
 * игра должна удовлетворять каким то правилам, например:
 * очередность ходов
 * нельзя делать ход за поле
 *
 * ну и должны быть условия победы
 * типа победа 3 подряд по горизонтале , вертикали, или диагонали
 * ничьчя
 *
 */

import java.util.Random;
import java.util.Scanner;


public class HW4 {
    public static char[][] map; // задать что в нашей проге будет поле
    public static int mapSizeX; // задать что есть размеры
    public static int mapSizeY; // задать что есть размеры

    public static char human = 'X'; // задаем что человечина ходит к примеру Х
    public static char ai = 'O'; // задаем что компик ходит к примеру О
    public static  char emptyField = '_';

    public static Scanner pensil = new Scanner(System.in); // инструмент по вводу значений игроков
    public static Random random = new Random();

    public static void main(String[] args) {
        createMap(); // имя метода, что говорит создай поле(карту)
        printMap(); //  имя метода, что говорит выведи поле(карту)

        while (true) { // цикл вайл для метода где ходит человек попеременно с компом и выводит в консоль
            turnHuman();
            printMap();

            if (win(human)) {
//            if (winGame(human)) {
                System.out.println("Human win!");
                break;
            }

            if (fullMap()) {
                System.out.println("Draw!");
                break;
            }

            turnAi(); // цикл вайл для метода где ходит компик попеременно с компом и выводит в консоль
            printMap(); // цикл вайл для метода где ходит человек попеременно с компом и выводит в консоль

            if (win(ai)) {
//            if (winGame(ai)) {
                System.out.println("Human win!");
                break;
            }

            if (fullMap()) {
                System.out.println("Draw!");
                break;
            }
        }
        System.out.println("Game over");
    }

    public static void createMap() { // метод по созданию поля
        mapSizeX = 5; // по иксу 3 изменил на 5
        mapSizeY = 5; // по игреку 3 изменил на 5
        map = new char[mapSizeY][mapSizeX]; // задаем чар в двойном массиве по y и по x

        for (int y = 0; y < mapSizeY; y++) { // цикл фор по созданию поля с переменными данные в мапсайзе по иксу и игреку
            for (int x = 0; x < mapSizeX; x++) {
                map[y][x] = emptyField;
            }
        }
    }

    public static void printMap() { // метод по выводу в консоль поля с с нумерацией для человечины))
        System.out.print(" ");

        for (int i = 0; i < mapSizeX * 2 + 1; i++) {
            System.out.print((i % 2 == 0) ? " " : (i / 2 + 1));
        }
        System.out.println();

        for (int y = 0; y < mapSizeY; y++) {
            System.out.print(y + 1 + "|"); // выводит | как граница
            for (int x = 0; x < mapSizeX; x++) {
                System.out.print(map[y][x] + "|"); // выводит | как граница
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------");
    }

    public static void turnHuman() { // метод по ходу человечины
        int x;
        int y;

        do {
            System.out.print("Enter your coordinates from 1 before " + mapSizeX + " :"); // цикл ду вайл что б сначала сделать потом проверить
            x = pensil.nextInt() - 1; // координаты по x  для человечины
            y = pensil.nextInt() - 1; // координаты по y  для человечины

        } while (!validField(y,x) || !emptyField(y,x));
        map[y][x] = human;
        System.out.println("Your move in [" + (y + 1) + ":" + (x + 1) + "]"); // выводит ход например [0,1]

    }

    public static void turnAi() { // метод по ходу компа в данном случае рандомно
        int x;
        int y;

        do {
            x = random.nextInt(mapSizeX);
            y = random.nextInt(mapSizeY);
        } while (!emptyField(y,x));

        map[y][x] = ai;
        System.out.println("Ai move in [" + (x + 1) + ":" + (y + 1) + "]"); // выводит в консоль как походил комп
    }

    public static boolean win(char player) { // метод с правилами победы


        if (map[0][0] == player && map[0][1] == player && map[0][2] == player) return true; // по вертикале слева
        if (map[1][0] == player && map[1][1] == player && map[1][2] == player) return true; // по вертикале по середине
        if (map[2][0] == player && map[2][1] == player && map[2][2] == player) return true; // по вертикале справа

        if (map[0][0] == player && map[1][1] == player && map[2][2] == player) return true; // по горизонтали сверху
        if (map[0][1] == player && map[1][1] == player && map[2][1] == player) return true; // по горизонтали по середине
        if (map[0][2] == player && map[1][2] == player && map[2][0] == player) return true; // по горизонтали снизу

        if (map[0][0] == player && map[1][1] == player && map[2][2] == player) return true; // по диагонале слева направо
        if (map[0][2] == player && map[1][1] == player && map[2][0] == player) return true; // по диагонале справо налево

        return false;
    }

//    public static char winGame() { идея по проверке такая, но она пока не работает, потому что значения чары с интами гдето попутал
//        char winner = ' ';
//
//        for (int i = 0; i < 3; i++) { // Проверка по горизонтали
//            if (map[i][0] == map[i][1] && map[i][1] == map[i][2] && map[i][0] != 'X') {
//                winner = map[i][0];
//                break;
//            }
//        }
//
//        if (winner == ' ') {  // Проверка по вертикали если победитель пока не найден
//            for (int i = 0; i < 3; i++) {
//                if (map[0][i] == map[1][i] && map[1][i] == map[2][i] && map[0][i] != 'X') {
//                    winner = map[0][i];
//                    break;
//                }
//            }
//        }
//
//        if (winner == ' ') { // Проверка главной диагонали если победитель пока не найден
//            if (map[0][0] == map[1][1] && map[1][1] == map[2][2] && map[0][0] != 'X') {
//                winner = map[0][0];
//            }
//        }
//
//        if (winner == ' ') { // Проверка побочной диагонали если победитель пока не найден
//            if (map[0][2] == map[1][1] && map[1][1] == map[2][0] && map[0][2] != 'X') {
//                winner = map[0][0];
//            }
//        }
//        return winner; // возвращаем победителя
//    }

    public static boolean fullMap() {
        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                if (map[y][x] == emptyField) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean  validField(int y, int x) { // метод по проверке валидности ячейки, и нужны координаты пользователя
        return x >= 0 && x < mapSizeX && y >= 0 && y < mapSizeY;
    }

    public static boolean emptyField(int y, int x) { // метод по проверке на пустоту ячейки
        return map[y][x] == emptyField;
    }
}

