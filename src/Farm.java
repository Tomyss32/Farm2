import Animals.Animal;
import Animals.Size;
import Flowers.Flower;


import java.util.ArrayList;

public class Farm {


    private ArrayList<Animal> animals = new ArrayList<>();
    private ArrayList<Flower> flowers = new ArrayList<>();
    private int account;
    private int fieldSize = 100;



    public void plantFlower(Flower flower){
        if(fieldSize - flower.getNeededArea()>0){
            if (account> flo)
        }
    }


    public void sellAnimals(Animal animal) {
        if (animals.contains(animal)) {
            if (animal.getSize() == Size.SMALL) {
                animals.remove(animal);
                account += 10000;
            }
        } else if (animals.contains(animal)) {
            if (animal.getSize() == Size.BIG) {
                animals.remove(animal);
                account += 15000;
            }
        }
    }


    public void buyAnimal(Animal animal) {
        int small = 0;
        int big = 0;

        for (Animal a : animals) {
            if (a.getSize() == Size.SMALL) {
                small++;
            } else if (a.getSize() == Size.BIG) {
                big++;
            }
        }
        if (animal.getSize() == Size.SMALL) {
            if (small > 10) {
                if (account > 1000) {
                    animals.add(animal);
                    account -= 1000;
                }
            }
        } else if (animal.getSize() == Size.BIG) {
            if (big > 10) {
                if (account > 10000) {
                    animals.add(animal);
                    account -= 10000;
                }
            }
        }
    }


    public void watering (Flower flower){
        
    }
}
