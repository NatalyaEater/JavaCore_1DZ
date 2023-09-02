package org.example.core;


import org.example.core.Model;

import java.util.Scanner;
/**
 *
 *Класс взаимодействия с пользователем
 */
public class View {

    public void menu(){
        int num = 1;

        while (num != 5) {
            System.out.print("Простой калькулятор.Выберите действие с числами : ");
            System.out.println();
            System.out.println("1 - Сложение");
            System.out.println("2 - Вычитание");
            System.out.println("3 - Деление ");
            System.out.println("4 - Умножение ");

            Scanner in = new Scanner(System.in);
            num = in.nextInt();

            Model cals = new Model();


            switch (num) {
                case 1:
                    System.out.println("Результат сложения = "+cals.sum(cals.onenum(),cals.twonum()));
                    break;
                case 2:
                    System.out.println("Результат вычитания = "+cals.subtraction(cals.onenum(),cals.twonum()));
                    break;
                case 3:
                    System.out.println("Результат деления = "+cals.division(cals.onenum(),cals.twonum()));
                    break;
                case 4:
                    System.out.println("Результат умножения: "+cals.multiplication(cals.onenum(),cals.twonum()));
                    break;
                default:
                    System.out.println("Неверный вариант ввода");

            }
        }
    }
}
