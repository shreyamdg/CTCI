package stringsandarrays;

public class OneWay {
	public boolean solution(String str1, String str2) {
		int length1 = str1.length();
		int length2 = str2.length();

		if (Math.abs(length1 - length2) > 1) {
			return false;
		}

		int edits = 0;

		int i = 0, j = 0;
		while (i < length1 && j < length2) {
			if (str1.charAt(i) != str2.charAt(j)) {
				if (edits == 1)
					return false;
				// If length of one string is more, then only possible edit is to remove a character
				if (length1 > length2) {
					i++;
				} else if (length2 > length1) {
					j++;
				} else {
					i++;
					j++;
				}

				edits++;
			} else {
				i++;
				j++;
			}
		}

		return true;
	}
}
