package by.belhard.j24.homeworks.hw9.task3;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Calculator {

    private static final BiFunction<Integer, Integer, Double> plus = (a, b) -> a + (double) b;
    private static final BiFunction<Integer, Integer, Double> minus = (a, b) -> a - (double) b;
    private static final BiFunction<Integer, Integer, Double> divide = (a, b) -> a / (double) b;
    private static final BiFunction<Integer, Integer, Double> multiply = (a, b) -> a * (double) b;

    public double calculate(String inputString)
            throws NumberFormatException, IndexOutOfBoundsException,
            UnsupportedOperationException {

        inputString = inputString.replaceAll(" ", "");

        String operation = parseOperation(inputString);

        String[] split = inputString.split("[" + operation + "]");

        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);

        return calculate(a, b, operation);
    }

    private double calculate(int a, int b, String operation) {

        BiFunction<Integer, Integer, Double> func;

        switch (operation) {
            case "+":
                func = plus;
                break;
            case "-":
                func = minus;
                break;
            case "*":
                func = multiply;
                break;
            case "/":
                func = divide;
                break;
            default:
                throw new UnsupportedOperationException();
        }

        return func.apply(a, b);
    }

    private String parseOperation(String inputString) {

        return inputString.replaceAll("\\d", "");
    }
    // Map<String, Account> map
}
