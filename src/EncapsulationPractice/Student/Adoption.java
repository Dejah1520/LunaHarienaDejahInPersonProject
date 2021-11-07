package EncapsulationPractice.Student;

public class Adoption {
    public static void main(String[] args) {

        DogAdoption adopt = new DogAdoption();

        adopt.setBreed("Yorkie");
        adopt.setAge(2);
        adopt.setPrice(1589.59);
        System.out.println(adopt.getBreed());
        System.out.println(adopt.getAge());
        System.out.println(adopt.getPrice());



    }
}
