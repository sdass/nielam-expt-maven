package org.niel;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Calculator calculator;

    public static void main( String[] args )
    {
        calculator = new Calculator();
        System.out.println( "Hello World!" );
        adding(7, 9);
    }

    public static void adding(int x, int y){
        int result = calculator.add(x, y);
        System.out.println("result=" + result);
    }



}
