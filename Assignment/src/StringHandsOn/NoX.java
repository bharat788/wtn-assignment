package StringHandsOn;
import java.util.Scanner;
public class NoX {
	
	public static String withoutX2(String str) {

		  if (str.length() < 2)
		     return "";
		  else if (str.charAt(0) == 'x' && str.charAt(1) == 'x')
		     return str.substring(2);
		  else if (str.charAt(0) == 'x')
		     return str.substring(1);
		  else if (str.charAt(1) == 'x')
		     return str.substring(0,1) + str.substring(2);
		  else
		     return str;
		}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	  System.out.println("enter string : ");
	  String str=sc.nextLine();
	        
	      System.out.print(withoutX2(str));
	        sc.close();
}
}




