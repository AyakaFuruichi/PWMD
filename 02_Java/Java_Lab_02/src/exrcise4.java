import java.util.Scanner;

public class exrcise4 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int addNum, num, ans=0;

        System.out.printf("How many integers will be added? ");
        addNum = scan1.nextInt();

        for(int i=0; i < addNum; i++){
            System.out.println("Enter an integer:");
            num = scan2.nextInt();
            ans += num;
        }

        System.out.println("The sum is " + ans);

        scan1.close();
        scan2.close();
    }
    
}
