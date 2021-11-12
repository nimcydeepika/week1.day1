package week1.day2.assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="9876";
		String str2="3456";
		System.out.println("string1="+str1);
		System.out.println("string2="+str2);
		if(str1.length()!=str2.length()) {
			System.out.println("not anagram");
		}
		char str1a[]=str1.toCharArray();
		char str2a[]=str2.toCharArray();
		Arrays.sort(str1a);
		Arrays.sort(str2a);
		System.out.println("the sorted array is");
		System.out.println(str1a);
		System.out.println(str2a);
		for(int i=0;i<str1.length();i++) {
			if(str1a[i]!=str2a[i]) {
				System.out.println("the strings are not anagram");
			}
			else {
				System.out.println("strings are anagram");
				break;
			}
		}

	}

}
