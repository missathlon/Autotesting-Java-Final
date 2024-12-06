package ru.gb.task2;

public class NotFoundAnswerException extends Exception{

    public NotFoundAnswerException(String text) {
        super(text);
    }
}
