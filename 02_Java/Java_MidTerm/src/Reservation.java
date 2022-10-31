import java.time.LocalDate;
import java.util.*;

public class Reservation {

    Scanner scan;
    ArrayList<Tickets> list = new ArrayList<>();
    Tickets flight = new Tickets();
    Tool tool = new Tool();

    void cancelReservation(){

        String conNum2;

        tool.clear();

        if(list.isEmpty() == true){
            System.out.println("------------------------------------");
            System.out.println("There is no your reservation information...");
            System.out.println("------------------------------------");
            return;
        }

        System.out.println(
            "Enter your confirmation number that you would like to cancel."
        );
        conNum2 = scan.next().toLowerCase();
        
        for(int i=0; i < list.size(); i++){
            if(list.get(i).getConNumber().toLowerCase().equals(conNum2)){
                while(true){
                    System.out.println(
                    "------------------------------------"+"\n"+
                    "Confirmation Number: ["+ list.get(i).getConNumber()+ "]\n"+
                    "Your Name:\t" + list.get(i).getFirstName()+ " "+ flight.getLastName()+"\n"+
                    "Flight Date:\t"+ list.get(i).getDate()+"\n"+
                    "Departure:\t"+ list.get(i).getDeparture()+"\n"+
                    "Destination:\t"+list.get(i).getDestination()+"\n"+
                    "Price:\t"+ "$"+list.get(i).getPrice()+"\n"+
                    "------------------------------------\n"+
                    "Do you really cancel it? [y/n]"
                    );

                    char opt = scan.next().charAt(0);

                    if(Character.toLowerCase(opt) == 'y'){
                        tool.clear();
                        list.remove(i);
                        System.out.println("Thank you! Cancellation process is complete!!");
                        return;

                    }else if(Character.toLowerCase(opt) == 'n'){

                        System.out.println("Canceled process...");
                        return;

                    }else{

                        System.out.println("Please enter a valid option");
                        continue;

                    }
                
                }

            }else{
                System.out.println("Invalid option, return to menu screen.");
                return;
            }

        }

    }

