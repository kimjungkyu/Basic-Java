/**
 * 예외 처리안한 문장
 */
package summerbasicjava;

import java.util.Scanner;

public class Exception {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
	int divisor = 0;
	int dividend = 0;
	
	System.out.println("나뉨수를 입력하세요");
	dividend = scanner.nextInt();
	
	System.out.println("나눗수를 입력하세요");
	divisor = scanner.nextInt();
	
	System.out.println(dividend+"를 " + divisor +"로 나누면 몫은"+dividend/divisor+"입니다.");
	}
	
}
