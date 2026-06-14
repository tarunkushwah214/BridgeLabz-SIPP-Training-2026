import java.util.*;

public class SpyAgency {

    // Reverse Message
    public static String reverseMessage(String msg) {
        return new StringBuilder(msg).reverse().toString();
    }

    // Palindrome Check
    public static boolean isPalindrome(String msg) {
        String reversed = reverseMessage(msg);
        return msg.equalsIgnoreCase(reversed);
    }

    // Count Vowels and Consonants
    public static void countVowelsConsonants(String msg) {
        int vowels = 0, consonants = 0;

        msg = msg.toLowerCase();

        for (char ch : msg.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // Anagram Check
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    // First Non-Repeating Character
    public static Character firstNonRepeating(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }

    public static void main(String[] args) {

        String message = "madam";

        System.out.println("Original Message: " + message);
        System.out.println("Reversed Message: " + reverseMessage(message));

        if (isPalindrome(message))
            System.out.println("Palindrome: Yes");
        else
            System.out.println("Palindrome: No");

        countVowelsConsonants(message);

        String intercept1 = "listen";
        String intercept2 = "silent";

        if (isAnagram(intercept1, intercept2))
            System.out.println(intercept1 + " and " + intercept2 + " are Anagrams");
        else
            System.out.println(intercept1 + " and " + intercept2 + " are Not Anagrams");

        String log = "swiss";

        Character result = firstNonRepeating(log);

        if (result != null)
            System.out.println("First Non-Repeating Character: " + result);
        else
            System.out.println("No Non-Repeating Character Found");
    }
}