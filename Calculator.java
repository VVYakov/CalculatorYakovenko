import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в калькулятор, введите выражение от 1 до 10," +
                "например (1 + 5 либо римскими  I * V)");
        String meaning1 = scanner.nextLine();
        String[] example = meaning1.split(" ");
        if (example.length != 3) {
            throw new Exception("//т.к.формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        } else {
            try {
                int num1 = Integer.parseInt(example[0].trim());
                int num2 = Integer.parseInt(example[2].trim());
                if (num1 >= 1 && num1 <= 10 && num2 >= 1 && num2 <= 10) {
                    if (example[1].equals("+")) {
                        System.out.println(num1 + num2);
                    } else if (example[1].equals("-")) {
                        System.out.println(num1 - num2);
                    } else if (example[1].equals("/")) {
                        System.out.println(num1 / num2);
                    } else if (example[1].equals("*")) {
                        System.out.println(num1 * num2);
                    } else {
                        throw new Exception("//т.к. строка не является математической операцией");
                    }

                } else {
                    throw new Exception("//т.к. необходимо ввести значение от 1 до 10");
                }
            } catch (NumberFormatException nfe) {
                List lista = new ArrayList();
                lista.add("I");
                lista.add("II");
                lista.add("III");
                lista.add("IV");
                lista.add("V");
                lista.add("VI");
                lista.add("VII");
                lista.add("VIII");
                lista.add("IX");
                lista.add("X");

                int index1 = (lista.indexOf(example[0]) + 1);
                int index2 = (lista.indexOf(example[2]) + 1);
                try {
                    if (example[0].equals(lista.get((index1 - 1))) && example[2].equals(lista.get((index2 - 1)))) {
                            int result = 0;

                            if (example[1].equals("+")) {
                                result = (index1 + index2);
                            } else if (example[1].equals("-")) {
                                result = (index1 - index2);
                            } else if (example[1].equals("/")) {
                                result = (index1 / index2);
                            } else if (example[1].equals("*")) {
                                result = (index1 * index2);
                            } else {
                                throw new Exception("//т.к. строка не является математической операцией");
                            }

                            int Result2 = (result - 1);

                            String[] roams3 = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                                    "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                                    "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                                    "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                                    "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                                    "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                                    "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                                    "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                                    "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                                    "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
                          try{  String Result3 = roams3[Result2];
                            System.out.println(Result3);}
                          catch (IndexOutOfBoundsException equals){throw new Exception("//т.к. в римской системе нет отрицательных чисел");}
                    }
                } catch (IndexOutOfBoundsException equals) {  throw new Exception("//т.к. используются одновременно разные системы счисления");
              }
            }
        }
    }
}