package ua.lesson.lessons.clinic;

import ua.lesson.lessons.calculator.*;
import ua.lesson.lessons.io.Input;
import ua.lesson.lessons.io.Output;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Marichka on 02.03.2016.
 */
public class Main  {
    public static void main(String [] arg)throws Exception{
        final Output out = new OutputStub();
        Scanner scanner = new Scanner(System.in);
        final Input in = new InputCons(scanner,out);
        Clinic clinic = new Clinic(out, in);
        Active active = new Active(out,clinic,in);
        active.activeRegistr();
    }
}
