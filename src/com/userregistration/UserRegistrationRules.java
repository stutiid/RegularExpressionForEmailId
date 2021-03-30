package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*@Description- class checks the entries for a user registration whether
 * a name,email or password is valid or not for that we are checking
 *  each entry one by one
 *@Parameter- User first and last name, email-id and password*/

public class UserRegistrationRules {
	public static void main(String args[]) {
		System.out.println("welcom to user registration page");

		Scanner scanner = new Scanner(System.in);

		/* Checking validity of first name */
		System.out.println("enter your first name");
		String firstName = scanner.next();
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2}+");
		Matcher matcher = pattern.matcher(firstName);
		boolean matches = matcher.find();
		if (matches)
			System.out.println("your first name is valid");
		else
			System.out.println("please enter a valid first name");

		/* Checking validity of last name */
		System.out.println("enter your last name");
		String lastName = scanner.next();
		matcher = pattern.matcher(lastName);
		matches = matcher.find();
		if (matches)
			System.out.println("your last name is valid");
		else
			System.out.println("please enter a valid last name");

		/* checking email-id validity */
		System.out.println("enter your email");
		String email = scanner.next();
		pattern = Pattern.compile(
				"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
				Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(email);
		matches = matcher.find();
		if (matches)
			System.out.println("your email is valid");
		else
			System.out.println("please enter a valid email");

		/* checking validity of mobile number */
		System.out.println("enter your mobile number");
		String number =scanner.next();
		pattern = Pattern.compile("\\\\d{2}[\\\\s]?\\\\d{10}");//("^([1-9]{1,2}[\s]?)?([1-9]{1})[0-9]{9}$");		matcher = pattern.matcher(number);
		matches = matcher.find();
		if (matches)
			System.out.println("your mobile number is valid");
		else
			System.out.println("please enter a valid mobile number");

	}
}
