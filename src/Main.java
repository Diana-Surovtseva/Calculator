import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Choose menu item: ");
            System.out.println("1. Sum ");
            System.out.println("2. Div");
            System.out.println("3. Mult");
            System.out.println("4. Sub");
            System.out.println("0. Exit");

            Scanner myObj = new Scanner(System.in);  // Create a object that can read user input
            String menuItem = myObj.nextLine();  // Read user input
            System.out.println("Menu item is: " + menuItem);  // Output user input

            if (menuItem.contains("0") || menuItem.contains("exit")) {
                break;
            }
            int firstNumber;
            int secondNumber;
            switch (menuItem) {
                case "1":
                    System.out.println("Введите первое число: ");
                    firstNumber = myObj.nextInt();
                    System.out.println("Введите второе число: ");
                    secondNumber = myObj.nextInt();
                    System.out.println("Result of sum: " + sum(firstNumber, secondNumber));
                    break;
                case "2":
                    System.out.println("Введите первое число: ");
                    firstNumber = myObj.nextInt();
                    System.out.println("Введите второе число: ");
                    secondNumber = myObj.nextInt();
                    System.out.println("Result of division: " + div(firstNumber, secondNumber));
                    break;
                case "3":
                    System.out.println("Введите первое число: ");
                    firstNumber = myObj.nextInt();
                    System.out.println("Введите второе число: ");
                    secondNumber = myObj.nextInt();
                    System.out.println("Result of multiplication: " + mult(firstNumber, secondNumber));
                    break;
                case "4":
                    System.out.println("Введите первое число: ");
                    firstNumber = myObj.nextInt();
                    System.out.println("Введите второе число: ");
                    secondNumber = myObj.nextInt();
                    System.out.println("Result of subtraction: " + sub(firstNumber, secondNumber));
                    break;
            }
        }
    }

    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double div(int firstNumber, int secondNumber) {
        return firstNumber / (double) secondNumber;
    }

    public static int mult(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public static int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
