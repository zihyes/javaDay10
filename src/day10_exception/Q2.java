package day10_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("인증 프로그램입니다.");
	
		System.out.print("주민번호 입력(앞 6자리 입력): ");
		try {
		num = input.nextInt();
			if(num / 100000 == 0 || num / 100000 > 9) {
				throw new Exception("길이가 틀렸습니다.");
		}else if(num / 100000 <= 8) {
			System.out.println("가입 가능");
		}else {
			System.out.println("가입 불가");
		}
		}catch(InputMismatchException e) {
			e.getStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
