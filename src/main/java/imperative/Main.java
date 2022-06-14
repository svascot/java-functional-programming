package main.java.imperative;

import main.java.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static main.java.Person.Gender.FEMALE;
import static main.java.Person.Gender.MALE;

public class Main {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", MALE, 20),
                new Person("Maria", FEMALE, 25),
                new Person("Aisha", FEMALE, 18),
                new Person("Alex", MALE, 28),
                new Person("Alice", FEMALE, 30)
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
}
