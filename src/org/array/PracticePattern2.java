package org.array;
//1
//12
//123
public class PracticePattern2 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 3; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print(j+"\t");
			}
			System.out.println(" ");
		}
	}
	
}
