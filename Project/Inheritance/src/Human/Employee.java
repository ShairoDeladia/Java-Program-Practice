package Human;
public class Employee extends Person{
    int salary;

    public Employee(String firstName, String lastName, int salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public String getSalary(){
        return this.firstName + this.lastName + "'s salary is " + this.salary;
    }
    
}
