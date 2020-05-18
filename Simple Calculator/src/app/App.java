package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("");
        Scanner scanner = new Scanner(System.in);

        ArithmeticOperations arithmeticDb = new ArithmeticOperations();
        String arithmeticHeading = "A few arithmetic operations";
        System.out.println(arithmeticHeading.toUpperCase());
        System.out.println("----------------------------");

        System.out.println("Enter two numbers (subtraction): ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double subAnswer = arithmeticDb.sub(num1, num2);
        System.out.println("The difference between " + num1 + " and " + num2 + " is: " + subAnswer);
        System.out.println("");

        System.out.println("Enter two numbers (addition): ");
        double num3 = scanner.nextDouble();
        double num4 = scanner.nextDouble();
        double addAnswer = arithmeticDb.add(num3, num4);
        System.out.println("The sum of " + num3 + " and " + num4 + " is: " + addAnswer);
        System.out.println("");

        System.out.println("Enter two numbers (multiplication): ");
        double num5 = scanner.nextDouble();
        double num6 = scanner.nextDouble();
        double multiplyAnswer = arithmeticDb.multiply(num5, num6);
        System.out.println("The multiplication of " + num5 + " and " + num6 + " is: " + multiplyAnswer);
        System.out.println("");

        System.out.println("Enter two numbers (division): ");
        double num7 = scanner.nextDouble();
        double num8 = scanner.nextDouble();
        double divideAnswer = arithmeticDb.divide(num7, num8);
        System.out.println("The division of " + num7 + " by " + num8 + " is: " + divideAnswer);
        System.out.println("");

        System.out.println("");

        // Portion 2 of the program!!!
        String trigHeading = "A few trigonometric operations";
        System.out.println(trigHeading.toUpperCase());
        System.out.println("------------------------------");
        TrigonometricalFunctions trigDouble = new TrigonometricalFunctions();

        System.out.println("Enter a number to determine its cosine: ");
        double cosNumber = scanner.nextDouble();
        System.out.println("The cosine of " + cosNumber + " in degrees is: " + trigDouble.cosine(cosNumber));
        System.out.println("");

        System.out.println("Enter a number to determine its sine: ");
        double sineNumber = scanner.nextDouble();
        System.out.println("The sine of " + sineNumber + " in degrees is " + trigDouble.sine(sineNumber));
        System.out.println("");

        System.out.println("Enter a number to determine its tangent: ");
        double tanNumber = scanner.nextDouble();
        System.out.println("The tangent of " + tanNumber + " in degrees is " + trigDouble.tangent(tanNumber));

        scanner.close();

    }
}