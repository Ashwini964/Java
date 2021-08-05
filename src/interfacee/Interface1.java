package interfacee;

public interface Interface1 {//Inside Interface all methods are by default abstract (except the static and default)so no need to add abstract keyword 
 static final int  a=200; //only static  data members are allowed
	
	 void doThis();

 static void ijk()
 {
	 System.out.println("Static method"); //cannot be override
 }
  default void xyz()
  {
	  System.out.println("Default method xyz"); //can be override,sub class can implement with same method
  }
  
}

//Everything in interface is by default considered as public.
