package animal_kingdom.child;

import animal_kingdom.parent.Birds;

public class Eagle extends Birds{

    public Eagle() {
        super(80, 41, "Birds", "W", "Animals with feathers", true);
    }

    @Override
    public String toString() {
        return "Eagle []";
    }
    
    @Override
    public String showInfo(){
        return "[Eagle]" + "\nCharacteristic:\t" + getCharacteristic() + "\nThey can fly:\t" + getFly() + "\nHight:\t"
        + getHight() + "\nWeight:\t" + getWeight() + "\nAnimal type:\t" + getAnimalType() + "\nBlood type:\t" + getBloodType();
    }
}
