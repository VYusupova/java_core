package s21.lymondka;

/*Разработай модуль, который ищет имена совершеннолетних пользователей.

Создай класс User с двумя полями: строка с именем пользователя, целочисленный возраст.
Класс User должен быть в отдельном файле.
Программа считывает количество пользователей.
Каждый считанный пользователь добавляется в список.
Если ввели отрицательный или нулевой возраст, то программа выводит: «Incorrect input. Age <= 0» и переходит к следующему вводу.
Программа не завершается с ошибкой при некорректных входных данных. Она выводит: «Could not parse a number. Please, try again» и повторяет попытку ввода.
Программа должна вывести имена совершеннолетних пользователей.
Должно использоваться Java Stream API.
Программа работает со ссылочными типами данных.

Входные данные 
	3  
	Name1  
	16  
	Name2 
	19  
	Name3  
	18
Выходные данные Name2, Name3

Входные данные 
	3  
	Name1  
	16  
	Name2  
	14  
	Name3  
	13
Выходные данные

Входные данные 
	3  
	Name1  
	-2  
	Name2  
	23  
	Name3  
	13  
	Name4  
	24
Выходные данные Incorrect input. Age <= 0  
		Name2, Name4
*/

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int userCount = readIntNum(scanner, "reads the number of users :");
            List<User> users = new ArrayList<>(userCount);
            while (users.size() < userCount) {
                String name = scanner.next();
                int age = readIntNum(scanner, "");
                try {
                    User user = new User(name, age);
                    users.add(user);
                } catch (IllegalArgumentException e){
                  System.out.println(e.getMessage());
                }
            }
            List<String> adultNames = users.stream()
                    .filter(user -> user.getAge() >= 18)
                    .map(User::getName)
                    .collect(Collectors.toList());
            if (!adultNames.isEmpty()) {
                System.out.println(String.join(", ", adultNames));
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
    public static int readIntNum(Scanner input, String what) {
        int num = 0;
        while(true){
            try {
                System.out.print(what);
                num = input.nextInt();
                break;
            }
            catch (InputMismatchException e){
                System.out.println("Couldn't read a number. Please, try again.");
                input.next();
            }
        }
        return num;
    }
}