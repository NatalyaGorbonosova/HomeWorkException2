import java.util.Scanner;
//Задача 2:
//Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
// Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с сообщением
// "Деление на ноль недопустимо".
// В противном случае, программа должна выводить результат деления.

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 = sc.nextDouble();
        System.out.println("Введите второе число: ");
        double num2 = sc.nextDouble();
        divide(num1, num2);
    }

    public static void divide(double num1, double num2){
        if (notZero(num2)){
            System.out.println(num1/num2);
        } else {
            throw new DivisionByZeroException("Деление на ноль не допустимо");
        }
    }
    private static boolean notZero(double num){
        if (num != 0) return  true;
        else {
            return  false;
        }
    }
    public static class DivisionByZeroException extends RuntimeException{
        public DivisionByZeroException(String message){
            super(message);
        }
    }
}
