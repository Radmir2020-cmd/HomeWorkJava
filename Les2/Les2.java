package Les2;

public class Les2 {

    public static void main(String[] args) {

//        int a = 20;
//        int b = 20;
//        int result;
//
//        if (a > b) {
//            result = a;
//        } else if (a == b) {
//            result = 999;
//        } else {
//            result = b;
//        String nameLetter = "Maria";
//
//        if (nameLetter == "Boris") {
//            System.out.println("Give letter to Boris");
//        } else if (nameLetter == "Olga") {
//            System.out.println("Give letter to Olga");
//        } else if (nameLetter == "Maria") {
//            System.out.println("Give letter to Maria");
//        } else {
//            System.out.println("Go out office");


//        switch (nameLetter) { //переключатель
//            case "Boris": // if (nameLetter == "Boris")
//                System.out.println("Give letter to Boris");
//                break; // прекращение
//            case "Olga":
//                System.out.println("Give letter to Olga");
//                break;
//            case "Maria":
//                System.out.println("Give letter to Maria");
//                break;
//            default:
//                System.out.println("Go out office");
//                break;
//        }

//        String value = "String";

        int a = 0;

        while (a < 10) { // смотрю на условие
            a++;
            if(a == 5 || a == 7){ // условие
                continue;
            }
            System.out.print(a + " | ");
        }

//        int b = 0; // бесконечный цикл
//        while (true) {
//            b++;
//            System.out.println(b + " | ");
//        }

        int c = 10;
        do {
            c++;
            if (c == 6) {
                break;
            }
            System.out.print(c + " | ");
        } while (c < 10);


//        int value1;
//        int value2;

//        for(value1 = 0, value2 = 15; value1 < 10; value2++, value2--) {
//            System.out.println(value + value1 + " > " + value2 + " | ");
//        }

//        for (int i = 15; i <= 20; i++) {
//            System.out.println(value + i + " ");
//        }

        //       result = (a > b) ? a : b; // тернальный оператор

        //       System.out.println("Result = " + result);

//        System.out.println(myMath(2,10)); //1024
//
//        myPifagorTable(10, 10);
    }

//    public static int myMath(int baseValue, int signature) {
//        int result = 1;
//
//        for (int i = 0; i < signature; i++) {
//            result = result * baseValue;
//        }
//
//        return result;
//    }
//
//    public static void  myPifagorTable(int width, int height) {
//        for (int y = 1; y < height; y++) {
//            for (int x = 1; x < width; x++){
//                System.out.print(y * x + "\t");
//            }
//            System.out.println();
//        }
    }
