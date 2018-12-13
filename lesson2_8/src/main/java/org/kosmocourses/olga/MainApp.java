package org.kosmocourses.olga;

/**
 * Напишите программу содержащую два класса MainApp и Printer. Переместите в
 * класс Printer метод printString() для печати строки “Vive la Java!”. Класс MainApp
 * должен содержать точку входа в приложение в которой создавать объект Printer
 * и после создания вызывать его метод печати строки “Vive la Java!”.
 *
 */
public class MainApp
{
    public static void main( String[] args )
    {
        Printer printer = new Printer();
        printer.printString();
    }
}

class Printer
{
    public void printString()
    {
        System.out.println("Vive la Java!");
    }
}