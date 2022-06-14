package main.java.streams;

import main.java.Person;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static main.java.Person.Gender.*;

public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE, 20),
                new Person("Maria", FEMALE, 25),
                new Person("Aisha", FEMALE, 18),
                new Person("Alex", MALE, 28),
                new Person("Alice", FEMALE, 30),
                new Person("Lash", PREFER_NOT_TO_SAY, 23)
        );

        var youngerPerson = people.stream()
                .filter(person -> FEMALE.equals(person.getGender()))
                .min(Comparator.comparing(Person::getAge))
                .map(Person::getName)
                .orElse(null);

        System.out.println("Younger person : " + youngerPerson);

        var genders = people.stream().map(Person::getGender).collect(Collectors.toSet());

        System.out.println(genders);

    }
}
