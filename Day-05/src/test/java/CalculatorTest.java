package com.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {


    @Test
    void additionReturns6(){
        Calculator calculator=new Calculator();
       int addAns= calculator.add(4,2);
       assertEquals(6,addAns);
    }
    @Test
    void subtractionReturns2(){
        Calculator calculator=new Calculator();
        int subAns=calculator.subtract(4,2);
        assertEquals(2,subAns);
    }

    @Test
    void multilplyReturns8(){
        Calculator calculator=new Calculator();
        int mulAns=calculator.multiply(4,2);
        assertEquals(8,mulAns);
    }
    @Test
    void divideReturns2(){
        Calculator calculator=new Calculator();
        int divAns=calculator.divide(4,2);
        assertEquals(2,divAns);
    }
    @Test
    public void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> Calculator.divide(4, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}