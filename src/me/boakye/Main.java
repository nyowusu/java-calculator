package me.boakye;

import me.boakye.lib.Calculator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calculator calculator = new Calculator();

        // adding two numbers
        int firstToAdd = 5;
        int secondToAdd = 7;
        System.out.printf("%d + %d = %d%n", firstToAdd, secondToAdd, calculator.addTwoNumber(firstToAdd, secondToAdd));

        // divideTwoNumbers
        double firstToDivide = 13;
        double secondToDivide = 4;
        System.out.printf("%.2f / %.2f = %.2f%n", firstToDivide, secondToDivide, calculator.divideTwoNumbers(firstToDivide, secondToDivide));

        // multiplyTwoNumbers
        double firstToMultiply = 13;
        double secondToMultiply = 4;
        System.out.printf("%.2f * %.2f = %d%n", firstToMultiply, secondToMultiply, calculator.multiplyTwoNumbers(firstToMultiply, secondToMultiply));
    }
}
