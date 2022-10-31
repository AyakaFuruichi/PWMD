public class AirLine {
    public static void main(String[] args) throws Exception {
        Reservation reservation = new Reservation();
        Tool tool = new Tool();

        //clear terminal
        tool.clear();

        //show title
        System.out.println("=============================\nWelcome to ABC AirLine!\n=============================");
        
        //show menu
        reservation.showMenu();

    }
}
