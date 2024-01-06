package org.example.Project2;

public class Car {
    /*
        Create a Class Car that would have the following fields: carPrice and color
    and method calculateSalePrice() which should be returning a price of the
    car.
    Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight
    and has its own implementation of calculateSalePrice() method in which
    returned price is calculated as following: if weight>2000 then returned price
    car should include 10% discount, otherwise 20% discount.
    The Sedan class has field as length and also does it is own implementation
    of calculateSalePrice(): if length of sedan is >20 feet then returned car price
    should include 5% discount, otherwise 10% discount
         */
    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public Car(double carPrice) {
        this.carPrice = carPrice;
    }

    public double calculateSalePrice() {
        return carPrice;
    }
}
    class  Sedan extends Car{
        float length;
        public Sedan(double carPrice, float length ){
            super(carPrice);
            this.length = length;
        }
        public double calculateSalePrice(){
            if(length>20){
                return carPrice - ((carPrice/100)*5);
            }else{
                return carPrice-((carPrice/100)*10);
            }
        }
    }


   class Truck extends Car{
    float weight;
    public Truck(double carPrice,float weight){
        super(carPrice);
        this.weight=weight;
    }
    public double calculateSalePrice(){
        if(weight>2000){
            return carPrice-((carPrice/100)*10);
        }else{
            return carPrice-((carPrice/100)*20);
        }
    }

   }

   class CarTester{
       public static void main(String[] args) {
           Car[] car = {new Truck(30000,2500),new Sedan(25000,25)};

       for(Car c: car){
           System.out.println(c.calculateSalePrice());
       }}
   }
