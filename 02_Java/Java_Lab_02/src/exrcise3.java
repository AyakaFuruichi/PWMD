import java.util.Scanner;

public class exrcise3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = new String();

        System.out.printf("Enter a word: ");
        str = scan.nextLine();

        for(int i=1; i <= str.length(); i++){
            System.out.println(str);
        }

        scan.close();
    }
    
}
