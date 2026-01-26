package s21.lymondka;
/*
Разработай математический модуль, который переводит секунды к формату hh:mm:ss находит, то есть находит количество часов, минут и секунд.

Программа считывает секунды.
Программа работает с целыми числами.
Программа вычисляет и выводит количество часов, минут и секунд в формате hh:mm:ss.
Если введено количество секунд меньше 0, то должно выводиться: «Incorrect time».
Программа не завершается с ошибкой при некорректных входных данных. Она выводит: «Could not parse a number. Please, try again» и повторяет попытку ввода.
Должна быть следующая структура программы:

метод ввода;
метод нахождения часов, минут и секунд;
метод вывода.


Все упомянутые выше методы должны вызываться из main.
Используй только простые типы.
Входные данные 3599
Выходные данные 00:59:59

Входные данные 3601
Выходные данные01:00:01

Входные данные -100
Выходные данныеIncorrect time

*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = inputSeconds(scanner);
        int[] time= calcTime_hhmmss (seconds);
        output(time[0], time[1], time[2], (seconds < 0 ? false : true));
        scanner.close();
    }

    public static int inputSeconds(Scanner input) {
        int seconds = 0;
        while (true) {
            try {
                System.out.print("Input seconds: ");
                seconds = Integer.parseInt(input.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Could not parse a number. Please try again");
            }
        }
        return seconds;
    }

    public static int[] calcTime_hhmmss (int seconds) {
        int[] time = new int[3];
        if (seconds < 0) {
            time[0] = 0;
            time[1] = 0;
            time[2] = 0 ;
        }
        else {
            time[0] = seconds / 3600;
            time[1] = (seconds % 3600) / 60;
            time[2] = seconds % 60;
        }
        return time;
    }

    public static void output(int hours, int minutes, int seconds, boolean isValid) {
        if (!isValid) {
            System.out.println("Incorrect time.");
        }
        else {
            System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
        }
    }
}