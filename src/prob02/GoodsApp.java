package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {


		Goods[] goods = new Goods[COUNT_GOODS];//
		
		for(int i = 0; i<3 ; i++ ) {
		Goods gi = new Goods();				
		Scanner scanner = new Scanner(System.in);
		gi.setName(scanner.nextLine());		
		gi.setPrice(scanner.nextInt());
		gi.setStock(scanner.nextInt());  
		
		goods[i] = gi;
		
		}
	
		goods[0].showInfo();
		goods[1].showInfo();
		goods[2].showInfo();
		
		}
		
	
}
