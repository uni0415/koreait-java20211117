package a07_����;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int result = 0;
		int round = 1;

		switch (round) {
		case 1:
			System.out.println("1���� ����");
			System.out.print("���� ��� �Է�(�¸�=1, �й�=2): ");
			result = input.nextInt();
			if (result == 2) {
				System.out.println("���� �й�");
				break;
			}
		case 2:
			System.out.println("2���� ����");
			System.out.print("���� ��� �Է�(�¸�=1, �й�=2): ");
			result = input.nextInt();
			if (result == 2) {
				System.out.println("���� �й�");
				break;
			}
		case 3:
			System.out.println("3���� ����");
			System.out.print("���� ��� �Է�(�¸�=1, �й�=2): ");
			result = input.nextInt();
			if (result == 2) {
				System.out.println("���� �й�");
				break;
			}
		case 4:
			System.out.println("4���� ����");
			System.out.print("���� ��� �Է�(�¸�=1, �й�=2): ");
			result = input.nextInt();
			if (result == 2) {
				System.out.println("���� �й�");
				break;
			}
			System.out.println("��� ���忡�� �¸��ϼ̽��ϴ�.");
		}

	}
}
