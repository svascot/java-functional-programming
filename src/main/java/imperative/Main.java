package main.java.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static main.java.imperative.Main.Gender.FEMALE;
import static main.java.imperative.Main.Gender.MALE;

public class Main {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );

        // Imperative approach
        System.out.println("Imperative approach");
        // Print all females

        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (FEMALE.equals(person.getGender())) {
                females.add(person);
            }
        }

        for (Person person : females) {
            System.out.println(person);
        }

        // Declarative approach
        System.out.println("Declarative approach");
        // Print all females

        List<Person> femalesTwo = people.stream()
                .filter(person -> FEMALE.equals(person.getGender()))
                .collect(Collectors.toList());

        femalesTwo.forEach(System.out::println);

        // Understanding
        Predicate<Person> predicate = person -> FEMALE.equals(person.getGender());
        people.stream()
                .filter(predicate)
                .forEach(System.out::println);


    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
