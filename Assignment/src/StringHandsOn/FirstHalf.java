package StringHandsOn;
import java.util.Scanner;
public class FirstHalf {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int x = str.length();
        if(x%2==0) {
        	 System.out.println(str.substring(0, x/2)); 
        }
        else {
        	System.out.println("Null"); 
        }
        scan.close();
    }
}
