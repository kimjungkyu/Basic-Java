package summerbasicjava;

public class Sumting {

	public static void main(String[] args){
		int sum = 0;
		
		int num[] = { 1,2,3,4,5,6,7,8,9,10 };
		for(int k : num)
			sum += k;
			System.out.println("합은" + sum);
		
	}

}