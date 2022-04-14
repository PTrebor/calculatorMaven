package com.endava.calculator.basic;

public interface BasicOperations {
    public abstract long add (int... no);
    public abstract long add(long... no);
    public abstract double add(double... no);

    abstract int subtract (int...no);
    abstract long subtract (long... no);
    abstract double subtract (double... no);

    public abstract long multiply(int a, int b, int c);    //de facut multiple variables cu "..."
    public abstract long multiply(long a, long b);  //de facut multiple variables cu "..."
    public abstract double multiply(double a, double b);    //de facut multiple variables cu "..."

    public abstract double divide(int...no);    //de facut multiple variables cu "..."
    public abstract double divide(long...no);  //de facut multiple variables cu "..."
    public abstract double divide(double...no);  //de facut multiple variables cu "..."

}
