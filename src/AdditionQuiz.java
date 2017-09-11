import java.util.Scanner;
/**
 * GNU GENERAL PUBLIC LICENSE
 Version 3, 29 June 2007
 Copyright (C) 2014  Author Akeem Prince Olass.
 Everyone is permitted to copy and distribute verbatim copies
 of this license document, but changing it is not allowed.
 *

 */
public class AdditionQuiz {
/**Adds two random numbers*/
    public static int addrand(int num1, int num2) {
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        // 3. Grade the answer and display the result
        if (num1 + num2 == answer) {
            System.out.println("You are correct!");
        }
        else {
                System.out.println("Your answer is wrong.");
                System.out.println(num1 + " + " + num2 +
                        " should be " + (num1 + num2));}
        return num1 + num2;

    }

    public static void main(String[] args)
    // 1. Generate two random single-digit integers

    {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
// 2. Prompt the student to answer ”What is number1 – number2?”
        System.out.print("What is " + number1 + " + " + number2 + "? ");

        addrand(number1, number2);
    }

        }
