package summerbasicjava;

public class Doit {

	public static void main(String[] args) {
		char a= 'a';
		
		do{
			System.out.print(a);
		a = (char) (a+1);
		
		} while (a <= 'z');
	
		System.out.println("  ");
		
		for(char i='a'; i <='z'; i++){
			System.out.print(i);
		}
		
		System.out.println("  ");
		
		a='a';
		while (a <= 'z'){
			
			System.out.print(a);	
		a=(char) (a+1);
		}
	}
}
