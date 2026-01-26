package s21.lymondka;
/*
Разработай математический модуль, который определяет периметр треугольника.

Программа считывает координаты вершин треугольника.
Программа работает с вещественными числами.
Программа вычисляет и выводит периметр треугольника, если из введенных вершин образуется треугольник.
Если из введенных вершин не образуется треугольник, то программа выводит: «It's not a triangle».
Программа не завершается с ошибкой при некорректных входных данных. Она выводит: «Could not parse a number. Please, try again» и повторяет попытку ввода.
Точность: 3 знака после запятой.
Используй только простые типы.

*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double aX, bX, cX;
        double aY, bY, cY;
        double A, B, C;
        Scanner scanner = new Scanner(System.in);

                aX = readDoubleNum(scanner);
                aY = readDoubleNum(scanner);
                bX = readDoubleNum(scanner);
                bY = readDoubleNum(scanner);
                cX = readDoubleNum(scanner);
                cY = readDoubleNum(scanner);

                if (isTriangle(aX,aY,bX,bY,cX,cY)){
                    A = sideLength(aX, bX, aY, bY);
                    B = sideLength(bX, cX, bY, cY);
                    C = sideLength(aX, cX, aY, cY);
                    double perim = (A + B + C);
                    System.out.printf("Perimeter: %.3f", perim);
                }
                else
                    System.out.println("It isn't triangle");

        scanner.close();
    }

    private static double sideLength(double x1, double x2, double y1, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double readDoubleNum(Scanner input){
        double num = 0;

        while(true){
            try {
                System.out.print("INPUT number :");
                num = input.nextDouble();
                break;
            }
            catch (Exception e){
                System.out.println("Couldn't parse a number. Please, try again. Usage . or ,");
                input.nextLine(); //очищаем буффер ввода
            }
        }
        return num;
    }
    public static boolean isTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        boolean check = true;
        // через уравнения прямой если точки леажт наодной прямой то n будет близко к 0
        double n = ((x2-x1)*(y3-y1)) - ((x3-x1)*(y2-y1));
        if (Math.abs(n) <= 1e-5) check = false;
        return check;
    }
}