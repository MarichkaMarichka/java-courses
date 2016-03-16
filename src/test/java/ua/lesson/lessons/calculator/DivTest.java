package ua.lesson.lessons.calculator;

import com.sun.org.apache.xpath.internal.operations.Div;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Marichka on 11.03.2016.
 */
public class DivTest {

    @Test
    public void testArithmetical()  {
         Calculator.Div division = new Calculator.Div();
        try {
            division.arithmetical(9,0);
        }catch (ArithmeticException e){
            System.out.println("division by 0!");
        }
    }
}