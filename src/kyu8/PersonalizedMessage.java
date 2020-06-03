package kyu8;

/**
 * https://www.codewars.com/kata/5772da22b89313a4d50012f7/train/java
 */
public class PersonalizedMessage {
    static String greet(String name, String owner) {
        // Add code here
        return name.equals(owner)? "Hello boss":"Hello guest";
    }
}
