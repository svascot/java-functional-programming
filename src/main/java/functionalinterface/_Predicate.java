package main.java.functionalinterface;

import javax.sound.midi.Soundbank;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid.and(contaninsNumber3).test("+1999999999"));
        System.out.println(isPhoneNumberValid.and(contaninsNumber3).test("+1399999999"));
    }

    // Takes 1 argument and evaluate the predicate to return a boolean value.
    static Predicate<String> isPhoneNumberValid = phoneNumber -> phoneNumber.length() == 11;

    static Predicate<String> contaninsNumber3 = phoneNumber -> phoneNumber.contains("3");
}
