package movies;

import util.Input;
import java.util.Scanner;

public class MoviesApplication {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;



        System.out.println(
        "\n\nWhat would you like to do? \n\n" +

        "0 - exit\n" +
        "1 - view all movies\n" +
        "2 - view movies in the animated category\n" +
        "3 - view movies in the drama category\n" +
        "4 - view movies in the horror category\n" +
        "5 - view movies in the scifi category \n\n" +

        "Enter your choice: "
        );
        input = sc.nextInt();

        switch (input){
            case 0:
        }
    }

}
