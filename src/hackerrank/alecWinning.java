package hackerrank;

public class alecWinning {

	public static void main(String[] args) {
		String alec = "34KJ";
		String bob = "33KQ";
		System.out.println(countAlecWin(alec, bob));
	}


	public static int countAlecWin(String A, String B) {
        // write your code in Java SE 8
        char alec[] = A.toCharArray();
        char bob[] = B.toCharArray();
        int alecWin=0;        
        for(int i = 0; i< alec.length; ++i) {
            if(isAlecWin(alec[i], bob[i])) {
                ++alecWin;
                }    
        }
        return alecWin;
    }


	 public static boolean isAlecWin(char a, char b) {
	        int aValue = 0;
	        int bValue = 0;
	        
	        if(Character.isLetter(a)) {
	            switch(a) {
	                case 'A' : 
	                        aValue = 14;
	                        break;
	                case 'K' : 
	                        aValue = 13;
	                        break;        
	                case 'Q' : 
	                        aValue = 12;
	                        break;        
	                case 'J' : 
	                        aValue = 11;
	                        break;        
	                case 'T' : 
	                        aValue = 10;
	                        break;
	            }    
	        }
	        else {
	            aValue = Character.getNumericValue(a);
	        }
	 
	         if(Character.isLetter(b)) {
	            switch(b) {
	                case 'A' : 
	                        bValue = 14;
	                        break;
	                case 'K' : 
	                        bValue = 13;
	                        break;        
	                case 'Q' : 
	                        bValue = 12;
	                        break;        
	                case 'J' : 
	                        bValue = 11;
	                        break;        
	                case 'T' : 
	                        bValue = 10;
	                        break;
	            }    
	        }
	        else {
	            bValue = Character.getNumericValue(b);
	        }
	        
	        if(aValue>bValue) 
	            return true;
	        return false;
	    } 
}
