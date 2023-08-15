import java.util.Scanner;

//Задача 1:
//Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
// Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException
// с сообщением "Некорректное число". В противном случае, программа должна выводить сообщение "Число корректно".
public class Task1 {
    public static void main(String[] args) throws InvalidNumberException {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        checkPositive(number);
        sc.close();
    }

    public static void checkPositive(int number) throws InvalidNumberException {
        if (isPositive(number)) {
            System.out.println("Число корректно");
        } else {
            throw new InvalidNumberException("Некорректное число");
        }
    }

    private static boolean isPositive(int number) {
        if (number > 0) return true;
        else {
            return false;
        }
    }

    public static class InvalidNumberException extends Exception {
        public InvalidNumberException(String message) {
            super(message);
        }
    }

}
