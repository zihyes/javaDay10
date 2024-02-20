package day10_exception;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
			System.out.println("수 입력");
			x = input.nextInt();
			
			try {
				int result = 10 / x;
				System.out.println("결과 : result " + result);
				return;
			}catch (Exception e) {
				e.printStackTrace();
			}finally{ // try가 실행되던 catch가 실행되던 무조건 실행되는 문 => 마지막 작업 넣어줌
				input.close();
				System.out.println("fimally 실행");
			}
			System.out.println("다음 문장들 실행!");
	}

}
