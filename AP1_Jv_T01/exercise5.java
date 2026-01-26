package s21.lymondka;
/*Задание 5. 
Поиск чисел, у которых совпадает первая и последняя цифра
Разработай математический модуль, ищущий числа, у которых совпадает первая и последняя цифра.

Программа считывает количество чисел.
Программа считывает каждое новое число в массив.
Программа работает с целыми числами.
Если есть числа, у которых совпадает первая и последняя цифра, то должно выводиться их, иначе: «There are no such elements».
Числа, у которых совпадает первая и последняя цифра, сохраняй в отдельный массив.
Если введено отрицательное количество чисел или ноль, то должно выводиться: «Input error. Size <= 0».
Программа не завершается с ошибкой при некорректных входных данных. Она выводит: «Could not parse a number. Please, try again» и повторяет попытку ввода.
Используй цикл с предусловием while.
Должен быть выделен отдельный метод для определения числа, у которого совпадает первая и последняя цифра.
Используй только простые типы.

Входные данные 4  100 200 300 400
Выходные данные There are no such elements


Входные данные -1
Выходные данные Input error. Size <= 0


Входные данные 5  1 202 300 200005 301213
Выходные данные 1 202 301213
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = readIntNum(scanner, "Input size of array :");
        if (n <= 0) System.out.println("Input error. Size <= 0.");
        else {
            int[] numbers = new int[n];
            int[] result = new int[n];
            int count = 0;
            for (int i = 0; i < n; i++) {
                numbers[i] = readIntNum(scanner, "input arrays element[" + String.valueOf(i) + "] :");
                if (isMatching(numbers[i])) {
                    result[count++] = numbers[i];
                }
            }
            if (count == 0) System.out.println("There are no such elements");
            else
                for (int i = 0; i < count; System.out.printf("%d ", result[i++])) ;
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

    public static boolean isMatching(int n) {
        if (n < 0) {
           n = n * (-1);
        }
        int lastDigit = n % 10;
        int firstDigit = n;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        return firstDigit == lastDigit;
    }
}