package org.example.Project2;
/*
Create an Interface 'Shape' with undefined methods as calculateArea and
calculatePerimeter. Create 2 classes Circle & Square that implements
functionality defined in the Shape Interface. Test your code
 */

public interface Shape {
    double calculateArea(double num);

    double calculatePerimeter(double num);

}

class Circle implements Shape {
    public double calculateArea(double num){
        return (3.14*num*num);
    }
    public double calculatePerimeter(double num){
        return (2*3.14*num);
    }

}

class Square implements Shape{

    @Override
    public double calculateArea(double num) {
        return (num*num);
    }

    @Override
    public double calculatePerimeter(double num) {
        return (4*num);
    }
}

