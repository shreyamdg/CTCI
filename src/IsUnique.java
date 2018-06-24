
public class IsUnique {
	public static boolean isUnique(String str) {
		str = str.toLowerCase().replaceAll("\\s+", "");
		StringBuilder newStr = new StringBuilder();
		for (char ch : str.toCharArray()) {
			if (newStr.indexOf(Character.toString(ch)) == -1) {
				newStr.append(ch);
			} else
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(isUnique("shreyamM"));
		System.out.println(isUnique("shreyam"));
		System.out.println(isUnique("abcd efgh xyz"));
		System.out.println(isUnique("       "));
		System.out.println(isUnique("shreyamM      ree"));
	}
}
