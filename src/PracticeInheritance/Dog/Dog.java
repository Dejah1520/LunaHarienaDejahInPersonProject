package PracticeInheritance.Dog;

public class Dog {

    String breed;
    String name;
    String color;
    double weight;
    int age;



    public Dog (String breed, String name, String color, double weight, int age) {

        this.breed = breed;
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public double calories (double weight, int age){
        double calories = weight * age;
        return calories;
    }



}
