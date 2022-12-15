package Base;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		
		
		int n;
		for(int i=0;i<=3;i++) {
		System.out.println("enter the value: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println("number Even");
			
		}else {
			System.out.println("number Odd");
		}
		}
		
		
		
		
		

	}

}
