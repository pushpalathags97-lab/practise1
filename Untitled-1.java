//abstraction
public abstract class Shape{
    //Encapsulation
    private String color;
    //constructor
    public Shape(String color){
        this.color
    }
    //get method
    public String getColor(){
        return color;
    }
    //Abstraction
    public abstract double calculateArea();
}
//constructor
public class Circle extends Shape{
    private double radius;
    public Circle(String color, double radius){
        super(color);
        this.radius=radius;
    }
    //polymorphism
    @Override
    public double calculateArea(){
        return Math.PI* radius*radius;
    }
}
//inheritance
public class Rectangle extends Shape{
    private double width;
    private double height;

    //constructor
    public Rectangle(String color, double width, double height){
        super((color));
        this.width=width;
        this.height=height;
    }
    //polymorphism
    @Override
    public double calculateArea(){
        return width*height;
    }
}
//main class
public class Practice{
    public static void main(String[] args){
    }
}