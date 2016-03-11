package ua.lesson.lessons.calculator;

/**
 * Created by Marichka on 09.03.2016.
 */
public class UserException extends Exception{
    UserException(final String output) {
        super(output);
    }
}
