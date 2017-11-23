package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputNumbers = new Scanner(System.in);
        System.out.println("Введите два натуральных числа: ");
        int numberOne = inputNumbers.nextInt();
        int numberTwo = inputNumbers.nextInt();
        if (numberOne < numberTwo) {                  //при условии, что первое число будет меньше второго, заменяем их местами
            int numberThree = numberOne;
            numberOne = numberTwo;
            numberTwo = numberThree;
        }
        int resultExpression = calculateResultExpression(numberOne, numberTwo);
        for (int i = 1; i <= resultExpression; i++) {
            for (int j = 1; j <= resultExpression; j++) {
                if (i * j == resultExpression) {
                    if (isPrimeNumbers(i)&&isPrimeNumbers(j)) {
                        System.out.println(i + " " + j);
                    }
                }
            }
        }
    }


    public static int calculateResultExpression(int number1, int number2) {          //вычисление заданной формулы x*x-y*y
        double result = Math.pow(number1, 2) - Math.pow(number2, 2);
        return (int) result;
    }

    public static boolean isPrimeNumbers(int number) {   //проверка простые ли пара чисел
        int counter=0;
        for(int i=1;i<=number;i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        if(counter==2)
            return true;
        else
            return false;
    }
}
