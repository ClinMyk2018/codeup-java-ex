import java.util.Scanner;
import java.util.Random;

public class ConsoleExercises {
    public static void main(String[] args) {

        //first

//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately "+"%.2f%n", pi);

        // second

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int userInput = sc.nextInt();
//
//        System.out.println("You entered: \"" + userInput + "\" ");

        //third
//        Scanner in = new Scanner(System.in);
//
//        String firstWord;
//        String secondWord;
//        String thirdWord;
//
//        // Prompts
//
//        System.out.println("Please enter a funny word: ");
//
//        System.out.println("Please enter your favorite place: ");
//
//        System.out.println("Please enter your pets name, or last pets name: ");
//
//        // Read in values
//
//        firstWord = in.nextLine();
//        secondWord= in.nextLine();
//        thirdWord= in.nextLine();
//
//        System.out.println("Now enjoy a funny story... ");
//
//        System.out.printf("When strolling through the hood this " + firstWord +
//                " type of guy came out and was trying to bum a ride to " + secondWord +
//                ", %n but you weren't feeling it and decided to tell him... %n Yo, " + thirdWord +
//                " ,get out of here maaaaaaan!");


//        Scanner input = new Scanner(System.in);
//
//
//        System.out.print("What is the length of the classroom in feet: ");
//        int length = input.nextInt();
//
//        System.out.print("What is the width of the classroom in feet: ");
//        int width = input.nextInt();
//
//        int perimeter = length * 2 + width * 2;
//        int area = length * width;
//
//        System.out.print("Assuming you are in a perfectly rectangular room...");
//        System.out.print("The perimeter of your classroom is: " + perimeter + " feet." +
//                " With an total area of: " + area + " feet.");

        /*

        NEW GAME

         */

        Scanner sc = new Scanner(System.in);

        String name;
        String begin;

        //Random number\\

        Random r = new Random();
        int low = 85;
        int high = 100;
        int ranResult = r.nextInt(high-low) + low;


        //Introduce Game\\

        System.out.println("Welcome to the great game of HERO'S!");

        //Get Hero Name\\

        System.out.print("Enter your HERO'S name: ");
        name = sc.nextLine();
        System.out.println("Welcome to the greatest adventure ever: " + name);

        //Ready to start?\\

        System.out.print("Are you ready to begin? yes or no ");
        begin = sc.nextLine();

        if (begin == "Yes" || begin == "yes") {
            System.out.println("Let's Go...!");
        }else{
            System.out.println("Too bad... you are playing!");
        }

        //Start Game\\

        System.out.println("Let the adventure begin!");

        //Display stats\\
            //enemy stats\\
        System.out.println("Your Enemy is EggMan");
        System.out.println("Health: " + ranResult);
        enemyHealth = sc.nextInt();
        System.out.println("Attack Points: " + 20);
        enemyAttack = sc.nextLine();

            //hero stats\\
        System.out.println("Your Stats");
        System.out.println("Health: " + 100);
        heroHealth = sc.nextInt();
        System.out.println("Attack Points: " + 20);
        heroAttack = sc.nextLine();

        //Actions to take?\\
            //Attack (decreases enemyHealth)
        System.out.println("Sword Slash!");
        heroAttack = sc.nextInt();
        if (heroAttack == true) {
            heroHealth -= heroAttack;
        }
            //Drink potion (adds to heroHealth)
        System.out.println("Drink a potion");
        heroDrinkPotion = sc.nextInt();
        if (heroDrinkPotion == true) {
            heroHealth += heroDrinkPotion;
        }
            //Run? (ends the game)
        System.out.println("Run away and let this all end!");
        heroRunAway = sc.nextInt();
        if (heroRunAway == true) {
            System.out.println("There is no running...");
        }
        continue;
        //Keep attacking until game is over\\

        //Do I need a loop to start at the attack choice?\\

        //     ?????????????????????      \\

        //Announce end of game\\

        System.out.println("The winner is " + winner);




        //BONUSES!!\\

        //allow the user to specify hero stats and enemy stats.

        //automate an enemyAttack after each time the hero takes a turn

        //end the game if either heroHealth or enemyHealth drops to 0.

        //Indicate how many potions your hero starts with.
        // Decrement this number each time 'Use Potion' action is used.


    }

}
