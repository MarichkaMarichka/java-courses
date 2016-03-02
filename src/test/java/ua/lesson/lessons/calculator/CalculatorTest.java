package ua.lesson.lessons.calculator;

import org.junit.Test;
import ua.lesson.lessons.calculator.Calculator;

import static org.junit.Assert.*;

/**
 * Created by Marichka on 29.02.2016.
 */
public class CalculatorTest {

    @Test
    public void testAdd() throws Exception {
        Calculator calc = new Calculator();
        calc.add(1,1);
        assertEquals(calc.getResult(),2);
    }

    @Test
    public void testSub() throws Exception {
        Calculator calc = new Calculator();
        calc.sub(1,1);
        assertEquals(calc.getResult(),0);
    }

    @Test
    public void testMult() throws Exception {
        Calculator calc = new Calculator();
        calc.mult(1,2);
        assertEquals(calc.getResult(),2);
    }

    @Test
    public void testDiv() throws Exception {
        Calculator calc = new Calculator();
        calc.div(10,5);
        assertEquals(calc.getResult(),2);
    }


    @Test
    public void testCleanResult() throws Exception {
        Calculator calc = new Calculator();
        calc.cleanResult();
        assertEquals(calc.getResult(),0);
    }
    @Test
    public void testCalculate() throws Exception {

    }
    @Test
    public void testUndoOrNot() throws Exception {

    }
}