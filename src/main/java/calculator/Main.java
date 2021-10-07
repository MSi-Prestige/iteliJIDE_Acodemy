package calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("Casio");
        double addition = calculator.add(10, 15);
        System.out.println(addition);
        double subtract = calculator.subtract(10, 5);
        System.out.println(subtract);
        double divide = calculator.divide(10, 5);
        System.out.println(divide);
        double multiply = calculator.multiply(10, 5);
        System.out.println(multiply);
    }
}
