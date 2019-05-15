public class StringExercise {

    public static void main(String[] args) {
        String message = "We don't need no education";
        System.out.printf(message + "%nWe don't need no thought control");

        String message1 = String.format("Check %s out!, %s s", "this", "s inside of");
        System.out.println(message1);

        String message2 = "C:";
        System.out.print("In windows, the main drive is usually " + message2 + "\\");

        String message3 = String.format("I can do backslashes %s, double backslashes %s%s," +
                        "and the amazing triple %s%s%s!", "\\", "\\", "\\", "\\", "\\", "\\");
        System.out.println(message3);
    }
}
