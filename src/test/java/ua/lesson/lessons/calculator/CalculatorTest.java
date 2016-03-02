package ua.lesson.lessons.calculator;

import org.junit.Test;
import ua.lesson.lessons.calculator.Calculator;

import static org.junit.Assert.*;

/**
 * Created by Marichka on 29.02.2016.
 */
public class CalculatorTest {


    @Test
    public void testCleanResult() throws Exception {
        Calculator calc = new Calculator();
        calc.cleanResult();
        assertEquals(calc.getResult(),0);
    }
    @Test
    public void testCalculate() throws Exception {

    }

}