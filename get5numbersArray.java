import java.util.Scanner;

public class get5numbersArray {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] number = new int['5'];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number " + i);
            number[i] = scan.nextInt();
        }
    }
}
