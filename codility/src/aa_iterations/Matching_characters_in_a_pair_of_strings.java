package aa_iterations;
import java.util.HashMap;
import java.util.Map;

public class Matching_characters_in_a_pair_of_strings {

	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "b";

		Map<Character, Integer> charCount = new HashMap<>();
		int count = 0;

		// Count characters in str1
		for (char c : str1.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}

		// Check for matching characters in str2
		for (char c : str2.toCharArray()) {
			if (charCount.containsKey(c) && charCount.get(c) > 0) {
				count++;
				charCount.put(c, charCount.get(c) - 1);
			}
		}
		System.out.println("Number of matching pairs: " + count);
	}
}
