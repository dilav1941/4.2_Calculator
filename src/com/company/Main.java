package com.company;

public class Main {

    public static void main( String[] args ) {
        Ints calc = new IntsCalculator ();
        System.out.println ("Сумма = " + calc.sum (2, 2));
        System.out.println ("Разница = " + calc.sub (5, 7));
        System.out.println ("Умножение = " + calc.mult (10, 22));
        System.out.println ("Возведение в степень = " + calc.pow (2, 10));
    }
}