    void changeReservation(){

        String conNum3, newDate;
        int opt, day, month, year, nowYear;
        LocalDate getDate = LocalDate.now();
        nowYear = getDate.getYear();

        tool.clear();

        if(list.isEmpty() == true){
            System.out.println("------------------------------------");
            System.out.println("There is no your reservation information...");
            System.out.println("------------------------------------");
            return;
        }

        System.out.println(
            "Enter your confirmation number that you would like to change."
        );
        conNum3 = scan.next().toLowerCase();
        
        for(int i=0; i<list.size();i++){
            if(list.get(i).getConNumber().toLowerCase().equals(conNum3)){
                System.out.println(
                    "------------------------------------\n"+
                    "[Confirmation]\n"+
                    "Confirmation Number:\t"+ list.get(i).conNumber +"\n"+
                    "Name:\t"+ list.get(i).firstName+ " "+ list.get(i).lastName+ "\n"+
                    "Data:\t"+ list.get(i).date+"\n"+
                    "From:\t"+ list.get(i).departure.toUpperCase()+"\n"+
                    "To:\t"+ list.get(i).destination.toUpperCase()+"\n"+
                    "Price:\t"+ "$"+ list.get(i).price+"\n"+
                    "------------------------------------"
                );
                System.out.println(
                    "What would you like to change?\n"+
                    "1: Date\n"+
                    "2: Departure\n"+
                    "3: Destination\n"+
                    "4: Name"
                );

                opt = scan.nextInt();

                switch(opt){
                    case 1:
                        System.out.println("New departure Date [DD/MM/YYYY]:");

                        System.out.printf("Day [DD]: ");
                        while(true){
                            day = scan.nextInt();
                            if(day <= 0 || day >= 31){
                                System.out.println("Invalid number.　Please try again.");
                                continue;
                            }else{
                                break;
                            }
                        }

                        System.out.printf("Month [MM]: ");
                        while(true){
                            month = scan.nextInt();
                            if(month <= 0 || month >= 13){
                                System.out.println("Invalid number. Please try again.");
                                continue;
                            }else{
                                break;
                            }
                        }

                        System.out.printf("Year [yyyy]: ");
                        while(true){
                            year = scan.nextInt();
                            if(year < nowYear){
                                System.out.println("Invalid number. Please try again.");
                                continue;
                            }else{
                                break;
                            }
                        }

                        if(day >= 1 && day <= 9){
                            newDate = "0" + day; 
                        }else{
                            newDate = "" + day;
                        }

                        if(month >= 1 && month <= 9){
                            newDate += "/0" + month;
                        }else{
                            newDate += "/" + month;
                        }

                        newDate += "/"+ year;
                        
                        String oldDate = list.get(i).getDate();
                        list.get(i).setDate(newDate);

                        tool.clear();

                        System.out.println(
                            "Success your process!\n"+
                            "------------------------------\n"+
                            "[Before] " + oldDate+ "\n"+
                            "[After] " + newDate
                        );

                        return;

                    case 2:
                        System.out.println(
                            "New departure: \n"+
                            ">option: Tokyo/ Fukuoka/ Vancouver/ London/ Seoul"
                            );
                        String oldFrom = list.get(i).getDeparture();
                        int oldPrice = list.get(i).getPrice();
                        String newFrom = scan.next();
                        int newPrice = getPrice(newFrom, list.get(i).getDestination());

                        tool.clear();

                        if(newPrice == 0){
                            System.out.println("invalid option!");
                            return;
                        }

                        list.get(i).setDeparture(newFrom);
                        list.get(i).setPrice(newPrice);

                        System.out.println(
                            "Success your process!\n"+
                            "------------------------------\n"+
                            "[Before] \n"+
                            " Departure:\t"+ oldFrom.toUpperCase()+"\n"+
                            " Price:\t"+ oldPrice+ "\n"+
                            "[After] \n"+
                            " Departure:\t"+ newFrom.toUpperCase()+ "\n"+
                            " Price:\t"+ newPrice
                        );

                        return;

                    case 3:
                        System.out.println(
                            "New destination: \n"+
                            ">option: Tokyo/ Fukuoka/ Vancouver/ London/ Seoul"
                            );
                        String oldTo = list.get(i).getDestination();
                        int oldPrice2 = list.get(i).getPrice();
                        String newTo = scan.next();
                        int newPrice2 = getPrice(newTo, list.get(i).getDestination());

                        tool.clear();

                        if(newPrice2 == 0){
                            System.out.println("invalid option!");
                            return;
                        }

                        list.get(i).setDestination(newTo);
                        list.get(i).setPrice(newPrice2);

                        System.out.println(
                            "Success your process!\n"+
                            "------------------------------\n"+
                            "[Before] \n"+
                            " Destination:\t"+ oldTo.toUpperCase()+"\n"+
                            " Price:\t"+ oldPrice2+ "\n"+
                            "[After] \n"+
                            " Destination:\t"+ newTo.toUpperCase()+ "\n"+
                            " Price:\t"+ newPrice2
                        );

                        return;

                    case 4:
                        String oldFName, oldLName, newFName, newLName;

                        oldFName = list.get(i).firstName;
                        oldLName = list.get(i).lastName;

                        System.out.println("What is new Name?");
                        System.out.printf("First name: ");
                        newFName = scan.next().toUpperCase();

                        System.out.printf("Last name: ");
                        newLName = scan.next().toUpperCase();

                        list.get(i).setFirstName(newFName);
                        list.get(i).setLastName(newLName);

                        tool.clear();

                        System.out.println(
                            "Success your process!\n"+
                            "------------------------------\n"+
                            "[Before] \t"+ oldFName+ " "+ oldLName+ "\n"+
                            "[After] \t"+ newFName+ " "+ newLName
                        );

                        return;
                        

                    default:
                        System.out.println("Invalid option.");
                        break;
                }

            }else{
                System.out.println("A confirmation number is not found.");
            }
        }

        return;
    }

