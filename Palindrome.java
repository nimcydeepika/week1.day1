package week1.day2.assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="madam";
		String n="";
		for(int i=0;i<name.length();i++) {
			char temp=name.charAt(i);
			n=temp+n;
		}
		System.out.println("the reversed string=="+n);
		if(name.equalsIgnoreCase(n)) {
			System.out.println("palindrome");
		}
		else
			System.out.println("not palindrome");

	}

}
