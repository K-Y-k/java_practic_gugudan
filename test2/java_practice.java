package test2;

import java.util.Scanner;

public class java_practice {

	public static void main(String[] args) {
		
		while(true) {  // 전체 반복문
			System.out.println("구구단을 이용할 메뉴를 선택해주세요: ");	// 메뉴 선정
			System.out.println("1. 구구단 출력");	
			System.out.println("2. 구구단 활용");	
			
			Scanner input_menu = new Scanner(System.in);  // 메뉴 입력
			int menu = input_menu.nextInt();
			
			if(menu == 1) {  // 1번 메뉴
			   int menu1_result = 0;   // 결과 변수
			   
			   System.out.printf("출력할 구구단을 입력해주세요: ");	    // 출력할 구구단 선정
			   Scanner menu1_input_number99 = new Scanner(System.in);
			   int menu1_number99 = menu1_input_number99.nextInt();
				
			   if(menu1_number99 > 0 && menu1_number99 < 10) {  // 1~9인 구구단을 정상 선택 시
				   for(int i=1; i<10; i++) {  // 사용자가 선택한 구구단 전체 출력
					   menu1_result = i * menu1_number99;
					   System.out.println(menu1_result);	
				   }
				   System.out.println("");
			   }
			   else {  // 그 외의 숫자 선택시
				   System.out.println("다시 입력해주세요");
				   System.out.println("");
			   }
			   
			}
			
			
			else if(menu == 2) {  // 2번 메뉴
				int menu2_result = 0;   // 결과 변수
				
				System.out.printf("곱할 임의의 숫자를 입력해주세요: ");	// 곱할 숫자 선정
				Scanner menu2_input_number = new Scanner(System.in);
				int menu2_number = menu2_input_number.nextInt();
				
				System.out.printf("곱할 구구단을 입력해주세요: ");	    // 곱할 구구단 선정
				Scanner menu2_input_number99 = new Scanner(System.in);
				int menu2_number99 = menu2_input_number99.nextInt();
				
				switch(menu2_number99) { // 곱할 구구단의 입력 값에 따른 제어문
					case 1: menu2_result = 1 * menu2_number;         // 1단
							System.out.println(menu2_result);	
							System.out.println("");	
							break;
					case 2: menu2_result = 2 * menu2_number;         // 2단
							System.out.println(menu2_result);	
							System.out.println("");	
							break;
					case 3: menu2_result = 3 * menu2_number;         // 3단
							System.out.println(menu2_result);
							System.out.println("");	
							break;
					case 4: menu2_result = 4 * menu2_number;         // 4단
							System.out.println(menu2_result);	
							System.out.println("");	
							break;
					case 5: menu2_result = 5 * menu2_number;         // 5단
							System.out.println(menu2_result);	
							System.out.println("");	
							break;
					case 6: menu2_result = 6 * menu2_number;         // 6단
							System.out.println(menu2_result);	
							System.out.println("");	
							break;
					case 7: menu2_result = 7 * menu2_number;         // 7단
							System.out.println(menu2_result);	
							System.out.println("");	
							break;
					case 8: menu2_result = 8 * menu2_number;         // 8단
							System.out.println(menu2_result);	
							System.out.println("");	
							break;
					case 9: menu2_result = 9 * menu2_number;         // 9단
							System.out.println(menu2_result);	
							System.out.println("");	
							break;
					default: System.out.println("다시 입력해주세요");	  // 그 외 입력 시
						   	 System.out.println("");
							break;
				}
			}
			else {
				 System.out.println("다시 입력해주세요");	  // 그 외 입력 시
				 System.out.println("");
			}
		}
	}

}
