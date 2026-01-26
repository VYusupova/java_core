package s21.lymondka;
/*
Разработай математический модуль, который находит n число Фибоначчи.

Программа считывает порядковый номер числа Фибоначчи.
Программа работает с целыми числами.
Предусмотри выход за пределы памяти.
Для нахождения числа Фибоначчи используй рекурсивный подход.
Программа не завершается с ошибкой при некорректных входных данных. Она выводит: «Could not parse a number. Please, try again» и повторяет попытку ввода.
Используй только простые типы.

Входные данные 10
Выходные данные 55

Входные данные 100000000
Выходные данные Too large n
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = readIntNum(scanner);
        try {
            long result = fibonacci(n);
            System.out.printf("%d", result);
        } catch (ArithmeticException e){
            System.out.println("Too large n");
        }
        scanner.close();
    }

    public static int readIntNum(Scanner input){
        int num = 0;
        while(true){
            try {
                System.out.print("INPUT number :");
                num = input.nextInt();
                if (num < 0) throw new Exception("input a negative number");
                break;
            }
            catch (InputMismatchException e){
                System.out.println("Couldn't read a number. Please, try again.");
                input.nextLine(); //очищаем буффер ввода
            }
            catch (Exception e){
                System.out.printf("not valid input number - %s\n", e);
                input.nextLine(); //очищаем буффер ввода
            }
        }
        return num;
    }

    public static long fibonacci(int n) throws ArithmeticException {
        if (n == 1 || n == 2) {
            return 1;
        }
        long previous = fibonacci(n - 1);
        long res = previous + fibonacci(n - 2);
        if (res < previous) {
            throw new ArithmeticException("");
        }
        return res;
    }
}
