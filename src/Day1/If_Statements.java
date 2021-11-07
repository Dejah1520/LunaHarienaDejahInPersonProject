package Day1;

import java.util.Scanner;

public class If_Statements {


   /*
   IF- STATEMENTS
   1.Write a Java program to get a number from the user and print whether it is positive or negative.

    Test Data
    Input number: 35
    Expected Output :
    Number is positive


    2. Write a Java program to solve quadratic equations (use if, else if and else).
    Test Data
    Input a: 1
    Input b: 5
    Input c: 1
    Expected Output :
    The roots are -0.20871215252208009 and -4.7912878474779195


    3. Take three numbers from the user and print the greatest number.

    Test Data
    Input the 1st number: 25
    Input the 2nd number: 78
    Input the 3rd number: 87
    Expected Output :
    The greatest: 87


    4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000. Go to the editor

       Test Data
       Input a number: 25
       Expected Output :
       Input value: 25
       Positive number


       5. Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.

        Test Data
        Input number: 3
        Expected Output :
        Wednesday

        TERNARY:


    */
   public static void main(String[] args) {

       /*
       1.Write a Java program to get a number from the user and print whether it is positive or negative.

        Test Data
        Input number: 35
        Expected Output :
        Number is positive
        */

       Scanner scan = new Scanner(System.in);
       System.out.println("Please enter a number: ");
       int num = scan.nextInt();
       if (num % 2 ==0 ){
           System.out.println("Positive");
       } else{
           System.out.println("Negative");
       }

       /*
        2. Write a Java program to solve quadratic equations (use if, else if and else).
         Test Data
         Input a: 1
         Input b: 5
         Input c: 1
         Expected Output :
         The roots are -0.20871215252208009 and -4.7912878474779195
        */

























   }


















}
