import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.println(num2 + " is smaller than " + num1);
        }
        else {
            System.out.println(num1 + " is smaller than " + num2);
        }
    }

}
