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
			System.out.println("Invalid email");

		System.out.println("enter password");
		String password = scanner.next();
		pattern = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\\\S+$).{8,}$”");
		matcher = pattern.matcher(password);
		matches = matcher.find();
		if (matches)
			System.out.println("your password is valid");
		else
			System.out.println("Invalid password");

	}
}
