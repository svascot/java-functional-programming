package main.java.optionals;

import java.util.Optional;
import java.util.function.Consumer;

public class _Optional {

    public static void main(String[] args) {
        String toEmail = null;

        Optional.ofNullable(toEmail)
                .ifPresentOrElse(message, error);

        toEmail= "svascot@gmail.com";

        Optional.ofNullable(toEmail)
                .ifPresentOrElse(message, error);

    }

    static Consumer<String> message =  email -> System.out.println("Sending email to: " + email);

    static Runnable error = () -> System.out.println("Cannot send message.");
}
