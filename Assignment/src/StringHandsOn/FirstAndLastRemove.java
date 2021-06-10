package StringHandsOn;

import java.util.Scanner;

public class FirstAndLastRemove {
	public static String removeFirstandLast(String str)
    {
  
        str = str.substring(1, str.length() - 1);
  
     
        return str;
    }
  
  
    public static void main(String args[])
    {
      
     
  Scanner sc=new Scanner(System.in);
  System.out.println("enter string : ");
  String str=sc.nextLine();
        
        System.out.print(removeFirstandLast(str));
        sc.close();
    }

}
