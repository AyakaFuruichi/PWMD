import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab5Q1 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        ArrayList<Integer> intList = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            intList.add(rand.nextInt(1,50));
        }

        /*for checking List */
        // System.out.println(intList);

        System.out.println("enter a number:");
        num = scan.nextInt();

        if(intList.indexOf(num) != -1){
            System.out.println("The number is in the List!");
        }else{
            System.out.println("The number is not in the List...");
        }

        scan.close();
    }
}
