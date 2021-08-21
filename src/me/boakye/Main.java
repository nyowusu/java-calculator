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

    }
}
