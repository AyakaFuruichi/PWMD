package animal_kingdom.child;

import animal_kingdom.parent.Reptile;

public class Crocodile extends Reptile{

    public Crocodile() {
        super(5000, 450, "Reptile", "B", "Dry Skin", "Backbone", "Hard-shelled eggs");
    }

    public Crocodile(int height, int weight, String animalType, String bloodType, String skinType, String bone, String eggType) {
        super(height, weight, animalType, bloodType, skinType, bone, eggType);
    }
    
    @Override
    public String toString() {
        return "Crocodile []";
    }
    
    @Override
    public String showInfo(){
        return  "[Crocodile]" + "\nSkin type:\t" + getSkinType()+ "\nBone:\t" + getBone() + "\neggType:\t" + getEggType() + "\nHight:\t"
                + getHight() + "\nWeight:\t" + getWeight() + "\nAnimal type:\t" + getAnimalType() + "\nBlood type:\t" + getBloodType();
    }
    
}
