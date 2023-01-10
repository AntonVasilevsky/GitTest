package com.task2;

public class LightTrial extends Trial {

    private static final int MARK_TO_PASS_ONE = 30;
    private static final int MARK_TO_PASS_TWO = 30;
    public LightTrial() {
    }

    public LightTrial(String name, int markOne, int markTwo) {
        super(name, markOne, markTwo);
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean isPassed() {
        return (getMarkOne() >= MARK_TO_PASS_ONE
        && getMarkTwo() >= MARK_TO_PASS_TWO);
    }
}
