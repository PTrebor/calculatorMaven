package com.endava.calculator;

import com.endava.calculator.basic.Basic;
import com.endava.calculator.basic.BasicOperations;
import com.endava.calculator.expert.Expert;
import com.endava.calculator.expert.ExpertOperations;

public class TestCalculator {
    public static void main(String[] args) {
        BasicOperations b = new Basic();
        ExpertOperations e = new Expert();
        System.out.println("Expert Calculator");
        System.out.println(e.calculate("84.19 + 44.10 + 14"));
        System.out.println(e.calculate("15 + 43 * 6/2"));
        System.out.println(e.calculate("-3 - 5 * 3"));
        System.out.println("Basic Calculator");
        System.out.println("Add: " + b.add(2, 3, 4, 9));
        System.out.println("Subtract: " + b.subtract(2, -3));
}
}
