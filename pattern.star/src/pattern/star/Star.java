package pattern.star;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of Lines");
		int p = sc.nextInt();
		
		for(int i=0; i<p; i++) {
			
			for(int j=p-i; j>0; j--) {
				System.out.print(" ");
			}
			//System.out.println("");
			for(int k=0; k<i;k++) {
				System.out.print("* ");
				
			}
			System.out.println("");
			
			
		}
	for(int m=1; m<p; m++) {
			
			for(int j=p+m; j>p; j--) {
				System.out.print(" ");
			}
			
			for(int k=p; k>m; k--) {
				System.out.print("* ");
				
			}
			System.out.println("");
			
			
		
		
	}

	}

}
