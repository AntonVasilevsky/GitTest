package com.task2;

public class Trial implements CheckExam{
    private String name;
    private int markOne;
    private int markTwo;

    private static final int MARK_TO_PASS = 33;

    public Trial() {
    }

    public Trial(String name, int markOne, int markTwo) {
        this.name = name;
        this.markOne = markOne;
        this.markTwo = markTwo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarkOne() {
        return markOne;
    }

    public void setMarkOne(int markOne) {
        this.markOne = markOne;
    }

    public int getMarkTwo() {
        return markTwo;
    }

    public void setMarkTwo(int markTwo) {
        this.markTwo = markTwo;
    }

    @Override
    public String toString() {
        return "Trial{" +
                "name='" + name + '\'' +
                ", markOne=" + markOne +
                ", markTwo=" + markTwo +
                '}';
    }


    @Override
    public boolean isPassed() {
        return getMarkOne()+getMarkTwo()>50;
    }
}
