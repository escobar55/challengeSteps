import java.util.Random;
import java.util.Scanner;

public class PrimeSteps {
    public static void main(String [] args){

        //create the scanner object
        Scanner key = new Scanner(System.in);

        //Part 3---------------------------------------------------------->
        //Give the user a choice
        System.out.print("Would you like to generate a random number or input a number? (R/I)");
        String answer = key.nextLine();

        boolean run = true;
        while(run) {
            if (answer.equalsIgnoreCase("R")) {
                System.out.println("Generating a random number...");
            } else if (answer.equalsIgnoreCase("I")) {
                System.out.println("Please enter a number: ");
            }
            break;
        }

        boolean isPrime = true; //boolean variable to check if the num is prime


        //Part 1 ----With user input------------------------------------------------>
        while (answer.equalsIgnoreCase("I")) {
            int num = key.nextInt();
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not a prime number");
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num + " is a prime number");
            }
            break;
        }
        //part 2 ------------------------------------------------------------>
        Random r = new Random();
        int x = 1 + r.nextInt(250);

        while (answer.equalsIgnoreCase("R")) {
            for (int i = 2; i <= x / 2; i++) {
                if (x % i == 0) {
                    System.out.println(); //Adding a space between the two results
                    System.out.println("From our random generator....");
                    System.out.println(x + " is not a prime number");
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("From our random generator....");
                System.out.println(x + " is a prime number");
            }
            break;
        }

        //Step 4 --------Ask the user if he/she would like to try again?
        key.nextLine();
        System.out.print("Would you like to try again? (Y/N)");
        String answer2 = key.nextLine();
        if (answer2.equalsIgnoreCase("N")){
            run = false;
        }




        //end of the main method ---------->
    }

}


