package org.example.core;

import java.util.Scanner;
/**
*
*Основной класс методов простых математических действий
 */
public class Model {

    /**
     * Функция сложения двух чисел
     *
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма a и b
     */
    public static int sum(int a, int b)
    {
        return a+b;

    }
    /**
     * Функция вычитания двух чисел
     *
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность a и b
     */
    public static int subtraction(int a, int b){
        return a-b;

    }
    /**
     * Функция деления двух чисел
     *
     * @param a делимое
     * @param b делитель
     * @return частное a и b
     */
    public static int division(int a, int b){
        return a/b;

    }
    /**
     * Функция умнеожения двух чисел
     *
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение a и b
     */
    public static int multiplication(int a, int b){
        return a*b;

    }
    /**
     * Функция сбора первого числа от пользователя
     *
     */

    public static int onenum() {
        System.out.println("Введите второе число");
        Scanner in2 = new Scanner(System.in);
        int num1 = in2.nextInt();
        return num1;
    }
    /**
     * Функция сбора второго числа от пользователя
     *
     */
    public static int twonum() {
        System.out.println("Введите второе число");
        Scanner in3 = new Scanner(System.in);
        int num2 = in3.nextInt();
        return num2;
    }
}
