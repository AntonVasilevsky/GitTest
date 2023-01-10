package com.task2;

public class ExtraTrial extends Trial implements CheckExam{
    private int markThree;
    private static final int MARK_TO_PASS_EXTRA = 150;

    public ExtraTrial() {

    }

    public ExtraTrial(String name, int markOne, int markTwo, int markThree) {
        super(name, markOne, markTwo);
        this.markThree = markThree;
    }

    public int getMarkThree() {
        return markThree;
    }

    public static int getMarkToPassExtra() {
        return MARK_TO_PASS_EXTRA;
    }

    @Override
    public String toString() {
        return "ExtraTrial{" + super.toString() +
                "markThree=" + markThree +
                '}';
    }


    public boolean isPassed(Trial trial) {
        return super.isPassed() && getMarkThree() >= getMarkToPassExtra();
    }
}
