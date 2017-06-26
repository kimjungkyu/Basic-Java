/***
 * continue문 + break문
 */
package summerbasicjava;

public class C_B {
	public static void main(String[] args){
		int sum = 0;
		for (int i = 0; i<100; i++){
			if(i%2==1)
				continue;
			else
			sum += i;
		}
		System.out.println("1~100까지의 숫자중 짝수 찾기" + ":" +sum);
	}	
}
