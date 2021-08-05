package regular_expression;

public class RegularEXPIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="+1-(565)-#$$(677)-&(677)-(876)";
		
		String str2= str1.replace("+", "").replace("-","").replace("(","").replace(")","");
		System.out.println(str2);
		String pat="[^A-Za-z0-9]"; //Special characters apart from  A-Za-z0-9
		String str3=str1.replaceAll(pat, "");
		System.out.println(str3);
		String pat2="abc*";
		String str4="abcccccccccc";
		System.out.println(str4.matches(pat2));

	}

}
