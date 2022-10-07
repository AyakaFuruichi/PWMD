import java.util.Scanner;

public class exrcise1 {
    public static void main(String[] args) throws Exception {
        System.out.println("----Exercise 1----");

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int num1, num2;

        System.out.printf("Input the start: ");
        num1 = scan1.nextInt();

        System.out.printf("Input the End: ");
        num2 = scan2.nextInt();

        for(int i = num1; i <= num2; i++){
            System.out.println(i);

            scan1.close();
            scan2.close();
        }
    }
}
