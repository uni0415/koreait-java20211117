package a08_�ݺ�;

import java.util.Scanner;

public class WhileGuGuDan2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int gugudanStart = 0;
		int gugudanEnd = 0;

		System.out.println("���� �ܼ�: ");
		gugudanStart = sc.nextInt();
		System.out.println("������ �ܼ�: ");
		gugudanEnd = sc.nextInt();

		int dan = gugudanStart;

		while (dan < gugudanEnd + 1) {
			if(dan%2 == 0) {
				dan++;
				continue;
			}
			
			System.out.println(dan + "��");
			int j = 1;
			if (dan % 2 != 0) {
				while (j < 10) {
					System.out.println(dan + " x " + j + " = " + dan * j);
					j++;
				}
			}
			System.out.println();
			dan++;
		}
	}
}
