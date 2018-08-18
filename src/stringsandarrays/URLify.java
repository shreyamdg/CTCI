package stringsandarrays;

import java.util.Arrays;

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
	public static String urlifyCharArray(String str, int len) {
		int countSpace =0;
		for(int i =0; i<len; i++) {
			if(str.charAt(i) == ' ') {
				countSpace++;
			}
		}
		
		int trueLength = len + (2*countSpace) -1;
		char [] arr = str.toCharArray();
		for(int i = len-1; i >= 0; i--) {
			if(arr[i] != ' ') {
				arr[trueLength] = arr[i];
				trueLength--;
			}else {
				arr[trueLength] = '0';
				arr[trueLength-1] = '2';
				arr[trueLength -2] = '%';
				trueLength -= 3;
			}
		}
		
		return Arrays.toString(arr);
	}
	
	public static void main(String[] args) {
		String str = "Mr Jhon Smith    "; 
		urlifyCharArray(str, 13);
		System.out.println(urlifyString("Mr Jhon Smith    ", 13));
		System.out.println(urlifyString("ab c", 4));
		System.out.println(urlifyString(" ", 1));
		
		
	}

}
