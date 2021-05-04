package Calculate;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Calculator {

    private static String [] value;

    Calculator() {
        Map<String, Integer> romanArabic = new HashMap<>();
        romanArabic.put("I", 1);
        romanArabic.put("II", 2);
        romanArabic.put("III", 3);
        romanArabic.put("IV", 4);
        romanArabic.put("V", 5);
        romanArabic.put("VI", 6);
        romanArabic.put("VII", 7);
        romanArabic.put("VIII", 8);
        romanArabic.put("IX", 9);
        romanArabic.put("X", 10);
        romanArabic.put("XI", 11);
        romanArabic.put("XII", 12);
        romanArabic.put("XIII", 13);
        romanArabic.put("XIV", 14);
        romanArabic.put("XV", 15);
        romanArabic.put("XVI", 16);
        romanArabic.put("XVII", 17);
        romanArabic.put("XVIII", 18);
        romanArabic.put("XIX", 19);
        romanArabic.put("XX", 20);
        romanArabic.put("XXI", 21);
        romanArabic.put("XXII", 22);
        romanArabic.put("XXIII", 23);
        romanArabic.put("XXIV", 24);
        romanArabic.put("XXV", 25);
        romanArabic.put("XXVI", 26);
        romanArabic.put("XXVII", 27);
        romanArabic.put("XXVIII", 28);
        romanArabic.put("XXIX", 29);
        romanArabic.put("XXX", 30);
        romanArabic.put("XXXI", 31);
        romanArabic.put("XXXII", 32);
        romanArabic.put("XXXIII", 33);
        romanArabic.put("XXXIV", 34);
        romanArabic.put("XXXV", 35);
        romanArabic.put("XXXVI", 36);
        romanArabic.put("XXXVII", 37);
        romanArabic.put("XXXVIII", 38);
        romanArabic.put("XXXIX", 39);
        romanArabic.put("XL", 40);
        romanArabic.put("XLI", 41);
        romanArabic.put("XLII", 42);
        romanArabic.put("XLIII", 43);
        romanArabic.put("XLIV", 44);
        romanArabic.put("XLV", 45);
        romanArabic.put("XLVI", 46);
        romanArabic.put("XLVII", 47);
        romanArabic.put("XLVIII", 48);
        romanArabic.put("XLIX", 49);
        romanArabic.put("L", 50);
        romanArabic.put("LI", 51);
        romanArabic.put("LII", 52);
        romanArabic.put("LIII", 53);
        romanArabic.put("LIV", 54);
        romanArabic.put("LV", 55);
        romanArabic.put("LVI", 56);
        romanArabic.put("LVII", 57);
        romanArabic.put("LVIII", 58);
        romanArabic.put("LIX", 59);
        romanArabic.put("LX", 60);
        romanArabic.put("LXI", 61);
        romanArabic.put("LXII", 62);
        romanArabic.put("LXIII", 63);
        romanArabic.put("LXIV", 64);
        romanArabic.put("LXV", 65);
        romanArabic.put("LXVI", 66);
        romanArabic.put("LXVII", 67);
        romanArabic.put("LXVIII", 68);
        romanArabic.put("LXIX", 69);
        romanArabic.put("LXX", 70);
        romanArabic.put("LXXI", 71);
        romanArabic.put("LXXII", 72);
        romanArabic.put("LXXIII", 73);
        romanArabic.put("LXXIV", 74);
        romanArabic.put("LXXV", 75);
        romanArabic.put("LXXVI", 76);
        romanArabic.put("LXXVII", 77);
        romanArabic.put("LXXVIII", 78);
        romanArabic.put("LXXIX", 79);
        romanArabic.put("LXXX", 80);
        romanArabic.put("LXXXI", 81);
        romanArabic.put("LXXXII", 82);
        romanArabic.put("LXXXIII", 83);
        romanArabic.put("LXXXIV", 84);
        romanArabic.put("LXXXV", 85);
        romanArabic.put("LXXXVI", 86);
        romanArabic.put("LXXXVII", 87);
        romanArabic.put("LXXXVIII", 88);
        romanArabic.put("LXXXIX", 89);
        romanArabic.put("XC", 90);
        romanArabic.put("XCI", 91);
        romanArabic.put("XCII", 92);
        romanArabic.put("XCIII", 93);
        romanArabic.put("XCIV", 94);
        romanArabic.put("XCV", 95);
        romanArabic.put("XCVI", 96);
        romanArabic.put("XCVII", 97);
        romanArabic.put("XCVIII", 98);
        romanArabic.put("XCIX", 99);
        romanArabic.put("C", 100);
        romanArabic.put("NULL", 0);


        Scanner scan = new Scanner(System.in);
        int result = 0;
        System.out.println("Insert using spaces number1 operation number2. Numbers can be as arabic(from 0 to 10) or roman(from I to X)");


        while (true) {
            if (scan.hasNextInt()) {
                String input = scan.nextLine();
                value = input.toUpperCase(Locale.ROOT).split(" ");

                if (Integer.parseInt(value[0]) > 10 || Integer.parseInt(value[0]) < 0) {
                    System.out.println("Wrong value. Must be from 0 to 10");
                    continue;
                }

                if (Integer.parseInt(value[2]) > 10 || Integer.parseInt(value[2]) < 0) {
                    System.out.println("Wrong value. Must be from 0 to 10");
                    continue;
                }

                if (value[1].equals("/") && Integer.parseInt(value[2]) == 0) {
                    System.out.println("You cannot divide by 0");
                    continue;
                }

                int value2 = Integer.parseInt(value[2]);
                int value1 = Integer.parseInt(value[0]);

                String operation = value[1];

                if (operation.equals("+")) result = value1 + value2;
                else if (operation.equals("*")) result = value1 * value2;
                else if (operation.equals("-")) result = value1 - value2;
                else if (operation.equals("/")) result = value1 / value2;

                System.out.println(result);

                break;


            } else if (scan.hasNextLine()) {
                String input = scan.nextLine();
                value = input.split(" ");
                int a = 0;
                int b = 0;

                for (Map.Entry<String, Integer> pair : romanArabic.entrySet()) {
                    if (value[0].equals(pair.getKey())) {
                        a = pair.getValue();
                    }
                    if (value[2].equals(pair.getKey())) {
                        b = pair.getValue();
                    }
                }

                if (a > 10 || a < 1) {
                    System.out.println("Wrong value. Must be from I to X");
                    continue;
                }

                if (b > 10 || b < 1) {
                    System.out.println("Wrong value. Must be from I to X");
                    continue;
                }

                if (value[1].equals("/") && b == 0) {
                    System.out.println("You cannot divide by NULL. There was no NULL in Roman Numeric");
                    continue;
                }

                String operation = value[1];

                String romanResult = "";

                if (operation.equals("+")) result = a + b;
                else if (operation.equals("*")) result = a * b;
                else if (operation.equals("-")) result = a - b;
                else if (operation.equals("/")) result = a / b;

                if (result < 0) {
                    System.out.println("There were no numbers less than NULL in Roman Numeric.");
                    continue;
                }

                for (Map.Entry<String, Integer> pair : romanArabic.entrySet()) {
                    if (pair.getValue().equals(result)) romanResult = pair.getKey();
                }
                System.out.println(romanResult);
                break;
            }

        }
    }
}
