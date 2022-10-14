package animal_kingdom.child;

import animal_kingdom.parent.Fish;

public class Eel extends Fish{
    private String characteristic;

    public Eel(){
        super(100, 1, "Fish", "A or B", "live in water", "gills");
        this.characteristic = "Release electric charge";
    }

    public Eel(int height, int weight, String animalType, String bloodType, String place, String breath, String characteristic) {
        super(height, weight, animalType, bloodType, place, breath);
        this.characteristic = characteristic;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    @Override
    public String toString() {
        return "Eel [characteristic=" + characteristic + "]";
    }

    @Override
    public String showInfo(){
        return "[Eel]" + "\nLiving place:\t" + getPlace() + "\nType of breath:\t" + getBreath() + "\nCharacteristic:\t" + characteristic + "\nHight:\t"
        + getHight() + "\nWeight:\t" + getWeight() + "\nAnimal type:\t" + getAnimalType() + "\nBlood type:\t" + getBloodType();
    }

    
}
