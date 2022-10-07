import java.util.Scanner;

public class exrcise2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, ans=0;

        System.out.printf("Input the N: ");
        num = scan.nextInt();

        for(int i=1; i <= num; i++){
            ans += i;
        }

        System.out.printf("The sum of 1 to %d is %d", num, ans);

        scan.close();
    }
    
}
