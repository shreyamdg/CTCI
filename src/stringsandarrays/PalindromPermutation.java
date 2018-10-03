package stringsandarrays;

public class PalindromPermutation {
	//Time complexity : O(n). We traverse over the string s of length n once only.
	//Space complexity : O(128). A map of constant size(128) is used.
	public static boolean canPermutePalindrome(String str) {
		String s = str.toLowerCase();
		int[] map = new int[128];
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				continue;
			}
			map[s.charAt(i)]++;
			if (map[s.charAt(i)] % 2 == 0)
				count--;
			else
				count++;
		}
		return count <= 1;
	}
}
