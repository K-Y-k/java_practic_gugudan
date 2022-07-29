package test2;

import java.util.Scanner;

public class java_practice {

	public static void main(String[] args) {
		
		while(true) {
			int result = 0;
			
			System.out.printf("곱할 숫자를 입력해주세요: ");	
			Scanner input_number = new Scanner(System.in);
			int number = input_number.nextInt();
			
			System.out.printf("곱할 구구단을 입력해주세요: ");	
			Scanner input_number99 = new Scanner(System.in);
			int number99 = input_number99.nextInt();
			
			switch(number99) {
				case 1: result = 1 * number;
						System.out.println(result);	
						System.out.println("");	
						break;
				case 2: result = 2 * number;
						System.out.println(result);	
						System.out.println("");	
						break;
				case 3: result = 3 * number;
						System.out.println(result);
						System.out.println("");	
						break;
				case 4: result = 4 * number;
						System.out.println(result);	
						System.out.println("");	
						break;
				case 5: result = 5 * number;
						System.out.println(result);	
						System.out.println("");	
						break;
				case 6: result = 6 * number;
						System.out.println(result);	
						System.out.println("");	
						break;
				case 7: result = 7 * number;
						System.out.println(result);	
						System.out.println("");	
						break;
				case 8: result = 8 * number;
						System.out.println(result);	
						System.out.println("");	
						break;
				case 9: result = 9 * number;
						System.out.println(result);	
						System.out.println("");	
						break;
				default: System.out.println("다시 입력해주세요");	
						break;
			}
		}
		
	}

}
