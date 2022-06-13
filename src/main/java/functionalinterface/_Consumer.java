package main.java.functionalinterface;

import java.lang.constant.Constable;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        Customer camila = new Customer("Camila", "+1999999999");

        sayHi.accept(camila);
        message.accept(camila, false);

    }

    // Takes 1 argument and produce no result.
    static Consumer<Customer> sayHi = customer -> System.out.println("Hi " + customer.customerName);

    // Takes 2 arguments.
    static BiConsumer<Customer, Boolean> message = (customer, showPhoneNumber) ->
            System.out.println("Hi " + customer.customerName + " thanks for registering phone number " +
                    (showPhoneNumber ? customer.customerPhoneNumber : "**********"));


    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