    int getPrice(String from, String to){
        
        switch(from.toLowerCase()){
            case "fukuoka":
                switch(to.toLowerCase()){
                    case "vancouver":
                        return 1600;

                    case "london":
                        return 1000;

                    case "seoul":
                        return 200;

                    case "tokyo":
                        return 120;
                    
                    default:
                        return 0;
                }

            case "vancouver":
                switch(to.toLowerCase()){
                    case "fukuoka":
                        return 1600;

                    case "london":
                        return 400;

                    case "seoul":
                        return 1000;

                    case "tokyo":
                        return 1200;
                    
                    default:
                        return 0;
                }

            case "london":
                switch(to.toLowerCase()){
                    case "fukuoka":
                        return 1000;

                    case "vancouver":
                        return 400;

                    case "seoul":
                        return 1000;

                    case "tokyo":
                        return 900;
                    
                    default:
                        return 0;
                }

            case "seoul":
                switch(to.toLowerCase()){
                    //Seoul -> Fukuoka
                    case "fukuoka":
                        return 200;

                    //Seoul -> Vancouver
                    case "vancouver":
                        return 1000;

                    //Seoul -> London
                    case "london":
                        return 1000;

                    //Seoul -> Tokyo
                    case "tokyo":
                        return 230;
                    
                    default:
                        return 0;
                }

            case "tokyo":
                switch(to.toLowerCase()){
                    //Tokyo -> Fukuoka
                    case "fukuoka":
                        return 120;

                    //Tokyo -> Vancouver
                    case "vancouver":
                        return 1200;

                    //Tokyo -> London
                    case "london":
                        return 900;

                    //Tokyo -> Seoul
                    case "seoul":
                        return 230;
                    
                    default:
                        return 0;
                }

            default:
                return 0;

        }

    }

    Tickets setList(String conNumber, String firstName, String lastName, String date, int price, String departure, String destination){
        Tickets setInfo = new Tickets();

        setInfo.setConNumber(conNumber);
        setInfo.setFirstName(firstName);
        setInfo.setLastName(lastName);
        setInfo.setDate(date);
        setInfo.setPrice(price);
        setInfo.setDeparture(departure);
        setInfo.setDestination(destination);

        return setInfo;
    }

