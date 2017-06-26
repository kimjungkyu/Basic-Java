package summerbasicjava;

public class TestGrade {

	public static void main(String[] args){
		char grade = 'C';
		switch(grade){
			case 'A':
			case 'B':
				System.out.println("참 잘했다.");
				break;
			case 'C':
				System.out.println("틀렸어여");
				break;
				
				default :
					System.out.println("잘못됬어요");
		}
	}
}
