package org.kosmocourses.olga;

import java.awt.dnd.peer.DragSourceContextPeer;

/**
 * Напишите программу содержащую метод printString() выводящую на экран строку “Vive la Java!”, далее:
 * ● на следующей строке выведете длинну распечатнной строки;
 * ● на следующей строке выведете первый и предпоследний символ первой
 * строки, позиция предпоследнего символа не должна быть жестко
 * записана в тексте программы, а должна быть рассчитана исходя из
 * длины строки;
 * ● на следующей строке выведете символы с 8 по 12 содержащиеся в
 * первой строке;
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        printString();
    }

    private static void printString(){

        String str = "Vive la Java!";
        System.out.println(str);
        System.out.println(str.length());
        int predChar = str.length() - 2;
        System.out.println(str.charAt(0) + " " + str.charAt(predChar));
        System.out.println(str.substring(8, 12));
    }
}
