public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Sunflower sunflower = new Sunflower();
        Marigold marigold = new Marigold();
        Person person = new Person("Jezreel", "Asuncion");
        Student student = new Student("Shairo","Deladia",5.2);
        Employee employee = new Employee("Jarel","Marabut",10000);

        dog.feed();
        cat.feed();

        dog.speak();
        cat.speak();

        sunflower.water();
        sunflower.interact();

        marigold.water();
        marigold.interact();

        System.out.println(student.getGPA());
        System.out.println(employee.getSalary());
    }
}
  