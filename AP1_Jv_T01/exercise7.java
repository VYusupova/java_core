package s21.lymondka;
/*Задание 7. Поиск максимального и минимального значений
Разработай математический модуль, который производит поиск максимального и минимального значений в массиве.

Программа считывает путь до файла.
Программа считывает из файла количество чисел.
Программа считывает каждое новое число из файла в массив, пока не превысит количество чисел либо не достигнет конца файла.
Программа работает с вещественными числами.
Программа выводит считанное количество чисел и сами числа.
Программа сохраняет в файл result.txt найденные минимум и максимум и выводит в консоль сообщение: «Saving min and max values in file».
Если считалось чисел меньше, чем указано в количестве, должно выводиться: «Input error. Insufficient number of elements».
Если файла не существует, то должно выводиться: «Input error. File doesn't exist».
Если отрицательное количество чисел или ноль, то должно выводиться: «Input error. Size <= 0».
Программа не завершается с ошибкой при некорректных входных данных. Она пропускает ошибочный ввод и переходит к следующему считыванию значения.
________________________________________________
file1.txt
4 
100.0 50.0 60.0 10.0

file2.txt
0  
100.0 50.0 60.0 10.0

file3.txt
10  
100.0 50.0 60.0 10.0

file4.txt
5  
20.0 50.0 f 60.0 g 10.0 1.0
__________________________________________________
Входные данные file1.txt
Выходные данные в консоль :
	4  
	100.0 50.0 60.0 10.0  
	Saving min and max values in file
Выходные данные в result.txt : 10.0 100.0


Входные данные file2.txt
Выходные данные в консоль :
	 Input error. Size <= 0


Входные данные file3.txt
Выходные данные в консоль :
	Input error. Insufficient number of elements
Выходные данные в result.txt : -


Входные данные file4.txt
Выходные данные в консоль :
	5  
	20.0 50.0 60.0 10.0 1.0 
	Saving min and max values in file
Выходные данные в result.txt : 1.0 60.0


Входные данные fileIsNotExist.txt
Выходные данные в консоль : 
	Input error. File doesn't exist
Выходные данные в result.txt : -
*/

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input name file : ");
        String filePath = scanner.nextLine();
        try {
            File file = new File(filePath);
            Scanner fileScanner = new Scanner(file);
            int count = readIntNum(fileScanner, "");
            if (count <= 0) System.out.println("Input error. Size <= 0");
            else {
                double[] numbers = inputArray(fileScanner, count);
                outArray(numbers,count);
                saveResult(findMin(numbers, count),findMax(numbers, count));
            }
            fileScanner.close();
            } catch(FileNotFoundException e){
                System.out.println("Input error. File doesn't exist");
            } catch (Exception e) {
                System.out.printf("%s",e);
        }
        scanner.close();
    }

    public static int readIntNum(Scanner input, String what ){
        int num = 0;
        while(input.hasNext()){ // читаем пока есть данные
            try {
                System.out.print(what);
                num = input.nextInt();
                break;
            }
            catch (Exception e){
                System.out.println("Could not parse a number, try again");
                input.next(); //очищаем буффер ввода
            }
        }
        return num;
    }
    public static double readDoubleNum(Scanner input, String what ){
        double num = 0;
        while(input.hasNext()){
            try {
                System.out.print(what);
                num = input.nextDouble();
                break;
            }
            catch (Exception e){
                System.out.println("Could not parse a number. Please, try again. Usage . or ,");
                input.next(); //очищаем буффер ввода
            }
        }
        return num;
    }
    public static double[] inputArray(Scanner input, int size) throws Exception {
        double [] array = new double[size];
        int numRead = 0;
        while (input.hasNext() && numRead < size) {
            array[numRead] = readDoubleNum(input,"");
            numRead++;
        }
        if (numRead < size)
            throw new Exception("\nInput error. Insufficient number of elements");
        return array;
    }
    public static void outArray(double [] array, int size){
        System.out.printf("%d\n", size);
        for (int i = 0; i < size-1; i++)
            System.out.printf("%.1f ", array[i]);
        System.out.printf("%.1f\n", array[size-1]);
    }

    public static double findMin(double[] array, int count) {
        double min = array[0];
        for (int i = 1; i < count; i++)
            if (array[i] < min) min = array[i];
        return min;
    }

    public static double findMax(double[] array, int count) {
        double max = array[0];
        for (int i = 1; i < count; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }
    public static void saveResult(double min, double max){
        try (PrintWriter writer = new PrintWriter("result.txt")) {
            writer.printf("%.1f %.1f", min, max);
            System.out.println("Saving min and max values to file");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}