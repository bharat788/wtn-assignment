package StringHandsOn;
import java.util.Scanner;
public class Ideone {
	 public static void main (String[] args) throws java.lang.Exception
	    {
	      
	        Scanner scanner = new Scanner(System.in);
	        String a = scanner.next();
	        String b = scanner.next();
	        if(a.length() > b.length())
	        System.out.println(b+a+b);
	        else
	        System.out.println(a+b+a);
	        scanner.close();
	    }
}
