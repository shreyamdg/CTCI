package stringsandarrays;

public class CompressedString {
	public String compress(String str) {
		StringBuilder compressed = new StringBuilder();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			count++;

			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
				compressed.append(str.charAt(i));
				if (count != 1)
					compressed.append(count);
				count = 0;
			}
		}

		return compressed.length() < str.length() ? compressed.toString() : str;
	}
}
