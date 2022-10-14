package animal_kingdom;
import animal_kingdom.child.Crocodile;
import animal_kingdom.child.Eagle;
import animal_kingdom.child.Eel;
import animal_kingdom.parent.Birds;
import animal_kingdom.parent.Fish;
import animal_kingdom.parent.Reptile;

public class Animal {
    private int hight;
    private int weight;
    private String animalType;
    private String bloodType;

    public Animal(){

    }
    
    public Animal(int hight, int weight, String animalType, String bloodType) {
        this.hight = hight;
        this.weight = weight;
        this.animalType = animalType;
        this.bloodType = bloodType;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return "Animal [hight=" + hight + ", weight=" + weight + ", animalType=" + animalType + ", bloodType="
                + bloodType + "]";
    }

    

    
}

class AnimalKingdum{
    public static void main(String[] args) throws Exception {
        
        //Reptile
        Reptile reptile = new Reptile();
        System.out.println(reptile.showInfo());
        System.out.println("------------------");

        Crocodile crocodile = new Crocodile();
        System.out.println(crocodile.showInfo());
        System.out.println("==================");
        System.out.println();

        //Fish
        Fish fish = new Fish();
        System.out.println(fish.showInfo());
        System.out.println("------------------");

        Eel eel = new Eel();
        System.out.println(eel.showInfo());
        System.out.println("==================");
        System.out.println();

        //Birds
        Birds birds = new Birds();
        System.out.println(birds.showInfo());
        System.out.println("------------------");

        Eagle eagle = new Eagle();
        System.out.println(eagle.showInfo());

    }
}
