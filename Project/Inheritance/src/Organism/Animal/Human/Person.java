package Organism.Animal.Human;
public class Person {
    String firstName;
    String lastName;
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFullName(){
        return this.firstName + this.lastName;
    }
    @Override
    public String toString(){
        return this.firstName + " " + this.lastName;
    }
}
