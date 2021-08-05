package regular_expression;

public class RegExp_program1 {

	public static void main(String[] args) {

String patt="www//.(google|yahoo|gamil)//.(com|in)";
//String str1="wwwayahoo.com"; //  TRUE  --dot meaning--Accept any single character. 
String str1="www.yahoo.com";  //So add Escape sequence // before DOTs
System.out.println(str1.matches(patt));

	}

}
