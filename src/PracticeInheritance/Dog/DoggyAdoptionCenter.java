package PracticeInheritance.Dog;

public class DoggyAdoptionCenter extends Dog {
    public DoggyAdoptionCenter(String breed, String name, String color, double weight, int age) {
        super(breed , name , color, weight, age);


    }

    public static void main(String[] args) {
        DoggyAdoptionCenter d = new DoggyAdoptionCenter("Yorkie", "Fendy","Black and Grey",70.2, 2 );

        System.out.println(d.breed +" : "+ d.name +" : "+ d.color +" : "+d.weight +" : "+ d.age );


        System.out.println("This dog should eat " + d.calories(70.2, 2) + " calories a day to lose weight");












    }




}







