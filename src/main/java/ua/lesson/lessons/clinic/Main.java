package ua.lesson.lessons.clinic;

import ua.lesson.lessons.io.Input;
import ua.lesson.lessons.io.Output;

import java.util.Arrays;

/**
 * Created by Marichka on 02.03.2016.
 */
public class Main  {
    public static void main(String [] arg)throws Exception{
        final Output out = new OutputStub();
        final Input in = new InputStub(Arrays.asList("1","1","1").iterator(), out);

        Clinic clinic = new Clinic(out, in);
        Active active = new Active(out,clinic);
        active.activeRegistr();
    }
}
