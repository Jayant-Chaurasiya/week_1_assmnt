package ifelse;

import java.util.Scanner;

public class TaxCalculation {
	static String gender;
	static int income;
	static float tax;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome To Tax Calculation Service ");
		System.out.println("Please enter your Gender : Male/Female ");
		gender = sc.nextLine();
		System.out.println("Enter your Income Amount : ");
		income = sc.nextInt();

		if (gender.equals("female") || gender.equals("Female")) {
			if (income < 0) {
				System.out.println("Invalid income");
				System.exit(0);
			} else if (income == 0 || income <= 190000) {
				System.out.println("No Tax ");
			} else if (income >= 190001 || income <= 500000) {
				tax = income * 10 / 100;
				System.out.println("Tax income : " + tax);
			} else if (income >= 500001 || income <= 800000) {
				tax = income * 20 / 100;
				System.out.println("Tax income : " + tax);
			} else if (income > 800000) {
				tax = income * 30 / 100;
				System.out.println("Tax income : " + tax);
			}

		} else if (gender.equals("male") || gender.equals("Male")) {
			if (income < 0) {
				System.out.println("Invalid income");
				System.exit(0);
			} else if (income == 0 || income <= 180000) {
				System.out.println("No Tax ");
			} else if (income >= 180001 || income <= 500000) {
				tax = income * 10 / 100;
				System.out.println("Tax income : " + tax);
			} else if (income >= 500001 || income <= 800000) {
				tax = income * 20 / 100;
				System.out.println("Tax income : " + tax);
			} else if (income > 800000) {
				tax = income * 30 / 100;
				System.out.println("Tax income : " + tax);
			}

		}

		System.out.println("Thanks For Using this app");

	}

}
