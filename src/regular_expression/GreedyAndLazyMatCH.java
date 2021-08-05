package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyAndLazyMatCH {

	public static void main(String[] args) {
		String str1="aaaXXabcdefYYXXabcdefYYXXabcdefYYXXabcdefYYsdfghjkl";

	//String patt="XX.*YY";        //Greedy Match .*
	String patt="XX.*?YY";          //Non Greedy where we have a end point - .*?
	Pattern p=Pattern.compile(patt);
	Matcher m=p.matcher(str1);
	
	System.out.println(m.results().count());
	m.reset();
	while(m.find())
	{
		System.out.println("starts At"+m.start());
		System.out.println(m.group());
	}
	
	}

}