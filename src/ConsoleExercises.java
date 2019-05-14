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

        Scanner sc = new Scanner(System.in);

        //Random number\\
        Random r = new Random();
        int low = 85;
        int high = 100;
        int ranResult = r.nextInt(high-low) + low;

        Random a = new Random();
        int lowAttack = 5;
        int highAttack = 12;
        int ranAttack = a.nextInt(highAttack-lowAttack) + lowAttack;

        String name;
        int begin;
        int heroHealth = 100;
        int heroPotion = 10;
        int enemyHealth = ranResult;

        //Introduce Game\\
        System.out.println("Welcome to the great game of HERO'S!");

        //Get Hero Name\\
        System.out.print("Enter your HERO'S name: ");
        name = sc.nextLine();

        System.out.println("=======================================");

        System.out.println("Welcome to the greatest adventure ever: " + name);

        //Ready to start?\\
        System.out.print("Are you ready to begin, YES (choice 1) or NO (choice 2)? Pick a number between 1-2! ");
        begin = sc.nextInt();

        System.out.println("=======================================");

        switch (begin)
        {
            case 1:
                System.out.println("Let's Begin");
                break;
            case 2:
                System.out.println("No You have to play");
                break;
            default:
                System.out.println("There are no real choices in life!");
        }

        //Start Game\\
        System.out.println("Let the adventure begin!");

        System.out.println("=======================================");


        while(enemyHealth>0 && heroHealth > 0){
            ranAttack = a.nextInt(highAttack-lowAttack) + lowAttack;

            //Display stats\\
            //enemy stats\\
            System.out.println("EggMan");
            System.out.println("Health: " + enemyHealth);
            System.out.println("Attack Points: " + ranAttack);

            System.out.println("=======================================");

            //hero stats\\
            System.out.println(name + " Stats");
            System.out.println("Health: " + heroHealth);
            System.out.println("Attack Points: " + ranAttack);

            System.out.println("=======================================");

            //Keep attacking until game is over\\

            //Actions to take?\\
            System.out.println("Choice 1: Sword Slash!");
            System.out.println("Choice 2: Drink a potion");
            System.out.println("Choice 3: Run away and let this all end!");
            System.out.println("Pick a number 1-3!");
            int heroChoiceConfirm = sc.nextInt();

            System.out.println("=======================================");
            System.out.println(name + " used: ");
            ranAttack = a.nextInt(highAttack-lowAttack) + lowAttack;
            switch (heroChoiceConfirm) {
                case 1:
                    //Attack (decreases enemyHealth)
                    System.out.println("Sword Slash!");
                    enemyHealth -= ranAttack;
                    break;
                case 2:
                    //Drink potion (adds to heroHealth)
                    System.out.println("Potion!");
                    heroHealth += heroPotion;
                    break;
                case 3:
                    //Run? (Try's to end the game)
                    System.out.println("There is no running...");
                    break;
                default:
                    System.out.println("You had to go to the bathroom, no choice made!");
            }

            System.out.println("=======================================");

            //automate an enemyAttack after each time the hero takes a turn
            Random e = new Random();
//            int ranEnemyOption = e.nextInt(3);
            int ranEnemyOption = e.nextInt(2);

            ranAttack = a.nextInt(highAttack-lowAttack) + lowAttack;

            System.out.println("EggMan used: ");
            switch (ranEnemyOption){
                case 0:
                    //Enemy Attack (decreases heroHealth)
                    System.out.println("Super Punch!");
                    heroHealth -= ranAttack;
                    break;
                case 1:
                    //Enemy Drink's Potion (adds to enemyHealth)
                    System.out.println("The Queens Potion!");
                    enemyHealth += heroPotion;
                    break;
//                case 2:
//                    //Enemy is distracted
//                    System.out.println("Nothing, EggMan is distracted!");
//                    break;
            }

            System.out.println("=======================================");

            //Announce end of game\\
            if (enemyHealth <= 0){
                System.out.println("The winner is " + name);
            } else if (heroHealth <= 0){
                System.out.println("The winner is EggMan!");
            }
        }












        //BONUSES!!\\

        //allow the user to specify hero stats and enemy stats.

        //Indicate how many potions your hero starts with.
        // Decrement this number each time 'Use Potion' action is used.


    }

}
