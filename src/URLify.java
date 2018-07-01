
public class URLify {
	
	public static String urlifyString(String str, int trueLength) {
		str= str.trim();
		StringBuilder newStr = new StringBuilder();
		for(char ch : str.toCharArray()) {
			if(ch == ' ') {
				newStr.append("%20");
			}else {
				newStr.append(ch);
			}	
		}
		String s = newStr.toString();
		return s;
	}
	
	public static void main(String[] args) {
		System.out.println(urlifyString("Mr Jhon Smith   ", 13));
		System.out.println(urlifyString("ab c", 4));
		System.out.println(urlifyString(" ", 1));
		
		
	}

}
