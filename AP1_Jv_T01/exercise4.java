package s21.lymondka;
/* 
Разработай математический модуль, который находит среднее арифметическое отрицательных чисел.

Программа считывает количество чисел.
Программа считывает каждое новое число в массив.
Программа работает с целыми числами.
Если отрицательные числа есть, то должно выводиться их среднее арифметическое, иначе: «There are no negative elements».
Если введено отрицательное количество чисел или ноль, то должно выводиться: «Input error. Size <= 0».
Программа не завершается с ошибкой при некорректных входных данных. Она выводит: «Could not parse a number. Please, try again» и повторяет попытку ввода.
Применяй цикл с предусловием for.
Используй только простые типы.

Входные данные 4  1 2 3 4
Выходные данные There are no negative elements


Входные данные -1
Выходные данные Input error. Size <= 0


Входные данные 4  1 -2 3 -4
Выходные данные -3
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = readIntNum(scanner, "Input size array : ");
        if (n <= 0)
        {
            System.out.println("Input error. Size <= 0");
        }
        else{
            int[] numbers = new int[n];
            int sum = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                System.out.printf("Input array element <%d> : ", (i+1));
                numbers[i] = readIntNum(scanner, "");
                if (numbers[i] < 0) {
                    sum += numbers[i];
                    count++;
                }
            }
            if (count > 0) {
                int avg = sum / count;
                System.out.println(avg);
            } else {
                System.out.println("There are no such elements");
            }
        }
    }

    public static int readIntNum(Scanner input, String what ){
        int num = 0;
        while(true){
            try {
                System.out.print(what);
                num = input.nextInt();
                break;
            }
            catch (Exception e){
                System.out.printf("not valid input number - %s\n", e);
                input.nextLine(); //очищаем буффер ввода
            }
        }
        return num;
    }
}
