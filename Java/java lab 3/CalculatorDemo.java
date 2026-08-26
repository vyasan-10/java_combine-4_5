class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public String add(String a, String b) {
        return a + b;
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add int: " + calc.add(10, 20));
        System.out.println("Add double: " + calc.add(12.5, 7.5));
        System.out.println("Add three ints: " + calc.add(1, 2, 3));
        System.out.println("Add strings: " + calc.add("Hello ", "World"));
    }
}
