package stringsandarrays;

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
	
	public static boolean isUniquewithBoolean(String str) {
		
		boolean []checkStr = new boolean[128];
		for(int i = 0; i< str.length(); i++) {
			if(checkStr[str.charAt(i)]) {
				return false;
			}
			checkStr[str.charAt(i)] = true;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isUnique("shreyamM"));
		System.out.println(isUnique("shreyam"));
		System.out.println(isUnique("abcd efgh xyz"));
		System.out.println(isUnique("       "));
		System.out.println(isUnique("shreyamM      ree"));
		
		System.out.println(("--------With isUniquewithBoolean ------------"));
		
		System.out.println(isUniquewithBoolean("shreyamM"));
		System.out.println(isUniquewithBoolean("shreyam"));
		System.out.println(isUniquewithBoolean("abcd efgh xyz"));
		System.out.println(isUniquewithBoolean("       "));
		System.out.println(isUniquewithBoolean("shreyamM      ree"));
		
	}
}
