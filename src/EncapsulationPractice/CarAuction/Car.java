package EncapsulationPractice.CarAuction;

public class Car {
    private String Make;
    private String Model;
    private double Price;
    private int Year;

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }



    public String getMake(){
        return Make;
    }

    public void setMake(String Make) {
       this. Make = Make;
    }

    public String getModel(){
        return Model;
    }

    public void setModel(String Model){
        this. Model= Model;
    }
    public double getPrice(){
        return Price;
    }
    public void setPrice (double Price){
        this.Price=Price;
    }

}
