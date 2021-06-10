package Overriding;
import java.util.*;
class fruit

{    

  protected char name, taste, size  ;

 Scanner sc = new Scanner ( System. in );

 

  public void eat ( ) // overridden method.

 {

       Scanner sc = new Scanner(System.in);

       System. out. println ( "enter the name of the fruit " ) ;

       name = sc.next().charAt(0);

       System. out. println ( " please provide the taste of the fruit " ) ;

       taste = sc.next().charAt(0) ;

       System. out. println ( " Name of the fruit is: " + name ) ;

       System. out. println ( " Taste of the fruit is: " + taste ) ;  
sc.close();
    }
  

}

class apple extends fruit

{

  public void eat( ) // overriding method

  {

       System. out. println ( " Name of the fruit is Apple " ) ;

       System. out. println ( " Taste of the fruit is sweet " ) ;

    }  

}

class orange extends fruit

{

   public void eat ( ) // overriding method

  {

       System. out. println ( " Name of the fruit is Orange " ) ;

       System. out. println ( " Taste of the fruit is sour " ) ;

    }

}
public class AppleOrange {
	public static void main(String[] args)
	{
	   apple A = new apple() ;
	   A.eat() ;
	   orange O = new orange() ;
	   O.eat() ;
	}
}
