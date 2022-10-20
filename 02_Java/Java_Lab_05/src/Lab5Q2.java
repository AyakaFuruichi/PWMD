import java.util.ArrayList;
import java.util.Random;

public class Lab5Q2 {

	public static void main(String[] args) {
		
        ArrayList<Integer> intList1 = new ArrayList<>();
        ArrayList<Integer> intList2 = new ArrayList<>();
        Random rand = new Random();
        int num;

        for(int i = 0; i < 10; i++){
            intList1.add(rand.nextInt(1,50));
        }

        System.out.println("[Before]");
        System.out.println("List1: " + intList1 + "\nList2: " + intList2);
        System.out.println("-----------------------------------------------");

        intList2.addAll(intList1);
        intList1.set(9, -5);

        System.out.println("[After]");
        System.out.println("List1: " + intList1 + "\nList2: " + intList2);

	}

}