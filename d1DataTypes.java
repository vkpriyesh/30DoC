import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		int i = 4;
		double d = 6.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		//Declaring second integer, double, and string:
		int myInt;
		double myDouble;
		String myString;

		//Reading and saving from Scanner inputs:
		myInt = scan.nextInt();
		myDouble = scan.nextDouble();
		scan.nextLine(); //for reading from the end of the current line to the starting of next line = empty string :p
		myString = scan.nextLine(); //this gives the actual string that is inputted in the console

		//printing begins:
		System.out.println(i + myInt);
		System.out.println(d + myDouble);
		System.out.println(s + myString);


		//Preventing resource leak:
		scan.close();
		}
}
