package Organism.Animal;
public class Cat extends Animal {
    public void speak(){
        System.out.println("Meow.");
    }
    @Override
    public void feed(){
        System.out.println("The cat is now eating.");
    }
}
