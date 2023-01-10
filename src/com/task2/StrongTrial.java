package com.task2;

public class StrongTrial extends Trial{
    public StrongTrial() {
    }

    public StrongTrial(String name, int markOne, int markTwo) {
        super(name, markOne, markTwo);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean isPassed() {

        return getMarkOne()/2+getMarkTwo() >= Trial.MARK_TO_PASS;
    }
}
