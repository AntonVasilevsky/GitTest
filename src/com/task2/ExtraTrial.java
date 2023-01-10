package com.task2;

public class ExtraTrial extends Trial implements CheckExam{
    private int markThree;
    private static final int MARK_TO_PASS_EXTRA = 80;

    public ExtraTrial() {

    }

    public ExtraTrial(String name, int markOne, int markTwo, int markThree) {
        super(name, markOne, markTwo);
        this.markThree = markThree;
    }

    public int getMarkThree() {
        return markThree;
    }

    public void setMarkThree(int markThree) {
        this.markThree = markThree;
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

    @Override
    public boolean isPassed() {
        return super.isPassed() && getMarkThree() >= getMarkToPassExtra();
    }

    @Override
    public void resetMarks() {
        super.resetMarks();
        setMarkThree(0);
    }
}
