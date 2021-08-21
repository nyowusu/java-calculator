package me.boakye.lib;

public class Calculator {
    public int addTwoNumber(int first, int second) {
        return first + second;
    }

    public double divideTwoNumbers(double first, double second) {
        if (second  == 0) return 0;

        return first / second;
    }

    public int multiplyTwoNumbers(double first, double second) {
        return (int) (first * second);
    }

    public double subtractTwoNumbers(double first, int second)  {
        return first - second;
    }
}
