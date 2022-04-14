package com.endava.calculator;

import com.endava.calculator.basic.Basic;
import com.endava.calculator.basic.BasicOperations;
import com.endava.calculator.expert.Expert;
import com.endava.calculator.expert.ExpertOperations;

public class TestCalculator {

    public static void main(String[] args) {

        BasicOperations b = new Basic(1);
        System.out.println("Basic Calculator");
        System.out.println("Add: " + b.add(2, 3, 4, 9));
        System.out.println("Subtract: " + b.subtract(2, -3));
        System.out.println("Multiply: " + b.multiply(2, 6));
        System.out.println("Divide: " + b.divide(10, 3));
        System.out.println("Divide by 0: " + b.divide(5, 0));
        System.out.println("Multiply: " + b.multiply(3.5, 2.3));

        System.out.println("--------------------------");
        ExpertOperations e = new Expert();
        System.out.println("Power/La puterea: " + e.pow(2, -5));
        System.out.println("Sqroot: " + e.root(4));
        System.out.println("Sqroot: " + e.root(7));
        System.out.println("Factorial: " + e.fact(3));
        System.out.println("Factorial recursive: " + e.factRec(5));
        System.out.println("--------------------------");

        System.out.println("Expert Calculator");
        System.out.println(e.calculate("84.19 + 44.10 + 14"));
        System.out.println(e.calculate("15 + 43 * 6/2"));
        System.out.println(e.calculate("-3 - 5 * 3"));
        System.out.println(e.calculate("2 * (-3 + 2)"));
        System.out.println(e.calculate("(-3-5) / 2"));
        System.out.println(e.calculate("2 + (-3-5) * (-7-5)"));
        System.out.println(e.calculate("(3+2) / 5 * 5 - (8/2)"));

    }

}
