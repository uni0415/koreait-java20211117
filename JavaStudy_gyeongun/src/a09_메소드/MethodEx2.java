package a09_�޼ҵ�;

import java.util.Scanner;

public class MethodEx2 {
	static Scanner in = new Scanner(System.in);

	static void mainMenu() {
boolean loopFlag = true;
		String select = null;
		while (loopFlag) {
			System.out.println("[���α׷� �޴�]");
			System.out.println("1. ������ ���� ����");
			System.out.println("q. ���α׷� ����");
			System.out.print("����� �Է��ϼ���: ");
			select = in.nextLine();
			System.out.println();

			if (select.equals("1")) {
				loopFlag = junilFolder();

			} else if (select.equals("q")) {
				System.out.println("���α׷� ���� ��...");
				break;
			} else {
				System.out.println("������ �� ���� ����Դϴ�.");
			}
	}
}



	static boolean junilFolder() {
		boolean loopFlag = true;
		boolean loopFlag2 = true;
		String select = null;

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
				loopFlag2 = false;
			} else if (select.equals("q")) {
				// ���α׷� ����
				System.out.println("���α׷� ���� ��...");
				loopFlag = false;
				loopFlag2 = false;
			}
		}
		return loopFlag;
	}

	public static void main(String[] args) {

	mainMenu();
	System.out.println("���α׷� ����");
	}
}


