package s21.lymondka;
/*Задание 6. Сортировка массива выбором
Разработай математический модуль, который производит сортировку массива выбором по возрастанию.

Программа считывает количество чисел.
Программа считывает каждое новое число в массив.
Программа работает с вещественными числами.
Программа выводит отсортированный массив выбором по возрастанию.
Если введено отрицательное количество чисел или ноль, то должно выводиться: «Input error. Size <= 0»
Программа не завершается с ошибкой при некорректных входных данных. Она выводит: «Could not parse a number. Please, try again» и повторяет попытку ввода.
Должен быть выделен отдельный метод для сортировки выбором массива по возрастанию.
Нельзя использовать библиотечные реализации, нужно написать свою.
Используй только простые типы.

Входные данные 4  100.0 50.0 60.0 10.0
Выходные данные 10.0 50.0 60.0 100.0


Входные данные -1
Выходные данные Input error. Size <= 0
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = readIntNum(scanner, "Input size of arrays : ");
        if (count <= 0) System.out.println("Input error. Size <= 0.");
        else {
            double[] numbers = new double[count];
            for (int i = 0; i < count; i++) {
                numbers[i] = readDoubleNum(scanner,"input arrays element[" + String.valueOf(i) + "] :");
            }
            selectionSort(numbers);
            for (double i : numbers)
                System.out.printf("%.1f ", i);
            scanner.close();
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
                System.out.printf("Could not parse a number. Please, try again %s\n", e);
                input.nextLine(); //очищаем буффер ввода
            }
        }
        return num;
    }
    public static double readDoubleNum(Scanner input, String what ){
        double num = 0;
        while(true){
            try {
                System.out.print(what);
                num = input.nextDouble();
                break;
            }
            catch (Exception e){
                System.out.println("Could not parse a number. Please, try again. Usage . or ,");
                input.nextLine(); //очищаем буффер ввода
            }
        }
        return num;
    }
    public static void selectionSort(double[] array) {
        int n = array.length;
        for (int i = 0; i < n-1 ; i++) {
            int minIndex = i;
            for(int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex])
                    minIndex = j;
            }
            if(minIndex!=i) {
                double temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
    }
}
