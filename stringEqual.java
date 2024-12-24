import java.util.Scanner;

public class stringEqual {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String inputtext = scan.nextLine();
        if (inputtext.equals("hi")) {
            System.out.println("Password Correct");
        } else {
            System.out.println("Invalid User");
        }
    }
}
