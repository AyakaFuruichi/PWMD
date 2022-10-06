import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.printf("Input the radius: ");
        num = input.nextInt();

        System.out.printf("The radius is: %d, The area is: %.15f", num, (num*num*Math.PI));
    }
}
