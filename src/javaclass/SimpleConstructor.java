package javaclass;

public class SimpleConstructor {

	
		   String name;
		   
		   SimpleConstructor(){
		      this.name = "Welcome To Java";
		   }
		   public static void main(String[] args) {
			   SimpleConstructor obj = new SimpleConstructor();
		      System.out.println(obj.name);
		   }
		

}
