import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {

    public static void main(String args[]) {
//        Factorial factoring = new Factorial();

        int num;
        Scanner numberAsk = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        num = numberAsk.nextInt();
        System.out.println("Factorial of " + num + " is " + Factorial.factorial(num));
    }
}
    class Factorial {

        static int factorial(int n)
        {
            return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);

        }

//    public static void main(String[] args) {
//        int x = 5;
//        int y = 8;
//        System.out.println("total = " + addTotal(x, y));
//        System.out.println("total = " + subTotal(x, y));
//        System.out.println("total = " + divTotal(x, y));
//        System.out.println("total = " + multTotal(x, y));
//        System.out.println("total = " + modTotal(x, y));
//
//    }
//        public static int addTotal(int args1, int args2) {
//        int total;
//        total = args1 + args2;
//        return total;
//        }
//        public static int subTotal(int args1, int args2) {
//        int total;
//        total = args1 - args2;
//        return total;
//        }
//        public static int divTotal(int args1, int args2) {
//        int total;
//        total = args1 / args2;
//        return total;
//        }
//        public static int multTotal(int args1, int args2) {
//        int total;
//        total = args1 * args2;
//        return total;
//        }
//        public static int modTotal(int args1, int args2) {
//        int total;
//        total = args1 % args2;
//        return total;
//        }
//    public static void main(String[] args) {
//
//        PairOfDice dice;
//        dice = new PairOfDice();
//
//        if (true) {
//            dice.roll();
//            System.out.println("The dice come up " + dice.getDie1()
//                    + " and " + dice.getDie2());
//        }
//        int answer;
//        Scanner user = new Scanner(System.in);
//        System.out.println("Want to play again? 1 for yes or 2 for no");
//        answer = user.nextInt();
//        if (answer == 1){
//            dice.roll();
//        }else{
//            System.out.println("Thanks!");
//        }
//    }
//        public static class PairOfDice {
//            private int die1;
//            private int die2;
//        public PairOfDice() {
//            roll();
//        }
//        public void roll() {
//            die1 = (int)(Math.random()*6) + 1;
//            die2 = (int)(Math.random()*6) + 1;
//        }
//
//        public int getDie1() {
//            return die1;
//        }
//        public int getDie2() {
//            return die2;
//        }
//
//    }


//        public static int getInteger ( int minnum, int maxnum){
//            do {
//
////                int maxnum =11;
////                int minnum =0;
//                double userInput;
//                Scanner numask = new Scanner(System.in);
//                System.out.print("Enter a number between 1 and 10: ");
//                userInput = numask.nextDouble();
//
//                if (userInput > maxnum) {
//                    System.out.println("This number is too big! Please try again.");
//                    break;
//                } else if (userInput < minnum) {
//                    System.out.println("This number is too small! Please try again.");
//                    break;
//                } else {
//                    System.out.println(" Thank you! ");
//                    break;
//                }
//            }while((getInteger(minnum, maxnum) >= 11 || (getInteger(minnum, maxnum) <= 0)));
//            return getInteger(minnum, maxnum);
//    }
}

