package EncapsulationPractice.Student;

public class Student {


    private String name;
    private int age;


    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
      this.age = age;
      if (age > 5){
          age += 5;
      }
    }
    public void setName(String name) {

        this.name = name;
    }








}
