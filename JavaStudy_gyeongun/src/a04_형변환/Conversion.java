package a04_����ȯ;

public class Conversion {
	/**
	 * 
	 * ����ȯ
	 * 1. ��ĳ����(������ ����ȯ <����>)
	 * ���� -> ���� -> �Ǽ�
	 * 
	 * 2. �ٿ�ĳ����(����� ����ȯ <�ʼ�>)
	 * �Ǽ� -> ����-> ����
	 */
	public static void main(String[] args) {
		//1. ���� -> ����
		char c = 'A';
		int i_c = (int)c;
		
		//2. ���� -> �Ǽ�
		int i = 10;
		double d_i = (double)i;
		
		//3. �Ǽ� -> ����
		double d = 3.14;
		int i_d = (int)d;
		
		//4. ���� -> ����
		int ii = 65;
		char c_ii = (char)ii;
		
		int number = (int)(10.5 * 2);
		double number2 = 10.5 * 2;
		
	}
}
