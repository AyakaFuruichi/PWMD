package animal_kingdom.parent;

import animal_kingdom.Animal;

public class Birds extends Animal{
    
    private String characteristic;
    private boolean fly;

    public Birds(){
        super(0, 0, "Bird", "-");
        characteristic = "Animals with feathers";
        fly = true;
    }

    public Birds(int height, int weight, String animalType, String bloodType, String characteristic, Boolean fly) {
        this.characteristic = characteristic;
        this.fly = fly;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public boolean getFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    @Override
    public String toString() {
        return "Birds [characteristic=" + characteristic + ", fly=" + fly + "]";
    }

    public String showInfo(){
        return "[Bird]"+ "\nCharacteristic:\t" + characteristic + "\nThey can fly:\t" + fly;
    }
}
