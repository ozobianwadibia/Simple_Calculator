package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();
        ArithmeticOperations arithmeticInt = new ArithmeticOperations();

        int subAnswer = arithmeticInt.sub(19, 39);
        int addAnswer = arithmeticInt.add(25, 78);
        int multiplyAnswer = arithmeticInt.multiply(30, 3);
        int divideAnswer = arithmeticInt.divide(125, 25);
        System.out.println("The difference between 19 and 39 is: " + subAnswer);
        System.out.println("The sum of 25 and 78 is: " + addAnswer);
        System.out.println("The multiplication of 30 and 3 is: " + multiplyAnswer);
        System.out.println("The division of 125 by 25 is: " + divideAnswer);

        System.out.println();

        TrigonometricalFunctions trigDouble = new TrigonometricalFunctions();
        double cos = trigDouble.cosine(98.65);
        double sine = trigDouble.sine(30.0);
        double tan = trigDouble.tangent(45.9);
        System.out.println("The cosine of 98.65 radians is: " + cos);
        System.out.println("The sine of 30.0 radians is: " + sine);
        System.out.println("The tangent of 45.9 radians is: " + tan);
    }
}