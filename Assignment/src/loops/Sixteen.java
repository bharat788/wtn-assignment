package loops;

import java.util.Scanner;

public class Sixteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for ( int i = 1 ; i <=n ; i++ )
	       {
	           for ( int j = 1 ; j <= i ; j++ )
	           {
	                System.out.print("*");
	                
	           }
	           //For new line
	           System.out.println();
	       }
sc.close();
	}

}