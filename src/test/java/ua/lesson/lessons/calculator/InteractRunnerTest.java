package ua.lesson.lessons.calculator;

import org.junit.Test;
import ua.lesson.lessons.io.Input;
import ua.lesson.lessons.io.Output;
import static org.junit.Assert.*;

import java.util.Arrays;

/**
 * Created by Marichka on 29.02.2016.
 */
public class InteractRunnerTest {

    @Test
    public void testAction() throws Exception {
        //assign
        final Output out = new OutputStub();
        final Input in = new InputStub(Arrays.asList("1","1","+","no","yes").iterator(), out);
        final Calculator calc = new Calculator();
        final InteractRunner interact = new InteractRunner(out,in,calc);
        //action
        interact.action();
        in.close();
        //assert
        assertEquals(calc.getResult(),2);
    }


}