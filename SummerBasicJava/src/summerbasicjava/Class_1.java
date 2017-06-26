package summerbasicjava;

public class Class_1 {

	private int age;
	private String getName ="김정규";

	public static void main(String[] args){
		Class_1 person;
		person = new Class_1();
		
		person.age = 30;
		String s = person.getName;
		
		System.out.println("나이 :" + person.age);
		System.out.println("이름 :" + s);
	}
}
