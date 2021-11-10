package Inheritance_Practice;

public class Dog {

     String Breed;
     String Color;
     double Weight;
     int Age;
     double calories;


    Dog( String Breed,String Color, double Weight, int Age){
        this.Breed= Breed;
        this.Color = Color;
        this.Weight= Weight;
        this.Age = Age;
    }

     void Bark(){
        System.out.println("Roof Roof!");
    }

     double CalculateCalories (double Weight, int Age){
     calories =Weight * Age;
        return calories;

    }

}
