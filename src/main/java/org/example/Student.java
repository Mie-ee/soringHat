package org.example;

public class Student {
    private String name;
    private String house;
    private String bloodType;

    public Student(String name, String house, String bloodType) {
        this.name = name;
        this.house = house;
        this.bloodType = bloodType;
    }

    public String getName() {
        return name;
    }

    public String getHouse() {
        return house;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void sortingHat() {
        System.out.println();
        System.out.println(Color.back + this.name + Color.end);
        System.out.println("your house will be");
        switch (this.getHouse()) {
            case "Slytherin" -> System.out.println(Color.green + this.house + Color.end);
            case "Hufflepuff" -> System.out.println(Color.yellow + this.house + Color.end);
            case "Ravenclaw" -> System.out.println(Color.cyan + this.house + Color.end);
            default -> System.out.println(Color.red + this.house + Color.end);
        }
    }
}