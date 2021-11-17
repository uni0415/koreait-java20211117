package a07_조건;

import java.util.Scanner;

public class 문제1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("성적을 입력해 주세요(0~100): ");
		int score = input.nextInt();
		
		if(score > 100 || score < 0) {
			System.out.println("잘못된 점수 입니다.");
		}else if(score > 89) {
			System.out.println("A");
		}else if(score > 79) {
			System.out.println("B");
		}else if(score > 69) {
			System.out.println("C");
		}else if(score > 59) {
			System.out.println("D");
		}else
			System.out.println("F");
	}
}










