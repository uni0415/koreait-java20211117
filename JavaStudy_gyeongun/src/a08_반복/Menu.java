package a08_�ݺ�;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String select = null; // ���ڿ� �Է�
		
		boolean loopFlag = true;
		
		while (loopFlag) {
			System.out.println("[���α׷� �޴�]");
			System.out.println("1. ������ ���� ����");
			System.out.println("q. ���α׷� ����");
			System.out.print("����� �Է��ϼ���: ");
			select = in.nextLine();
			System.out.println();

			if (select.equals("1")) {
				boolean loopFlag2 = true;
				while (loopFlag2) {
					System.out.println("[1. ������ ���� ����]");
					System.out.println("1. javaStudy ����");
					System.out.println("b. �ڷΰ���");
					System.out.println("q. ���α׷� ����");
					System.out.println("����� �Է��ϼ���: ");
					select = in.nextLine();
					System.out.println();

					if (select.equals("1")) {
						System.out.println("1. javaStudy ���� open");
					} else if (select.equals("b")) {
						// ���� �������� �̵�
						System.out.println("�ڷΰ��� ����");
						loopFlag2 = false;;
					} else if (select.equals("q")) {
						// ���α׷� ����
						System.out.println("���α׷� ���� ��...");
						loopFlag = false;
						loopFlag2 = false;

					}

				}
			} else if (select.equals("q")) {
				System.out.println("���α׷� ���� ��...");
				break;
			} else {
				System.out.println("������ �� ���� ����Դϴ�.");
			}

		}
		System.out.println("���α׷� ����");
	}
}
