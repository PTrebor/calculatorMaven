package com.endava.calculator;

import com.endava.calculator.basic.Basic;
import com.endava.calculator.expert.Expert;
import com.endava.extensions.TestReporterExtension;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;

@ExtendWith( TestReporterExtension.class )
public class CalculatorTest {

    private Basic basicCalculator;
    private Expert expertCalculator;

    @BeforeAll
    public static void setUpAllTests(){
        System.out.println("Before all");
    }

    @AfterAll
    public static void tearDownAllTests(){
        System.out.println("After all");
    }

    @BeforeEach
    public void setUpEachTest(){
        basicCalculator = new Basic();
        expertCalculator = new Expert();
        System.out.println("Before Each");
    }

    @AfterEach
    public void tearDownEachTest(){
        System.out.println("After Each");
    }


    @Tags( {@Tag("Smoke"), @Tag("UI")} )
    @ParameterizedTest
    @MethodSource("numberProvider")
    public void shouldAddNumbersGivenOperand0(int a, int b){

        //GIVEN
        //WHEN
       long result = basicCalculator.add(a, b );
        //THEN
        System.out.println(result);
    }

    public static List<Arguments> numberProvider(){
        List<Arguments> argumentsList = new ArrayList<>();
        argumentsList.add(Arguments.of(0, 2));
        argumentsList.add(Arguments.of(2, 0));
        return argumentsList;
    }

    @Tag("Smoke")
    @Test
    public void shouldAddNegativeNumbers(){

        //GIVEN
        //WHEN
        long result = basicCalculator.add(-2, -4);
        //THEN
        System.out.println(result);
    }

    @Test
    public void shouldAddLongNumbers() {

        //GIVEN
        //WHEN
        long result = basicCalculator.add(Integer.MAX_VALUE, 1);
        //THEN
        System.out.println(result);
    }

    @ParameterizedTest
    @CsvSource({"1,2,3", "2,4,5"})
    @CsvFileSource (resources = "numberSource.csv")
    public void shouldAddMoreThan2Operands(Integer a1, Integer a2, Integer a3){

        //WHEN
        long result = basicCalculator.add(a1, a2, a3);
        //THEN
        System.out.println(result);
    }

    @Test
    public void shouldAddNoOperands(){
        //GIVEN
        //WHEN
        long result = basicCalculator.add();
        //THEN
        System.out.println(result);
    }

    @Tag("API")
    @Test
    public void shouldAdd1Operands(){
        //GIVEN
        //WHEN
        long result = basicCalculator.add(167);
        //THEN
        System.out.println(result);
    }


    @Test
    public void shouldSubtract1Operand(){
        //GIVEN
        //WHEN
        long result = expertCalculator.subtract(167);
        //THEN
        System.out.println(result);
    }
    @Test
    public void shouldSubtract2Operands(){
        //GIVEN
        //WHEN
        long result = expertCalculator.subtract(35, 9);
        //THEN
        System.out.println(result);
    }
    @Test
    public void shouldSubtractMoreThan2Operands(){
        //GIVEN
        //WHEN
        long result = expertCalculator.subtract(35, 9, 6);
        //THEN
        System.out.println(result);
    }
    @Test
    public void shouldSubtractZeroAndNumbersOperands(){
        //GIVEN
        //WHEN
        long result = expertCalculator.subtract(0, 20);
        //THEN
        System.out.println(result);
    }
    @Test
    public void shouldSubtractLongNumbers() {

        //GIVEN
        //WHEN
        long result = expertCalculator.subtract(Integer.MAX_VALUE, 1);
        //THEN
        System.out.println(result);
    }

    @Test
    public void shouldDivideLongNumbers() {

        //GIVEN
        //WHEN
        double result = expertCalculator.divide(Integer.MAX_VALUE, 1);
        //THEN
        System.out.println(result);
    }
    @Test
    public void shouldDivideByZeroOperator() {

        //GIVEN
        //WHEN
        double result = expertCalculator.divide(42, 0);
        //THEN
        System.out.println(result);
    }

    

}
