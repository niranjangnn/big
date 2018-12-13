package test;

public class sql {
	public static void main (String args[]) {
		String s1="abcdef";
		String s="abcd";
		int i;
		int a=s1.length();
		System.out.println("print a"+a);
		for(i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			System.out.println(c);
		}
		char[] c=s1.toCharArray();
		System.out.println(c);
		String s2=s1.toUpperCase();
		System.out.println(s2);
		String s3=s1.toLowerCase();
		System.out.println(s3);
		boolean res=s1.equals(s);
		System.out.println(res);
		
		

	}

}
