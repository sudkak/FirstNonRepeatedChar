
public class NonRepChar {
	
	public static void main(String args[]) {
		String givenStr = "satishiati";
		int len = givenStr.length();
		char[] charArray = new char[len];
		//boolean[] boolArray = new boolean[len];
		int repeated ;
	    
		for(int i=0; i < givenStr.length(); i++) {
			charArray[i] = givenStr.charAt(i); 
				}
		
		for(int i=0; i< charArray.length ; i++) {
			 repeated = 0;
			for(int j=0;j<charArray.length;j++){
				if(i != j && charArray[i] == charArray[j]){
					repeated = 1;
					break;
						 
					 }
					}
				
			 if(repeated == 0) {
				 
				 System.out.println(charArray[i]);	
				 break;
			 }

			
			
			
			}
		
		}
		
	
}
