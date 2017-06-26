package summerbasicjava;

public class Goods {
	private String name;
	private int price, numberOfStock, sold;
	
	public static void main(String[] args){
		Goods camera = new Goods();
	
		camera.name = "니콘";
		
		camera.price = 400000;
		
		camera.numberOfStock = 30;
		
		camera.sold = 50;
		
		System.out.println("이름 :" + camera.name + " 가격 :" + camera.price
				+ " 재고 개수 :"+ camera.numberOfStock + " 판매량 :" + camera.sold);
		
	}
}
