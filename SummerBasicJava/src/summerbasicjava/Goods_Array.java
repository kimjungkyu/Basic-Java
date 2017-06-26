package summerbasicjava;

import java.util.Scanner;

class Goods1 {
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	
	Goods1 (String n, int p, int nStock, int s){
	name = n;
	price = p;
	numberOfStock = nStock;
	sold = s;
}
String getName() {return name;}

int getPrice() {return price;}

int getNumberOfStock() {return numberOfStock;}

int getSold() {return sold;}
}
public class Goods_Array {
	public static void main(String[] args){
		
		/*Goods goods_Array[];
		goods_Array= new Goods[3];*/
		
		Goods1 goods_Array[] = new Goods1[3];
		
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < goods_Array.length; i++){
			
		String name = scanner.next();
		int price = scanner.nextInt();
		int numberOfStock = scanner.nextInt();
		int sold = scanner.nextInt();	
		
		goods_Array[i] = new Goods1 (name, price, numberOfStock, sold);
		
		}
		for(int i = 0; i < goods_Array.length; i++){
			
			System.out.println("이름 :" + goods_Array[i].getName() +" ");
			System.out.println("가격 :" + goods_Array[i].getPrice()+" ");
			System.out.println("상품 재고 :" + goods_Array[i].getNumberOfStock()+" ");
			System.out.println("판매 개수 :" + goods_Array[i].getSold()+" ");
		}
			
	}
}
