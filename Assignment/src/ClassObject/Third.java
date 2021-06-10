package ClassObject;

class Third{
    String name;
    double height,weight;
    Third(double w,double h)
    {
        weight=w;
        height=h;
    }
    double BMI()
    {
       
       return ((weight/(height*height))*703);
    }
}
    class Patients
{
  public static void main (String[] args)
 {
  Third p=new Third(75,156);
  System.out.println("The BMI:"+p.BMI());
  
 }
}