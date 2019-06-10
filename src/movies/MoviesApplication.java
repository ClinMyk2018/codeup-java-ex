package movies;

import util.Input;

public class MoviesApplication {
    static Input input = new Input();
    static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
        boolean keepGoing;

        System.err.println("Welcome to the Movie zone!");
        do {
            System.out.println("0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category");

            int userAnswer = input.getInt(0, 5);

            switch (userAnswer) {
                case 0:
                    System.out.println("Bye!");
                    break;
                case 1:
                    for (Movie movie : movies) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                    break;
                case 2:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("animated")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case 3:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case 4:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case 5:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("scifi")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                default:
                    System.err.println("That's not right at all...");
            }
            System.out.println("Would you like to continue using the movie zone?");
            keepGoing = input.yesNo();
        } while (keepGoing);
    }
}
