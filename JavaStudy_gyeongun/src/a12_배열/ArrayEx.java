package a12_�迭;
/**
 * 
 * �迭(Array)
 * ���� �ڷ��� �Ǵ� ��ü���� ���� �� ����.
 * �迭�� Ű����
 * index(�ε���) -> ������ ��ȣǥ�� -> [] ���ȣ
 * 
 *
 */
public class ArrayEx {
	public static void main(String[] args) {
		// �ڷ���[] �迭�� = new �ڷ���[�迭�� ũ��]
		// int[] num = new int[10];
		// ��	��	��	��	��
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
