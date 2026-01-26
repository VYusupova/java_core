package s21.lymondka;
/*
Задание 8. Упорядоченная последовательность по возрастанию
Разработай математический модуль, который определяет, является ли последовательность упорядоченной по возрастанию.

Программа считывает каждое новое число.
Программа работает с целыми числами.
Нельзя использовать массивы.
Программа должна определить, является ли последовательность упорядоченной по возрастанию. В случае отрицательного ответа программа должна определить порядковый номер первого числа, нарушающего такую упорядоченность, и вывести: «The sequence is not ordered from the ordinal number of the number (порядковый номер)».
Программа завершает проверку введенной последовательности при некорректном вводе и выводит: «The sequence is ordered in ascending order», если было введено хотя бы одно число.
Если не ввели ни одного числа, то должно выводиться: «Input error».
Используй только простые типы.

Входные данные 1 2 3 5 4
Выходные данные The sequence is not ordered from the ordinal number of the number 4


Входные данные а
Выходные данные Input error


Входные данные 10 20 50 80 90 g
Выходные данные The sequence is ordered in ascending order

*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static int count;
    private static boolean endEnter;
    private static boolean isOrdered;
    private static String endMassege;
    static {
        endEnter = false;
        isOrdered = false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers. the end of input is not a numeric character :");
            int num1 = readIntNum(scanner);
            int num2 = 0;
            while (scanner.hasNextInt() && !Main.endEnter) {
                num2 = readIntNum(scanner);
                if (num1 > num2) {
                    isOrdered = false;
                    --Main.count;
                    Main.endMassege = "The sequence is not ordered from the ordinal number of the number " + Main.count;
                    break;
                } else
                    num1 = num2;
            }
            if (isOrdered) Main.endMassege = "The sequence is in ascending order";
            System.out.println(endMassege);
    }

    public static int readIntNum(Scanner input){
        int num = 0;
            try {
                num = input.nextInt();
                Main.count++;
                isOrdered = true;
            }
            catch (InputMismatchException e){
                if (Main.count == 0)  {
                    Main.endMassege = "Input error";
                    Main.endEnter = true;
                }
                else {
                    Main.endEnter = true;
                }
        }
        return num;
    }
}