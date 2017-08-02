package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			
			/*  코드를 완성 합니다 */
			System.out.print( ">> " );
			String expression = scanner.nextLine(); // 계산식을 문자열로 입력 받는다, 문자열로 받은 식을 char [] 로 끊고 연산자에 따라 클래스호출
					
			
			if( expression.equals( "quit" ) ) { // quit을 치면 나온다. 
				break;
			} // if문 종료
			
			
			
				String[] tokens = expression.split(" ");			
				int a = Integer.parseInt(tokens[0]);

				String operator = tokens[1];
				int b = Integer.parseInt(tokens[2]);			
				
				char c = operator.charAt(0);
				
				
				switch(c) {
				
				case '+':
				
				{
					Add add = new Add();
					add.setValue(a, b);
					System.out.println(add.calcurate());
										
				}
				break;
				
				case '-':
				{
					Sub sub = new Sub();
					sub.setValue(a, b);
					System.out.println(sub.calcurate());
				}
				break;
				
				case '*':
				{
					Mul mul = new Mul();
					mul.setValue(a, b);
					System.out.println(mul.calcurate());
				}
				break;
				
				case '/':
				{
					Div div = new Div();
					div.setValue(a, b);
					System.out.println(div.calcurate());
				}
				break;
				} // switch문 종료 
				
				
				
				
				
				
				
				
				
				
				
				
				

		} // while문 종료
		
		scanner.close();

	}

}
