package day10_exception;

import java.util.ArrayList;

public class Ex04 { //Exception 하나로도 처리 가능
	public static void main(String[] args) {
		try{
			int n1 = 10, n2 = 0;
			System.out.println( n1 / n2 );
			ArrayList<String> arr = new ArrayList<>();
			arr.add("111"); // 0 ; index는 0부터 시작
			arr.add("222"); // 1
			arr.add("333"); // 2
			for(int i = 0; i <= arr.size(); i++) {
				System.out.println( arr.get(i) );
			}
		}catch(Exception e) {//catch도 하나의 메소드 => 메소드 오버라이딩 가능
			//System.out.println("문제 발생 : " + e);
			e.printStackTrace(); // 문제 발생 알려줌
		}
		System.out.println("다음 문장들 이어서 진행!");
	}

}
