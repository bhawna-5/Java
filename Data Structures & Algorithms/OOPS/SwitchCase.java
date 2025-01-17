import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("1. addition");
        System.out.println("2. subtraction");
        System.out.println("3. multiply");
        System.out.println("enter your choice");
        int choice = sc.nextInt();
        int i;
        switch (choice) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            default:
                System.out.println("invalid action");
        }
    }
}
