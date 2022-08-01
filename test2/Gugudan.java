package test2;

import java.util.Scanner;

public class Gugudan {

	public static void menu1_gugudan_print() {
		// 1번 메뉴
		int menu1_result[] = new int[9]; // 결과 변수

		System.out.printf("출력할 구구단을 입력해주세요: "); // 출력할 구구단 선정
		Scanner menu1_input_number99 = new Scanner(System.in);
		int menu1_number99 = menu1_input_number99.nextInt();

		if (menu1_number99 > 1 && menu1_number99 < 10) { // 1~9인 구구단을 정상 선택 시
			for (int i = 0; i < menu1_result.length; i++) { // 사용자가 선택한 구구단 전체 담기
				menu1_result[i] = (i + 1) * menu1_number99;
			}
			for (int i = 0; i < menu1_result.length; i++) { // 사용자가 선택한 구구단 전체 출력
				System.out.println(menu1_result[i]);
			}
			System.out.println("");
		} else { // 그 외의 숫자 선택시
			System.out.println("2~9의 구구단만 입력할 수 있습니다. 다시 입력해주세요");
			System.out.println("");
		}

	}

	public static void menu2_gugudan_calculate() {
		// 2번 메뉴
		int menu2_result = 0; // 결과 변수

		System.out.printf("곱할 임의의 숫자를 입력해주세요: "); // 곱할 숫자 선정
		Scanner menu2_input_number = new Scanner(System.in);
		int menu2_number = menu2_input_number.nextInt();

		System.out.printf("곱할 구구단을 입력해주세요: "); // 곱할 구구단 선정
		Scanner menu2_input_number99 = new Scanner(System.in);
		int menu2_number99 = menu2_input_number99.nextInt();

		switch (menu2_number99) { // 곱할 구구단의 입력 값에 따른 제어문
		case 1:
			menu2_result = 1 * menu2_number; // 1단
			System.out.println(menu2_result);
			System.out.println("");
			break;
		case 2:
			menu2_result = 2 * menu2_number; // 2단
			System.out.println(menu2_result);
			System.out.println("");
			break;
		case 3:
			menu2_result = 3 * menu2_number; // 3단
			System.out.println(menu2_result);
			System.out.println("");
			break;
		case 4:
			menu2_result = 4 * menu2_number; // 4단
			System.out.println(menu2_result);
			System.out.println("");
			break;
		case 5:
			menu2_result = 5 * menu2_number; // 5단
			System.out.println(menu2_result);
			System.out.println("");
			break;
		case 6:
			menu2_result = 6 * menu2_number; // 6단
			System.out.println(menu2_result);
			System.out.println("");
			break;
		case 7:
			menu2_result = 7 * menu2_number; // 7단
			System.out.println(menu2_result);
			System.out.println("");
			break;
		case 8:
			menu2_result = 8 * menu2_number; // 8단
			System.out.println(menu2_result);
			System.out.println("");
			break;
		case 9:
			menu2_result = 9 * menu2_number; // 9단
			System.out.println(menu2_result);
			System.out.println("");
			break;
		default:
			System.out.println("다시 입력해주세요"); // 그 외 입력 시
			System.out.println("");
			break;
		}

	}

	public static void menu3_gugudan_calculate() {
		int menu3_result[] = new int[1000];

		System.out.printf("구구단 할 숫자를 고르세요: "); // 곱할 숫자 선정
		Scanner menu3_input_number = new Scanner(System.in);
		int menu3_number = menu3_input_number.nextInt();

		for (int i = 0; i <= menu3_number; i++) {
			menu3_result[i] = (i + 1) * menu3_number;
		}

		for (int i = 0; i < menu3_number; i++) {
			System.out.println(menu3_result[i]);
		}
	}

	public static void menu4_gugudan_calculate() {
		int menu4_result[] = new int[1000];

		System.out.printf("곱할 숫자를 입력해주세요 ex) 3,4 입력 시 2*1.. 2*4, 3*1..3*4까지 출력: "); // 곱할 숫자 선정
		Scanner menu4_input_number = new Scanner(System.in);
		String menu4_number = menu4_input_number.next();

		String[] splitedNumber = menu4_number.split(","); // ,를 기준으로 문자 분리

		int first_number = Integer.parseInt(splitedNumber[0]); // 분리한 문자열 숫자로 변환
		int second_number = Integer.parseInt(splitedNumber[1]);

		for (int i = 2; i <= first_number; i++) { // 첫 숫자 입력까지 단까지 출력
			System.out.println(i + "단");

			for (int j = 0; j < second_number; j++) { // 두번째 숫자 입력까지 구구단 진행
				menu4_result[j] = (j + 1) * i;
				System.out.println(menu4_result[j]);
			}

			System.out.println("");
		}
	}

}
