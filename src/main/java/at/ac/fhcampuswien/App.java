package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!"); // input your solution here
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println();
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\ ");
        System.out.println("       /\\__/\\ \\__0 (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `___''___`");// input your solution here
    }

    //todo Task 3
    public void sumOfLiterals(){
     int a = 0xface;
     int b = 'Z';
     int c = 012;
     long d = 80L;
     float e = 44e-1f;
     float f = 5.5f;
     double g = 8.88e1;
     double h = 99.9;
     int sum = (int) (a + b + c + d + e + f + g + h);
        System.out.println(sum);

     // input your solution here
    }

    //todo Task 4
    public void addTwoNumbers(){
    Scanner scan = new Scanner(System.in);
    int value1 = scan.nextInt();
    int value2 = scan.nextInt();
        System.out.println(value1 + value2);// input your solution here
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
    }

    //todo Task 6
    public void compareTwoNumbers(){
     Scanner scan = new Scanner(System.in);
        System.out.print("n1: ");
     int n1 = scan.nextInt();
        System.out.print("n2: ");
     int n2 = scan.nextInt();
     if (n1 < n2)
     System.out.println("n2 > n1");
     else if (n1 > n2)
         System.out.println("n1 > n2");
     else System.out.println("n1 == n2");// input your solution here
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}