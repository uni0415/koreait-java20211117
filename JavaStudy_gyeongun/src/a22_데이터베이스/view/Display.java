package a22_�����ͺ��̽�.view;

import a22_�����ͺ��̽�.session.Principal;

public class Display {
	private Principal principal;
	
	public Display() {
		principal = Principal.getInstance();
	}
	
	public void mainDisplay() {
		System.out.println("[���α׷� ����]");
		if(principal.getLoginUser() != null) {
			System.out.println(principal.getLoginUser().getName()+"�� ȯ���մϴ�.");
		}
		System.out.println("1. ȸ������");
		if(principal.getLoginUser() == null) {
		System.out.println("2. �α���");
		}else {
		System.out.println("2. �α׾ƿ�");
		}
		System.out.println("q. ���α׷� ����");
		System.out.println();
	}
	public void signupDisplay() {
		System.out.println("[ȸ������]");
	}
	public void signupMessage(boolean result) {
		if(result == true) {
			System.out.println("ȸ������ ����.");
		}else {
			System.out.println("ȸ������ ����.");
		}
	}
	
	public void signinDisplay() {
		System.out.println("[�α���]");
	}
	public void signinMessage(int result) {
		if(result == 0) {
			System.out.println("�������� �ʴ� ���̵� �Դϴ�.");
		}else if(result == 1) {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}else {
			System.out.println("�α��� ����.");
		}
		
		
		
	}
}

