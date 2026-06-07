package Shape;

public class Rectangle extends Shape {
    double length;
    double width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double area(){
        return this.length * this.width;
    }
}
