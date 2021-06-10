package StringHandsOn;

import java.util.Scanner;

public class Concatenate {
	public static void main(String[] args) {
		String str1; 
		String str2; 
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a string1:");
	      str1 = sc.nextLine();
	      System.out.println("Enter a string2:");
	      str2 = sc.nextLine();
if(str1.substring(str1.length()-1).equalsIgnoreCase(str2.substring(0,1)) )
		  System.out.println(  str1.concat( str2.substring(1, str2.length())).toLowerCase() );
		   else
	  System.out.println(  str1.concat( str2) );
sc.close();
	}
}