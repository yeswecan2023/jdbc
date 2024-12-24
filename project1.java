import java.util.Scanner;

class project1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        int age = scan.nextInt();
        scan.nextLine();
        String address = scan.nextLine();
        System.out.println("My Name is " + username);
        System.out.println("My age is " + age);
        System.out.println("My address is " + address);
    }
}