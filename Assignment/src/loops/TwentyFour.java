package loops;
import java.util.Arrays;
import java.util.Scanner;
public class TwentyFour {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(" two Min"+a[0]+" "+a[1]);
		System.out.println(" two Max"+a[n-1]+" "+a[n-2]);
sc.close();
	}

}