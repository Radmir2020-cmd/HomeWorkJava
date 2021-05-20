package Les7;

import java.util.Scanner;

public class Les7 {

    private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
        String s0 = "Hello_world"; //Hello_world
        String s1 = "Hello_";
        s1 += "world"; //Hello_world

        String s2 = scanner.nextLine(); //Hello_world
        String s3 = "Hello_world"; //Hello_world

        System.out.println("s0 = " + s0);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println(s0 == s1); //true / false ?
        System.out.println(s0 == s2); //true / false ?
        System.out.println(s0 == s3); //true / false ?
        System.out.println(s0.equals(s1)); //true / false ?
        System.out.println(s0.equals(s2)); //true / false ?
        System.out.println(s0.equals(s3)); //true / false ?

            String testString = "ExampleTest"; //String testString = new String("ExampleTest");
            StringBuilder stringBuilder = new StringBuilder("ExampleTest");

            long startTime = System.nanoTime();

            for (int i = 0; i < 50000; i++) {
                testString += i; //ExampleTest01234567891011..49999
            }

            float deltaTime = System.nanoTime() - startTime;
            System.out.println(testString);
            System.out.println("Time-work test string = " + deltaTime * 0.000001f + " millisec.");

            startTime = System.nanoTime();
            for (int i = 0; i < 50000; i++) {
                stringBuilder.append(i); //ExampleTest01234567891011..49999
            }

            deltaTime = System.nanoTime() - startTime;
            System.out.println(stringBuilder.toString());
            System.out.println("Time-work test stringBuilder = " + deltaTime * 0.000001f + " millisec.");
            System.out.println(testString.equals(stringBuilder.toString()));

        }

    }


