package task15;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        // Написать программу проверяющую, что строка не null и не пуста,
        // используя метод and() функционального интерфейса Predicate.
        String str = "";

        Predicate<String> notNullPredicate = str1 -> str1 != null;
        Predicate<String> notEmptyPredicate = str2 -> !str2.isEmpty();

        boolean isValid = notNullPredicate.and(notEmptyPredicate).test(str);

        if (isValid) {
            System.out.println("String is not null and not empty.");
        } else {
            System.out.println("String is either null or empty.");
        }

    }
}
