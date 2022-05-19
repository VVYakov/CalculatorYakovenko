import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Calculator {
    public static void main(String[] input) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше значение от 1 до 10 либо  I до X");
        String userValue = scanner.nextLine();
        String[] example = userValue.split(" ");
        if (example.length!=3) {
            throw new Exception("//т.к.формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        } else {
            try {
                int num1 = Integer.parseInt(example[0].trim());
                int num2 = Integer.parseInt(example[2].trim());
                if (num1 >= 1 && num1 <= 10 && num2 >= 1 && num2 <= 10) {
                    switch (example[1]) {
                        case "+" -> System.out.println(num1 + num2);
                        case "-" -> System.out.println(num1 - num2);
                        case "/" -> System.out.println(num1 / num2);
                        case "*" -> System.out.println(num1 * num2);
                        default -> throw new Exception("//т.к. строка не является математической операцией");
                    }
                } else {
                    throw new Exception("//т.к. необходимо ввести значение от 1 до 10");
                }
            } catch (NumberFormatException nfe) {
                List roamNumbers = new ArrayList();
                roamNumbers.add("I");
                roamNumbers.add("II");
                roamNumbers.add("III");
                roamNumbers.add("IV");
                roamNumbers.add("V");
                roamNumbers.add("VI");
                roamNumbers.add("VII");
                roamNumbers.add("VIII");
                roamNumbers.add("IX");
                roamNumbers.add("X");
                int index1 = (roamNumbers.indexOf(example[0]) + 1);
                int index2 = (roamNumbers.indexOf(example[2]) + 1);
                try {
                    if (example[0].equals(roamNumbers.get(index1 - 1)) && example[2].equals(roamNumbers.get(index2 - 1))) {
                            int result = switch (example[1]) {
                                case "+" -> (index1 + index2);
                                case "-" -> (index1 - index2);
                                case "/" -> (index1 / index2);
                                case "*" -> (index1 * index2);
                                default -> throw new Exception("//т.к. строка не является математической операцией");};
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
                          try{  String Result3 = roams3[result - 1];
                            System.out.println(Result3);}
                          catch (IndexOutOfBoundsException equals) {throw new Exception("//т.к. в римской системе нет отрицательных чисел");}
                    }
                } catch (IndexOutOfBoundsException equals) {throw new Exception("//т.к. используются одновременно разные системы счисления");}
            }
        }
    }
}