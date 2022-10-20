import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Lab5Q3 {

    public static void main(String[] args){
        
        List<Cars> carList = new ArrayList<>();

        carList.add(new Cars("honda", "aaa", 1999));
        carList.add(new Cars("toyota", "sedan", 1995));
        carList.add(new Cars("suzuki", "4WD", 1870));
        carList.add(new Cars("XXX", "bbb", 2000));
        carList.add(new Cars("YYY", "ccc", 1970));


        Collections.sort(carList);
        for (Cars car : carList) {
            System.out.println("Brand: " + car.brand + ", Model: "+ car.model + " Year: " + car.year);
        }
    }


}

class Cars implements Comparable<Cars>{

    String brand;
    String model;
    int year;

    public Cars(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public int compareTo(Cars o) {
        return this.year - o.year;
        }
    }
