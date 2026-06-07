public class Main{
    public static void main(String[] args) {
        Student student1 = new Student("Shairo S. Deladia", 22);
        Student student2 = new Student("Jarel G. Marabut", 22);
        System.out.println(student1.getName() + " is a " + student1.getAge() + " years old student with an id number of " + student1.getId());
        System.out.println(student2.getName() + " is a " + student2.getAge() + " years old student with an id number of " + student2.getId());
        System.out.println(student1.getName() + "'s intellect is " + student1.getIntellect());
        System.out.println(student2.getName() + "'s intellect is " + student2.getIntellect());
        student1.study();
        System.out.println(student1.getName() + "'s intellect is " + student1.getIntellect());
    }
}