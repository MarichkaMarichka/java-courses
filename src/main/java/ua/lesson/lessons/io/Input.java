package ua.lesson.lessons.io;

/**
 * Created by Marichka on 29.02.2016.
 */
public interface Input {
    String next();

    String ask(String question);

    void close();

}
