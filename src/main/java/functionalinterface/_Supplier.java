package main.java.functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getDBConnectionsUrls.get());
    }

    // Get a result of the type of the given argument.
    static Supplier<List<String>> getDBConnectionsUrls = () -> List.of("jdbc://localhost:5432/users","jdbc:localhost:5432/customer");
}
