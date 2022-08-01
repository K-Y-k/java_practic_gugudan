package test2;

import java.util.Scanner;

public class java_practice {

	public static void main(String[] args) {

		while (true) { // 전체 무한 반복문
			System.out.println("구구단을 이용할 메뉴를 선택해주세요: "); // 메뉴 선정
			System.out.println("1. 구구단 출력");
			System.out.println("2. 구구단 활용");
			System.out.println("3. 구구단 활용2");
			System.out.println("4. 구구단 활용3");

			Scanner input_menu = new Scanner(System.in); // 메뉴 입력
			int menu = input_menu.nextInt();

			if (menu == 1) { // 1번 메뉴
				Gugudan.menu1_gugudan_print();
			} else if (menu == 2) { // 2번 메뉴
				Gugudan.menu2_gugudan_calculate();
			} else if (menu == 3) { // 3번 메뉴
				Gugudan.menu3_gugudan_calculate();
			} else if (menu == 4) { // 4번 메뉴
				Gugudan.menu4_gugudan_calculate();
			} else {
				System.out.println("다시 입력해주세요"); // 그 외 입력 시
				System.out.println("");
			}
		}
	}

}