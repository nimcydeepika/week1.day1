package week1.day2.assignment;

public class MyCalculator {
	public void add(int a,int b,int c) {
	    int d=a+b+c;
		System.out.println("addition result is="+d);
	}
	public void sub(int e,int f) {
		int g=e-f;
		System.out.println("substraction result is="+g);
	}
	public void multi(double m,double n) {
		double o=m*n;
		System.out.println("multiplication result is="+o);
	}
	public void div(float x,float y) {
		float z=x/y;
		System.out.println("division result is="+z);
	}
	public static void main(String[]args) {
		MyCalculator calc=new MyCalculator();
		calc.add(86, 75, 97);
		calc.sub(23, 14);
		calc.multi(26, 5);
	}

}
