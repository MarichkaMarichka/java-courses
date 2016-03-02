package ua.lesson.lessons.calculator;

import ua.lesson.lessons.io.Input;
import ua.lesson.lessons.io.Output;

import java.util.Iterator;

/**
 * Created by Marichka on 01.03.2016.
 */
final public class InputStub implements Input {
    private final Iterator<String> answers;
    private final Output output;
    InputStub(Iterator<String> answers, Output output){
        this.output = output;
        this.answers = answers;
    }
    public String next() {
        return this.answers.next();
    }

    public String ask(String question) {
        this.output.println(question);
        return this.answers.next();
    }

    public void close() {

    }
}
