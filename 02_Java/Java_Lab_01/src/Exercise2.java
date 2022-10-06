import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.printf("Input the cents: ");
        num = input.nextInt();

        System.out.printf("The value is %d dollars and %d cents.", (num/100), (num%100));
    }
}
