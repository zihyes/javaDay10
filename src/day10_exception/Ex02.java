package day10_exception;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("수 입력");
			num = input.nextInt();
			try {
			System.out.println("결과 : " + (100/num) );
			}catch(Exception e) { // 부모클래스로 받아서 처리 가능
				//System.out.println("0은 입력할 수 없음"); // catch에 발생한 문제 정확히 기재해야 함
				System.out.println( e );
				System.err.println("에러 : " + e);
			}
		}
	}
}
