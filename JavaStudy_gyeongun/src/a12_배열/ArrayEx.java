package a12_배열;
/**
 * 
 * 배열(Array)
 * 같은 자료형 또는 객체끼리 묶을 수 있음.
 * 배열의 키워드
 * index(인덱스) -> 연산자 기호표기 -> [] 대괄호
 * 
 *
 */
public class ArrayEx {
	public static void main(String[] args) {
		// 자료형[] 배열명 = new 자료형[배열의 크기]
		// int[] num = new int[10];
		// ㅁ	ㅁ	ㅁ	ㅁ	ㅁ
		// 0	1	2	3	4
		
		int[] num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
		for(int i=0; i<num.length; i++) {
			num[i] = 10*(i+1);
			System.out.println(num[i]);
		}
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
	}
}
