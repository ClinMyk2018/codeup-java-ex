import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ControlFlowExercises {
//    public static void main(String[] args) {
//        for (long i = 2; i < 1000000; i*=i){
//                System.out.println(i);
//            }


//        for (int i = 1; i <= 100; i++) {
//
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            }else{
//                System.out.println(i);
//            }
//        }
//        Scanner sc = new Scanner(System.in);
//
//        int num;
//
//        System.out.print("Enter a number: ");
//        num = sc.nextInt();
//        for (int i = 0; i < 1; i++) {
//
//            if (num <= 100 && num >= 95) {
//                System.out.println("Your grade is: A+");
//                break;
//            } else if (num <= 94 && num >= 90) {
//                System.out.println("Your grade is: A-");
//                break;
//            } else if (num <= 89 && num >= 85) {
//                System.out.println("Your grade is: B+");
//                break;
//            } else if (num <= 84 && num >= 80) {
//                System.out.println("Your grade is: B-");
//                break;
//            } else if (num <= 79 && num >= 75) {
//                System.out.println("Your grade is: C+");
//                break;
//            } else if (num <= 74 && num >= 70) {
//                System.out.println("Your grade is: C-");
//                break;
//            } else if (num <= 69 && num >= 65) {
//                System.out.println("Your grade is: D+");
//                break;
//            } else if (num <= 64 && num >= 60) {
//                System.out.println("Your grade is: D-");
//                break;
//            } else if (num < 60) {
//                System.out.println("Your grade is: F");
//                break;
//            }
//        }

        // frame
        JFrame f;
        // Table
        JTable j;

//        Scanner sc = new Scanner(System.in);
//        int num;
//
//        System.out.print("Enter a number: ");
//        num = sc.nextInt();

        // Constructor
        ControlFlowExercises()
        {
            // Frame initiallization
            f = new JFrame();

            // Frame Title
            f.setTitle("JTable Example");

            // Data to be displayed in the JTable
            String[][] data = {
                    { "Kundan Kumar Jha", "4031", "CSE" },
                    { "Anand Jha", "6014", "IT" }
            };

            // Column Names
            String[] columnNames = { "Name", "Roll Number", "Department" };

            // Initializing the JTable
            j = new JTable(data, columnNames);
            j.setBounds(30, 40, 200, 300);

            // adding it to JScrollPane
            JScrollPane sp = new JScrollPane(j);
            f.add(sp);
            // Frame Size
            f.setSize(500, 200);
            // Frame Visible = true
            f.setVisible(true);
        }

        // Driver  method
        public static void main(String[] args)
        {
            new ControlFlowExercises();
        }

    }
