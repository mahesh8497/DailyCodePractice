package Java8;

import java.util.HashMap;
import java.util.Map;

public class count_word_usingHashMap {
	public static void main(String[] args) {
        String input = "Hello world! Hello Java. This is a Java program. Java is fun!";
        
        // Remove punctuation and convert to lowercase
        input = input.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        
        // Split the string into words
        String[] words = input.split("\\s+");
        
        // Create a HashMap to store word counts
        Map<String, Integer> wordCountMap = new HashMap<>();
        
        // Count the words
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                // If the word is already in the map, increment its count
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // If the word is not in the map, add it with a count of 1
                wordCountMap.put(word, 1);
            }
        }
        
        // Print the word counts
        System.out.println("Word Counts:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
