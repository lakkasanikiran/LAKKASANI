package Base;

public class Polindrom {

	public static void main(String[] args) {
	
		
		String k="MADAM";
		 String polindrome="";
		
			for(int i=k.length()-1;i>=0;i--) {
				polindrome=polindrome+(k.charAt(i));
				
				
			if(polindrome.equals(k)) {
				System.out.println("given String is polindrome");
			}else {
				System.out.println("given String not a polindrome");
			}
				
				
				
				
			}
		
		
		
		
		

	}

}
