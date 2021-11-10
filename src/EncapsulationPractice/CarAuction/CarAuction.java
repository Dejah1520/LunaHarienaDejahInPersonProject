package EncapsulationPractice.CarAuction;


import EncapsulationPractice.CarAuction.Car;

public class CarAuction {

    public static void main(String[] args) {

        Car car = new Car();

        car.setMake("Chevy");
        car.setModel("Cruze");
        car.setPrice(10_000.00);
        car.setYear(2016);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println(car.getPrice());






    }
}
