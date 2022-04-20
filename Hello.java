class Hello
{
public void m1()
{
System.out.println("hello usha");
}
}
public class Welcome extends Hello
{
public void m2()
{
System.out.println("hai nagashree");
}
public static void main(String args[])
{
   Welcome wel=new Welcome();
   wel.m1();
   wel.m2();
   }
   }