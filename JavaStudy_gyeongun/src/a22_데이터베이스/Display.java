package a22_�����ͺ��̽�;

public class Display {
	public void mainDisplay() {
		System.out.println("[���α׷� ����]");
		System.out.println("1. ȸ������");
		System.out.println("2. �α���");
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
}
