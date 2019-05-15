import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String question;
        System.out.println("Please ask me anything:");
        question = sc.nextLine();
        if (question.endsWith("?")){
            System.out.println("Sure!");
        }else if (question.endsWith("!")){
            System.out.println("Whoa, chill out!");
        }else if(question.equals("")){
            System.out.println("Fine, be that way!");
        }else{
            System.out.println("Whatever!");
        }


    }

}
