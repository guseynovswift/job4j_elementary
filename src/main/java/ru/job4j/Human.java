package ru.job4j;

class Home1 {
    String address;
    Float ploshad;
    Integer rooms;

    public Home1(String address, Float ploshad, Integer rooms) {
        this.address = address;
        this.ploshad = ploshad;
        this.rooms = rooms;
    }

    void getHome() {
        System.out.println("Address doma: " + address + " Ploshad doma:" + ploshad + " Kolichestvo komnat: " + rooms);
    }
}

class Car {
    String nameCar;
    Integer yearCar;
    String numberCar;

    public Car(String nameCar, Integer yearCar, String numberCar) {
        this.nameCar = nameCar;
        this.yearCar = yearCar;
        this.numberCar = numberCar;
    }

    public void getCar() {
        System.out.println("Model: " + nameCar + " God mashini: " + yearCar + " Nomernoy znak: " + numberCar);
    }
}

public class Human {
    String name;
    Integer age;

    Home1 myHome;

    Car myCar;

    Human(String name, Integer age, Home1 myHome, Car myCar) {
        this.name = name;
        this.age = age;
        this.myHome = myHome;
        this.myCar = myCar;
    }

    void getHuman() {
        System.out.println("My name: " + name + " Age: " + age);
        myCar.getCar();
        myHome.getHome();
    }

}

class Dannie {
    public static void main(String[] args) {
        Human ali = new Human("Ali", 22, new Home1("Sarakul", 50.5f, 5), new Car("Matiz", 2009, "B245EA"));
        ali.getHuman();
    }
}