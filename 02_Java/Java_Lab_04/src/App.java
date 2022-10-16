import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //define variables and objects
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        Scanner scan4 = new Scanner(System.in);
        int num1,num2;
        String ope, cont;
        Boolean flag = true;
        Calcurator calc = new Calcurator();

        //Calcuration App
        while(flag == true){
            //type the first number
            System.out.println(">Please type the first number");
            num1 = scan1.nextInt();
            
            //chose an operation
            System.out.println(">Chose an operation:");
            System.out.println(" >> Type + for addtion");
            System.out.println(" >> Type - for substraction");
            System.out.println(" >> Type * for multiplication");
            System.out.println(" >> Type / for division");
            ope = scan2.nextLine();
            
            //Check operation
            if(ope.equals("+") || ope.equals("-") || ope.equals("*") || ope.equals("/")){
                //type the second number
                System.out.println(">Please type the second number");
                num2 = scan3.nextInt();

                 //calcuration
                if(ope.equals("+")){
                    System.out.println(calc.Add(num1, num2));
                    flag = false;
                }else if(ope.equals("-")){
                    System.out.println(calc.Subtract(num1, num2));
                    flag = false;
                }else if(ope.equals("*")){
                    System.out.println(calc.Multiply(num1, num2));
                    flag = false;
                }else{
                    System.out.println(calc.Divede(num1, num2));
                    flag = false;
                }
            }else{
                System.out.println(">It is an invalid operator");
                flag = false;
            }

            //Continue or quite
            while(true){
                System.out.println(">Do you want to continue or quit");
                cont = scan4.nextLine();
                if(cont.equals("continue")){
                    flag = true;
                    break;
                }else if(cont.equals("quit")){
                    flag = false;
                    System.out.println(">Bye!");
                    break;
                }else if(!(ope.equals("quit")) && !(ope.equals("continue"))){
                    flag = false;
                    System.out.println(">You wrote a wrong operation.. Try again!");
                    continue;
                }
            }
        }
        scan1.close();
        scan2.close();
        scan3.close();
        scan4.close();
    }
}
