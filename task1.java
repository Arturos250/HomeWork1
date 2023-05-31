import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;

        System.out.println("addition :" + " " + addition);
        System.out.println("subtraction :" + " " + subtraction);
        System.out.println("multiplication :" + " " + multiplication);
        System.out.println("division :" + " " + division);

    }

}
