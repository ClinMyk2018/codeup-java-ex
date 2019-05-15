public class DiceSpinner {
    public static void main(String[] args) {

        MethodsExercises.PairOfDice dice;          // A variable that will refer to the dice.
        int rollCount;    // Number of times the dice have been rolled.

        dice = new MethodsExercises.PairOfDice();  // Create the PairOfDice object.
        rollCount = 0;

        /* Roll the dice until they come up snake eyes. */

        do {
            dice.roll();
            System.out.println("The dice come up " + dice.getDie1()
                    + " and " + dice.getDie2());
            rollCount++;
        } while (dice.getTotal() != 2);

        /* Report the number of rolls. */

        System.out.println("\nIt took " + rollCount + " rolls to get a 2.");

    }
    public static class PairOfDice {

        private int die1;   // Number showing on the first die.
        private int die2;   // Number showing on the second die.

        public PairOfDice() {
            // Constructor.  Rolls the dice, so that they initially
            // show some random values.
            roll();  // Call the roll() method to roll the dice.
        }

        public void roll() {
            // Roll the dice by setting each of the dice to be
            // a random number between 1 and 6.
            die1 = (int)(Math.random()*6) + 1;
            die2 = (int)(Math.random()*6) + 1;
        }

        public int getDie1() {
            // Return the number showing on the first die.
            return die1;
        }

        public int getDie2() {
            // Return the number showing on the second die.
            return die2;
        }

        public int getTotal() {
            // Return the total showing on the two dice.
            return die1 + die2;
        }

    }


}

