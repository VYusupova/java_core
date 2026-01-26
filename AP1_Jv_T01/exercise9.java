package s21.lymondka;
/*Задание 9. Фильтрация строк
Разработай модуль, который фильтрует список строк по подстроке.

Программа считывает количество строк.
Программа считывает каждую новую строку в список.
После считывания всех строк программе на вход подается подстрока для фильтрации.
Программа работает со ссылочными типами данных (List, String, Integer и т. д.).
Программа должна вывести список строк, в которых присутствует введенная подстрока.
Нельзя использовать Java Stream API.
Должна быть своя реализация метода фильтрации.

Входные данные 
	4  
	First car  
	Second door  
	Third message  
	Fourth wood  
	oo
Выходные данные Second door, Fourth wood

Входные данные 
	2  
	First car  
	Second door  
	kek
Выходные данные 
*/
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int count = readIntNum(scanner, "Input count strings read :");
            List<String> input = readListString(scanner,count);
            String substring = scanner.nextLine();
            List<String> output = myFilter(input, substring);
            System.out.print(output.toString());
        }
        catch (InputMismatchException ime) {
            System.out.print("Fist param must be a integer number");
        }
        catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
        }
        catch (Exception e) {
            System.out.print(e);
        }
        finally {
            scanner.close();
        }
    }
    public static int readIntNum(Scanner input, String what) throws IllegalArgumentException {
        int num = 0;
        System.out.print(what);
        num = input.nextInt();
        if (num <= 0) throw new IllegalArgumentException("Input error. Size <= 0");
        input.nextLine();
        return num;
    }
    public static List<String> readListString(Scanner input, int count) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String line = input.nextLine();
            list.add(line);
        }
        return list;
    }
    public static List<String> myFilter(List<String> strings, String substring) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            if (str.contains(substring)) {
                result.add(str);
            }
        }
        return result;
    }
}