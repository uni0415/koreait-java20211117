package a08_반복;

import java.util.Scanner;

public class WhileGuGuDan2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int gugudanStart = 0;
		int gugudanEnd = 0;

		System.out.println("시작 단수: ");
		gugudanStart = sc.nextInt();
		System.out.println("마지막 단수: ");
		gugudanEnd = sc.nextInt();

		int dan = gugudanStart;

		while (dan < gugudanEnd + 1) {
			if(dan%2 == 0) {
				dan++;
				continue;
			}
			
			System.out.println(dan + "단");
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
