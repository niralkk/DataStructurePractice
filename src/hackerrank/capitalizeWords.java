package hackerrank;

public class capitalizeWords {

	public static void main(String[] args) {
		String str = "this is sentence with Small letters";
		System.out.println(capitalizeString(str));
	}
	
	
	public static String capitalizeString(String s) {
		StringBuilder result = new StringBuilder();
		String strArray[] = s.split(" ");
		for(int i = 0; i< strArray.length; i++) {
			char[] ch = strArray[i].toCharArray();
			
			if(!Character.isUpperCase(ch[0])) {
				ch[0] = (char) (ch[0] - 32);
			}
			
			strArray[i]= String.valueOf(ch);
			result.append(strArray[i]);
			if(i<strArray.length-1)
				result.append(" ");
		}
		
		return result.toString();	
	}

}