    void reserveTickets(){
        
        String date, departure, destination, confirmNum;
        int day, month, year, nowYear, price;
        char opt;
        LocalDate localDate = LocalDate.now();
        nowYear = localDate.getYear();

        tool.clear();

        try{
            System.out.println("Departure Data [DD/MM/YYYY]:");
            System.out.printf("Day [DD]: ");
            while(true){
                day = scan.nextInt();
                if(day <= 0 || day >= 31){
                    System.out.println("Invalid number.　Please try again.");
                    continue;
                }else{
                    break;
                }
            }

            System.out.printf("Month [MM]: ");
            while(true){
                month = scan.nextInt();
                if(month <= 0 || month >= 13){
                    System.out.println("Invalid number. Please try again.");
                    continue;
                }else{
                    break;
                }
            }

            System.out.printf("Year [yyyy]: ");
            while(true){
                year = scan.nextInt();
                if(year < nowYear){
                    System.out.println("Invalid number. Please try again.");
                    continue;
                }else{
                    break;
                }
            }

            if(day >= 1 && day <= 9){
                date = "0" + day; 
            }else{
                date = "" + day;
            }

            if(month >=1 && month <= 9){
                date += "/0" + month;
            }else{
                date += "/" + month;
            }

            date += "/"+ year;


            System.out.println("Where are you going from? [Select from options]:");
            System.out.println(">option: Tokyo/ Fukuoka/ Vancouver/ London/ Seoul");
            departure =scan.next();
            
            System.out.println("Where are you going? [Enter a country name]:");
            System.out.println(">option: Tokyo/ Fukuoka/ Vancouver/ London/ Seoul");
            destination =scan.next();
            
            price = getPrice(departure, destination);

            tool.clear();

            if(price == 0){
                System.out.println("Sorry, your booking is invalid.");
                return;
            }

            

            while(true){
                //clear terminal
                

                //show confirmation
                System.out.println(
                    "------------------------------------\n"+
                    "[Confirmation]\n"+
                    "Data:\t"+ date+"\n"+
                    "From:\t"+ departure+"\n"+
                    "To:\t"+ destination+"\n"+
                    "Price:\t"+ "$"+ price+"\n"+
                    "------------------------------------\n"+
                    "is it OK? [y/n]"
                );

                opt = scan.next().charAt(0);

                if(Character.toLowerCase(opt) == 'y'){
                    tool.clear();
                    System.out.println("What is your name?");
                    System.out.printf("First name: ");
                    String firstName = scan.next().toUpperCase();
                    System.out.print("Last name: ");
                    String lastName = scan.next().toUpperCase();

                    //generate number
                    confirmNum = tool.getRandomString(10);
                    
                    //setInformation
                    Tickets setInfo = setList(confirmNum, firstName, lastName, date, price, departure, destination);
                    
                    int index = list.size();
                    list.add(index, setInfo);
                    
                    //clear before showing information
                    tool.clear();

                    //show Info
                    System.out.println("Thank you! Your booking is confirmed!!");
                    System.out.println(
                    "------------------------------------\n"+
                    "[Confirmation]\n"+
                    "Confirmation Number:\t"+ confirmNum +"\n"+
                    "Name:\t"+ firstName+ " "+ lastName+ "\n"+
                    "Data:\t"+ date+"\n"+
                    "From:\t"+ departure.toUpperCase()+"\n"+
                    "To:\t"+ destination.toUpperCase()+"\n"+
                    "Price:\t"+ "$"+ price+"\n"+
                    "------------------------------------"
                );
                    return;

                }else if(Character.toLowerCase(opt) == 'n'){

                    System.out.println("Canceled process...");
                    return;

                }else{

                    System.out.println("Please enter a valid option");
                    continue;

                }
                
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    void checkReservation(){

        tool.clear();

        if(list.isEmpty() == true){
            System.out.println("------------------------------------");
            System.out.println("There is no your reservation information...");
            System.out.println("------------------------------------");
            return;
        }


        System.out.println(
            "====================================\n"+
            "Your Reservations: \n"+
            "===================================="
        );

        for(int i=0; i<list.size(); i++){
            System.out.println(
                "------------------------------------"+"\n"+
                "Confirmation Number: ["+ list.get(i).conNumber+ "]\n"+
                "Your Name:\t" + list.get(i).firstName+ " "+ list.get(i).lastName+"\n"+
                "Flight Date:\t"+ list.get(i).date+"\n"+
                "Departure:\t"+ list.get(i).departure+"\n"+
                "Destination:\t"+list.get(i).destination+"\n"+
                "Price:\t"+ "$"+list.get(i).price+"\n"+
                "------------------------------------"
            );
        }

        while(true){
            System.out.println(
            "Quit service:\tPlease enter Q\nReturn to menu:\tPlease enter R"
            );
            switch(scan.next().toLowerCase().charAt(0)){
                case 'r':
                    tool.clear();
                    return;
                    
                case 'q':
                    tool.clear();
                    System.out.println("Thank you for choosing ABC Airline! See you again!");
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please try again");
                    break;
            }
        }
    }

    void showMenu(){
        char opt;

        try{
            scan = new Scanner(System.in);
            
            do{

                System.out.println(
                    "=============================\n"+
                    "[Menu]\n"+
                    "   *Select an option*\n"+
                    "=============================\n"+
                    "A: Check your reservation\n"+
                    "B: Reserve tickets\n"+
                    "C: Change your reservation\n"+
                    "D: Cancel your reservation\n"+
                    "E: Quit"
                );

                opt = scan.next().charAt(0);

                switch(Character.toLowerCase(opt)){
                    case 'a':
                        try {
                            checkReservation();
                        } catch (Exception e) {
                            // error message
                            System.out.println("Menu A"+e.getMessage());
                        }
                        
                        break;

                    case 'b':
                        try {
                            reserveTickets();
                        } catch (Exception e) {
                            // error message
                            System.out.println("Menu B"+e.getMessage());
                        }

                        break;

                    case 'c':
                        try {
                            changeReservation();
                        } catch (Exception e) {
                            System.out.println("Menu C"+e.getMessage());
                        }

                        break;

                    case 'd':
                        try {
                            cancelReservation();
                        } catch (Exception e) {
                            System.out.println("Menu C"+e.getMessage());
                        }

                        break;
                    
                    case 'e':
                        break;
                    
                    default:
                        System.out.println("Invalid option. Please try again");
                        break;
                }

            }while(Character.toLowerCase(opt) != 'e');

            System.out.println("Thank you for choosing ABC Airline! See you again!");
            System.exit(0);
        }catch(Exception e){
            System.out.println("Menu"+e.getMessage());
        }
    }
}

class Tickets{
    String conNumber;
    String firstName;
    String lastName;
    String date;
    int price;
    String departure;
    String destination;

    public Tickets(){

    }


    public Tickets(String conNumber, String firstName, String lastName, String date, int price, String departure, String destination) {
        this.conNumber = conNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
        this.price = price;
        this.departure = departure;
        this.destination = destination;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getConNumber() {
        return conNumber;
    }

    public void setConNumber(String conNumber) {
        this.conNumber = conNumber;
    }

}
