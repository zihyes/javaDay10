package day10_exception;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int x, y, result = 0;
	System.out.println("수 입력");
	x = input.nextInt();
	y = input.nextInt();
	try { //문제가 생기면 바로 캐치로 넘어가고 밑에는 수행 안됨/ 문제가 안생기면 try에 있는 모든내용 실행 후 catch는 건너뜀
		System.out.println("try 실행");
		result = x / y;
		System.out.println("정상 동작");
		System.out.println("정상 동작");
		System.out.println("정상 동작");
	}catch(ArithmeticException e) {
		System.out.println("문제 발생");
		System.out.println("0으로 나눌 수 없음");
	}
	System.out.println("결과 : " + result);
}
}
