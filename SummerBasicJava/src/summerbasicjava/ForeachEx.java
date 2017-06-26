package summerbasicjava;

public class ForeachEx {
	enum Week
	{
		월, 화, 수, 목, 금, 토, 일
	}

	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 5 };
		String names[] = { "딸기", "포도", "바나나", "사과", "오렌지" };
		int sum = 0;

		for (int k : num)
			sum += k;
		System.out.println("합은" + sum);

		for (String a : names)
			System.out.print(a + "과일 ");
		System.out.println(" ");

		for (Week day : Week.values())
			System.out.print(day + "요일 ");
		System.out.println(" ");
	}
}