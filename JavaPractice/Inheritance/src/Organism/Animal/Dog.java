package Organism.Animal;
public class Dog extends Animal {
    public void speak(){
        System.out.println("Bark.");
    }
    @Override
    public void feed(){
        System.out.println("The Dog is now eating.");
    }
}
