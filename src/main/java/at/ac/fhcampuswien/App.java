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
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");// input your solution here
    }

    //todo Task 3
    public void sumOfLiterals(){

      // define variables
     int a = 0xface;
     int b = 'Z';
     int c = 012;
     long d = 80L;
     float e = (int) 44e-1f;
     float f = (int) 5.5f;
     double g = (int) 8.88e1;
     double h = (int) 99.9;
     int sum = (int) (a + b + c + d + e + f + g + h);

     // report result
        System.out.println(sum);

     // input your solution here
    }

    //todo Task 4
    public void addTwoNumbers(){

    Scanner scan = new Scanner(System.in);

    // assign scanner to variables
    int value1 = scan.nextInt();
    int value2 = scan.nextInt();

    // report result
        System.out.println(value1 + value2);// input your solution here
    }

    //todo Task 5
    public void swapTwoNumbers(){

      Scanner scan = new Scanner(System.in);

      // get values
        System.out.println("Before Swap:");
        System.out.print("x: ");
        int value1 = scan.nextInt();
        System.out.print("y: ");
        int value2 = scan.nextInt();

        // swap values
        System.out.println("After Swap:");
        if (value1 != value2) {
            System.out.println("x: " + value2);
            System.out.println("y: " + value1);
        } else {
            System.out.println("x: " + value1);
        System.out.println("y: " + value2);
        }

            // input your solution here
    }

    //todo Task 6
    public void compareTwoNumbers(){

     Scanner scan = new Scanner(System.in);

     // get values
        System.out.print("n1: ");
     int n1 = scan.nextInt();
        System.out.print("n2: ");
     int n2 = scan.nextInt();

     // compare with if else branch
     if (n1 < n2)
     System.out.println("n2 > n1");
     else if (n1 > n2)
         System.out.println("n1 > n2");
     else System.out.println("n1 == n2");// input your solution here
    }

    //todo Task 7
    public void ratingSalesPerson(){

Scanner scan = new Scanner(System.in);

// ask for and get value
        System.out.print("Enter annual Revenue: ");
        int rev = scan.nextInt();

        // if else branch
        if (rev < 0 | rev >= 100_000)
            System.out.println("Invalid Revenue");
        else if (0 <= rev & rev < 20_000)
                System.out.println("Poor Sales Revenue");
        else if(20_000 <= rev & rev < 50_000)
            System.out.println("Average Sales Revenue");
            else if (50_000 <= rev & rev < 80_000)
                    System.out.println("Good Sales Revenue");
                else if (80_000 <= rev & rev < 100_000)
                        System.out.println("Excellent Sales Revenue");

                // input your solution here
    }

    //todo Task 8
    public void getCommissionRate(){

       Scanner scan = new Scanner(System.in);

       // ask for and get value
        System.out.print("Enter CommissionClass: ");
        int value = scan.nextInt();

        // define r
        double r = value * 0.01;


        switch (value) {
            case 1: case 2: case 3: case 4:
                System.out.println("Your Commission Rate was set to " + r);
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");


        }

       // input your solution here
    }

    //todo Task 9
    public void leapyear(){

     Scanner scan = new Scanner(System.in);

     // ask for value
        System.out.print("Year: ");
        int year = scan.nextInt();

        // check formulas with if else
        if (year % 400 == 0)
            System.out.println("Leapyear");
        else {
            if (year % 100 == 0)
                System.out.println("Not a Leapyear");
            else {
              if (year % 4 == 0)
                  System.out.println("Leapyear");
              else {
                  System.out.println("Not a Leapyear");
              }
            }
        }
    }

        // input your solution here


    //todo Task 10
    public void transposedNumbers(){

        Scanner scan = new Scanner(System.in);

        // get value
        System.out.print("Number: ");
        int value = scan.nextInt();

        if (value > 999) {
            System.out.println("Too long!");
        }
        else if (value < 100) {
            String digit = String.valueOf(value % 10);
            String digit2 = String.valueOf(value / 10 % 10);

            System.out.println(digit + digit2);
        }
        else {
            String digit = String.valueOf(value % 10);
            String digit2 = String.valueOf(value / 10 % 10);
            String digit3 = String.valueOf(value / 100 % 10);

            System.out.println(digit + digit2 + digit3);
        }// input your solution here
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