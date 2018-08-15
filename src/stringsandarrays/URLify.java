package stringsandarrays;

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
	
	//in place insertion
	public static String urlifyCharArray(char [] str, int trueLength) {
		int spaceCount = 0, index, i = 0;
		for(i = 0; i<trueLength; i++) {
			if(str[i] == ' ')
				spaceCount++;
		}
		index = trueLength + spaceCount*2;
		if(trueLength < str.length) 
			str[trueLength] = '\0';
		
		for(i = trueLength-1; i>0; i--) {
			if(str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index-3;
			}else {
				str[index-1] = str[i];
				index--;
			}
				
		}
		return str.toString();
		
	}
	
	public static void main(String[] args) {
		String str = "Mr Jhon Smith    "; 
		urlifyCharArray(str.toCharArray(), 13);
		System.out.println(urlifyString("Mr Jhon Smith    ", 13));
		System.out.println(urlifyString("ab c", 4));
		System.out.println(urlifyString(" ", 1));
		
		
	}

}
