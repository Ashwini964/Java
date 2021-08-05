package super_keyword;

public class B extends A {
int mum1=200;

public void doThis()
{
	System.out.println("Do this from B");
}
public void abc()
{
	//doThis();//Class B method will be executed
	super.doThis();// Parent class 'A' will be executed when we use super keyword
	System.out.println(num1);
	System.out.println("xyz");
}
}
