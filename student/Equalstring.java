package org.student;

public class Equalstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String col1="I am Learning Java";
		String col2="computer";
		String col3="I am learning java";
		boolean equal1=col1.equalsIgnoreCase(col2);
		boolean equal2=col1.equalsIgnoreCase(col3);
		System.out.println("\""+ col1+"\"equals\""+ col2+"\"?"+equal1);
		System.out.println("\""+col1+"\"equals\""+col3+"\"?"+equal2);

	}

}
