package les1;

public class les1 {

//one-line comment

/*
more-line comment
 */

//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

    /**
     * JavaDoc Comment
     * Created by Aleksandr Gladkov [Anticisco]
     * Date: 26.04.2021
     */

    //public class Lection01 {

        public static void main(String[] args) {
            //Hello_Java!!!
//        System.out.print("Hello_Java!!!\n");
//        System.out.println("Hello_World!!!");
//        System.out.print("РџСЂРёРІРµС‚ Р’Р°СЃСЏ!!!");

//        String myString1 = "Hello_Java from myString1";
//        String myString2 = "Hello_World!!!";
//        String myString3 = "3000000000";
//        String myString4 = "9000000000";
//
//        System.out.println(myString1);
//        System.out.println(myString2);
//        System.out.println(myString1 + myString2);
//        System.out.println(myString3 + myString4);
//
//        //Р¦РµР»РѕС‡РёСЃР»РµРЅРЅС‹Рµ
//        byte myByte = 50; //-128..+127 (1 byte)
//        short myShort = 500; // -32768..+32767 (2 byte)
//        int myInteger = 5269032; //-2.1РјР»СЂРґ..+2.1РјР»СЂРґ (4 byte)
//        long myLong = 3000000000L; //-2^63 .. + 2^63 (8 byte)
//        System.out.println("Result = " + myInteger);
//
//        //РЎ РїР»Р°РІР°СЋС‰РµР№ С‚РѕС‡РєРѕР№
//        float myFloat = 956.345f; // (4 byte) - <>.0000000
//        double myDouble = 956.345; // (8 bytes) - <>.00000000000000
//
//        //symbols
//        char myChar = '"'; //ASCII (2 byte)
//
//        //boolean
//        boolean myBoolean = true; //false
//
//        int a = 15;
//        int b = 4;
//        int c = a % b;
//        System.out.println(a + b);
//        System.out.println(c);

            //Math-operation +, - , / , * , ^, %

//        int age = 32;
//
//        boolean less = age < 18;
//        boolean more = age > 65;
//
//        System.out.println(less);
//        System.out.println(more);
//
//        if (less) {
//            System.out.println("Don't drink!!!");
//        } else if (more) {
//            System.out.println("Sorry, you old!!! Go home!");
//        } else {
//            System.out.println("Good luck!!!");
//        }
//
//        int abc = 40;
//        if (abc < 10) {
//            System.out.println(abc + "< 10");
//        }

        /*
        a = a + 1; -> a++;
        a = a - 1; -> a--;
        a = a + 45; -> a += 45; (-=, *=, /=, %=)
         */

//        int qwe = 100;
//        int asd = 65;
//        int result;
//
//        result = myMath(qwe, asd, "Hello");
//        qwe++; //qwe = qwe + 1;
//        result += myMath(qwe, asd, "World");
//        asd++;
//        result += myMath(qwe, asd, "РџСЂРёРІРµС‚");
//        qwe++;
//        result += myMath(qwe, asd, "РњРµРґРІРµРґ");
//        System.out.println(result); //666
//
//        System.out.println("Result: " + myMath(10,15,"Qwerty"));

            doSomethingNoArgs();
            doSomethingNoArgs();

            doSomethingWithArgs("Hello from method", 1000, 999.99f);
        }

        public static int myMath(int value1, int value2, String myCustomString) {
            System.out.println(myCustomString);
            return value1 - value2;
        }

        public static void doSomethingNoArgs() {
            System.out.println("РљСЂР°СЃРЅС‹Р№");
        }

        public static void doSomethingWithArgs(String valueStr, int valueInt, float valueFloat) {
            System.out.println("StrArgs in method = " + valueStr);
            System.out.println("IntArgs in method = " + (valueInt + 1500));
            System.out.println("FloatArgs in method = " + valueFloat / 15.98f);
        }
    }

