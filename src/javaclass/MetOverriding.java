package javaclass;

 class Sample3 {

	   public void disp(char c, int num)
	   {
	       System.out.println("I’m the first definition of method disp");
	   }
	   public void disp(int num, char c)
	   {
	       System.out.println("I’m the second definition of method disp" );
	   }
	}
public class MetOverriding
	{
	   public static void main(String args[])
	   {
		   Sample3 obj = new Sample3();
	       obj.disp('x', 51 );
	       obj.disp(52, 'y');
	   }
	}
