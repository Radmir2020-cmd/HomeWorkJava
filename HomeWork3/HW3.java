package Les3;

import java.util.Arrays;

public class HW3 {

    public static void main(String[] args) {

        int[] arr1 = {1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0}; // задаем переменные в массив
        printArr1("1. Before:\t", arr1);  // строка в консоли выведет то, что "до"
        change(arr1); // магия по смене пола, ой значений с 0 на 1 и наоборот
        printArr1("1. After:\t", arr1);// строка в консоли выведет то, что "после"

        System.out.println("**********************************************");

        int[] arr2 = new int[100]; // задаем массив из 100
        fillArr(arr2); // передача в метод fillArr
        printArr1("2. Filled with cycle:\t", arr2); // вывод в консоль результата

        System.out.println("**********************************************");

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // задаем массив со значениями
        printArr1("3. Before:\t", arr3); // выводим в консоль типа "до"
        multiplyByTwo(arr3); // передача в метод  multiplyByTwo
        printArr1("3. After:\t", arr3); // выводим в консоль типа "после"

        System.out.println("**********************************************");

        int[][] arr4 = new int[10][10]; // задаем массив с пеерменными 10 на 10
        fillDiagonal(arr4); //  передаем в метод fillDiagonal
        printArr2("4. Result fill diagonals", arr4); // вывод в консоль методом вывода для двумерного массива

        System.out.println("**********************************************"); // дальше под звездочкой с помощью смотрел и разбирался и разбираюсь

        int[] returnArrayFromMethod = returnArray(10, 999); // задаем массив и в него записываем что должно вернусься len и initialValue
        printArr1("5. Array from method", returnArrayFromMethod); // вывод в консоль методом для одномерного мас

        printArr1("5. Find min & max in array\t", arr3);
        System.out.println("5. Minimum: " + findMin(arr3));
        System.out.println("5. Maximum: " + findMax(arr3));

        int[] balance = {1, 1, 1, 1, 1, 1, 6};
        System.out.print("6. Is the " + Arrays.toString(balance) + " balanced? ");
        System.out.println(checkBalance(balance));

        int[] shiftArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArr1("7. Array for shift", shiftArray);
        shifter(shiftArray, -3);
        printArr1("shift <<< (-3)", shiftArray);
        shifter(shiftArray, 6);
        printArr1("shift >>> (+6)", shiftArray);

    }

    public static void printArr1(String msg, int[] inputArr1) { // метод войд по выводу в консоль printArr1
        System.out.print(msg + ": "); // указываем, что прописать в разделе "до" и "после" (printArr1)
        for (int i = 0; i < inputArr1.length; i++) { // запускаем цикл for, где он смотрит до предела массива
            System.out.print(inputArr1[i] + " "); // вывод в конмоль
        }
        System.out.println();
    }

    public static void printArr2(String msg, int[][] inputArr1) { // метод войд по выводу в консоль printArr1 двумерного массива
        System.out.print(msg); // указываем, что прописать в разделе printArr2
        for (int i = 0; i < inputArr1.length; i++) { // запускаем цикл for, где он смотрит до предела массива по i
            for (int j = 0; j < inputArr1[i].length; j++) { // запускаем цикл for, где он смотрит до предела массива по j
                System.out.print(inputArr1[i][j] + " "); // вывод в конcоль
            }
            System.out.println();
        }
    }

    public static void change(int[] arr) { // метод войд по выводу в консоль change
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 1) { // если i есть 1
                arr[i] = 0; // то меняй на 0
            } else { // иначе
                arr[i] = 1; // если нет то оставайся 1
            }
    }
     public static void  fillArr(int[] arr) { // метод принимает массив из int
         for (int i = 0; i < arr.length; i++) // запускаем цикл
             arr[i] = i + 1; // + 1 шоб 100 вывел

     }

     public static void multiplyByTwo(int[] arr) { // метод принимает значение из int из arr3
         for (int i = 0; i < arr.length; i++) // запускаем цикл
            if (arr[i] < 6) // если есть значение меньше 6 то...
                arr[i] *=2; // записываю его умножая на 2
     }

     public static void  fillDiagonal(int[][] arr) { // метод принимает значение из int из arr4
         for (int i = 0; i < arr.length; i++) { // запускаем цикл
             arr[i][i] = 1; // да блин тут гребаная магия (всю голову сломал)))) , понимаю но объяснить сложно, сто то вроде если координаты типа 11 22 33 то 1
             arr[i][arr.length - 1 - i] = 1; // а тут обратная сторона, типа х всегда растет, а вторая, последний элемент массива минус 1 и минус из цикла.. както так наверно правильно
         }
     }

     public static int[] returnArray(int len, int initialValue) { // метод возвращает массив int[], в метод прописываем лен и инитвэлью
        int[] tempArray = new int[len]; // создаем временный массив длинной лен

        for (int i = 0; i < tempArray.length; i++) { // запускаем цикл фор, по длинне массива
            tempArray[i] = initialValue; // говорим что каждый элемент это инитвэлью
        }
        return tempArray;
     }

     public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i =0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
     }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static boolean checkBalance(int[] arr) {
        int right = 0, left = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            left += arr[i];
            for (int j = i + 1; j < arr.length; j++)
                right += arr[j];
            if (left == right) return true;
            right = 0;
        }
        return false;
    }

    public static void shifter(int[] arr, int value) {
        boolean direction;
        if (value < 0) {
            direction = true;
            value = -value;
        } else {
            direction = false;
        }
        value %= arr.length;
        int lastIndex = arr.length - 1;
        for (int i = 0; i < value; i++) {
            int temp = (direction) ? arr[0] : arr[lastIndex];
            for (int j = 0; j < lastIndex; j++) {
                if (direction)
                    arr[j] = arr[j + 1];
                else
                    arr[lastIndex - j] = arr[lastIndex - j - 1];
            }
            if (direction)
                arr[lastIndex] = temp;
            else
                arr[0] = temp;
        }
    }

}
