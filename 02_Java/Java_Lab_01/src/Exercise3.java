import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.printf("Input a number: ");
        num = input.nextInt();
        System.out.printf("-------------------------\n");

        for(int i=1; i<=10; i++){
        System.out.printf("%d x %d = %d\n", num, i, num*i);

        input.close(); //add:221006
        }
    }
}
