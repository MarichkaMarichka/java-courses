package ua.lesson.lessons.calculator;

import ua.lesson.lessons.clinic.OutputStub;
import ua.lesson.lessons.io.Input;
import ua.lesson.lessons.io.Output;
import java.util.Scanner;

/**
 * Created by Marichka on 09.03.2016.
 */
public class Main {
    public static void main(String [] arg){
        final Output out = new OutputStub();
        Scanner scanner = new Scanner(System.in);
        final Input in = new InputCons(scanner,out);
        final Calculator calc = new Calculator();
        final InteractRunner interact = new InteractRunner(out,in,calc);
        while(true) {
            try {
                interact.action();
                break;
            }catch (IllegalArgumentException e) {
                out.println("entered incorrect arg!");
            }catch (NullPointerException e) {
                out.println("entered incorrect action!");
            }catch (ArithmeticException e){
                out.println("division by 0!");
            }
        }
    }
}
