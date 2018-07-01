import java.util.HashMap;

public class CheckPermutation {

	// Considering only a-z, LowerCase = UpperCase and whitespace is insignificant
	// but a Space between a String is not
	public static boolean checkPerm(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}

		HashMap<Character, Integer> charCount = new HashMap<>();
		for (char ch : s.toLowerCase().toCharArray()) {
			if (!charCount.containsKey(ch)) {
				charCount.put(ch, 1);
			} else {
				charCount.put(ch, charCount.get(ch) + 1);
			}
		}

		for (char ch : t.toLowerCase().toCharArray()) {
			if (!charCount.containsKey(ch)) {
				charCount.put(ch, 1);
			} else {
				charCount.put(ch, charCount.get(ch) - 1);
			}
		}

		for (Character ch : charCount.keySet()) {
			if ((charCount.get(ch) != 0)) {
				return false;
			}
		}
		return true;
	}
	
	//No whitespace and spaces allowed. Only chars

	public static boolean checkChar(String s, String t) {
		
		int [] chars = new int[26];
		
		for(char ch: s.toLowerCase().toCharArray()) {
			chars[ch-'a']++;
		}
		
		for(char ch: t.toLowerCase().toCharArray()) {
			chars[ch-'a']--;
		}
		
		for(int i : chars) {
			if(i != 0)
				return false;
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		System.out.println(checkPerm("ab cd", "d acb"));
	}

}
