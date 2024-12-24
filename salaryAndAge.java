import java.util.Scanner;

public class salaryAndAge {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int salary = scan.nextInt();
        int age = scan.nextInt();
        if (salary >= 20000 || age < 25) {
            System.out.println("Required Amount");
            int required = scan.nextInt();
            if (required <= 50000) {
                System.out.println("You are eligible");
            } else {
                System.out.println("Maximum loan amount is 50000");
            }
        } else {
            System.out.println("You are not eligible");
        }
    }
}
