package org.example.Project2;

public abstract class Marks {
    /*
    We have to calculate the average of marks obtained in three subjects by
   student A and by student B. Create class 'Marks' with an abstract method
   'getPercentage' that will return the average percentage of marks. Provide
   implementation of abstract methods in classes 'A' and 'B'. The constructor of
   student A takes the marks in three subjects as its parameters and the marks
   in four subjects as its parameters for student B. Test your code
     */

    private double math;
    private double science;
    private double language;
    private double english;

    public abstract double getPercentage();

    // Protected getters for subclasses
    protected double getMath() { return math; }
    protected double getScience() { return science; }
    protected double getLanguage() { return language; }
    protected double getEnglish() { return english; }

    public Marks(double math, double english, double science, double language) {
        this.math = math;
        this.english = english;
        this.science = science;
        this.language = language;
    }
    public Marks(double math, double english,  double language) {
        this.math = math;
        this.english = english;
        this.language = language;
    }
}

class A extends Marks {
    public A(double math, double english, double language) {
        super(math, english, language); // Assuming Science is not applicable for class A
    }

    public double getPercentage() {
        return (getMath() + getEnglish() + getLanguage()) / 3;
    }
}

class B extends Marks {
    public B(double math, double english, double science, double language) {
        super(math, english, science, language);
    }

    public double getPercentage() {
        return (getMath() + getEnglish() + getScience() + getLanguage()) / 4;
    }
}

// Testing the code
 class TestMarks {
    public static void main(String[] args) {
        A studentA = new A(85, 90, 95);
        B studentB = new B(80, 85, 90, 95);

        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}





