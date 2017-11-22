package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputNumbers = new Scanner(System.in);
        System.out.println("Введите два натуральных числа: ");
        int numberOne = inputNumbers.nextInt();
        int numberTwo = inputNumbers.nextInt();
        if (numberOne <= numberTwo) {
            System.out.println("Первое число должно быть больше второго. Введите два натуральных числа: ");
            numberOne = inputNumbers.nextInt();
            numberTwo = inputNumbers.nextInt();
        }
        int resultExpression = expression(numberOne, numberTwo);
        for (int i = 1; i <= resultExpression; i++) {
            for (int j = 1; j <= resultExpression; j++) {
                if (i * j == resultExpression) {
                    if (isPrimeNumbers(i, j) == true) {
                        System.out.println(i + " " + j);
                    }
                }
            }
        }
    }


    public static int expression(int number1, int number2) {          //вычисление заданной формулы x*x-y*y
        double result = Math.pow(number1, 2) - Math.pow(number2, 2);
        return (int) result;
    }

    public static boolean isPrimeNumbers(int number, int number2) {   //проверка простые ли пара чисел
        int counter1=0;
        int counter2=0;
        for(int i=1;i<=number;i++) {
            if (number % i == 0) {
                counter1++;
            }
        }
        for(int i=1;i<=number2;i++) {
            if (number2 % i == 0) {
                counter2++;
            }
        }
        if(counter1==2&&counter2==2)
            return true;
        else
            return false;
    }
}
