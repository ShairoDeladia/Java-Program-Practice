public class Student {
    
    private String name;
    static int nextId = 1;
    private int id;
    private int age;
    private int intellect;

    Student(String name, int age){
        this.name = name;
        this.id = nextId;
        nextId++;
        this.age = age;
        this.intellect = 0;
    }

    void study(){
        System.out.println(this.name + " is now studying.");
        this.intellect++;
    }

    String getName(){
        return this.name;
    }

    int getId(){
        return this.id;
    }

    int getAge(){
        return this.age;
    }

    int getIntellect(){
        return this.intellect;
    }

}
