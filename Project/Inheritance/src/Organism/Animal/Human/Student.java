package Organism.Animal.Human;
public class Student extends Person{
    double gpa;

    public Student(String firstName, String lastName, double gpa) {
        super(firstName, lastName);
        this.gpa = gpa;
    }

    public String getGPA(){
        return this.firstName + this.lastName + "'s gpa is " + this.gpa;
    }
    
}
