package Base;

import java.util.Scanner;

public class polindrom_number {

	public static void main(String[] args) {
		
	for(int i=0;i<3;i++) {	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a nuber: ");
	int num=sc.nextInt();
	int org_num=num;
	int rev=0;
	
	while(num!=0) {
		
	rev=rev*10 + num%10;
	num=num/10;	
	}
		
	if(org_num==rev) {
		
		
		
		System.out.println(org_num+ "polindrom number");
	}else {
		System.out.println(org_num+" not polindrome number");
	}
		
	}
		
		
		
		
		

	}

}
