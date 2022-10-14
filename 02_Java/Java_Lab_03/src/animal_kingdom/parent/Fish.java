package animal_kingdom.parent;

import animal_kingdom.Animal;

public class Fish extends Animal{
    private String place;
    private String breath;

    public Fish(){
        super(0, 0, "Fish", "-");
        place = "water";
        breath = "gills";
    }

    public Fish(int height, int weight, String animalType, String bloodType, String place, String breath) {
        super(height, weight, animalType, bloodType);
        this.place = place;
        this.breath = breath;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getBreath() {
        return breath;
    }

    public void setBreath(String breath) {
        this.breath = breath;
    }

    @Override
    public String toString() {
        return "Fish [place=" + place + ", breath=" + breath + "]";
    }

    public String showInfo(){
        return "[Fish]" + "\nLiving place:\t" + getPlace() + "\nType of breath:\t" + getBreath();
    } 

    

    
}
