package org.example.Project2;

public class ShapeTester {
    public static void main(String[] args) {
        Shape sh=new Circle();

        Circle s = new Circle();
        double r = s.calculateArea(10);
        double p = s.calculatePerimeter(10);
        System.out.println("The Area of the Circle is : "+ r);
        System.out.println("The circumference of the circle is : "+ p);

        Shape sq= new Square();
        double sa= sq.calculateArea(20);
        double sp=sq.calculatePerimeter(20);
        System.out.println("The Area of a Square is : "+sa);
        System.out.println("The perimeter of a square is : "+sp);
    }
}
