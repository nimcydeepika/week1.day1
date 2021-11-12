package week1.day2.assignment;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;i++) {
				if(array[i]==array[j]) {
					System.out.println("the duplicates in the array is:"+array[i]);
				}
			}
		}		

	}

}
