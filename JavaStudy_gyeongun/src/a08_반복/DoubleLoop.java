package a08_�ݺ�;

public class DoubleLoop {
	public static void main(String[] args) {
		
		int i = 1;
		while(i < 11) {
			System.out.println(i + "��° ����");
			int j = 1;
			while(j < 6) {
				System.out.println("�ڳ����� "+ j + "��°");
				j++;
			}
			i++;
		}
		// System.out.println(j); �������� j�� while�� �ȿ����� ��� �����ϴ�.
	}
}
