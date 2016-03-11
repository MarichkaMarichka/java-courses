package ua.lesson.lessons.clinic;

import ua.lesson.lessons.io.Input;
import ua.lesson.lessons.io.Output;

import java.util.Scanner;

/**
 * Created by Marichka on 09.03.2016.
 */
    final public class InputCons implements Input {
        Output output;
        Scanner scanner;
        InputCons(Scanner scanner, Output output){
            this.output = output;
            this.scanner = scanner;
        }
        public String next() {
            return this.scanner.next();
        }

        public String ask(String question) {
            this.output.println(question);
            return this.scanner.next();
        }

        public void close() {

        }
    }
