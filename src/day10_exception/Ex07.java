package day10_exception;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age = 0;
		System.out.println("나이 입력");
		try {
			age = input.nextInt();
			if(age < 0) {
				throw new Exception("음수는 안돼요!"); //강제 예외 : 예외 발생 => exception쪽으로 던져짐
			}
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println( e.getMessage() );
		}
		System.out.println("당신의 나이는 : " + age); 

	}

}
