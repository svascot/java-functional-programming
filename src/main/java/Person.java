package main.java;

public class Person {
    private final String name;
    private final Gender gender;
    private final Integer age;

    public Person(String name, Gender gender, Integer age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }


    public enum Gender {
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}