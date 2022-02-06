
package com.mphasis;

import java.util.Scanner;

public class EmailValidation {
	
	public static void main(String[] args) {
		
		Boolean flag = false;
		String emails[] = new String[8];
		
		emails[0] = "vish123@gmail.com";
		emails[1] = "katu789@gmail.com";
		emails[2] = "rudrafolern@gmail.com";
		emails[3] = "divya1@gmail.com";
		emails[4] = "trilok5410@gmail.com";
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		while (true) {
			flag = false;
			System.out.println("Enter your Email: ");
			String userEmail = sc.next();

			for (String email : emails) {
				if (userEmail.matches(email)) {
					System.out.println("Welcome back " + userEmail);
					flag = true;
					break;
				}
			}
			
			
			if (flag == false) {
				System.out.println("Invalid User");
			}
			System.out.println("Do you want to continue" +"... 1.YES"
					+ " ...2.NO");
			choice = sc.nextInt();
			
			
			if (choice == 2) {
				break;
			}
		}
		
	}

}
