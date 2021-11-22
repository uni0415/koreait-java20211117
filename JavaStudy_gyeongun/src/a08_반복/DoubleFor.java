package a08_반복;

import java.util.Scanner;

public class DoubleFor {
	public static void main(String[] args) {
//		for(int i=0; i<10; i++) {
//			System.out.println("운동장 "+(i+1)+"바퀴째");
//			for(int j=0; j<5; j++) {
//				System.out.println("코끼리코 "+(j+1)+"바퀴째");
//			}
//			System.out.println("=====================");
//		}

//		for(int i=2; i<10; i++) {
//			System.out.println(i+"단");
//			for(int j=1; j<10; j++) {
//				System.out.println(i+" x "+j+" = "+i*j);
//			}
//			System.out.println();
//		}
		Scanner in = new Scanner(System.in);
		int gugudanStart = 0;
		int gugudanEnd = 0;

		System.out.println("시작 단수: ");
		gugudanStart = in.nextInt();
		System.out.println("마지막 단수: ");
		gugudanEnd = in.nextInt();

		for (int dan = gugudanStart; gugudanStart < gugudanEnd + 1; dan++) {
			System.out.println(gugudanStart + "단");
			for (int j = 1; j < 10; j++) {
				System.out.println(gugudanStart + " x " + j + " = " + gugudanStart * j);
			}
			System.out.println();
		}

	}
}
