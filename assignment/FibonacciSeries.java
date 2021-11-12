package week1.day1.assignment;

public class FibonacciSeries {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=8,num1=0,num2=1,num3;
		System.out.println(num1+""+num2);
		for(int i=2;i<range;i++) {
			
			num3=num1+num2;
			System.out.println(""+num3);
			num1=num2;
			num2=num3;			
		}
		
		
	}

}
