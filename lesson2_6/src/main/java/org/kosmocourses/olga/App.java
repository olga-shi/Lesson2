package org.kosmocourses.olga;

/**
 * Число Pi с точностью до второго знака после запятой.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        double pi = Math.PI;

        String newPi = String.format("%.3g%n", pi);

        System.out.println( newPi );
    }
}
