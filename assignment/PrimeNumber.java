package week1.day1.assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		boolean prime=true;
		for (int i=2;i<=n;i++) {
			if(n%i==0) {
				prime=false;
				break;
			}
		}
		if(prime==true) {
			System.out.println(n+"is prime number");
		}
		else
			System.out.println(n+"not prime number");
		

	}

}
