package a07_����;

import java.util.Scanner;

public class ����1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��� �ּ���(0~100): ");
		int score = input.nextInt();
		
		if(score > 100 || score < 0) {
			System.out.println("�߸��� ���� �Դϴ�.");
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










